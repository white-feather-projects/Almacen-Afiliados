'use strict'

	var url = window.location.pathname;
	var id = url.substring(url.lastIndexOf('&') + 1);
	var idAlmacen = id.indexOf("_");
	var idAlmacen_1 = id.substring(0, idAlmacen);
	var idDestino = id.substring(id.lastIndexOf('_') + 1);
	
	console.log("id--------", id);
	console.log("idAlmacenDestino", idDestino);
	console.log("idAlmacenActual", idAlmacen_1);

window.addEventListener('load', function(){
	
	$("#btnAtras_relacion-almacen").on('click', function(){
		location.href = "/CBPult/Almacen/inventario_almacen&"+idAlmacen_1+"";
	});
	
	var consulta_Almacen_Actual = {
		"idAlmacen": idAlmacen_1
	};
	
	$.ajax({
        type: "POST",
        url: '/CBPult/Almacen/consultarAlmacenPorAlmacenId',
        contentType: "application/json",
        dataType: "json",
        data: JSON.stringify(consulta_Almacen_Actual),
        success: processSuccess,
        error: processError
 	});
	
	function processSuccess(data, status, req) {
        //alert(req.responseText + " " + status);
		console.log("Consulta Almacen Actual", data);
   		
		$("#txtCodigoActual_relacion-almacen").val(data.return.warehouseNumber);
		$('select [id="cboxTipoActual_relacion-almacen"] option:selected').val(data.return.tipoAlmacenId);
		$("#txtNameActual_relacion-almacen").val(data.return.warehouseName);
		$("#txtUbicacionActual_relacion-almacen").val(data.return.direccion);
		$("#txtGerenteActual_relacion-almacen").val(data.return.gerenteSucursal);
		
			var consulta_Almacen_Destino = {
				"idAlmacen": idDestino
			};
			
			$.ajax({
		        type: "POST",
		        url: '/CBPult/Almacen/consultarAlmacenPorAlmacenId',
		        contentType: "application/json",
		        dataType: "json",
		        data: JSON.stringify(consulta_Almacen_Destino),
		        success: processSuccess,
		        error: processError
		 	});
			
			function processSuccess(data, status, req) {
		        //alert(req.responseText + " " + status);
				console.log("Consulta Almacen Destino", data);
		   		
				$("#txtCodigoDest_relacion-almacen").val(data.return.warehouseNumber);
				$('select [id="cboxTipoDest_relacion-almacen"] option:selected').val(data.return.tipoAlmacenId);
				$("#txtNameDest_relacion-almacen").val(data.return.warehouseName);
				$("#txtUbicacionDest_relacion-almacen").val(data.return.direccion);
				$("#cboxGerenteDest_relacion-almacen").val(data.return.gerenteSucursal);
				
			}
				
			function processError(data, status, req) {
			    //alert(req.responseText + " " + status);
			   	swal("Error al contactar el servicio", data);
			}
		
	}
		
	function processError(data, status, req) {
	    //alert(req.responseText + " " + status);
	   	swal("Error al contactar el servicio", data);
	}
	
});