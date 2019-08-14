var data_almacen; // para capturar la toda la info del modulo (Almacen, Zonas, Relaciones)
var data_zonas;// se usa para capturar las Zonas i se incrusta en "data_almacen" en el atributo "zonasAlmacen"

var txtDescAlmacen = $('#txtDesc_almacen');
var txtUbicacionAlmacen = $('#txtUbicacion_almacen');
var contenedor_relZonas = $('#relaciones_zonas');

//Se usa para Crear una nueva Zona en el Tab de Relaciones
/*
var html_relacion_zona = `
	<!-- Zona Relacion -->
    <div id="" class="zona col-sm-12 card" style="border: none">
    	
    	<div class="row">
    		
    		<!-- Card 1 -->
        	<div class="col-sm-4">											                                            	                                   
            	<div class="card">                                                   
                	<div class="card-block">
                		<!-- Titulo de Card -->
                    	<h4 class="sub-title">Información de Zona</h4>
                    	
                    	<!-- Row -->                                                        	
                    	<div class="row">
                    		
                    		<!-- Contenido de Card -->  
                    		<div class="col-sm-12">
                                <label class="col-sm-12 col-form-label">Código de Zona</label>
                                <div class="col-sm-12">
                                    <input type="text" id="txtCodigo_zona" class="form-control" placeholder="Codigo" disabled>
                                </div>
                        	</div>
                        
                            <div class="col-sm-12 mobile-inputs">
                                <label class="col-sm-12 col-form-label">Tipo Zona</label>
                                <div class="col-sm-12">
                                    <select name="select" id="cboxTipo_zona" class="form-control" disabled>
                                        <option value="Recibo">Recibo</option>
                                        <option value="Almacenaje">Almacenaje</option>
                                        <option value="Almacenaje Restringido">Almacenaje Restringido</option>
                                        <option value="Despacho">Despacho</option>
                                    </select>
                         		</div>
                            </div>
                            
                            <div class="col-sm-12 mobile-inputs">
                            	<label class="col-sm-12 col-form-label">Descripción Zona</label>
                            	<div class="col-sm-12">
                                    <input type="text" id="txtDescripcion_zona" class="form-control" placeholder="" disabled>
                                </div>
                            </div>	                                                        	
                            
                            <div class="col-sm-12 mobile-inputs">
                                <label class="col-sm-12 col-form-label">Encargado de Zona</label>
                                <div class="col-sm-12">
                                    <select name="select" id="cboxEncargado_zona" class="form-control" disabled>
                                        <option value="Elon Musk">Elon Musk</option>
                                        <option value="Einstein">Einstein</option>
                                        <option value="Jack Ma">Jack Ma</option>
                                    </select>
                         		</div>
                            </div>
                            <!-- Contenido de Card -->  
                            
                    	</div>
                    	<!-- Row -->                                                      		                                                        	
                                                                  
                	</div>
            	</div> 
        	                                
            </div>
            <!-- Card 1 -->											                                            
            
            <!-- Card 2 -->
        	<div class="col-sm-8"> 
        	                                           
            	<div class="card">                                                   
                	<div class="card-block">
                		<!-- Titulo de Card -->
                    	<h4 class="sub-title">Zonas Relacionadas</h4>
                    	
                    	<!-- Fila 1 -->                                      
                    	<div class="row">
                    		<div class="col-sm-12">
                    		
                    			
                    			
                    			<div class="dt-responsive table-responsive">
                                    <table id="simpletable" class="table table-striped table-bordered displayrel`+contador_zonas+` nowrap">
                                        <thead>
											<tr>
												<th>Relacionar</th>
												<th>Código de Zona</th>
												<th>Tipo de Zona</th>
												<th>Descripción</th>							                                                        
												<th>Encargado</th>																																																																
											 </tr>
										</thead>
										<tbody id="rel-zona`+contador_zonas+`">
										    <tr>
										    	<td>
										    		<div><input type="checkbox" class="js-switch-blue-zona" data-switchery="true" style="display: none;"></div>
										    	</td>
										    	<td>R1 ( OBLIGATORIO )</td>
										    	<td>Recibo</td>
										    	<td>Recibo de Nueva Mercancia</td>
										    	<td>Alfred Newman</td>																														    																														    	
										    </tr>
										    <tr>
										    	<td>
										    		<div><input type="checkbox" class="js-switch-blue-zona" data-switchery="true" style="display: none;"></div>
										    	</td>
										    	<td>R2</td>
										    	<td>Recibo</td>
										    	<td>Recibo de Mercancia en Reparaciones</td>
										    	<td>Carlos Rater</td>																														    	
										    </tr>
										    <tr>
										    	<td>
										    		<div><input type="checkbox" class="js-switch-blue-zona" data-switchery="true" style="display: none;"></div>
										    	</td>
										    	<td>A1</td>
										    	<td>Alcenaje</td>
										    	<td>Almacenaje General</td>
										    	<td>Carlos Rater</td>																														    	
										    </tr>
										    <tr>
										    	<td>
										    		<div><input type="checkbox" class="js-switch-blue-zona" data-switchery="true" style="display: none;"></div>
										    	</td>
										    	<td>X1</td>
										    	<td>Alcenaje Restringido</td>
										    	<td>Almacenaje de Mercancia de alto valor</td>
										    	<td>Empleado X</td>																														    	
										    </tr>
										    <tr>
										    	<td>
										    		<div><input type="checkbox" class="js-switch-blue-zona"  data-switchery="true" style="display: none;"></div>
										    	</td>
										    	<td>D1 ( OBLIGATORIO )</td>
										    	<td>Despacho</td>
										    	<td>Despacho de Mercancias</td>
										    	<td>Stiven Rutherford</td>																														    	
										    </tr>
										    
										</tbody>
                                    </table>
                               	</div>                                                        			
                               	
                               	
                    		</div> 
                    	</div>                                                                                                                           
                	</div>
                	<!-- Fila 1 -->                                                   	
                	                                                         
            	</div>
        	</div>
        	<!-- Card 2 -->
    	                                
        </div>
    </div>										                                            
    <!-- Zona Relacion -->
`;
*/
$(document).ready(function(){

	// Validaciones de contenido
	// tab Almacen
	txtDescAlmacen.blur(function(){
		if(txtDescAlmacen.val().length > 0){
			
		}else{
			txtDescAlmacen.css("border", "1px solid red");
		}		
	});
	
	txtUbicacionAlmacen.blur(function(){
		if(txtUbicacionAlmacen.val().length > 0){
			
		}else{
			txtUbicacionAlmacen.css("border" , "1px solid red");
		}
	});
	// tab Almacen
	
});

