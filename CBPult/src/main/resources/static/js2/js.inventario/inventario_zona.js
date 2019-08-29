'use strict'

	var url = window.location.pathname;
	var id = url.substring(url.lastIndexOf('&') + 1);
	
	console.log("id--------", id);

window.addEventListener('load', function(){
	
	var consulta_detalle_zona = {
		"zonaId": id
	};

	$.ajax({
        type: "POST",
        url: '/CBPult/Almacen/consultaZonaPorZonaId',
        contentType: "application/json",
        dataType: "json",
        data: JSON.stringify(consulta_detalle_zona),
        success: processSuccess,
        error: processError
 	});
	
	function processSuccess(data, status, req) {
        //alert(req.responseText + " " + status);
		console.log("Informacion Almacen", data);
   		
		$("#txtCodigo_zona").val(data.return.zonaId).prop('disabled', true);
		$('select[id="cboxTipo_zona"] option:selected').val(data.return.tipoZonaId.nombre);
		document.getElementById("cboxTipo_zona").disabled = true;
		$("#txtDescripcion_zona").val(data.return.descripcion).prop('disabled', true);
		$('select[id="cboxEncargado_zona"] option:selected').val(data.return.encargadoZona.cargoId.cargoNombre);
		document.getElementById("cboxEncargado_zona").disabled = true;
		
		
		
	}
		
	function processError(data, status, req) {
	    //alert(req.responseText + " " + status);
	   	swal("Error al contacter el servicio", data);
	}
	
});