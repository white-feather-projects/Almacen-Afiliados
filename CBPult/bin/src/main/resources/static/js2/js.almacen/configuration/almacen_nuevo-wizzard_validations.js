var data_almacen; // para capturar la toda la info del modulo (Almacen, Zonas, Relaciones)
var data_zonas; // se usa para capturar las Zonas i se incrusta en "data_almacen" en el atributo "zonasAlmacen"

var txtDescAlmacen = $('#txtDesc_almacen');
var txtUbicacionAlmacen = $('#txtUbicacion_almacen');

var contenedor_relZonas = $('#relaciones_zonas');
var listar = 0;

var url = window.location.pathname;
var IdAlmacen =  url.substring(url.lastIndexOf('&') + 1);


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

if(IdAlmacen === "nuevo"){
	
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
					
					if(validated == 2){
						
						// Creacion del Almacén
						
						data_almacen = {
							"direccion": $('#txtUbicacion_almacen').val(),
						    "gerenteSucursal": parseInt($('select[id="cboxEncargado_almacen"] option:selected').attr('name')),
						    "officeId": 1,
						    "tipoAlmacen": $('#cboxTipo_almacen').val(),
						    "tipoAlmacenId": parseInt($('select[id="cboxTipo_almacen"] option:selected').attr('name')),
						    "warehouseName": $('#txtDesc_almacen').val(),
						    "zonas": []
						};					
						console.log("Info del Almacen", data_almacen);
						
					}else if(validated != 2){
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
					data_zonas = zonaListTemp.map(function(zona, i){	
						var estanterias = $('#simpletable'+zona.zona.id+' tbody tr');
						var estanterias_json = [];
						
						for (var j = 0; j < estanterias.length; j++) {
							var modulo, nivel;
							for (var k = 0; k < estanterias[j].cells.length; k++) {							
								if(k == 0){
									modulo = estanterias[j].cells[k].innerHTML;
								}
								else if(k == 1){
									nivel = estanterias[j].cells[k].innerHTML;
								}							
							}
							estanterias_json.push([modulo, nivel]);
						}
						
						return {
							"id": zona.zona.id,
							"tipoZona": $('#cboxTipo_zona'+zona.zona.id).val(),
							"IdTipoZona": parseInt($('select[id="cboxTipo_zona'+zona.zona.id+'"] option:selected').attr('name')),
							"descripcionZona": $('#txtDescripcion_zona'+zona.zona.id).val(),
							"encargadoZona": $('#cboxEncargado_zona'+zona.zona.id).val(),
							"estanteriasZona": estanterias_json,
							"relacionesZona": []
						}
					});	
					
					data_almacen.zonas = data_zonas;
					console.log("Almacen: ", data_almacen);
				}			
				
			}		
			// tab Zonas
			
			if(currentIndex === 2){
				
				// para no cargar a cada rato la Tabla de Relaciones del Almacén
				if(listar == 0){
					listarAlmacenesRelServ();
					listar++;
				}
				
				for (var i = 0; i < data_zonas.length; i++) {
					
					// Llenado de los campos de las Zonas en Relaciones
					$('#cboxTipo_zonarel'+data_zonas[i].id).val(data_zonas[i].tipoZona);
					$('#txtDescripcion_zonarel'+data_zonas[i].id).val(data_zonas[i].descripcionZona);
					$('#cboxEncargado_zonarel'+data_zonas[i].id).val(data_zonas[i].encargadoZona);
					// Llenado de los campos de las Zonas en Relaciones
					
					// Llenado de Tablas de Relaciones
					for (var j = 0; j < data_zonas.length; j++) {
						
						if(j != i){
							$('#tbodyrel_'+data_zonas[i].id).append(`
								<tr>
									<td style="text-align:center">
										<div class="row" style="display: inline-block">
			                                <div class="col-sm-4"><input type="checkbox" class="js-switch-blue_rel" data-switchery="true" style="display: none;"></div>
			                            </div>
									</td>							
									<td>`+data_zonas[j].tipoZona+`</td>
									<td>`+data_zonas[j].descripcionZona+`</td>
									<td>`+data_zonas[j].encargadoZona+`</td>
								</tr>						`
							);
						}	
						
					}
					// Llenado de Tablas de Relaciones
					
				}			
				// Cargar Switches de las Tablas de Relación de las Zonas
				Array.prototype.forEach.call($('.js-switch-blue_rel'), (item, i)=>{
					var actual_switch = new Switchery(item, {
						color: '#17a2b8',
						secondaryColor: '#e0e0e0',
						jackSecondaryColor: '#17a2b8'
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
			
			// Construyendo los objetos de las Relaciones
			// Relaciones de Almacén
			var centerSwitchesRel = $('#simpletablerel .uno center');
			var centerIdAlmacenRel = $('#simpletablerel .dos center');
			
			console.log(centerSwitchesRel);
			
			// Consumo de Servicios - ServicesConfigurationWarehouse.js
			//crearAlmacenServ();
		}

	});
	
}
else{
	alert("perelo manito");
}

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