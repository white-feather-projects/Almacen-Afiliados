'use strict'

window.addEventListener('load', function(){
	
	var estado = document.querySelector("#estado_tab5");
	var ciudad = document.querySelector("#ciudad_tab5");
	var municipio_tab5 = document.querySelector("#municipio_tab5");
	var sector_urbanizacion = document.querySelector("#sector_urbanizacion_tab5");
	var avenida_calle = document.querySelector("#avenida_calle_tab5");
	var codigo_postal = document.querySelector("#codigo_postal_tab5");
	var localidad = document.querySelector("#localidad_tab5");
	var nombre_inmueble = document.querySelector("#nombre_inmueble_tab5");
	var geo_localizacion_tab5 = document.querySelector("#geo_localizacion_tab5");
	var punto_referencia = document.querySelector("#punto_referencia_tab5");
	
	/////////////////////////////////////////////////////////////////////////

	
	var provincias = {
		"idPais": 1,
		"nombrePais": "Costa Rica"
	};
	
	$.ajax({
         type: "POST",
         url: '/CBPult/Afiliacion/listaProvincias',
         contentType: "application/json",
         dataType: "json",
         data: JSON.stringify(provincias),
         success: processSuccess,
         error: processError
     });
	
		function processSuccess(data, status, req) {
         //alert(req.responseText + " " + status);
    		console.log(data);
    		
    		for(var i=0; i<data.length; i++){
    			
	  			  var provincia = '<option value="'+data[i].idProvincia+'">'+data[i].nombreProvincia+'</option>';
	  			  
	  				$("#estado_tab5").append(provincia);
	  			  
  		  	}
    		
    	} 
    	
    	function processError(data, status, req) {
         //alert(req.responseText + " " + status);
        	swal("Error al contactar el servicio", data);
        	valid = false;
        	return valid;
        } 
    	
    	var cont = 0;
    	var cont1 = 0;
	
	estado.addEventListener('blur', ()=>{
		
		console.log("estado_tab5", estado.value);
		document.getElementById("estado_tab5").style.border = "1px solid black";
		
		if(cont == 0){
			cont++;
			console.log("value-------", $("#estado_tab5").val());
			console.log("texto--------", $("#estado_tab5").text());
			
			var canton = {
					"idProvincia": $("#estado_tab5").val(),
					"nombreProvincia": $("#estado_tab5").text(),
					"paisId":{
						"idPais": 1,
						"nombrePais": "Costa Rica"
					}
				};
				
				$.ajax({
			         type: "POST",
			         url: '/CBPult/Afiliacion/listaCanton',
			         contentType: "application/json",
			         dataType: "json",
			         data: JSON.stringify(canton),
			         success: processSuccess,
			         error: processError
			     });
				
					function processSuccess(data, status, req) {
			         //alert(req.responseText + " " + status);
			    		console.log(data);
			    		
			    		
			    		for(var i=0; i<data.length; i++){
			    			
				  			  var canton = '<option value="'+data[i].idCanton+'">'+data[i].nombreCanton+'</option>';
				  			  
				  				$("#municipio_tab5").append(canton);
				  			  
			  		  	}
			    		
			    	} 
			    	
			    	function processError(data, status, req) {
			         //alert(req.responseText + " " + status);
			        	swal("Error al contactar el servicio", data);
			        	valid = false;
			        	return valid;
			        } 
			    	
		}else if(cont >= 1){
			
			cont++;
			console.log("value-------", $("#estado_tab5").val());
			console.log("texto--------", $("#estado_tab5").text());
			
				var canton = {
					"idProvincia": $("#estado_tab5").val(),
					"nombreProvincia": $("#estado_tab5").text(),
					"paisId":{
						"idPais": 1,
						"nombrePais": "Costa Rica"
					}
				};
				
				$.ajax({
			         type: "POST",
			         url: '/CBPult/Afiliacion/listaCanton',
			         contentType: "application/json",
			         dataType: "json",
			         data: JSON.stringify(canton),
			         success: processSuccess,
			         error: processError
			     });
				
					function processSuccess(data, status, req) {
			         //alert(req.responseText + " " + status);
			    		console.log(data);
			    		
			    		
			    		for(var i=0; i<data.length; i++){
			    			
				  			  var canton = '<option value="'+data[i].idCanton+'">'+data[i].nombreCanton+'</option>';
				  			  if(i == 0){
				  				$("#municipio_tab5").html(canton);
				  			  }else if(i >= 1){
				  				$("#municipio_tab5").append(canton);
				  			  }
				  			  
			  		  	}
			    		
			    	} 
			    	
			    	function processError(data, status, req) {
			         //alert(req.responseText + " " + status);
			        	swal("Error al contactar el servicio", data);
			        	valid = false;
			        	return valid;
			        } 
			    	
		}

	});
	
	municipio_tab5.addEventListener('blur', ()=>{
		console.log("municipio_tab5", municipio_tab5.value);
		document.getElementById("municipio_tab5").style.border = "1px solid black";
		
		if(cont1 == 0){
			cont1++;
			console.log("value-------", $("#municipio_tab5").val());
			console.log("texto--------", $("#municipio_tab5").text());
			
			var municipio = {
					"idCanton": $("#municipio_tab5").val(),
					"nombreCanton": $("#municipio_tab5").text(),
					"provinciaId":{
						"idProvincia": $("#estado_tab5").val(),
						"nombreProvincia": $("#estado_tab5").text(),
						"paisId":{
							"idPais": 1,
							"nombrePais": "Costa Rica"
						}
					}
				};
				
				$.ajax({
			         type: "POST",
			         url: '/CBPult/Afiliacion/listaDistrito',
			         contentType: "application/json",
			         dataType: "json",
			         data: JSON.stringify(municipio),
			         success: processSuccess,
			         error: processError
			     });
				
					function processSuccess(data, status, req) {
			         //alert(req.responseText + " " + status);
			    		console.log(data);
			    		
			    		
			    		for(var i=0; i<data.length; i++){
			    			
				  			  var municipio = '<option value="'+data[i].idDistrito+'">'+data[i].nombreDistrito+'</option>';
				  			  
				  				$("#ciudad_tab5").append(municipio);
				  			  
			  		  	}
			    		
			    	} 
			    	
			    	function processError(data, status, req) {
			         //alert(req.responseText + " " + status);
			        	swal("Error al contactar el servicio", data);
			        	valid = false;
			        	return valid;
			        } 
			    	
		}else if(cont1 >= 1){
			
			cont1++;
			console.log("value-------", $("#municipio_tab5").val());
			console.log("texto--------", $("#municipio_tab5").text());
			
			var municipio = {
					"idCanton": $("#municipio_tab5").val(),
					"nombreCanton": $("#municipio_tab5").text(),
					"provinciaId":{
						"idProvincia": $("#estado_tab5").val(),
						"nombreProvincia": $("#estado_tab5").text(),
						"paisId":{
							"idPais": 1,
							"nombrePais": "Costa Rica"
						}
					}
				};
				
				$.ajax({
			         type: "POST",
			         url: '/CBPult/Afiliacion/listaDistrito',
			         contentType: "application/json",
			         dataType: "json",
			         data: JSON.stringify(municipio),
			         success: processSuccess,
			         error: processError
			     });
				
					function processSuccess(data, status, req) {
			         //alert(req.responseText + " " + status);
			    		console.log(data);
			    		
			    		
			    		for(var i=0; i<data.length; i++){
			    			
				  			  var municipio = '<option value="'+data[i].idDistrito+'">'+data[i].nombreDistrito+'</option>';
				  			  if(i == 0){
				  				$("#ciudad_tab5").html(municipio);
				  			  }else if(i >= 1){
				  				$("#ciudad_tab5").append(municipio);
				  			  }
				  			  
			  		  	}
			    		
			    	} 
			    	
			    	function processError(data, status, req) {
			         //alert(req.responseText + " " + status);
			        	swal("Error al contactar el servicio", data);
			        	valid = false;
			        	return valid;
			        } 
			    	
		}
	});
	
	ciudad.addEventListener('blur', ()=>{
		document.getElementById("ciudad_tab5").style.border = "1px solid black";
		
		var ciudad = {
				"distrito":{
					"cantonId":{
						"idCanton": $("#municipio_tab5").val(),
						"nombreCanton": $("#municipio_tab5").text(),
						"provinciaId":{
							"idProvincia": $("#estado_tab5").val(),
							"nombreProvincia": $("#estado_tab5").text(),
							"paisId":{
								"idPais": 1,
								"nombrePais": "Costa Rica"
							}
						}
					},
					"idDistrito": $("#ciudad_tab5").val(),
					"nombreDistrito": $("#ciudad_tab5").text()
				}
			};
			
			$.ajax({
		         type: "POST",
		         url: '/CBPult/Afiliacion/codigoPosta',
		         contentType: "application/json",
		         dataType: "json",
		         data: JSON.stringify(ciudad),
		         success: processSuccess,
		         error: processError
		     });
			
				function processSuccess(data, status, req) {
		         //alert(req.responseText + " " + status);
		    		console.log(data);
		    		
			  				$("#codigo_postal_tab5").val(data.return.valueCod).prop("disabled", true);

		    		
		    	} 
		    	
		    	function processError(data, status, req) {
		         //alert(req.responseText + " " + status);
		        	swal("Error al contactar el servicio", data);
		        	valid = false;
		        	return valid;
		        } 
		    	
	});
	
	sector_urbanizacion.addEventListener('blur', ()=>{
		console.log("sector_urbanizacion", sector_urbanizacion.value);
		soloLetrasYNum(sector_urbanizacion);
		document.getElementById("sector_urbanizacion_tab5").style.border = "1px solid black";
	});
	
	avenida_calle.addEventListener('blur', ()=>{
		console.log("avenida_calle", avenida_calle.value);
		document.getElementById("avenida_calle_tab5").style.border = "1px solid black";
	});
	
	codigo_postal.addEventListener('blur', ()=>{
		console.log("codigo_postal", codigo_postal.value);
		soloNumeros(codigo_postal);
		document.getElementById("codigo_postal_tab5").style.border = "1px solid black";
	});
	
	localidad.addEventListener('blur', ()=>{
		console.log("localidad", localidad.value);
		soloLetrasYNum(localidad);
		document.getElementById("localidad_tab5").style.border = "1px solid black";
	});
	
	nombre_inmueble.addEventListener('blur', ()=>{
		console.log("nombre_inmueble", nombre_inmueble.value);
		soloLetrasYNum(nombre_inmueble);
		document.getElementById("nombre_inmueble_tab5").style.border = "1px solid black";
	});
	
	geo_localizacion_tab5.addEventListener('blur', ()=>{
		console.log("geo_localizacion_tab5", geo_localizacion_tab5.value);
		document.getElementById("geo_localizacion_tab5").style.border = "1px solid black";
	});
	
	punto_referencia.addEventListener('blur', ()=>{
		console.log("punto_referencia", punto_referencia.value);
		soloLetrasYNum(punto_referencia);
		document.getElementById("punto_referencia_tab5").style.border = "1px solid black";
	});

});

////////////////////////////////////////////////////

function soloTexto(texto){
	var patron = /^[A-Za-z \u00C0-\u017F]*$/;
	if(texto.value.search(patron)){
		swal("Solo Texto");
		texto.value = "";
	}else{
		return true;
	}
}

function soloNumeros(numero){
	var patron = /^([0-9])*$/;
	if(numero.value.search(patron)){
		swal("Solo Numeros");
		numero.value = "";
	}else{
		return true;
	}
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