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
	
	var cont = 0;
	
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
    		confirmButtonText:'<i class="fa fa-thumbs-up"></i> OK!',
    	}).then(function(a, b, c){
    		if($('#txtNombreProducto').val().length >= 1 && $('#txtCantidadProducto').val().length >= 1){
    			
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
    			
    			cont = cont + 1;
    			console.log(cont);
    			
    			if(cont == 1){
    				
    				var objetoJSON = [{'numeral': cont, 'nombre_producto': $('#txtNombreProducto').val(), 'cantidad_producto': $('#txtCantidadProducto').val()}];
        			
        			localStorage.setItem('productos', JSON.stringify(objetoJSON));
        			
        			console.log(objetoJSON);
        			
    			}else if(cont >= 2){
    				
    				var objetoJSON = {'numeral': cont, 'nombre_producto': $('#txtNombreProducto').val(), 'cantidad_producto': $('#txtCantidadProducto').val()};
    				
    				var objetoStorage = JSON.parse(localStorage.getItem('productos'));
    				objetoStorage.push(objetoJSON);
    				
    				localStorage.setItem('productos', JSON.stringify(objetoStorage));
    				
    				console.log(objetoStorage);
    				
    			}
    			
    		}
    		
    	});
		
	});
	
	$("#btnAtras_movimiento").on('click', function(){
		
		location.href='/CBPult/Almacen/inventario_almacen&'+id+'';
		
	});
	
	$("#btnGenerar_movimiento").on('click', function(){
		
		var nombreTipoOrden;
		var tipoOrdenId;
		
		if($("#cboxTipo_orden").text() === "Orden de Transferencia"){
			
			nombreTipoOrden = "TRANSFERENCIA";
			tipoOrdenId = 3;
			
		}else if($("#cboxTipo_orden").text() === "Orden de Traspaso"){
			
			nombreTipoOrden = "TRASPASO";
			tipoOrdenId = 4;
			
		}
		
			var crear_orden_relacionada = {
					"ordenRelacionadaNumber": "",
					"tipoOrdenId": {
						"nombre": nombreTipoOrden,
						"tipoOrdenId": tipoOrdenId
					},
					"descripcion": "",
					"idProduct": {
						"catalogueId": {
							"catalogueActive": "1",
							"catalogueName": "1",
							"codigoUsuarioModifica": "1",
							"fechaHoraCarga": "1",
							"fechaHoraModificacion": "1"
						},
						"codigoUsuarioModifica": "1",
						"fechaHoraCarga": "1",
						"fechaHoraModificacion": "1",
						"idProduct": "",
						"productActive": "",
						"productLogo": "",
						"productName": "",
						"warehouseId": ""
					},
					"cantidad": "",
					"fechaCargaDatos": ""
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
		
	});
	
});