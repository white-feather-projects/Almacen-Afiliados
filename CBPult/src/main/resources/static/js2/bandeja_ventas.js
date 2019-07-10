'use strict'

window.addEventListener('load', ()=>{
	localStorage.clear();
	listarTdc();
	$("#solicitud_ingresada").on('click', function(){
		var status = "SOLICITUD_INGRESADA";
		listarTdc(status);
	});
	
	$("#solicitud_analisis").on('click', function(){
		var status = "SOLICITUD_EN_ANALISIS";
		listarTdc(status);
	});
	
	$("#tarjetas_imprimir").on('click', function(){
		var status = "TARJETA_POR_IMPRIMIR";
		listarTdc(status);
	});
	
	$("#solicitud_completada").on('click', function(){
		var status = "SOLICITUD_COMPLETADA";
		listarTdc(status);
	});

    $("#crear_Soli").on('click', function(){
        location.href = "/carga_datos";
    })
    
    $("#menu").on('click', function(){
    	location.href = "/gestion_solicitudes";
    })

})

////////////////////////////////////////////

	function listarTdc(status){
	
	    $('#simpletable').DataTable( {
	   
	    sort:true,
	    destroy: true,
	    searching: true,
	    language: {
    		url: '/js2/Spanish.json'
        },
	        ajax: {
	              url: "/listTdcRequest/"+status+"",
	            dataSrc: ''
	        },
	        columns: [ 
	        	
	        {
	                "data": "clientId.clientFirstName", // can be null or undefined
	                "class": "cero1",
	                "render": function (data) {
	          
	            return '<center>'+ data +'</center>';
	              }	
	            },
	            {
	                "data": "clientId.clientSurname", // can be null or undefined
	                "class": "uno1",
	                "defaultContent": "",
	                "render": function ( data ) {
	            return '<center class="p2">'+data+'</center>';
	              }
	            },
	            {
	                "data": "clientId.clientDocumentId", // can be null or undefined
	                "class": "dos1",
	                "defaultContent": "",
	                "render": function ( data ) {
	            return '<center class="p3">'+data+'</center>';
	              }
	            },          
	            {
	                "data": "clientId.fechaHoraCarga", // can be null or undefined
	                "class": "tres1",
	                "defaultContent": "",
	                "render": function ( dat ) {
	                	
	                	//alert(date(dat));
	                	return '<center class="p5">'+date(dat)+'</center>';	 
						
						
	          //  return '<center class="p5">'+data_t[0]+"/"+data_split[1]+"/"+data_split[0]+'</center>';
	            //    	return '<center class="p5">'+dia[0]+'/'+strd[1]+'/'+strd[0]+'</center>';
	              }
	            },
	            {
	                "data": "idOrderRequest",
	                "class": "canal",
	                "defaultContent": "",
	                "render": function ( data, type, full, meta ) {
	                	return '<center class="p6">Canal</center>';
	                }
	            },
	            {
	                "data": "statusRequest", // can be null or undefined
	                "class": "cuatro1",
	                "defaultContent": "",
	                "render": function ( data ) {
	                	
	            return '<center class="p6">'+data+'</center>';
	              }
	            },
	            {
	                "data": "clientId.clientDocumentId",
	                "class": "ver",
	                "defaultContent": "",
	                "render": function ( data, type, full, meta ) {
	                		return '<center><a title="Ver" href="/consulta/'+data+'"><i class="fa fa-search" style="font-size:30px" aria-hidden="true"></i></a></center>';
	                		//return '<center><a class="ui blue button" href="/4track/api/devices?id=">Ver</a></center>';
	                }
	            }
	            
	        ]
	        
    });
	
	 function date(data){
		 if (data != undefined) {
			 var str=data;
			  var strd=str.split('-'); //split()
			  var dia=strd[2].split('T');
			return dia[0]+'/'+strd[1]+'/'+strd[0]; 
			}

	 } 
	    
}