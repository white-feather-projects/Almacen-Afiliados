'use strict'

	var url = window.location.pathname;
	var id = url.substring(url.lastIndexOf('/') + 1);
	var idAlmacen = id.indexOf("_");
	var idAlmacen_1 = id.substring(0, idAlmacen);
	var idZona = id.substring(id.lastIndexOf('_') + 1);
	var idZonaActual = idZona.indexOf("&");
	var idZonaActual_1 = idZona.substring(0, idZonaActual);
	var idZonaDestino = id.substring(id.lastIndexOf('&') + 1);
	
	console.log("id--------", id);
	console.log("idAlmacen", idAlmacen_1);
	console.log("idZonaActual", idZonaActual_1);
	console.log("idZonaDestino", idZonaDestino);

window.addEventListener('load', function(){
	
	$("#btnAtras_relacion-zona").on('click', function(){
		location.href = "/CBPult/Almacen/inventario_zona&"+idAlmacen_1+"_"+idZonaActual_1+"";
	});
	
	var consulta_zona_actual = {
		"zonaId": idZonaActual_1
	};
	
	$.ajax({
        type: "POST",
        url: '/CBPult/Almacen/consultaZonaPorZonaId',
        contentType: "application/json",
        dataType: "json",
        data: JSON.stringify(consulta_zona_actual),
        success: processSuccess,
        error: processError
 	});
	
	function processSuccess(data, status, req) {
        //alert(req.responseText + " " + status);
		console.log("Informacion Almacen", data);
   		
		$("#txtCodigoActual_relacion-zona").val(data.return.zonaId);
		$('select[id="cboxTipoActual_relacion-zona"] option:selected').val(data.return.tipoZonaId.nombre);
		$("#txtDescripcionActual_relacion-zona").val(data.return.descripcion);
		$("#txtEncargadoActual_relacion-zona").val(data.return.encargadoZona.cargoId.cargoNombre);
		
			var consulta_zona_destino = {
				"zonaId": idZonaDestino
			};
			
			$.ajax({
		        type: "POST",
		        url: '/CBPult/Almacen/consultaZonaPorZonaId',
		        contentType: "application/json",
		        dataType: "json",
		        data: JSON.stringify(consulta_zona_destino),
		        success: processSuccess,
		        error: processError
		 	});
			
			function processSuccess(data, status, req) {
		        //alert(req.responseText + " " + status);
				console.log("Informacion Almacen", data);
		   		
				$("#txtCodigoDestino_relacion-zona").val(data.return.zonaId);
				$('select[id="cboxTipoDestino_relacion-zona"] option:selected').val(data.return.tipoZonaId.nombre);
				$("#txtDescripcionDestino_relacion-zona").val(data.return.descripcion).prop('disabled', true);
				$("#cboxEncargadoDestino_relacion-zona").val(data.return.encargadoZona.cargoId.cargoNombre);
				
			}
				
			function processError(data, status, req) {
			    //alert(req.responseText + " " + status);
			   	swal("Error al contacter el servicio", data);
			}
		
	}
		
	function processError(data, status, req) {
	    //alert(req.responseText + " " + status);
	   	swal("Error al contacter el servicio", data);
	}
	
});