$('#demo').steps({
	
	onChange: function (currentIndex, newIndex, stepDirection) {
		
		// tab Almacen
		if(currentIndex === 0){
			
			if(stepDirection === 'forward'){
				
				var validated = 0;
				
				// Validaciones de Vacio
				if(txtDescAlmacen.val().length > 0){
					validated++;
				}else{
					txtDescAlmacen.css("border" , "1px solid red");
				}
				///
				if(txtUbicacionAlmacen.val().length > 0){
					validated++;
				}else{
					txtUbicacionAlmacen.css("border" , "1px solid red");
				}
				///
				
				// Validacion Encargado
				var Encargado = $('#cboxEncargado_almacen').val(); // lo necesito porque el servicio de Crear me pide el IdTipo Almacen, mas no el Tipo en si
				var idEncargado;
				if(Encargado === 'Elon Musk'){
					idEncargado = 1;
				}
				else if(Encargado === 'Einstein'){
					idEncargado = 2;
				}
				else if(Encargado === 'Jack Ma'){
					idEncargado = 3;
				}
				else{
					console.log("Encargado no Existente");
					idEncargado = null;
				}
				// Validacion Encargado
				
				// Validacion Tipo Almacen
				var tipoAlmacen = $('#cboxTipo_almacen').val(); // lo necesito porque el servicio de Crear me pide el IdTipo Almacen, mas no el Tipo en si
				var idTipoAlmacen;
				if(tipoAlmacen === 'Almacén'){
					idTipoAlmacen = 1;
				}
				else if(tipoAlmacen === 'Laboratorio'){
					idTipoAlmacen = 2;
				}
				else if(tipoAlmacen === 'Sucursal'){
					idTipoAlmacen = 3;
				}
				else{
					console.log("Tipo de Almacén no Existente");
					idTipoAlmacen = null;
				}
				// Validacion Tipo Almacen
				
				
				// Validacion y Creacion Id Almacen
				var warehouseText;
				var IdAlmacen = $('#txtCodigo_almacen').val();
				if(idTipoAlmacen == 1){
					warehouseText = "Almacen-"+IdAlmacen;
				}		
				else if(idTipoAlmacen == 2){
					warehouseText = "Laboratorio-"+IdAlmacen;
				}
				else if(idTipoAlmacen == 3){
					warehouseText = "Sucursal-"+IdAlmacen;
				}
				else{
					console.log("No se puede Enviar Id, Tipo de Almacén no Existente");
					warehouseText = null;
				}
				// Validacion y Creacion Id Almacen
				
				if(validated == 2){
					
					// Creacion del Almacén
					
					data_almacen = {
						"direccion": $('#txtUbicacion_almacen').val(),
					    "gerenteSucursal": idEncargado,
					    "officeId": 1,
					    "productId": 1,
					    "tipoAlmacenId": idTipoAlmacen,
					    "warehouseName": $('#txtDesc_almacen').val(),
					    "warehouseNumber": warehouseText
					};
					/* Consumo 
					$.ajax({
 		               type: "POST",
 		               url: '/CBPult/Afiliacion/crearAlmacen',
 		               contentType: "application/json",
 		               dataType: "json",
 		               data: JSON.stringify(data_almacen),
 		               success: processSuccess,
 		               error: processError
	 		        });
					function processSuccess(data, status, req) {
	 		            //alert(req.responseText + " " + status);
	 		       		console.log(data);
	 		       		
		 		       	if(data.return.descripcion === "FAIL"){
	 		           		swal("Error al Crear Almacén", data.return.descripcion);
	 		           		return false;	 		           		
	 		           	}else if(data.return.descripcion === "OK"){
		 		           	document.getElementById("txtUbicacion_almacen").disabled = true;
		 		            document.getElementById("cboxEncargado_almacen").disabled = true;
		 		            document.getElementById("cboxTipo_almacen").disabled = true;
		 		            document.getElementById("txtDesc_almacen").disabled = true;
		 		            document.getElementById("txtCodigo_almacen").disabled = true;
		 		           	
		 		           	swal("Almacén Creado", data.return.descripcion);
	 		           		return true;	 		           		
	 		           	}else if(data.return.descripcion === "Almacen ya existe"){
	 		           		valid = false;
	 		           		return valid;	 		           		
	 		           	}
 		       		}
 		       	
 		       		function processError(data, status, req) {
	 		            //alert(req.responseText + " " + status);
	 		       		swal("Error al contactar el servicio", data);
	 		           	valid = false;
	 		           	return valid;
 		       		}*/
					// Creacion del Almacén
					
					//console.log(data_almacen);
					//swal("Valido");
					
				}else if(validated != 2){
					//swal("invalido");
					return false;
				}				
				
			}
			
		}
		// tab Almacen
		
		
		// tab Zonas
		/// Las valla parte de Zonas está en "almacen_nuevo-wizzard_funcionalidad.js"
		if(currentIndex === 1){
			
			if(stepDirection === 'forward'){
				
				// Armando el Json de listZonas		
				console.log("Zonas que pasan a Relaciones", zonaListTemp);				
				data_zonas = zonaListTemp.map(function(zona, i){	
					var estanterias = $('#simpletable'+zona.zona.id+' tbody tr');
					var estanterias_json = [];
					
					for (var i = 0; i < estanterias.length; i++) {
						var modulo, nivel;
						for (var j = 0; j < estanterias[i].cells.length; j++) {							
							if(j == 1){
								modulo = estanterias[i].cells[j].innerHTML;
							}
							else if(j == 2){
								nivel = estanterias[i].cells[j].innerHTML;
							}							
						}
						estanterias_json.push([modulo, nivel]);
					}
					
					return {
						"id": zona.zona.id,
						"tipoZona": $('#cboxTipo_zona'+zona.zona.id).val(),
						"descripcionZona": $('#txtDescripcion_zona'+zona.zona.id).val(),
						"encargadoZona": $('#cboxEncargado_zona'+zona.zona.id).val(),
						"estanteriasZona": estanterias_json
					}
				});				
				console.log("Pasan a Relaciones: ", data_zonas);
				
			}			
			
		}		
		// tab Zonas
		
		if(currentIndex === 2){
			// $('#tbodyrel_'+i+).append();
			for (var i = 0; i < data_zonas.length; i++) {
				console.log("Zona Actual", data_zonas[i]);
				console.log('Relaciones de Zona '+i);
				
				// Llenado de los campos de las Zonas en Relaciones
				$('#cboxTipo_zonarel'+data_zonas[i].id).val(data_zonas[i].tipoZona);
				$('#txtDescripcion_zonarel'+data_zonas[i].id).val(data_zonas[i].descripcionZona);
				$('#cboxEncargado_zonarel'+data_zonas[i].id).val(data_zonas[i].encargadoZona);
				// Llenado de los campos de las Zonas en Relaciones
				
				for (var j = 0; j < data_zonas.length; j++) {
					
					if(j != i){
						console.log(data_zonas[j]);
						$('#tbodyrel_'+data_zonas[i].id).append(`
							<tr>
								<td>
									<div class="row">
		                                <div class="col-sm-4"><input type="checkbox" class="js-switch-blue_rel" checked="" data-switchery="true" style="display: none;" id="cboxSegundoNombre_RepLegal"></div>
		                            </div>
								</td>							
								<td>`+data_zonas[j].tipoZona+`</td>
								<td>`+data_zonas[j].descripcionZona+`</td>
								<td>`+data_zonas[j].encargadoZona+`</td>
							</tr>
						`);
					}					
					
				}				
				
			}
			
			// Cargar Switches
			Array.prototype.forEach.call($('.js-switch-blue_rel'), (item, i)=>{
				var actual_switch = new Switchery(item, {
					color: '#17a2b8'
				});
			});
			
			if(stepDirection === 'backward'){
				// para limpiar los registros de las Tablas en Relaciones
				for (var i = 0; i < data_zonas.length; i++) {					
					$('#tbodyrel_'+data_zonas[i].id+' *').remove();					
				}				
			}
			
		}
    	
		return true;        
	},
	onFinish: function () {
		//alert('Wizard Completed');
		location.href = "/CBPult/Almacen/configuration_almacen";
	}

});

