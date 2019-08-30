'use strict'

window.addEventListener('load', function(){
	
	$("#menu").on('click', function(){
		location.href = "../../CBPult/Afiliacion/menu_afiliacion";
	});
	
	$("#comercios_creados").on('click', function(){
		listarTabla1();
	});
	
});

/////////////////////////////////////////////////////////////////////////////////////////////////////

function listarTabla1(){
	
    $('#simpletable1').DataTable( {
	   
	    sort:true,
	    destroy: true,
	    searching: true,
	    language: {
    		url: '/CBPult/js2/Spanish.json'
        },
	        ajax: {
	              url: "/CBPult/Afiliacion/listaSolicitudes",
	            dataSrc: ''
	        },
	        columns: [ 
	        	
	        {
	                "data": "comercioId.identificacionComercio", // can be null or undefined
	                "class": "identificacion",
	                "render": function ( data ) {
	          
	            return '<center class="p1">'+ data +'</center>';
	              }	
	            },
	            {
	                "data": "comercioId.nombreEmpresarial", // can be null or undefined
	                "class": "nombre_empresa",
	                "defaultContent": "",
	                "render": function ( data ) {
	            return '<center class="p2">'+data+'</center>';
	              }
	            },
	            {
	                "data": "comercioId.nombreComercial", // can be null or undefined
	                "class": "nombre_comercial",
	                "defaultContent": "",
	                "render": function ( data ) {
            	return '<center class="p3">'+data+'</center>';
	              }
	            },          
	            {
	                "data": "comercioId.actividadComercial", // can be null or undefined
	                "class": "actividad_comercial",
	                "defaultContent": "",
	                "render": function ( data ) {
	            return '<center class="p4">'+data+'</center>';
	              }
	            },
	            {
	                "data": "comercioId.email",
	                "class": "correo",
	                "defaultContent": "",
	                "render": function ( data ) {
            	return '<center class="p5">'+data+'</center>';
	              }
	            },
	            {
	                "data": "comercioId.fechaCargaDatos", // can be null or undefined
	                "class": "fecha_carga",
	                "defaultContent": "",
	                "render": function ( data ) {
	                	var año = data.substring(0, 4);
	                	var mes = data.substring(5, 7);
	                	var dia = data.substring(8, 10);
	            return '<center class="p6">'+año+"/"+mes+"/"+dia+'</center>';
	              }
	            },
	            {
	                "data": "idChannel.channelName", // can be null or undefined
	                "class": "nombre_canal",
	                "defaultContent": "",
	                "render": function ( data ) {
	            return '<center class="p7">'+data+'</center>';
	              }
	            },
	            {
	                "data": "comercioId.statusComercio", // can be null or undefined
	                "class": "estado_comercio",
	                "defaultContent": "",
	                "render": function ( data ) {
	                	if(data === "Y"){
	                		return '<center class="p8">APROBADO</center>';
	                	}
	                	if(data === "N"){
	                		return '<center class="p8">PENDIENTE</center>';
	                	}
	            
	              }
	            },
	            {
	                "data": "comercioId.identificacionComercio",
	                "class": "ver",
	                "defaultContent": "",
	                "render": function ( data, type, full, meta ) {
	                	if(full.comercioId.statusComercio === "N"){
	                		return '<center><a title="Visualizar Recaudos" href="/CBPult/Afiliacion/aprobacion_recaudos&'+data+'"><i class="fa fa-edit" style="font-size:30px" aria-hidden="true"></i></a></center>';
	                	}
	                
	                }
	            }
	            
	        ]
	        
    });
	    
}