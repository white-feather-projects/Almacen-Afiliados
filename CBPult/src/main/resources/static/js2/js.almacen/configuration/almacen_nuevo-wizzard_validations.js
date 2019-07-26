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
			soloTexto1(txtDescAlmacen);
		}else{
			txtDescAlmacen.css("border", "1px solid red");
		}		
	});
	
	txtUbicacionAlmacen.blur(function(){
		if(txtUbicacionAlmacen.val().length > 0){
			soloTexto1(txtUbicacionAlmacen);
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
				if(validated == 2){
					data_almacen = {
							'idAlmacen': $('#txtCodigo_almacen').val(),
							'tipoAlmacen': $('#cboxTipo_almacen').val(),
							'descripcionAlmacen': $('#txtDesc_almacen').val(),
							'encargadoAlmacen': $('#cboxEncargado_almacen').val(),
							'ubicacionAlmacen': $('#txtUbicacion_almacen').val(),
							'zonasAlmacen': {},
							'relacionesAlmacen': {}
					};
					console.log(data_almacen);
					alert("Valido");
					
				}else if(validated != 2){
					alert("invalido");
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
		alert('Wizard Completed');
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
	alert("dentro Switches");
	var blue_switches = $('.js-switch-blue-zona');
	console.log(blue_switches);
	
	Array.prototype.forEach.call(blue_switches, (item, i)=>{
		var actual_switch = new Switchery(item, {
			color: '#17a2b8'
		});
	});

}