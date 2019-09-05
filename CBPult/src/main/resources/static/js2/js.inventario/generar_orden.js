'use strict'

	var url = window.location.pathname;
	var id = url.substring(url.lastIndexOf('&') + 1);
	var contadorProductos = 0;
	
	console.log("id--------", id);

window.addEventListener('load', function(){
	
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
   		
		$("#txtCodigo_origen").val(data.return.warehouseNumber);
		if(data.return.tipoAlmacenId == 1){
			$("#cboxTipo_origen").val("ALMACEN");
		}else if(data.return.tipoAlmacenId == 2){
			$("#cboxTipo_origen").val("LABORATORIO");
		}else if(data.return.tipoAlmacenId == 3){
			$("#cboxTipo_origen").val("SUCURSAL");
		}
		
		$("#txtDescripcion_origen").val(data.return.warehouseName).prop('disabled', true);
		$('select[id="cboxEncargado_origen"] option:selected').val(data.return.gerenteSucursal);
		
		/////Lista de Almacenes....////
		
		$.ajax({
	        type: "GET",
	        url: '/CBPult/Almacen/listaAlmacenesRelacionados/'+id,
	        dataType: "json",
	        success: processSuccess,
	        error: processError
	 	});		
		function processSuccess(data, status, req) {
	        //alert(req.responseText + " " + status);
			console.log("lista almacenes", data);
			
			for(var i=0; i<data.length; i++){
				
				if(data[i].idWarehouse != id){
					var almacen = '<option value="'+data[i].almacenDestinoId.idWarehouse+'">'+data[i].almacenDestinoId.warehouseNumber+'</option>';		  			  
	  				$("#txtCodigo_destino").append(almacen);
				}
				
				var consulta_informacion_almacen = {
					"idAlmacen": $("#txtCodigo_destino").val()
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
						$("#cboxTipo_destino").val("ALMACEN");
					}else if(data.return.tipoAlmacenId == 2){
						$("#cboxTipo_destino").val("LABORATORIO");
					}else if(data.return.tipoAlmacenId == 3){
						$("#cboxTipo_destino").val("SUCURSAL");
					}
					
					$("#txtDescripcion_destino").val(data.return.warehouseName);
					$('select[id="cboxEncargado_destino"] option:selected').val(data.return.gerenteSucursal);
					
				}
				
				function processError(data, status, req) {
				    //alert(req.responseText + " " + status);
				   	swal("Error al contactar el servicio", data);
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
	
	
	
	
	
	// Cbox Tipo de Orden
	$('#cboxTipo_orden').change(function(){
		
		$('#txtCodigo_destino option').remove();
		
		if($('#cboxTipo_orden').val() == "Orden de Transferencia"){
			
			// Listar Terceros
			$('select[id="cboxTipo_destino"]').val("TERCERO");
			$('select[id="txtDescripcion_destino"]').val("");
			
			$.ajax({
				
		        type: "GET",
		        url: '/CBPult/Inventario/listaTercero',
		        dataType: "json",
		        success: processSuccess,
		        error: processError
				
			});
			function processSuccess(data, status, req){
				
				//alert(req.responseText + " " + status);
				console.log("lista Terceros", data);
				
				for(var i=0; i<data.length; i++){
					
					if(data[i].idWarehouse != id){
						var almacen = '<option value="'+data[i].terceroId+'">'+data[i].terceroId+'</option>';		  			  
		  				$("#txtCodigo_destino").append(almacen);
					}
					// Reemplazar este if temporal por Servicio de Consultar Terero por ID Tercero
					if($("#txtCodigo_destino").val() == data[i].terceroId){
						$('#txtDescripcion_destino').val(data[i].nombre);
					}
			  	}
				
			}
			function processError(data, status, req){
				//alert(req.responseText + " " + status);
			   	swal("Error al contactar el servicio", data);
			}
			
		}
		else if($('#cboxTipo_orden').val() == "Orden de Traspaso"){
			
			/////Lista de Almacenes....////
			
			$.ajax({
		        type: "GET",
		        url: '/CBPult/Almacen/listaAlmacenesRelacionados/'+id,
		        dataType: "json",
		        success: processSuccess,
		        error: processError
		 	});		
			function processSuccess(data, status, req) {
		        //alert(req.responseText + " " + status);
				console.log("lista almacenes", data);
				
				for(var i=0; i<data.length; i++){
					
					if(data[i].idWarehouse != id){
						var almacen = '<option value="'+data[i].almacenDestinoId.idWarehouse+'">'+data[i].almacenDestinoId.warehouseNumber+'</option>';		  			  
		  				$("#txtCodigo_destino").append(almacen);
					}
	    			
			  	}
				
				var consulta_informacion_almacen = {
					"idAlmacen": $("#txtCodigo_destino").val()
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
						$("#cboxTipo_destino").val("ALMACEN");
					}else if(data.return.tipoAlmacenId == 2){
						$("#cboxTipo_destino").val("LABORATORIO");
					}else if(data.return.tipoAlmacenId == 3){
						$("#cboxTipo_destino").val("SUCURSAL");
					}
					
					$("#txtDescripcion_destino").val(data.return.warehouseName);
					$('select[id="cboxEncargado_destino"] option:selected').val(data.return.gerenteSucursal);
					
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
		}
		
	});
	
	// cambio en Código destino
	$("#txtCodigo_destino").on('change', function(){
		
		if($('#cboxTipo_orden').val() == "Orden de Transferencia"){
			
			// Listar de terceros
			$.ajax({
				
		        type: "GET",
		        url: '/CBPult/Inventario/listaTercero',
		        dataType: "json",
		        success: processSuccess,
		        error: processError
				
			});
			function processSuccess(data, status, req){
				
				//alert(req.responseText + " " + status);
				//console.log("lista Terceros", data);
				
				for(var i=0; i<data.length; i++){
					
					// Reemplazar este if temporal por Servicio de Consultar Terero por ID Tercero
					if($("#txtCodigo_destino").val() == data[i].terceroId){
						$('#txtDescripcion_destino').val(data[i].nombre);
					}
			  	}
				
			}
			function processError(data, status, req){
				//alert(req.responseText + " " + status);
			   	swal("Error al contactar el servicio", data);
			}
			
		}
		else if($('#cboxTipo_orden').val() == "Orden de Traspaso"){
			
			var consulta_informacion_almacen = {
				"idAlmacen": $("#txtCodigo_destino").val()
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
					$("#cboxTipo_destino").val("ALMACEN");
				}else if(data.return.tipoAlmacenId == 2){
					$("#cboxTipo_destino").val("LABORATORIO");
				}else if(data.return.tipoAlmacenId == 3){
					$("#cboxTipo_destino").val("SUCURSAL");
				}
				
				$("#txtDescripcion_destino").val(data.return.warehouseName);
				$('select[id="cboxEncargado_destino"] option:selected').val(data.return.gerenteSucursal);
				
			}
			
			function processError(data, status, req) {
			    //alert(req.responseText + " " + status);
			   	swal("Error al contactar el servicio", data);
			}
			
		}
		
	})
	
	
	// Detalle de la Orden
	$('#btnNuevo_detalle').click(function(){
		contadorProductos++;
		var htmlAlmacen = `
			<div class="row">
									                                            
	        	<!-- Card 1 -->
	            <div class="col-sm-12">
	                <div class="card">
	                    <div class="card-header">
	                        <div class="card-header-rigth">									                                                            	
	                        </div>
	                    </div>
	                    <div class="card-block">
	                    	<!-- Titulo de Card -->
	                    	<h4 id="titleAlmacen" class="sub-title">Información de Almacén</h4>
	                    	
	                    	<!-- Row -->                                                        	
	                    	<div class="row">
	                    		
	                    		<!-- Contenido de Card -->
	                    		
	                    		<div class="col-sm-6">
	                                <label class="col-sm-12 col-form-label">Nombre Producto</label>
	                                <div class="col-sm-12">
	                                    <input type="text" id="txtNombreProducto" class="form-control" placeholder="Nombre Producto">
	                                </div>
	                        	</div>	   
	                        	
	                        	<div class="col-sm-6">
	                                <label class="col-sm-12 col-form-label">Cantidad Producto</label>
	                                <div class="col-sm-12">
	                                    <input type="text" id="txtCantidadProducto" class="form-control" placeholder="Cantidad Producto">
	                                </div>
	                        	</div>	
	                            
	                    		<!-- Contenido de Card -->  
	                                
	                		</div>
	            			<!-- Row -->                                                      		                                                        	
	                	 	                                                 
	        			</div>
	                	
	    			</div>
				</div>
	            <!-- Card 1 -->
	            
			</div>
		`
    	
    	Swal.fire({
    		title: '<strong>Nuevo Producto</strong>',
    		type: 'info',
    		html: htmlAlmacen,
    		showCloseButton: true,
    		focusConfirm: false,
    		confirmButtonText:'Agregar',
    	}).then(function(a, b, c){
    		$('#simpletable').append(
				`<tr id="`+contadorProductos+`">
					<td>`+$('#txtNombreProducto').val()+`</td>
					<td>`+$('#txtCantidadProducto').val()+`</td>
					<td>
	            		<a onclick="alert('Relación Eliminada')">
	            			<img alt="Eliminar" src="/CBPult/img2/bin_delete_file_garbage_recycle_remove_trash_icon_123192.ico" width="30px">
	            		</a>
	            	</td>
				</tr>`
    		);
    		
    	});
		
	});
	
	$("#btnAtras_movimiento").on('click', function(){
		
		location.href='/CBPult/Almacen/inventario_almacen&'+id+'';
		
	});
	
	// Para remover la fila de las tablas que aparece cuando no hay registros
	var body = $('#simpletable');
	body.find( 'tbody tr:eq(0)').remove();
	
});