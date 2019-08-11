var data_almacen; // para capturar la toda la info del modulo (Almacen, Zonas, Relaciones)
var data_zonas; // se usa para capturar las Zonas i se incrusta en "data_almacen" en el atributo "zonasAlmacen"
var contador_switches = 0;

var txtDescAlmacen = $('#txtDesc_almacen');
var txtUbicacionAlmacen = $('#txtUbicacion_almacen');

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
					console.log(data_almacen);
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
					
					console.log(data_almacen);
					swal("Valido");
					
				}else if(validated != 2){
					//swal("invalido");
					return false;
				}				
				
			}
			
		}
		// tab Almacen
		
		
		// tab Zonas
		/// Las validaciones de la parte de Zonas está en "almacen_nuevo-wizzard_funcionalidad.js"
		if(currentIndex === 1){
			
			if(stepDirection === 'forward'){
				
				// Capturar los ids de las Zonas
				var zonas = $('.zona_zonas');
				console.log(zonas.length);
				for(i=0; i<zonas.length; i++){
					var zona_id =zonas[i].getAttribute('id');
					var id_actual = zona_id.substring(4,5); 
					console.log(id_actual);					
				}
				// Capturar los ids de las Zonas
				if(contador_switches == 0){
					recorrerswitch(); // para recargar los switches de las tablas en relaciones de Zonas
					contador_switches++;
				}
				
				var txts_num = $('.solo_num');
				console.log(txts_num);
			}			
			
		}		
		// tab Zonas	
    	
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