'use strict'

	var url = window.location.pathname;
	var id = url.substring(url.lastIndexOf('&') + 1);
	
	console.log("id--------", id);

window.addEventListener('load', function(){
	
	$("#txtCodigo_orden_2").on('change', function(){
		console.log("holi");
		
			var consulta_informacion_almacen = {
				"idAlmacen": $("#txtCodigo_orden_2").val()
			};
			
			$.ajax({
		        type: "POST",
		        url: '/CBPult/Almacen/consultarAlmacenPorAlmacenId',
		        contentType: "application/json",
		        dataType: "json",
		        data: JSON.stringify(consulta_informacion_almacen),
		        success: processSuccess,
		        error: processError
		 	});
			
			function processSuccess(data, status, req) {
		        //alert(req.responseText + " " + status);
				console.log("consulta almacen destino", data);
				
				if(data.return.tipoAlmacenId == 1){
					$("#cboxTipo_orden_2").val("ALMACEN");
				}else if(data.return.tipoAlmacenId == 2){
					$("#cboxTipo_orden_2").val("LABORATORIO");
				}else if(data.return.tipoAlmacenId == 3){
					$("#cboxTipo_orden_2").val("SUCURSAL");
				}
				
				$("#txtDescripcion_orden_2").val(data.return.warehouseName);
				$('select[id="cboxEncargado_orden_2"] option:selected').val(data.return.gerenteSucursal);
				
			}
			
			function processError(data, status, req) {
			    //alert(req.responseText + " " + status);
			   	swal("Error al contactar el servicio", data);
			}
		
	})
	
	var consulta_informacion_almacen = {
		"idAlmacen": id
	};
	
	$.ajax({
        type: "POST",
        url: '/CBPult/Almacen/consultarAlmacenPorAlmacenId',
        contentType: "application/json",
        dataType: "json",
        data: JSON.stringify(consulta_informacion_almacen),
        success: processSuccess,
        error: processError
 	});
	
	function processSuccess(data, status, req) {
        //alert(req.responseText + " " + status);
		console.log("Informacion Almacen origen", data);
   		
		$("#txtCodigo_orden_1").val(data.return.warehouseNumber);
		if(data.return.tipoAlmacenId == 1){
			$("#cboxTipo_orden_1").val("ALMACEN");
		}else if(data.return.tipoAlmacenId == 2){
			$("#cboxTipo_orden_1").val("LABORATORIO");
		}else if(data.return.tipoAlmacenId == 3){
			$("#cboxTipo_orden_1").val("SUCURSAL");
		}
		
		$("#txtDescripcion_orden_1").val(data.return.warehouseName).prop('disabled', true);
		$('select[id="cboxEncargado_orden_1"] option:selected').val(data.return.gerenteSucursal);
		
		/////Lista de Almacenes....////
		
		$.ajax({
	        type: "GET",
	        url: '/CBPult/Almacen/listaAlmacenes',
	        dataType: "json",
	        success: processSuccess,
	        error: processError
	 	});
		
		function processSuccess(data, status, req) {
	        //alert(req.responseText + " " + status);
			console.log("lista almacenes", data);
			
			for(var i=0; i<data.length; i++){
				
				if(data[i].idWarehouse != id){
					var almacen = '<option value="'+data[i].idWarehouse+'">'+data[i].warehouseNumber+'</option>';
		  			  
	  				$("#txtCodigo_orden_2").append(almacen);
				}
    			
		  	}
			
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
	
	//////////////////////////////////////////////
	
	$("#btnAtras_movimiento").on('click', function(){
		
		location.href='/CBPult/Almacen/inventario_almacen&'+id+'';
		
	});
	
});