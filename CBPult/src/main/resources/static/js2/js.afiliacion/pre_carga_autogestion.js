'use strict'

window.addEventListener('load', ()=>{
	
	//////////////////////////////////////////////////////////////////////

	var tipo_identificacion = document.querySelector("#tipo_identificacion");
	var provincia = document.querySelector("#provincia");
    var ciudad = document.querySelector("#ciudad");
    var punto_de_referencia = document.querySelector("#punto_de_referencia");
    var documento = document.querySelector("#documento");
    var canton = document.querySelector("#canton");
    var urbanizacion = document.querySelector("#urbanizacion");
    var nombre_empresa = document.querySelector("#nombre_empresa");
    var distrito = document.querySelector("#distrito");
    var geo_localizacion = document.querySelector("#geo_localizacion");
    var tipo_identificacion2 = document.querySelector("#tipo_identificacion2");
    var primer_nombre = document.querySelector("#primer_nombre");
    var primer_apellido = document.querySelector("#primer_apellido");
    var documento2 = document.querySelector("#documento2");
    var segundo_nombre = document.querySelector("#segundo_nombre");
    var segundo_apellido = document.querySelector("#segundo_apellido");
    var telefono_celular = document.querySelector("#telefono_celular");
    var telefono_local = document.querySelector("#telefono_local");
    var correo_electronico = document.querySelector("#correo_electronico");
	
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
		  			  
		  				$("#provincia").append(provincia);
		  			  
	  		  	}
	    		
	    	} 
	    	
	    	function processError(data, status, req) {
	         //alert(req.responseText + " " + status);
	        	swal("Error al contactar el servicio", data);
	        	valid = false;
	        	return valid;
	        } 
	    	
	    	//////
	    	
    	var cont = 0;
    	var cont1 = 0;
	    	
    	provincia.addEventListener('blur', ()=>{
    		
    		console.log("provincia", provincia.value);
    		document.getElementById("provincia").style.border = "1px solid black";
    		
    		if(cont == 0){
    			cont++;
    			console.log("value-------", $("#provincia").val());
    			console.log("texto--------", $("#provincia").text());
    			
    			var canton1 = {
    					"idProvincia": $("#provincia").val(),
    					"nombreProvincia": $("#provincia").text(),
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
    			         data: JSON.stringify(canton1),
    			         success: processSuccess,
    			         error: processError
    			     });
    				
    					function processSuccess(data, status, req) {
    			         //alert(req.responseText + " " + status);
    			    		console.log(data);
    			    		
    			    		
    			    		for(var i=0; i<data.length; i++){
    			    			
    				  			  var canton2 = '<option value="'+data[i].idCanton+'">'+data[i].nombreCanton+'</option>';
    				  			  
    				  				$("#canton").append(canton2);
    				  			  
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
    			console.log("value-------", $("#provincia").val());
    			console.log("texto--------", $("#provincia").text());
    			
    				var canton1 = {
    					"idProvincia": $("#provincia").val(),
    					"nombreProvincia": $("#provincia").text(),
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
    			         data: JSON.stringify(canton1),
    			         success: processSuccess,
    			         error: processError
    			     });
    				
    					function processSuccess(data, status, req) {
    			         //alert(req.responseText + " " + status);
    			    		console.log(data);
    			    		
    			    		
    			    		for(var i=0; i<data.length; i++){
    			    			
    				  			  var canton2 = '<option value="'+data[i].idCanton+'">'+data[i].nombreCanton+'</option>';
    				  			  if(i == 0){
    				  				$("#canton").html(canton2);
    				  			  }else if(i >= 1){
    				  				$("#canton").append(canton2);
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
    	
    	canton.addEventListener('blur', ()=>{
    		console.log("canton", canton.value);
    		document.getElementById("canton").style.border = "1px solid black";
    		
    		if(cont1 == 0){
    			cont1++;
    			console.log("value-------", $("#canton").val());
    			console.log("texto--------", $("#canton").text());
    			
    			var distrito2 = {
    					"idCanton": $("#canton").val(),
    					"nombreCanton": $("#canton").text(),
    					"provinciaId":{
    						"idProvincia": $("#provincia").val(),
    						"nombreProvincia": $("#provincia").text(),
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
    			         data: JSON.stringify(distrito2),
    			         success: processSuccess,
    			         error: processError
    			     });
    				
    					function processSuccess(data, status, req) {
    			         //alert(req.responseText + " " + status);
    			    		console.log(data);
    			    		
    			    		
    			    		for(var i=0; i<data.length; i++){
    			    			
    				  			  var distrito3 = '<option value="'+data[i].idDistrito+'">'+data[i].nombreDistrito+'</option>';
    				  			  
    				  				$("#distrito").append(distrito3);
    				  			  
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
    			console.log("value-------", $("#canton").val());
    			console.log("texto--------", $("#canton").text());
    			
    			var distrito2 = {
    					"idCanton": $("#canton").val(),
    					"nombreCanton": $("#canton").text(),
    					"provinciaId":{
    						"idProvincia": $("#provincia").val(),
    						"nombreProvincia": $("#provincia").text(),
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
    			         data: JSON.stringify(distrito2),
    			         success: processSuccess,
    			         error: processError
    			     });
    				
    					function processSuccess(data, status, req) {
    			         //alert(req.responseText + " " + status);
    			    		console.log(data);
    			    		
    			    		
    			    		for(var i=0; i<data.length; i++){
    			    			
    				  			  var distrito3 = '<option value="'+data[i].idDistrito+'">'+data[i].nombreDistrito+'</option>';
    				  			  if(i == 0){
    				  				$("#distrito").html(distrito3);
    				  			  }else if(i >= 1){
    				  				$("#distrito").append(distrito3);
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

///////////////////////////////////////////////////////////77
    
    tipo_identificacion.addEventListener('blur', ()=>{
    	console.log("tipo identificacion", tipo_identificacion.value);
    	document.getElementById("tipo_identificacion").style.border = "1px solid black";
    	
    	if(tipo_identificacion.value === "Cedula de Residente"){
			document.getElementById("documento").setAttribute("maxlength", "9");
			
		}else if(tipo_identificacion.value === "DIMEX"){
			document.getElementById("documento").setAttribute("maxlength", "11");
			
		}else if(tipo_identificacion.value === "Cedula de Persona Jurídica"){
			document.getElementById("documento").setAttribute("maxlength", "10");
			
		}
    });
    
    provincia.addEventListener('blur', ()=>{
    	console.log("provincia", provincia.value);
    	
    });
    
    ciudad.addEventListener('blur', ()=>{
    	console.log("ciudad", ciudad.value);
    	soloTexto(ciudad);
    });
    
    punto_de_referencia.addEventListener('blur', ()=>{
    	console.log("punto de referencia", punto_de_referencia.value);
    	soloTexto(punto_de_referencia);
    });
    
    documento.addEventListener('blur', ()=>{
    	console.log("documento", documento.value);
    	soloNumeros(documento);
    	
    	document.getElementById("documento").style.border = "1px solid black";
		
		if($("#documento").attr("maxlength") === "9"){
			if($("#documento").val().length < 9){
				swal("Longitud debe ser de 9");
				document.getElementById("documento").style.border = "1px solid red";
				$("#documento").val("");
			}else if($("#documento").val().length == 9){
				$.ajax({
			        type: "GET",
			        url: '/CBPult/Afiliacion/consultaComercio/'+$("#documento").val()+'',
			        dataType: "json",
			        success: processSuccess,
			        error: processError
			   	});
				
					function processSuccess(data, status, req) {
			        //alert(req.responseText + " " + status);
			   		console.log(data);
			   		if(typeof(data.return.identificacionComercio) === "object"){

			   		}else if(typeof(data.return.identificacionComercio) != "object"){
			   			swal("Ya existe el Comercio");
						document.getElementById("documento").style.border = "1px solid red";
						$("#documento").val("")
			   		}
			   		
			   		
			   	} 
			   	
			   	function processError(data, status, req) {
			        //alert(req.responseText + " " + status);
			       	swal("Error al contactar el servicio", data);
			       	
			   	} 
			}
		}
		
		if($("#documento").attr("maxlength") === "11"){
			if($("#documento").val().length < 11){
				swal("Longitud debe ser de 11");
				document.getElementById("documento").style.border = "1px solid red";
				$("#documento").val("");
			}else if($("#documento").val().length == 9){
				$.ajax({
			        type: "GET",
			        url: '/CBPult/Afiliacion/consultaComercio/'+$("#documento").val()+'',
			        dataType: "json",
			        success: processSuccess,
			        error: processError
			   	});
				
					function processSuccess(data, status, req) {
			        //alert(req.responseText + " " + status);
			   		console.log(data);
			   		if(typeof(data.return.identificacionComercio) === "object"){

			   		}else if(typeof(data.return.identificacionComercio) != "object"){
			   			swal("Ya existe el Comercio");
						document.getElementById("documento").style.border = "1px solid red";
						$("#documento").val("")
			   		}
			   		
			   		
			   	} 
			   	
			   	function processError(data, status, req) {
			        //alert(req.responseText + " " + status);
			       	swal("Error al contactar el servicio", data);
			       	
			   	} 
			}
		}
		
		if($("#documento").attr("maxlength") === "10"){
			if($("#documento").val().length < 10){
				swal("Longitud debe ser de 10");
				document.getElementById("documento").style.border = "1px solid red";
				$("#documento").val("");
			}else if($("#documento").val().length == 9){
				$.ajax({
			        type: "GET",
			        url: '/CBPult/Afiliacion/consultaComercio/'+$("#documento").val()+'',
			        dataType: "json",
			        success: processSuccess,
			        error: processError
			   	});
				
					function processSuccess(data, status, req) {
			        //alert(req.responseText + " " + status);
			   		console.log(data);
			   		if(typeof(data.return.identificacionComercio) === "object"){

			   		}else if(typeof(data.return.identificacionComercio) != "object"){
			   			swal("Ya existe el Comercio");
						document.getElementById("documento").style.border = "1px solid red";
						$("#documento").val("")
			   		}
			   		
			   		
			   	} 
			   	
			   	function processError(data, status, req) {
			        //alert(req.responseText + " " + status);
			       	swal("Error al contactar el servicio", data);
			       	
			   	} 
			}
		}
    });
    
    canton.addEventListener('blur', ()=>{
    	console.log("canton", canton.value);
    	
    });
    
    urbanizacion.addEventListener('blur', ()=>{
    	console.log("urbanizacion", urbanizacion.value);
    	soloTexto(urbanizacion);
    });
    
    nombre_empresa.addEventListener('blur', ()=>{
    	console.log("nombre empresa", nombre_empresa.value);
    	soloTexto(nombre_empresa);
    });
    
    distrito.addEventListener('blur', ()=>{
    	console.log("distrito", distrito.value);
    	
    });
    
    geo_localizacion.addEventListener('blur', ()=>{
    	console.log("geo localizacion", geo_localizacion.value);
    	
    });
    
    tipo_identificacion2.addEventListener('blur', ()=>{
    	console.log("tipo identificacion 2", tipo_identificacion2.value);
    	document.getElementById("tipo_identificacion2").style.border = "1px solid black";
    	
    	if(tipo_identificacion2.value === "Cedula de Residente"){
			document.getElementById("documento2").setAttribute("maxlength", "9");
			
		}else if(tipo_identificacion2.value === "DIMEX"){
			document.getElementById("documento2").setAttribute("maxlength", "11");
			
		}else if(tipo_identificacion2.value === "Cedula de Persona Jurídica"){
			document.getElementById("documento2").setAttribute("maxlength", "10");
			
		}
    });
    
    primer_nombre.addEventListener('blur', ()=>{
    	console.log("primer nombre", primer_nombre.value);
    	soloTexto(primer_nombre);
    });
    
    primer_apellido.addEventListener('blur', ()=>{
    	console.log("primer apellido", primer_apellido.value);
    	soloTexto(primer_apellido);
    });
    
    documento2.addEventListener('blur', ()=>{
    	console.log("documento2", documento2.value);
    	soloNumeros(documento2);
    	document.getElementById("documento2").style.border = "1px solid black";
		
		if($("#documento2").attr("maxlength") === "9"){
			if($("#documento2").val().length < 9){
				swal("Longitud debe ser de 9");
				document.getElementById("documento2").style.border = "1px solid red";
				$("#documento2").val("");
			}else if($("#documento2").val().length == 9){
				$.ajax({
			        type: "GET",
			        url: '/CBPult/Afiliacion/consultaComercio/'+$("#documento2").val()+'',
			        dataType: "json",
			        success: processSuccess,
			        error: processError
			   	});
				
					function processSuccess(data, status, req) {
			        //alert(req.responseText + " " + status);
			   		console.log(data);
			   		if(typeof(data.return.identificacionComercio) === "object"){

			   		}else if(typeof(data.return.identificacionComercio) != "object"){
			   			swal("Ya existe el Comercio");
						document.getElementById("documento2").style.border = "1px solid red";
						$("#documento2").val("")
			   		}
			   		
			   		
			   	} 
			   	
			   	function processError(data, status, req) {
			        //alert(req.responseText + " " + status);
			       	swal("Error al contactar el servicio", data);
			       	
			   	} 
			}
		}
		
		if($("#documento2").attr("maxlength") === "11"){
			if($("#documento2").val().length < 11){
				swal("Longitud debe ser de 11");
				document.getElementById("documento2").style.border = "1px solid red";
				$("#documento2").val("");
			}else if($("#documento2").val().length == 11){
				$.ajax({
			        type: "GET",
			        url: '/CBPult/Afiliacion/consultaComercio/'+$("#documento2").val()+'',
			        dataType: "json",
			        success: processSuccess,
			        error: processError
			   	});
				
					function processSuccess(data, status, req) {
			        //alert(req.responseText + " " + status);
			   		console.log(data);
			   		if(typeof(data.return.identificacionComercio) === "object"){

			   		}else if(typeof(data.return.identificacionComercio) != "object"){
			   			swal("Ya existe el Comercio");
						document.getElementById("documento2").style.border = "1px solid red";
						$("#documento2").val("")
			   		}
			   		
			   		
			   	} 
			   	
			   	function processError(data, status, req) {
			        //alert(req.responseText + " " + status);
			       	swal("Error al contactar el servicio", data);
			       	
			   	} 
			}
		}
		
		if($("#documento2").attr("maxlength") === "10"){
			if($("#documento2").val().length < 10){
				swal("Longitud debe ser de 10");
				document.getElementById("documento2").style.border = "1px solid red";
				$("#documento2").val("");
			}else if($("#documento2").val().length == 10){
				$.ajax({
			        type: "GET",
			        url: '/CBPult/Afiliacion/consultaComercio/'+$("#documento2").val()+'',
			        dataType: "json",
			        success: processSuccess,
			        error: processError
			   	});
				
					function processSuccess(data, status, req) {
			        //alert(req.responseText + " " + status);
			   		console.log(data);
			   		if(typeof(data.return.identificacionComercio) === "object"){

			   		}else if(typeof(data.return.identificacionComercio) != "object"){
			   			swal("Ya existe el Comercio");
						document.getElementById("documento2").style.border = "1px solid red";
						$("#documento2").val("")
			   		}
			   		
			   		
			   	} 
			   	
			   	function processError(data, status, req) {
			        //alert(req.responseText + " " + status);
			       	swal("Error al contactar el servicio", data);
			       	
			   	} 
			}
		}
    });
    
    segundo_nombre.addEventListener('blur', ()=>{
    	console.log("segundo nombre", segundo_nombre.value);
    	soloTexto(segundo_nombre);
    });
    
    segundo_apellido.addEventListener('blur', ()=>{
    	console.log("segundo apellido", segundo_apellido.value);
    	soloTexto(segundo_apellido);
    });
    
    telefono_celular.addEventListener('blur', ()=>{
    	console.log("telefono celular", telefono_celular.value);
    	soloNumeros(telefono_celular);
    });
    
    telefono_local.addEventListener('blur', ()=>{
    	console.log("telefono local", telefono_local.value);
    	soloNumeros(telefono_local);
    });
    
    var emailRegex = /^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i;
    var email1;
    correo_electronico.addEventListener('blur', ()=>{
    	console.log("correo electronico", correo_electronico.value);
    	var email = document.querySelector("#correo_electronico").value;
        email1 = email;
        if(emailRegex.test(email)){

        }else{
            //alert("Espacio Obligatorio, Correo no valido");
            swal("Espacio Obligatorio, Correo no valido");
            document.getElementById("correo_electronico").value = "";
        }
    });
    
    //////////////////////////////////////////////////////////////////////////////
    ////////////Botones////////////////////////////////////
    
    $("#atras_2").on('click', function(){
    	location.href = "../../CBPult/Afiliacion/menu_afiliacion";
    });
    
    $("#aceptar_2").on('click', function(){
    	
    	if($("#documento").val().length >=1 && $('select[id="provincia"] option:selected').val().length >=1 && $('select[id="canton"] option:selected').val().length >=1 && $('select[id="distrito"] option:selected').val().length >=1 && $("#ciudad").val().length >=1 && $("#urbanizacion").val().length >=1 && $("#geo_localizacion").val().length >=1 && $("#punto_de_referencia").val().length >=1 && $("#documento2").val().length >=1 && $("#primer_nombre").val().length >=1){
    		
    		var crearPrecargaComercio = {
    				"tipoIdentificacionId": {
    					"nombre": $('select[id="tipo_identificacion"] option:selected').val(),
    					"tipoIdentificacionId": 1
    				},
    				"identificacionComercio": $("#documento").val(),
    				"statusComercio": "I",
    				"nombreEmpresarial": $("#nombre_empresa").val(),
    				"ciudad": $("#ciudad").val(),
    				"urbanizacion": $("#urbanizacion").val(),
    				"geolocalizacion": $("#geo_localizacion").val(),
    				"puntoReferencia": $("#punto_de_referencia").val(),
    				"idProvincia": {
    					"idProvincia": $('select[id="provincia"] option:selected').val(),
    					"nombreProvincia": $('select[id="provincia"] option:selected').text(),
    					"paisId": {
    						"idPais": 1,
    						"nombrePais": "Costa Rica"
    					}
    				},
    				"idCanton": {
    					"idCanton": $('select[id="canton"] option:selected').val(),
    					"nombreCanton": $('select[id="canton"] option:selected').text(),
    					"provinciaId": {
    						"idProvincia": $('select[id="provincia"] option:selected').val(),
    						"nombreProvincia": $('select[id="provincia"] option:selected').text(),
    						"paisId": {
    							"idPais": 1,
    							"nombrePais": "Costa Rica"
    						}
    					}
    				},
    				"idDistrito": {
    					"cantonId": {
    						"idCanton": $('select[id="canton"] option:selected').val(),
    						"nombreCanton": $('select[id="canton"] option:selected').text(),
    						"provinciaId": {
    							"idProvincia": $('select[id="provincia"] option:selected').val(),
    							"nombreProvincia": $('select[id="provincia"] option:selected').text(),
    							"paisId": {
    								"idPais": 1,
    								"nombrePais": "Costa Rica"
    							}
    						}
    					},
    					"idDistrito": $('select[id="distrito"] option:selected').val(),
    					"nombreDistrito": $('select[id="distrito"] option:selected').text()
    				},
    				"tipoIdentifContactoId": {
    					"nombre": $('select[id="tipo_identificacion2"] option:selected').val(),
    					"tipoIdentificacionId": 1
    				},
    				"identificacionContacto": $("#documento2").val(),
    				"primerNombre": $("#primer_nombre").val(),
    				"segundoNombre": $("#segundo_nombre").val(),
    				"primerApellido": $("#primer_apellido").val(),
    				"segundoApellido": $("#segundo_apellido").val(),
    				"telefonoLocal": $("#telefono_local").val(),
    				"telefonoCelular": $("#telefono_celular").val(),
    				"emailContacto": $("#correo_electronico").val(),
    				"fechaCargaDatos": ""
    		};
    	
        	$.ajax({
             type: "POST",
             url: '/CBPult/Afiliacion/crearPrecargaComercio',
             contentType: "application/json",
             dataType: "json",
             data: JSON.stringify(crearPrecargaComercio),
             success: processSuccess,
             error: processError
        	});
    	
    		function processSuccess(data, status, req) {
             //alert(req.responseText + " " + status);
        		console.log(data);
        		
        	} 
        	
        	function processError(data, status, req) {
             //alert(req.responseText + " " + status);
            	swal("Error al contactar el servicio", data);
            	valid = false;
            	return valid;
            } 
    		
    	}else{
    		swal("Campos Obligatorios");
    	}
    	
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