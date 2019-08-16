'use strict'

window.addEventListener('load', ()=>{
	listarPurchseOrder();
	
	$("#menu").on('click', function(){
		location.href = "/CBPult/Solicitudes/gestion_solicitudes";
	})

})

/////////////////////////////////////////7

function listarPurchseOrder(){
	
	var uno;
	    $('#simpletable').DataTable( {
	    
	    sort:true,
	    destroy: true,
	    language: {
    		url: '../js2/Spanish.json'
        },
	        ajax: {
	              url: "/CBPult/Solicitudes/listClientAndAccountWS",
	            dataSrc: ''
	        },
	        columns: [ 
	        {
	                "data": "clientDocumentId", // can be null or undefined
	                "class": "cero1",
	                "render": function ( data ) {
	            return '<center>'+ data +'</center>';
	              }	
	            },
	            {
	                "data": "clientFirstName", // can be null or undefined
	                "class": "uno1",
	                "defaultContent": "",
	                "render": function ( data ) {
	            return '<center>'+data+'</center>';
	              }
	            },
	            {
	                "data": "clientSurname", // can be null or undefined
	                "class": "dos1",
	                "defaultContent": "",
	                "render": function ( data ) {
	                if(data != " "){
	                	var apellidos=data.split('-');
	                	//alert(apellidos[0]);
	                }
	            return '<center>'+apellidos[0]+'</center>';
	              }
	            },  
	            {
	                "data": "clientSurname", // can be null or undefined
	                "class": "dos1",
	                "defaultContent": "",
	                "render": function ( data ) {
	                if(data != " "){
	                	var apellidos=data.split('-');
	                	//alert(apellidos[0]);
	                }
	            return '<center>'+apellidos[1]+'</center>';
	              }
	            },    
	            {
	                "data": "fechaCarga", // can be null or undefined
	                "class": "tres1",
	                "defaultContent": "",
	                "render": function ( data ) {
	                	uno = data;
	            return '<center>'+data+'</center>';
	              }
	            },
	            {
	                "data": "accountStatus", // can be null or undefined
	                "class": "tres1",
	                "defaultContent": "",
	                "render": function ( data ) {
	                	uno = data;
	            return '<center>'+data+'</center>';
	              }
	            },
	            {
	                "data": "idClient",
	                "class": "editar",
	                "defaultContent": "",
	                "render": function (data) {
	                	if(uno == "NEGADA"){
                   
	                	}else if(uno == "ACTIVA"){
	                		return '<center><a href="/CBPult/Solicitudes/customerAnalysisTdc/'+data+'" title="Analizar"><i class="fa fa-plus-square agregaryasignar" style="font-size:30px"></i></a></center>';                      
	                	}
	                }
	            }
	        ]
    });
}