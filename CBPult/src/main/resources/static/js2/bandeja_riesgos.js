'use strict'

window.addEventListener('load', ()=>{
	listarPurchseOrder();
	
	$("#menu").on('click', function(){
		location.href = "/gestion_solicitudes";
	})

})

/////////////////////////////////////////
/////////////////////////////////////////

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
	                "data": "clientBirthday", // can be null or undefined
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
	                "data": "clientDocumentId",
	                "class": "editar",
	                "defaultContent": "",
	                "render": function (data) {
	                	if(uno == "NEGADA"){
                   
	                	}else if(uno == "ACTIVA"){
	                		return '<center><a href="/confirmacion2/'+data+'" title="Editar"><i class="fa fa-plus-square agregaryasignar" style="font-size:30px"></i></a></center>';                      
	                	}
	                }
	            }
	        ]
    });
}