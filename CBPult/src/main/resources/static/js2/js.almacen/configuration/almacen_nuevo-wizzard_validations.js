var data_almacen; // para capturar la toda la info del modulo (Almacen, Zonas, Relaciones)
var data_zonas = []; // se usa para capturar las Zonas y se incrusta en "data_almacen" en el atributo "zonasAlmacen"
var zonas_response = "";
var zonas_creadas = false;

var txtDescAlmacen = $('#txtDesc_almacen');
var txtUbicacionAlmacen = $('#txtUbicacion_almacen');

var contenedor_relZonas = $('#relaciones_zonas');
var listar = 0

var valid_descZonas = 0;
var empty_Estanterias = 0;
var valid = false;

var url = window.location.pathname;
var Tipo = url.substring(url.lastIndexOf('%') + 1);
var IdAlmacen =  url.substring(url.lastIndexOf('&') + 1);



$(document).ready(function(){
	
	// Validaciones de contenido
	// tab Almacen
	txtDescAlmacen.blur(function(){
		if(txtDescAlmacen.val().length <= 0){
			txtDescAlmacen.css("border", "1px solid red");
		}
		else{
			txtDescAlmacen.css("border", "1px solid #20c997");
		}
	});
	
	txtUbicacionAlmacen.blur(function(){
		if(txtUbicacionAlmacen.val().length <= 0){
			txtUbicacionAlmacen.css("border" , "1px solid red");
		}
		else{
			txtUbicacionAlmacen.css("border", "1px solid #20c997");
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
						return true;
						
					}else if(validated != 2){
						return false;
					}				
					
				}
				
			}
			// tab Almacen
			
			
			// tab Zonas
			/// El código que hace funcionar el tab de Zonas está en "almacen_nuevo-wizzard_funcionalidad.js"
			if(currentIndex === 1){
				
				if(stepDirection === 'forward'){
					
					valid_descZonas = 0;
					empty_Estanterias = 0;
					
					// Construyendo el Json de listZonas					
					data_zonas = zonaListTemp.map(function(zona, i){	
						var estanterias = $('#simpletable'+zona.zona.id+' tbody tr');
						var estanterias_json = [];
											
						if($('#txtDescripcion_zona'+zona.zona.id).val().length > 0){
							valid_descZonas++;
						}
						else{
							$('#txtDescripcion_zona'+zona.zona.id).css("border" , "1px solid red");
						}
						
						if(estanterias.length < 1){
							estanterias_json.push([1,1]);												        
							empty_Estanterias++;
						}
						else{
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
					
				}
				
				if(valid_descZonas == data_zonas.length){
					if(empty_Estanterias > 0 && zonas_creadas == false){
						//////////////////
						Swal.fire({
				        	title: "Zonas con Estanterias Vacias",
						    text: "Se creará una Estanteria con (1) Nivel y (1) Módulo para las Zonas sin Estanterias, Regresa y crea Estanterias en las Zonas donde las Necesites!!",
						    type: "warning",
						    confirmButtonColor: '#3085d6',
						    confirmButtonText: 'OK'	               
				        });
				        //////////////////
						empty_Estanterias = 0;
					}
					return true;
				}
				else{
					//////////////////  
					Swal.fire({
						title: "Debes Llenar Todos los Campos de las Zonas",
						text: "",
						type: "warning",
						confirmButtonColor: '#3085d6',
						confirmButtonText: 'OK'	               
					});
					//////////////////
					return false;
				}
				
				
			}
			
			// tab Relaciones de Almacén		
			if(currentIndex === 2){
				
				// para no cargar a cada rato la Tabla de Relaciones del Almacén
				if(listar == 0){
					listarAlmacenesRelServ();
					listar++;
				}				
				
				if(stepDirection === 'forward'){

					// Consumo de Servicios - ServicesConfigurationWarehouse.js
					// Almacén, Zonas y Estanterias
					
					const swalWithBootstrapButtons = Swal.mixin({
						customClass: {
							confirmButton: 'btn btn-success',
							cancelButton: 'btn btn-danger'
						},
						buttonsStyling: false
					})
					if(valid == false){
						swalWithBootstrapButtons.fire({
							title: '¿Quires Continuar?',
							text: "Al Continuar se Creará el Almacén! Ya no podrás modificar mas la Información anterior, tendras que modificarla desde el proceso de Modificación",
							type: 'warning',
							showCancelButton: true,
							confirmButtonText: 'Si, Continuar!',
							cancelButtonText: 'No',
							reverseButtons: true
						}).then((result) => {
							if(result.value) {
								valid = true;
								crearAlmacenServ();							
							}
							else if(result.dismiss === Swal.DismissReason.cancel) {
								
								swalWithBootstrapButtons.fire(
										'Sigue Configurando!!',
										'Modifica tu Almacén y luego podras Crear las Relaciones de las Zonas :)',
										'info'
								)
								
							}
						})
					}
					return valid;
				}
				
			}
			
			// tab Relaciones de Zonas
			if(currentIndex === 3){
				
				crearFormsZonasRel();
				
			}
	    	
			return true;        
		},
		onFinish: function () {
			// - Creacion de Relaciones de Zonas
			crearRelacionesZonasServ();
			
			Swal.fire({
	        	title: "¡¡¡ Cofiguración Completada !!!",
			    text: "",
			    type: "success",
			    confirmButtonColor: '#3085d6',
			    confirmButtonText: 'Genial!'	               
	        }).then((result) => {
	        	if (result.value) {
	        		window.location.href = '/CBPult/Almacen/configuration_almacen';
	        	}
	        });			
			
		}

	});
	
}
else if(IdAlmacen === "editar"){
	
	alert("Modificando");
	
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
						return true;
						
					}else if(validated != 2){
						return false;
					}				
					
				}
				
			}
			// tab Almacen
			
			
			// tab Zonas
			/// El código que hace funcionar el tab de Zonas está en "almacen_nuevo-wizzard_funcionalidad.js"
			if(currentIndex === 1){
				
				if(stepDirection === 'forward'){
					
					valid_descZonas = 0;
					empty_Estanterias = 0;
					
					// Construyendo el Json de listZonas					
					data_zonas = zonaListTemp.map(function(zona, i){	
						var estanterias = $('#simpletable'+zona.zona.id+' tbody tr');
						var estanterias_json = [];
											
						if($('#txtDescripcion_zona'+zona.zona.id).val().length > 0){
							valid_descZonas++;
						}
						else{
							$('#txtDescripcion_zona'+zona.zona.id).css("border" , "1px solid red");
						}
						
						if(estanterias.length < 1){
							estanterias_json.push([1,1]);												        
							empty_Estanterias++;
						}
						else{
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
					
				}
				
				if(valid_descZonas == data_zonas.length){
					if(empty_Estanterias > 0 && zonas_creadas == false){
						//////////////////
						Swal.fire({
				        	title: "Zonas con Estanterias Vacias",
						    text: "Se creará una Estanteria con (1) Nivel y (1) Módulo para las Zonas sin Estanterias, Regresa y crea Estanterias en las Zonas donde las Necesites!!",
						    type: "warning",
						    confirmButtonColor: '#3085d6',
						    confirmButtonText: 'OK'	               
				        });
				        //////////////////
						empty_Estanterias = 0;
					}
					return true;
				}
				else{
					//////////////////  
					Swal.fire({
						title: "Debes Llenar Todos los Campos de las Zonas",
						text: "",
						type: "warning",
						confirmButtonColor: '#3085d6',
						confirmButtonText: 'OK'	               
					});
					//////////////////
					return false;
				}
				
				
			}
			
			// tab Relaciones de Almacén		
			if(currentIndex === 2){
				
				// para no cargar a cada rato la Tabla de Relaciones del Almacén
				if(listar == 0){
					listarAlmacenesRelServ();
					listar++;
				}				
				
				if(stepDirection === 'forward'){

					// Consumo de Servicios - ServicesConfigurationWarehouse.js
					// Almacén, Zonas y Estanterias
					
					const swalWithBootstrapButtons = Swal.mixin({
						customClass: {
							confirmButton: 'btn btn-success',
							cancelButton: 'btn btn-danger'
						},
						buttonsStyling: false
					})
					if(valid == false){
						swalWithBootstrapButtons.fire({
							title: '¿Quires Continuar?',
							text: "Al Continuar se Creará el Almacén! Ya no podrás modificar mas la Información anterior, tendras que modificarla desde el proceso de Modificación",
							type: 'warning',
							showCancelButton: true,
							confirmButtonText: 'Si, Continuar!',
							cancelButtonText: 'No',
							reverseButtons: true
						}).then((result) => {
							if(result.value) {
								valid = true;
								crearAlmacenServ();							
							}
							else if(result.dismiss === Swal.DismissReason.cancel) {
								
								swalWithBootstrapButtons.fire(
										'Sigue Configurando!!',
										'Modifica tu Almacén y luego podras Crear las Relaciones de las Zonas :)',
										'info'
								)
								
							}
						})
					}
					return valid;
				}
				
			}
			
			// tab Relaciones de Zonas
			if(currentIndex === 3){
				
				crearFormsZonasRel();
				
			}
	    	
			return true;        
		},
		onFinish: function () {
			// - Creacion de Relaciones de Zonas
			crearRelacionesZonasServ();
			
			Swal.fire({
	        	title: "¡¡¡ Cofiguración Completada !!!",
			    text: "",
			    type: "success",
			    confirmButtonColor: '#3085d6',
			    confirmButtonText: 'Genial!'	               
	        }).then((result) => {
	        	if (result.value) {
	        		window.location.href = '/CBPult/Almacen/configuration_almacen';
	        	}
	        });			
			
		}

	});

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