function soloTexto1(texto){
	var patron = /^[A-Za-z \u00C0-\u017F]*$/;
	if(texto.val().search(patron)){
		texto.css("border", "1px solid red");
		texto.val("");
		swal("Solo Texto");
	}
	else{
		texto.css("border", "1px solid #20c997");
	}
}

function soloNumeros(numero){
	var patron = /^([0-9])*$/;
	if(numero.val().search(patron)){
		numero.css("border", "1px solid red");
		numero.val("");	
		swal("Solo Numeros");			
	}else{
		numero.css("border", "1px solid #20c997");
	}
}

function recorrerswitch(){
	//alert("dentro Switches");
	var blue_switches = $('.js-switch-blue-zona');
	console.log(blue_switches);
	
	Array.prototype.forEach.call(blue_switches, (item, i)=>{
		var actual_switch = new Switchery(item, {
			color: '#17a2b8'
		});
	});

}

function soloLetrasYNum(campo) {
	 var validos = " abcdefghijklmnopqrstuvwxyz0123456789";
	 var letra;
	 var bien = true;
	 for (var i=0; i<campo.value.length; i++) {
		  letra=campo.value.charAt(i).toLowerCase()
		  if (validos.indexOf(letra) == -1){bien=false;};
		  }
		  if (!bien) {
			  campo.value = "";
			  swal("Campo Alfanumerico");
			  //campo.focus();
		  }
}