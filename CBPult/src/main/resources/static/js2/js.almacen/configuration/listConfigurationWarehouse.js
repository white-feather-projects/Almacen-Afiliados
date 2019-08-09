$(document).ready(function() {
	listarConfiguracionAlmacen();

});



function listarConfiguracionAlmacen(){
		
    $('#configuracionAlmacen').DataTable( {
	    
	    	sort:true,
	    	destroy: true,
	    	searching: true,
	      	
	    	language: {
	    		url: '../js2/Spanish.json'
	        },
	        ajax: {
	        	url:"/CBPult/Almacen/listaAlmacenes",
	            dataSrc: '',
	        	
	        },
	      
	        columns: [ 
	      
	        	   {
		                "data": "idWarehouse", // can be null or undefined
		                "class": "uno",
		                "defaultContent": "",
		                "render": function ( data ) {
		            		return '<center>'+data+'</center>';
		              	}
		            },
	            {
	                "data": "warehouseName", // can be null or undefined
	                "class": "dos",
	                "defaultContent": "",
	                "render": function ( data ) {
	            		return '<center>'+data+'</center>';
	              	}
	            },
	            {
	                "data": "direccion", // can be null or undefined
	                "class": "tres",
	                "defaultContent": "",
	                "render": function ( data ) {
	            		return '<center>'+data+'</center>';
	              	}
	            },
	            {
	                "data": "tipoAlmacenId", // can be null or undefined
	                "class": "cuatro",
	                "defaultContent": "",
	                "render": function ( data ) {
	            		return '<center>'+data+'</center>';
	              	}
	            },
	            {
	                "data": "gerenteSucursal", // can be null or undefined
	                "class": "cinco",
	                "defaultContent": "",
	                "render": function ( data ) {
	            		return '<center>'+data+'</center>';
	              	}
	            },
	            {
	                "data": "idWarehouse", // can be null or undefined
	                "class": "seis",
	                "defaultContent": "",
	                "render": function ( data ) {
	                	return '<center><a href="/CBPult/Almacen/almacen_nuevo-editar/'+data+'" title="Editar solicitud de orden de compra"><input type="hidden" id="edit" value="'+data+'"><i class="fa fa-edit" agregaryasignar" style="font-size:30px"></i></a></center>';
	              	}
	            }
	        ]
	        
	    } );

	}
