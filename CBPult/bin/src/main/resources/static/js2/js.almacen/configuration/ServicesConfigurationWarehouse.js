function listarAlmacenesServ(){
		
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
        
    });

}

function cargarDatosAlmacenServ() {
	var url = window.location.pathname;
	var idWarehouse = url.substring(url.lastIndexOf('/') + 1);
	
	var url3='/CBPult/Almacen/consultarAlmacenPorAlmacenId';
	var datos = {
		"idAlmacen": idWarehouse			
	}

	$.ajax({
	    url:url3,
	    dataType: 'json',
	    contentType:'application/json',
	    data:JSON.stringify(datos),
	    type: 'POST',
	    success: function(resp){
		    console.log(resp);		   
		    console.log(resp.return.idWarehouse);
		    
		    document.getElementById('txtCodigo_almacen').value = resp.return.idWarehouse;
			$("#cboxTipo_almacen option[value="+resp.return.tipoAlmacenId+"]").attr("selected",true);
			
		    document.getElementById('txtName_almacen').value = resp.return.warehouseName;
		    
		    document.getElementById('txtUbicacion_almacen').value = resp.return.direccion;
		    $("#cboxEncargado_almacen option[value="+resp.return.gerenteSucursal+"]").attr("selected",true);
		    document.getElementById('numeroAlmacen').value = resp.return.warehouseNumber;
		},
	    error: function(e){
	    	console.log("errro:"+e);
		}
	}); 
}

function modificarAlmacenServ(){
	
	var numeroAlmacen = $("#numeroAlmacen").val();
	var nombreAlmacen = $("#txtName_almacen").val();
	var tipoAlmacen = $("#cboxTipo_almacen").val();
	var direccion =  $("#txtUbicacion_almacen").val();
	var gerente =  $("#cboxEncargado_almacen").val();
	  
	var contenido = {
		"numeroAlmacen": numeroAlmacen,
        "nombreAlmacen": nombreAlmacen,
        "tipoAlmacen": tipoAlmacen,
        "direccion": direccion,
        "gerenteSucursal": gerente,		           
	}
	
	$.ajax({
		headers: { 
			'Accept': 'application/json',
	        'Content-Type': 'application/json' 
	    },
   
        type: "POST",	  
        url: "/CBPult/Almacen/modificarAlmacen",
        data: JSON.stringify(contenido),
        dataType: "json",
        success: function(data){
        	if(data.return.descripcion=='OK'){			
        		swal({
        			title: 'Almacen modificado con exito',
		    	    text: 'Redirigiendo...',
		    	    icon: 'Exitoso',
		    	    timer: 1000,
		    	    buttons: false,
        		},
    		    function() {
        			location.href = "/CBPult/Almacen/configuration_almacen";
        		})		    	
        	}
		    else{
		    	swal("Solicitud de orden de compra en carga no Exitosa!!");	          
		    }
        }	   
	}); 
}

// Servicios para el Wizard
function listarAlmacenesRelServ(){
	
    $('#simpletablerel').DataTable( {
	    
    	sort:true,
    	destroy: true,
    	searching: true,
    	paging: false, // le quito el paging porque no deja cargar los switches de las otras paginas
      	
    	language: {
    		url: '../js2/Spanish.json'
        },
        ajax: {
        	url:"/CBPult/Almacen/listaAlmacenes",
            dataSrc: ''
        	
        },       
        columns: [ 
        	
           {
                "class": "uno",
                "defaultContent": "",
                "render": function ( data ) {
                	return '<center><input type="checkbox" class="js-switch-blue" data-switchery="true" style="display: none;"></center>';
                }
           },
    	   {
                "data": "idWarehouse", // can be null or undefined
                "class": "dos",
                "defaultContent": "",
                "render": function ( data ) {
            		return '<center>'+data+'</center>';
              	}
            },
            {
                "data": "tipoAlmacenId", // can be null or undefined
                "class": "cinco",
                "defaultContent": "",
                "render": function ( data ) {
            		return '<center>'+data+'</center>';
              	}
            },
            {
                "data": "warehouseName", // can be null or undefined
                "class": "tres",
                "defaultContent": "",
                "render": function ( data ) {
            		return '<center>'+data+'</center>';
              	}
            },            
            {
                "data": "direccion", // can be null or undefined
                "class": "cuatro",
                "defaultContent": "",
                "render": function ( data ) {
            		return '<center>'+data+'</center>';
              	}
            },            
            {
                "data": "gerenteSucursal", // can be null or undefined
                "class": "seis",
                "defaultContent": "",
                "render": function ( data ) {
            		return '<center>'+data+'</center>';
              	}
            }            
        ],
        // ejecuta una funcion Despues de Cargar los Registros de la Tabla
        // lo uso para cargar la clase de los Switches
        initComplete: function( settings, json){
            //Cargar Switches
			Array.prototype.forEach.call($('.js-switch-blue'), (item, i)=>{
				var actual_switch = new Switchery(item, {
					color: '#17a2b8',
					secondaryColor: '#e0e0e0',
					jackSecondaryColor: '#17a2b8'
				});
			});
        },
        
    });
    
}