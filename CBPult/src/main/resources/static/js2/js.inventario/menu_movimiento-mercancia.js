'use strict'

window.addEventListener('load', function(){
	
	listarAlmacenesServ();
	
});

function listarAlmacenesServ(){
	
    $('#simpletable1').DataTable( {
	    
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
                	return '<center><a title="Visualizar Inventario" href="/CBPult/Almacen/inventario_almacen&'+data+'"><i class="fa fa-edit" style="font-size:30px" aria-hidden="true"></i></a></center>';
              	}
            }
        ]
        
    });

}