'use strict'

$(document).ready(function(){
	
	cargarDatosAlmacenServ(); // Carga de Datos de Almacen
	
	$("#btnGuardar_almacen").click(function(){
		modificarAlmacenServ();	   
    });
		   
	$("#nueva_zona").click(function(){
		location.href = "/CBPult/Almacen/zona_nuevo-editar";
	});
	
	$("#nueva_relacion").click(function(){
		location.href = "/CBPult/Almacen/relacion-almacen_nuevo-editar";
	});
	
});




 