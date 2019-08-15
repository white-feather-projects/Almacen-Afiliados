'use strict'

$(document).ready(function(){
	
	$("#nueva_zona").click(function(){
		location.href = "/CBPult/Almacen/zona_nuevo-editar";
	});
	
	$("#nueva_relacion").click(function(){
		location.href = "/CBPult/Almacen/relacion-almacen_nuevo-editar";
	});	

	mostrarDatos();
	
	$("#btnGuardar_almacen").click(function(){
		
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
		      
		    	$.ajax({      headers: { 
		            'Accept': 'application/json',
		            'Content-Type': 'application/json' 
		        },     
		            
		  		  type: "POST",
		  		  
		  		  url: "/CBPult/Almacen/modificarAlmacen",
		  		  data: JSON.stringify(contenido),
		  		dataType: "json",
		  		  success: function(data)
		  	    {
		  			  
		  			
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
		                  
		        	
		        	
		              }else{
		            	swal("Solicitud de orden de compra en carga no Exitosa!!");    
		              
		              }
		              }
		              
		                },
		                
		    	
		    	);  
		    });
		   
		
});

function mostrarDatos() {
	var url = window.location.pathname;
	var idWarehouse = url.substring(url.lastIndexOf('/') + 1);
	 	    
var datos = {
		"idAlmacen": idWarehouse
		
		}

var url3='/CBPult/Almacen/consultarAlmacenPorAlmacenId';

$.ajax({
    url:url3,
    dataType: 'json',
    contentType:'application/json',
    data:JSON.stringify(datos),
    type: 'POST',
    success: function(resp){
    console.log(resp);
   
    console.log(resp.return.idWarehouse);
    cboxTipo_almacen
    document.getElementById('txtCodigo_almacen').value = resp.return.idWarehouse;
	$("#cboxTipo_almacen option[value="+resp.return.tipoAlmacenId+"]").attr("selected",true);
    document.getElementById('txtName_almacen').value = resp.return.warehouseName;
    document.getElementById('txtUbicacion_almacen').value = resp.return.direccion;
    $("#cboxEncargado_almacen option[value="+resp.return.gerenteSucursal+"]").attr("selected",true);
    document.getElementById('numeroAlmacen').value = resp.return.warehouseNumber;
    },
    error: function(e)
	{
		console.log("errro:"+e);
	}
		}); 
}



 