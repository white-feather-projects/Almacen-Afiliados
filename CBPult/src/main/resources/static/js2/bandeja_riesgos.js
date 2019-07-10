'use strict'

window.addEventListener('load', ()=>{
	listarPurchseOrder();
	
	$("#menu").on('click', function(){
		location.href = "/gestion_solicitudes";
	})

})

/////////////////////////////////////////7

function listarPurchseOrder(){
	
	var uno;
	    $('#simpletable').DataTable( {
	    
	    sort:true,
	    destroy: true,
	        ajax: {
	              url: "/listClientAndAccountWS",
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
	            return '<center>'+data+'</center>';
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
	                		return '<center><a href="/customerAnalysisTdc/'+data+'" title="Analizar"><i class="fa fa-plus-square agregaryasignar" style="font-size:30px"></i></a></center>';                      
	                	}
	                }
	            }
	        ]
    });
}