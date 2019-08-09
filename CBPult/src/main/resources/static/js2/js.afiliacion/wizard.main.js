
var url = window.location.pathname;
var ver = url.substring(37,40);
var modificar = url.substring(37,46);
var nuevo = url.substring(37, 42);
var id = url.substring(url.lastIndexOf('&') + 1);

console.log("id---", id);
console.log("seleccion----", ver);
console.log("modificar----", modificar);
console.log("nuevo----", nuevo);
$("#banco_label").hide();
$("#nombre_banco_tab3").hide();
$("#afiliacion_label").hide();
$("#numero_afiliacion_tab3").hide();
$("#card_operador").hide();
$("#tab8").hide();
$(".tb8").hide();

var identificacion_global;

////////////////////////////////////////////////////////////////////////
///////////////////////////NUEVO////////////////////////////////////////
////////////////////////////////////////////////////////////////////////

	if(nuevo === "nuevo"){
		
		/////////////////////////////////////////////////////////////////////////////////////////////////
		
		$.get( "/CBPult/Afiliacion/listaBanks", function( data ) {
			console.log("data------", data);
			  console.log("data1------", data[1]);
			  
			  for(var i=0; i<data.length; i++){
				  var bancos = '<option value="'+data[i].idEntityBank+'">'+data[i].entityBankName+'</option>';
				  $("#banco_tab2").append(bancos);
				  $("#nombre_banco_tab7").append(bancos);
				  $("#tipo_banco_tab8").append(bancos);
			  }
			  
			});
		
		/////////////////////////////////////////////////////////////////////////////////////////////////
		
		$('#demo').steps({
		      onChange: function (currentIndex, newIndex, stepDirection) {
		    	  
		        console.log('onChange', currentIndex, newIndex, stepDirection);
		        
		        // tab 1    
		        if (currentIndex === 0) {
		        	valid = false;
		    		
		 	       if (stepDirection === 'forward') {
		 	    	   var cont1 = 0;
		 	    	   
		 		         var nombre_empresa1 = $("#nombre_empresa_tab2").val();
		 		         console.log("nombre empresa", nombre_empresa1.length);
		 		         if(nombre_empresa1.length >= 1){
		 		        	 cont1 = cont1 + 1;
		 		         }else{
		 		        	 cont1 = cont1;
		 		        	document.getElementById("nombre_empresa_tab2").style.border = "1px solid red";
		 		         }
		 		         
		 		         var numero_iban_tab2 = $("#numero_iban_tab2").val();
		 		         if(numero_iban_tab2.length >= 1){
		 		        	 cont1 = cont1 + 1;
		 		         }else{
		 		        	 cont1 = cont1;
		 		        	document.getElementById("numero_iban_tab2").style.border = "1px solid red";
		 		         }
		 		         
		 		         var identificacion_tab2 = $("#identificacion_tab2").val();
		 		         if(identificacion_tab2.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("identificacion_tab2").style.border = "1px solid red";
				         }
		 		         
		 		        var nombre_comercial_tab2 = $("#nombre_comercial_tab2").val();
				         if(nombre_comercial_tab2.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("nombre_comercial_tab2").style.border = "1px solid red";
				         }
				         
				         var telefono_local_tab2 = $("#telefono_local_tab2").val();
		 		         if(telefono_local_tab2.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("telefono_local_tab2").style.border = "1px solid red";
				         }
		 		         
		 		         if(cont1 == 5){
		 		        	 console.log(cont1);
		 		        	 
		 		        	 ////////////////
		 		        	 
		 		        	 var tipo_identificacion = $("#tipo_identificacion_tab2").val();
		 		        	 var identificacion = $("#identificacion_tab2").val();
		 		        	 var nombre_empresa = $("#nombre_empresa_tab2").val();
		 		        	 var nombre_comercial = $("#nombre_comercial_tab2").val();
		 		        	 var correo = $("#correo_tab2").val();
		 		        	 var telefono_local = $("#telefono_local_tab2").val();
		 		        	 var numero_IBAN = $("#numero_iban_tab2").val();
		 		        	 var banco = $("#banco_tab2").val();
		 		        	 var afiliado = $("#afiliado_tab2").val();
		 		        	 var hora_inicio = $("#horario_inicio_tab2").val();
		 		        	 var telefono_alternativo = $("#telefono_alternativo_tab2").val();
		 		        	 var hora_final = $("#horario_fin_tab2").val();
		 		        	 
		 		        	identificacion_global = identificacion;
		 		        	 
		 		        	 var afiliado_d;
		 		        	 if(afiliado === "SI"){
		 		        		afiliado_d = "Y";
		 		        	 }else if(afiliado ==="NO"){
		 		        		afiliado_d = "N";
		 		        	 }
		 		        	 
		 		        	 console.log(tipo_identificacion+" "+identificacion+" "+nombre_empresa+" "+nombre_comercial+" "+correo+" "+telefono_local+" "+numero_IBAN+" "+banco+" "+afiliado_d+" "+hora_inicio+" "+telefono_alternativo+" "+hora_final);
		 		        	 
		 		        	 ////////////////
		 		        	 
		 		        	 var comercio_json = {
		 		        			"identificacionComercio": identificacion,
		 		        			"nombreEmpresarial": nombre_empresa,
		 		        			"nombreComercial": nombre_comercial,
		 		        			"email": correo,
		 		        			"telefonoContacto": telefono_alternativo,
		 		        			"estadoComercioActivo": "N",
		 		        			"telefonoLocal": telefono_local,
		 		        			"numCuentaAsociado": numero_IBAN,
		 		        			"afiliadoOtroBanco": afiliado_d,
		 		        			"tipoIdentificacionId": {
		 		        				"nombre": tipo_identificacion,
		 		        				"tipoIdentificacionId": "1"
		 		        			},
		 		        			"actividadComercial":  banco,
		 		        			"horaInicio": hora_inicio,
		 		        			"horaFin": hora_final,
		 		        			"idCanal": "2",
		 		        			"nombreCanal": "EJECUTIVO_VENTAS" 
		 		        	 };
		 		        	 
			 		        	$.ajax({
			 		               type: "POST",
			 		               url: '/CBPult/Afiliacion/crearClienteComercio',
			 		               contentType: "application/json",
			 		               dataType: "json",
			 		               data: JSON.stringify(comercio_json),
			 		               success: processSuccess,
			 		               error: processError
			 		           });
			 		        	
				 		       		function processSuccess(data, status, req) {
					 		            //alert(req.responseText + " " + status);
					 		       		console.log(data);
					 		       		
							 		       	if(data.return.descripcion === "FAIL"){
						 		           		swal("Error al Crear Comercio", data.return.descripcion);
						 		           		valid = false;
						 		           		return valid;
						 		           		
						 		           	}else if(data.return.descripcion === "OK"){
							 		           	document.getElementById("tipo_identificacion_tab2").disabled = true;
							 		           	document.getElementById("identificacion_tab2").disabled = true;
							 		           	document.getElementById("nombre_empresa_tab2").disabled = true;
							 		           	document.getElementById("nombre_comercial_tab2").disabled = true;
							 		           	document.getElementById("correo_tab2").disabled = true;
							 		           	document.getElementById("telefono_local_tab2").disabled = true;
							 		           	document.getElementById("numero_iban_tab2").disabled = true;
							 		           	document.getElementById("banco_tab2").disabled = true;
							 		           	document.getElementById("afiliado_tab2").disabled = true;
							 		           	document.getElementById("horario_inicio_tab2").disabled = true;
							 		           	document.getElementById("telefono_alternativo_tab2").disabled = true;
							 		           	document.getElementById("horario_fin_tab2").disabled = true;
							 		           	
							 		           	swal("Comercio Creado", data.return.descripcion);
						 		           		valid = true;
						 		           		return valid;
						 		           		
						 		           	}else if(data.return.descripcion === "Comercio ya existe"){
							 		           		valid = false;
							 		           		return valid;
						 		           		
						 		           	}
				 		       		}
				 		       	
				 		       		function processError(data, status, req) {
					 		            //alert(req.responseText + " " + status);
					 		       		swal("Error al contactar el servicio", data);
					 		           	valid = false;
					 		           	return valid;
				 		       		} 
				 		     ////////////////
				 		       	
		 		         }else if(cont1 < 5){
		 		        	 valid = false;
		 		        	 return valid;
		 		         }
		 		         
		 	       }
		 	       
		 	       if (stepDirection === 'backward') {
		 	    	   //clientValidator.resetForm();
		 	       }
		 	     }
			   
		        // tab 2    
		        if (currentIndex === 1) {
		        	valid = false;
		        	
		        	///////////////////////////////////////
		        	
		        		//Cargar Nombre del Banco del Comercio y Bloquearlo......//
		        		$("#nombre_banco_tab3").val($("#banco_tab2").val()).prop('disabled', true);
		        	
		        	///////////////////////////////////////
		        	
			       if (stepDirection === 'forward') {
			    	   
			    	   var cantidad_terminales_tab3 = $("#cantidad_terminales_tab3");
			    	   if(cantidad_terminales_tab3.val() === ""){
			    		   
			    		   swal("Campo Obligatorio");
			    		   document.getElementById("cantidad_terminales_tab3").style.border = "1px solid red";
		        			valid = false;
		        			return valid;
		        			
			    	   }else{
			    		   
			    		   var cont1 = 0;
				    	   
				    	   var cantidad_terminales_tab3 = $("#cantidad_terminales_tab3").val();
				    	   var nombre_banco_tab3 = $("#nombre_banco_tab3").val();
				    	   var numero_afiliacion_tab3 = $().val("#numero_afiliacion_tab3");
				    	   
				    	   if(cantidad_terminales_tab3.length >= 1){
					        	 cont1 = cont1 + 1;
					         }else{
					        	 cont1 = cont1;
					        	document.getElementById("cantidad_terminales_tab3").style.border = "1px solid red";
					         }
					         
					         if(cont1 == 1){
					        	 console.log(cont1);
					        	 ///////////////////////
					        	 
					        	//Crear Banco de afiliacion al Comercio con Id Entidad del Banco, Id Comercio, Numero de Afiliacion y Cantidad de Terminales.....//
					        		
					        		var id_comercio = $("#identificacion_tab2").val();
					        		var id_banco;
					        		
					        		var comercio_json = {
					        				"identificacionComercio": id_comercio
					        		};
					        		
					        		$.ajax({
					 		               type: "POST",
					 		               url: '/CBPult/Afiliacion/consultaComercio',
					 		               contentType: "application/json",
					 		               dataType: "json",
					 		               data: JSON.stringify(comercio_json),
					 		               success: processSuccess,
					 		               error: processError
					 		           });
					 		       	
						 		       	function processSuccess(data, status, req) {
						 		            //alert(req.responseText + " " + status);
						 		       		console.log(data);
						 		       		
						 		           	if(data.return.identificacionComercio != id_comercio){
						 		           		swal("Error al Consultar Comercio", data.return.descripcion);
						 		           		valid = false;
						 		           		return valid;
						 		           		
						 		           	}else if(data.return.identificacionComercio === id_comercio){
						 		           		
						 		           		id_banco = data.return.actividadComercial;
						 		           		
						 		           		///////////////////////////////////////
							 		           	var asociar_banco_json = {
								        				"idEntityBanck": "1",
								        				"idComercio": id_comercio,
								        				"numeroAfiliacion": id_comercio,
								        				"numTerminalesComprar": $("#cantidad_terminales_tab3").val()
								        		};
							 		           	
							 		           $.ajax({
							 		               type: "POST",
							 		               url: '/CBPult/Afiliacion/asociarBanco',
							 		               contentType: "application/json",
							 		               dataType: "json",
							 		               data: JSON.stringify(asociar_banco_json),
							 		               success: processSuccess,
							 		               error: processError
							 		           });
							 		       	
								 		       	function processSuccess(data, status, req) {
								 		            //alert(req.responseText + " " + status);
								 		       		console.log(data);
								 		       		
								 		           	if(data.return.descripcion === "FAIL"){
								 		           		swal("Error al Asociar Banco", data.return.descripcion);
								 		           		valid = false;
								 		           		return valid;
								 		           		
								 		           	}else if(data.return.descripcion === "OK"){
								 		           		//document.getElementById("numero_afiliacion_tab3").disabled = true;
								 		           		document.getElementById("cantidad_terminales_tab3").disabled = true;
								 		           		//document.getElementById("cantidad_claro_tab3").disabled = true;
								 		           		
								 		           		swal("Cantidad Terminales Registrados", data.return.descripcion);
								 		           		valid = true;
								 		           		return valid;
								 		           		
								 		           	}
								 		           } 
								 		       	
								 		       	function processError(data, status, req) {
								 		            //alert(req.responseText + " " + status);
								 		           	swal("Error al contactar el servicio", data);
								 		           	valid = false;
								 		           	return valid;
								 		           } 
							 		           	
							 		           	///////////////////////////////////////
						 		           	}
						 		           } 
						 		       	
						 		       	function processError(data, status, req) {
						 		            //alert(req.responseText + " " + status);
						 		           	swal("Error al contactar el servicio", data);
						 		           	valid = false;
						 		           	return valid;
						 		           } 
					        	 
					        	 //////////////////////

					         }else if(cont1 < 1){
					        	 valid = false;
					        	 return valid;
					         }
			    	   }
			    	   //return valid;
				         
			       }
			       if (stepDirection === 'backward') {
			    	   //clientValidator.resetForm();
			       }
			     }
		        
		     // tab 3   
		        if (currentIndex === 2) {
		        	valid = false;
		        	
		        	//Consultar Representante legal.......//
		        	var identifi_tab4 = $("#identificacion_tab4");
		        	
		        	if (stepDirection === 'forward') {

		        			   var cont1 = 0;
					    	   
					    	   var primer_nombre_tab4 = $("#primer_nombre_tab4").val();
					    	   var tipo_identificacion_tab4 = $("#tipo_identificacion_tab4").val();
					    	   var segundo_nombre_tab4 = $("#segundo_nombre_tab4").val();
					    	   var segundo_apellido_tab4 = $("#segundo_apellido_tab4").val();
					    	   var telefono_local_tab4 = $("#telefono_local_tab4").val();
					    	   var correo_tab4 = $("#correo_tab4").val();
					    	   
					    	   if(primer_nombre_tab4.length >= 1){
						        	 cont1 = cont1 + 1;
						         }else{
						        	 cont1 = cont1;
						        	document.getElementById("primer_nombre_tab4").style.border = "1px solid red";
						         }
					    	   
					    	   var primer_apellido_tab4 = $("#primer_apellido_tab4").val();
					    	   if(primer_apellido_tab4.length >= 1){
						        	 cont1 = cont1 + 1;
						         }else{
						        	 cont1 = cont1;
						        	document.getElementById("primer_apellido_tab4").style.border = "1px solid red";
						         }
					    	   
					    	   var identificacion_tab4 = $("#identificacion_tab4").val();
					    	   if(identificacion_tab4.length >= 1){
						        	 cont1 = cont1 + 1;
						         }else{
						        	 cont1 = cont1;
						        	document.getElementById("identificacion_tab4").style.border = "1px solid red";
						         }
					    	   
					    	   var telefono_celular_tab4 = $("#telefono_celular_tab4").val();
					    	   if(telefono_celular_tab4.length >= 1){
						        	 cont1 = cont1 + 1;
						         }else{
						        	 cont1 = cont1;
						        	document.getElementById("telefono_celular_tab4").style.border = "1px solid red";
						         }
						         
					    	   console.log("cont1", cont1);
						         if(cont1 === 4){
						        	 con1 = 0;
							        	 /////////////////////////////////////////////////////////////
							        	 var consulta_representante_json = {
						    		        		"identificacionRepresentante": identifi_tab4.val()
						    		        	};
				        				
					        				$.ajax({
							 		               type: "POST",
							 		               url: '/CBPult/Afiliacion/consultaRepresentanteLegalByIdentificacionRepresentante',
							 		               contentType: "application/json",
							 		               dataType: "json",
							 		               data: JSON.stringify(consulta_representante_json),
							 		               success: processSuccess,
							 		               error: processError
							 		           });
						 		       	
							 		       	function processSuccess(data, status, req) {
							 		            //alert(req.responseText + " " + status);
							 		       		console.log("consultarepresentante", data);
							 		       		
							 		       		var retorno_identifi = data.return.identificacionRepresentante;
							 		       		
							 		           	if(typeof(data.return.identificacionRepresentante) == "object"){
								 		           	
							 		           		//swal("No existe el Representante Legal, Registrelo Porfavor...");
							 		           		
								 		           	document.getElementById("tipo_identificacion_tab4").disabled = false;
										        	document.getElementById("primer_nombre_tab4").disabled = false;
										        	document.getElementById("segundo_nombre_tab4").disabled = false;
										        	document.getElementById("primer_apellido_tab4").disabled = false;
										        	document.getElementById("segundo_apellido_tab4").disabled = false;
										        	document.getElementById("telefono_local_tab4").disabled = false;
										        	document.getElementById("telefono_celular_tab4").disabled = false;
										        	document.getElementById("correo_tab4").disabled = false;
															        	 
										        	 var representante_legal_json = {
										        			 "tipoIdentificacionId": {
										        				 "nombre": tipo_identificacion_tab4,
										        				 "tipoIdentificacionId": "1" 
										        			 },
										        			 "identificacionRepresentante": identificacion_tab4,
										        			 "primerNombre": primer_nombre_tab4,
										        			 "segundoNombre": segundo_nombre_tab4,
										        			 "primerApellido": primer_apellido_tab4,
										        			 "segundoApellido" : segundo_apellido_tab4,
										        			 "telefonoLocal": telefono_local_tab4,
										        			 "telefonoCelular": telefono_celular_tab4,
										        			 "emailRepresentante": correo_tab4,
										        			 "statusRepresentante": "Y"
										        	 }
									        	 
										        	 $.ajax({
									 		               type: "POST",
									 		               url: '/CBPult/Afiliacion/crearRepresentanteLegal',
									 		               contentType: "application/json",
									 		               dataType: "json",
									 		               data: JSON.stringify(representante_legal_json),
									 		               success: processSuccess,
									 		               error: processError
									 		           });
								 		       	
									 		       	function processSuccess(data, status, req) {
									 		            //alert(req.responseText + " " + status);
									 		       		console.log("crear representante legal-----", data);
									 		       		
									 		       		
									 		           	if(data.return.descripcion === "FAIL"){
									 		           		swal("Error al Crear Representante Legal", data.return.descripcion);
									 		           		valid = false;
									 		           		return valid;
									 		           		
									 		           	}else if(data.return.descripcion === "OK"){
									 		           		
									 		           		var consulta_comercio_json = {
									 		           			"identificacionComercio": $("#identificacion_tab2").val()
									 		           		}
									 		           		
										 		           	$.ajax({
											 		               type: "POST",
											 		               url: '/CBPult/Afiliacion/consultaComercio',
											 		               contentType: "application/json",
											 		               dataType: "json",
											 		               data: JSON.stringify(consulta_comercio_json),
											 		               success: processSuccess,
											 		               error: processError
											 		           });
									 		           		
										 		           	function processSuccess(data, status, req) {
											 		            //alert(req.responseText + " " + status);
											 		       		console.log("consulta comercio asociar con representante...", data);
											 		       		
											 		           	if(data.return.identificacionComercio != $("#identificacion_tab2").val()){
											 		           		swal("Error al encontrar comercio", data.return.descripcion);
											 		           		valid = false;
											 		           		return valid;
											 		           		
											 		           	}else if(data.return.identificacionComercio == $("#identificacion_tab2").val()){
											 		           		
											 		           		var idcomercio = data.return.comercioId;
											 		           		
											 		           		var consulta_representante_json = {
											 		           			"identificacionRepresentante": $("#identificacion_tab4").val()
											 		           		};
											 		           		
												 		           	$.ajax({
													 		               type: "POST",
													 		               url: '/CBPult/Afiliacion/consultaRepresentanteLegalByIdentificacionRepresentante',
													 		               contentType: "application/json",
													 		               dataType: "json",
													 		               data: JSON.stringify(consulta_representante_json),
													 		               success: processSuccess,
													 		               error: processError
													 		           });
												 		           	
												 		           function processSuccess(data, status, req) {
													 		            //alert(req.responseText + " " + status);
													 		       		console.log("consulta representante al asociar representante..", data);
													 		       		
													 		           	if(data.return.identificacionRepresentante != $("#identificacion_tab4").val()){
													 		           		swal("Error al encontrar representante legal", data.return.descripcion);
													 		           		valid = false;
													 		           		return valid;
													 		           		
													 		           	}else if(data.return.identificacionRepresentante == $("#identificacion_tab4").val()){
													 		           		var representanteid = data.return.representanteId;
													 		           		
														 		           	swal("Representante Registrado");
													 		           		
													 		           		var asociar_representante_legal_json = {
													 		           				"comercioId": idcomercio,
													 		           				"representanteId": representanteid
													 		           		};
													 		           		
														 		           	$.ajax({
															 		               type: "POST",
															 		               url: '/CBPult/Afiliacion/asociarComercioConRepresentanteLegal',
															 		               contentType: "application/json",
															 		               dataType: "json",
															 		               data: JSON.stringify(asociar_representante_legal_json),
															 		               success: processSuccess,
															 		               error: processError
															 		           });
															 		       	
																 		       	function processSuccess(data, status, req) {
																 		            //alert(req.responseText + " " + status);
																 		       		console.log("asociar comercio despues de crearlo...", data);
																 		       		
																 		           	if(data.return.descripcion === "FAIL"){
																 		           		swal("Error al Asociar Representante Legal", data.return.descripcion);
																 		           		valid = false;
																 		           		return valid;
																 		           		
																 		           	}else if(data.return.descripcion === "OK"){
																 		           		document.getElementById("tipo_identificacion_tab4").disabled = true;
																 		           		document.getElementById("identificacion_tab4").disabled = true;
																 		           		document.getElementById("primer_nombre_tab4").disabled = true;
																 		          		document.getElementById("segundo_nombre_tab4").disabled = true;
																 		         		document.getElementById("primer_apellido_tab4").disabled = true;
																 		        		document.getElementById("segundo_apellido_tab4").disabled = true;
																 		       			document.getElementById("telefono_local_tab4").disabled = true;
																 		      			document.getElementById("telefono_celular_tab4").disabled = true;
																 		     			document.getElementById("correo_tab4").disabled = true;
																 		           		
																	 		           	swal("Representante Legal Asociado", data.return.descripcion);
																 		           		valid = true;
																 		           		return valid;
																 		           		swal("Representante Legal Asociado", data.return.descripcion);
																 		           	}
																 		       	} 
																 		       	
																 		       	function processError(data, status, req) {
																 		            //alert(req.responseText + " " + status);
																 		           	swal("Error al contactar el servicio", data);
																 		           	valid = false;
																 		           	return valid;
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
											 		           } 
											 		       	
											 		       	function processError(data, status, req) {
											 		            //alert(req.responseText + " " + status);
											 		           	swal("Error al contactar el servicio", data);
											 		           	valid = false;
											 		           	return valid;
											 		       	} 
									 		           	}
									 		           } 
									 		       	
									 		       	function processError(data, status, req) {
									 		            //alert(req.responseText + " " + status);
									 		           	swal("Error al contactar el servicio", data);
									 		           	valid = false;
									 		           	return valid;
									 		       	}
								        		}else if(data.return.identificacionRepresentante == identifi_tab4.val()){
								        			
								        			console.log("representante encontrado------------------");
								        			
								        			$("#tipo_identificacion_tab4").val(data.return.tipoIdentificacionId.nombre);
								        			$("#identificacion_tab4").val(data.return.identificacionRepresentante);
								        			$("#primer_nombre_tab4").val(data.return.primerNombre);
								        			$("#segundo_nombre_tab4").val(data.return.segundoNombre);
								        			$("#primer_apellido_tab4").val(data.return.primerApellido);
								        			$("#segundo_apellido_tab4").val(data.return.segundoApellido);
								        			$("#telefono_local_tab4").val(data.return.telefonoLocal);
								        			$("#telefono_celular_tab4").val(data.return.telefonoCelular);
								        			$("#correo_tab4").val(data.return.emailRepresentante);
								        			
								        			/////////////////////////////////////////////////////////////////////////
								        			
								        				var consulta_comercio_json = {
								 		           			"identificacionComercio": $("#identificacion_tab2").val()
								 		           		}
								 		           		
									 		           	$.ajax({
										 		               type: "POST",
										 		               url: '/CBPult/Afiliacion/consultaComercio',
										 		               contentType: "application/json",
										 		               dataType: "json",
										 		               data: JSON.stringify(consulta_comercio_json),
										 		               success: processSuccess,
										 		               error: processError
										 		           });
								 		           		
									 		           	function processSuccess(data, status, req) {
										 		            //alert(req.responseText + " " + status);
										 		       		console.log("consulta comercio asociar con representante...", data);
										 		       		
										 		           	if(data.return.identificacionComercio != $("#identificacion_tab2").val()){
										 		           		swal("Error al encontrar comercio", data.return.descripcion);
										 		           		valid = false;
										 		           		return valid;
										 		           		
										 		           	}else if(data.return.identificacionComercio == $("#identificacion_tab2").val()){
										 		           		
										 		           		var idcomercio = data.return.comercioId;
										 		           		
										 		           		var consulta_representante_json = {
										 		           			"identificacionRepresentante": $("#identificacion_tab4").val()
										 		           		};
										 		           		
											 		           	$.ajax({
												 		               type: "POST",
												 		               url: '/CBPult/Afiliacion/consultaRepresentanteLegalByIdentificacionRepresentante',
												 		               contentType: "application/json",
												 		               dataType: "json",
												 		               data: JSON.stringify(consulta_representante_json),
												 		               success: processSuccess,
												 		               error: processError
												 		           });
											 		           	
											 		           function processSuccess(data, status, req) {
												 		            //alert(req.responseText + " " + status);
												 		       		console.log("consulta representante al asociar representante..", data);
												 		       		
												 		           	if(data.return.identificacionRepresentante != $("#identificacion_tab4").val()){
												 		           		swal("Error al encontrar representante legal", data.return.descripcion);
												 		           		valid = false;
												 		           		return valid;
												 		           		
												 		           	}else if(data.return.identificacionRepresentante == $("#identificacion_tab4").val()){
												 		           		var representanteid = data.return.representanteId;
												 		           		
													 		           	var asociar_representante_legal_json = {
												 		           				"comercioId": idcomercio,
												 		           				"representanteId": representanteid
												 		           		};
											 		           		
													 		           	$.ajax({
														 		               type: "POST",
														 		               url: '/CBPult/Afiliacion/asociarComercioConRepresentanteLegal',
														 		               contentType: "application/json",
														 		               dataType: "json",
														 		               data: JSON.stringify(asociar_representante_legal_json),
														 		               success: processSuccess,
														 		               error: processError
														 		           });
													 		       	
														 		       	function processSuccess(data, status, req) {
														 		            //alert(req.responseText + " " + status);
														 		       		console.log("asociar sin crear representante....", data);
														 		       		
														 		           	if(data.return.descripcion === "El objeto que intenta registrar ya existe en base de datos"){
														 		           		swal("Error al Asociar Representante Legal", data.return.descripcion);
														 		           		valid = true;
														 		           		return valid;
														 		           		
														 		           	}else if(data.return.descripcion === "OK"){
														 		           		document.getElementById("tipo_identificacion_tab4").disabled = true;
														 		           		document.getElementById("identificacion_tab4").disabled = true;
														 		           		document.getElementById("primer_nombre_tab4").disabled = true;
														 		           		document.getElementById("segundo_nombre_tab4").disabled = true;
														 		          		document.getElementById("primer_apellido_tab4").disabled = true;
														 		         		document.getElementById("segundo_apellido_tab4").disabled = true;
														 		        		document.getElementById("telefono_local_tab4").disabled = true;
														 		       			document.getElementById("telefono_celular_tab4").disabled = true;
														 		      			document.getElementById("correo_tab4").disabled = true;
														 		           		
															 		           	swal("Representante Legal Asociado", data.return.descripcion);
														 		           		valid = true;
														 		           		return valid;
														 		           	}
														 		       	} 
														 		       	
														 		       	function processError(data, status, req) {
														 		            //alert(req.responseText + " " + status);
														 		           	swal("Error al contactar el servicio", data);
														 		           	valid = false;
														 		           	return valid;
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
										 		           } 
										 		       	
										 		       	function processError(data, status, req) {
										 		            //alert(req.responseText + " " + status);
										 		           	swal("Error al contactar el servicio", data);
										 		           	valid = false;
										 		           	return valid;
										 		       	} 
										 		       	
						 		           		}
												    	   
						 		       		}
							 		       	
							 		       function processError(data, status, req) {
							 		            //alert(req.responseText + " " + status);
							 		           	swal("Error al contactar el servicio", data);
							 		           	valid = false;
							 		           	return valid;
							 		           } 
						        	 
						         }else if(cont1 < 4){
						        	 cont1 = 0;
						        	 valid = false;
						        	 return valid;
						         }

		        		//return valid;
		        	}
		        		
		        	//////////////////////////////////////////////////
			       
			       if (stepDirection === 'backward') {
			    	   //clientValidator.resetForm();
			       }
			       
			     }
		        
		     // tab 4   
		        if (currentIndex === 3) {
		        	valid = false;
		        	
		        	////////Consulta Provincia////////////
		        	
		        		
		        	
		        	/////////////////////////////////////	
		        	
		        	/////////////////////////////////////
				
			       if (stepDirection === 'forward') {
			    	   var cont1 = 0;
			    	   
			    	   var avenida_calle_tab5 = $("#avenida_calle_tab5").val();
			    	   if(avenida_calle_tab5.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("avenida_calle_tab5").style.border = "1px solid red";
				         }
			    	   
			    	   var localidad_tab5 = $("#localidad_tab5").val();
			    	   if(localidad_tab5.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("localidad_tab5").style.border = "1px solid red";
				         }
			    	   
			    	   var punto_referencia_tab5 = $("#punto_referencia_tab5").val();
			    	   if(punto_referencia_tab5.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("punto_referencia_tab5").style.border = "1px solid red";
				         }
			    	   
			    	   var sector_urbanizacion_tab5 = $("#sector_urbanizacion_tab5").val();
			    	   if(sector_urbanizacion_tab5.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("sector_urbanizacion_tab5").style.border = "1px solid red";
				         }
			    	   
			    	   var codigo_postal_tab5 = $("#codigo_postal_tab5").val();
			    	   if(codigo_postal_tab5.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("codigo_postal_tab5").style.border = "1px solid red";
				         }
			    	   
			    	   var nombre_inmueble_tab5 = $("#nombre_inmueble_tab5").val();
			    	   if(nombre_inmueble_tab5.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("nombre_inmueble_tab5").style.border = "1px solid red";
				         }
			    	   
				         
				         if(cont1 == 6){
				        	 console.log(cont1);
				        	 //////////////////////////
				        	 
				        	 	valid = true;
				        	 	return valid;
				        	 
				        	 /////////////////////////
				         }else if(cont1 < 6){
				        	 valid = false;
				        	 return valid;
				         }
				         
			       }
			       if (stepDirection === 'backward') {
			    	   //clientValidator.resetForm();
			       }
			     }
		        
		     // tab 5 
		        if (currentIndex === 4) {
		        	valid = false;
				
			       if (stepDirection === 'forward') {
			    	   var cont1 = 0;
			    	   
			    	   var tipo_identificacion_tab6 = $("#tipo_identificacion_tab6").val();
			    	   var cargo_tab6 = $("#cargo_tab6").val();
			    	   
			    	   if(cargo_tab6.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("cargo_tab6").style.border = "1px solid red";
				         }
			    	   
			    	   var segundo_nombre_tab6 = $("#segundo_nombre_tab6").val();
			    	   if(segundo_nombre_tab6.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("segundo_nombre_tab6").style.border = "1px solid red";
				         }
			    	   
			    	   var segundo_apellido_tab6 = $("#segundo_apellido_tab6").val();
			    	   if(segundo_apellido_tab6.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("segundo_apellido_tab6").style.border = "1px solid red";
				         }
			    	   
			    	   var identificacion_tab6 = $("#identificacion_tab6").val();
			    	   if(identificacion_tab6.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("identificacion_tab6").style.border = "1px solid red";
				         }
			    	   
			    	   var correo_electronico_tab6 = $("#correo_electronico_tab6").val();
			    	   if(correo_electronico_tab6.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("correo_electronico_tab6").style.border = "1px solid red";
				         }
			    	   
			    	   var primer_nombre_tab6 = $("#primer_nombre_tab6").val();
			    	   if(primer_nombre_tab6.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("primer_nombre_tab6").style.border = "1px solid red";
				         }
			    	   
			    	   var primer_apellido_tab6 = $("#primer_apellido_tab6").val();
			    	   if(primer_apellido_tab6.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("primer_apellido_tab6").style.border = "1px solid red";
				         }
			    	   
			    	   var telefono_tab6 = $("#telefono_tab6").val();
			    	   if(telefono_tab6.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("telefono_tab6").style.border = "1px solid red";
				         }
				         
				         if(cont1 == 8){
				        	 console.log(cont1);
				        	 
				        	 ///////////////////////////////////////
				        	 
				        	 	var identificacion_tab6 = $("#identificacion_tab6");
				        	 
				        	 	var consulta_contacto_json = {
				        	 			"identificacionContacto": identificacion_tab6.val()
				        	 	};
				        	 	
				        	 	$.ajax({
				 		               type: "POST",
				 		               url: '/CBPult/Afiliacion/consultaContactoByIdentificacionContacto',
				 		               contentType: "application/json",
				 		               dataType: "json",
				 		               data: JSON.stringify(consulta_contacto_json),
				 		               success: processSuccess,
				 		               error: processError
				        	 	});
				 		       	
				 		       	function processSuccess(data, status, req) {
				 		            //alert(req.responseText + " " + status);
				 		       		console.log("consultar contacto...", data);
				 		       		
					 		       	if(typeof(data.return.identificacionContacto) == "object"){
					 		       		
						 		       	var crear_contacto_json = {
						        			 "tipoIdentificacionId": {
						        				 "nombre": $("#tipo_identificacion_tab6").val(),
						        				 "tipoIdentificacionId": "1"
						        			 },
						        			 "identificacionContacto": $("#identificacion_tab6").val(),
						        			 "telefonoCelular": $("#telefono_tab6").val(),
						        			 "primerNombre": $("#primer_nombre_tab6").val(),
						        			 "segundoNombre": $("#segundo_nombre_tab6").val(),
						        			 "primerApellido": $("#primer_apellido_tab6").val(),
						        			 "segundoApellido": $("#segundo_apellido_tab6").val(),
						        			 "cargoContacto": $("#cargo_tab6").val(),
						        			 "telefonoLocal": $("#telefono_tab6").val(),
						        			 "emailContacto": $("#correo_electronico_tab6").val()
						 		       	};
						 		       	
						 		       $.ajax({
					 		               type: "POST",
					 		               url: "/CBPult/Afiliacion/crearContacto",
					 		               contentType: "application/json",
					 		               dataType: "json",
					 		               data: JSON.stringify(crear_contacto_json),
					 		               success: processSuccess,
					 		               error: processError
					 		           });
					 		       	
						 		       	function processSuccess(data, status, req) {
						 		            //alert(req.responseText + " " + status);
						 		       		console.log("crear contacto----", data);
						 		       		
						 		           	if(data.return.descripcion === "FAIL"){
						 		           		swal("Error al Crear Persona Contacto", data.return.descripcion);
						 		           		valid = false;
						 		           		return valid;
						 		           		
						 		           	}else if(data.return.descripcion === "OK"){
						 		           		
						 		           			var consulta_comercio_json = {
						 		           				"identificacionComercio": $("#identificacion_tab2").val()	
						 		           			};
						 		           			
							 		           		$.ajax({
									 		               type: "POST",
									 		               url: '/CBPult/Afiliacion/consultaComercio',
									 		               contentType: "application/json",
									 		               dataType: "json",
									 		               data: JSON.stringify(consulta_comercio_json),
									 		               success: processSuccess,
									 		               error: processError
									 		           });
							 		           		
								 		           	function processSuccess(data, status, req) {
									 		            //alert(req.responseText + " " + status);
									 		       		console.log("consulta comercio al asociar contacto------", data);
									 		       		
									 		           	if(data.return.identificacionComercio != $("#identificacion_tab2").val()){
									 		           		swal("Error al encontrar comercio", data.return.descripcion);
									 		           		valid = false;
									 		           		return valid;
									 		           		
									 		           	}else if(data.return.identificacionComercio == $("#identificacion_tab2").val()){
									 		           		var comercioid = data.return.comercioId;
									 		           		
										 		           	var consulta_contacto_json = {
										 		           		"identificacionContacto": $("#identificacion_tab6").val()
										 		           	};
										 		           	
										 		           $.ajax({
										 		               type: "POST",
										 		               url: '/CBPult/Afiliacion/consultaContactoByIdentificacionContacto',
										 		               contentType: "application/json",
										 		               dataType: "json",
										 		               data: JSON.stringify(consulta_contacto_json),
										 		               success: processSuccess,
										 		               error: processError
										 		           });
										 		           
											 		          function processSuccess(data, status, req) {
												 		            //alert(req.responseText + " " + status);
												 		       		console.log("consultar contacto----------", data);
												 		       		
												 		           	if(data.return.identificacionContacto != $("#identificacion_tab6").val()){
												 		           		swal("Error al encontrar contacto", data.return.descripcion);
												 		           		valid = false;
												 		           		return valid;
												 		           		
												 		           	}else if(data.return.identificacionContacto == $("#identificacion_tab6").val()){
													 		           	var contactoid = data.return.contactoId;
													 		           	
														 		           var asociar_contacto_json = {
													 		           				"comercioId": comercioid,
													 		           				"contactoId": contactoid
													 		           		};
												 		           		
														 		           	$.ajax({
															 		               type: "POST",
															 		               url: '/CBPult/Afiliacion/asociarComercioConContacto',
															 		               contentType: "application/json",
															 		               dataType: "json",
															 		               data: JSON.stringify(asociar_contacto_json),
															 		               success: processSuccess,
															 		               error: processError
															 		           });
														 		       	
															 		       	function processSuccess(data, status, req) {
															 		            //alert(req.responseText + " " + status);
															 		       		console.log("asociar comercio------", data);
															 		       		
															 		           	if(data.return.descripcion === "FAIL"){
															 		           		swal("Error al Asociar Persona Contacto", data.return.descripcion);
															 		           		valid = false;
															 		           		return valid;
															 		           		
															 		           	}else if(data.return.descripcion === "OK"){
																 		           	document.getElementById("cargo_tab6").disabled = true;
															 		           		document.getElementById("primer_nombre_tab6").disabled = true;
															 		           		document.getElementById("segundo_nombre_tab6").disabled = true;
															 		           		document.getElementById("primer_apellido_tab6").disabled = true;
															 		          		document.getElementById("segundo_apellido_tab6").disabled = true;
															 		         		document.getElementById("tipo_identificacion_tab6").disabled = true;
															 		        		document.getElementById("identificacion_tab6").disabled = true;
															 		       			document.getElementById("telefono_tab6").disabled = true;
															 		      			document.getElementById("correo_electronico_tab6").disabled = true;
															 		           		
															 		           		swal("Persona Contacto Asociado", data.return.descripcion);
															 		           		valid = true;
															 		           		return valid;
															 		           	}
															 		       	} 
															 		       	
															 		       	function processError(data, status, req) {
															 		            //alert(req.responseText + " " + status);
															 		           	swal("Error al contactar el servicio", data);
															 		           	valid = false;
															 		           	return valid;
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
									 		       	} 
									 		       	
									 		       	function processError(data, status, req) {
									 		            //alert(req.responseText + " " + status);
									 		           	swal("Error al contactar el servicio", data);
									 		           	valid = false;
									 		           	return valid;
									 		       	} 
									 		       	
						 		           	}
						 		       	} 
						 		       	
						 		       	function processError(data, status, req) {
						 		            //alert(req.responseText + " " + status);
						 		           	swal("Error al contactar el servicio", data);
						 		           	valid = false;
						 		           	return valid;
						 		       	} 
					 		       		
					 		       	}else if(data.return.identificacionContacto == identificacion_tab6.val()){
					 		       		
					 		       		$("#cargo_tab6").val(data.return.cargoContacto);
					 		       		$("#primer_nombre_tab6").val(data.return.primerNombre);
					 		       		$("#segundo_nombre_tab6").val(data.return.segundoNombre);
					 		       		$("#primer_apellido_tab6").val(data.return.primerApellido);
					 		       		$("#segundo_apellido_tab6").val(data.return.segundoApellido);
					 		       		$("#tipo_identificacion_tab6").val(data.return.tipoIdentificacionId.nombre);
					 		       		$("#identificacion_tab6").val(data.return.identificacionContacto);
					 		       		$("#telefono_tab6").val(data.return.telefonoLocal);
					 		       		$("#correo_electronico_tab6").val(data.return.emailContacto);
					 		       		
					 		       		/////////////////////////////////
					 		       		
					 		       		var consulta_comercio_json = {
			 		           				"identificacionComercio": $("#identificacion_tab2").val()	
			 		           			};
			 		           			
				 		           		$.ajax({
						 		               type: "POST",
						 		               url: '/CBPult/Afiliacion/consultaComercio',
						 		               contentType: "application/json",
						 		               dataType: "json",
						 		               data: JSON.stringify(consulta_comercio_json),
						 		               success: processSuccess,
						 		               error: processError
						 		           });
				 		           		
					 		           	function processSuccess(data, status, req) {
						 		            //alert(req.responseText + " " + status);
						 		       		console.log("consulta comercio al asociar contacto------", data);
						 		       		
						 		           	if(data.return.identificacionComercio != $("#identificacion_tab2").val()){
						 		           		swal("Error al encontrar comercio", data.return.descripcion);
						 		           		valid = false;
						 		           		return valid;
						 		           		
						 		           	}else if(data.return.identificacionComercio == $("#identificacion_tab2").val()){
						 		           		var comercioid = data.return.comercioId;
						 		           		
							 		           	var consulta_contacto_json = {
							 		           		"identificacionContacto": $("#identificacion_tab6").val()
							 		           	};
							 		           	
							 		           $.ajax({
							 		               type: "POST",
							 		               url: '/CBPult/Afiliacion/consultaContactoByIdentificacionContacto',
							 		               contentType: "application/json",
							 		               dataType: "json",
							 		               data: JSON.stringify(consulta_contacto_json),
							 		               success: processSuccess,
							 		               error: processError
							 		           });
							 		           
								 		          function processSuccess(data, status, req) {
									 		            //alert(req.responseText + " " + status);
									 		       		console.log("consultar contacto----------", data);
									 		       		
									 		           	if(data.return.identificacionContacto != $("#identificacion_tab6").val()){
									 		           		swal("Error al encontrar contacto", data.return.descripcion);
									 		           		valid = false;
									 		           		return valid;
									 		           		
									 		           	}else if(data.return.identificacionContacto == $("#identificacion_tab6").val()){
										 		           	var contactoid = data.return.contactoId;
										 		           	
										 		           		var asociar_contacto_json = {
												 		       		"comercioId": comercioid,
									 		           				"contactoId": contactoid
										 		           		};
												 		       	
												 		       $.ajax({
											 		               type: "POST",
											 		               url: '/CBPult/Afiliacion/asociarComercioConContacto',
											 		               contentType: "application/json",
											 		               dataType: "json",
											 		               data: JSON.stringify(asociar_contacto_json),
											 		               success: processSuccess,
											 		               error: processError
											 		           });
												 		       
												 		       function processSuccess(data, status, req) {
												 		            //alert(req.responseText + " " + status);
												 		       		console.log("asociar comercio con consulta------", data);
												 		       		
												 		           	if(data.return.descripcion === "FAIL"){
												 		           		swal("Error al Asociar Persona Contacto", data.return.descripcion);
												 		           		valid = false;
												 		           		return valid;
												 		           		
												 		           	}else if(data.return.descripcion === "OK"){
												 		           		document.getElementById("cargo_tab6").disabled = true;
												 		           		document.getElementById("primer_nombre_tab6").disabled = true;
												 		           		document.getElementById("segundo_nombre_tab6").disabled = true;
												 		           		document.getElementById("primer_apellido_tab6").disabled = true;
												 		          		document.getElementById("segundo_apellido_tab6").disabled = true;
												 		         		document.getElementById("tipo_identificacion_tab6").disabled = true;
												 		        		document.getElementById("identificacion_tab6").disabled = true;
												 		       			document.getElementById("telefono_tab6").disabled = true;
												 		      			document.getElementById("correo_electronico_tab6").disabled = true;
												 		           		
												 		           		swal("Persona Contacto Asociado", data.return.descripcion);
												 		           		valid = true;
												 		           		return valid;
												 		           	}
											 		           	} 
												 		       	
										 		       			function processError(data, status, req) {
												 		            //alert(req.responseText + " " + status);
												 		           	swal("Error al contactar el servicio", data);
												 		           	valid = false;
												 		           	return valid;
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
						 		       	} 
						 		       	
						 		       	function processError(data, status, req) {
						 		            //alert(req.responseText + " " + status);
						 		           	swal("Error al contactar el servicio", data);
						 		           	valid = false;
						 		           	return valid;
						 		       	} 
					 		       		
					 		       	}
				 		           	
				 		       	} 
				 		       	
				 		       	function processError(data, status, req) {
				 		            //alert(req.responseText + " " + status);
				 		           	swal("Error al contactar el servicio", data);
				 		           	valid = false;
				 		           	return valid;
				 		       	} 
				        	 
				        	 ///////////////////////////////////////
				 		       	
				         }else if(cont1 < 8){
				        	 valid = false;
				        	 return valid;
				         }
				         
			       }
			       if (stepDirection === 'backward') {
			    	   //clientValidator.resetForm();
			       }
			     }
		        
		     // tab 6
		        if (currentIndex === 5) {
		        	valid = false;
				
			       if (stepDirection === 'forward') {
			    	   var cont1 = 0;
			    	   
			        		////Consulta COmercio....
			        	
			        		var consulta_comercio_json = {
			        				"identificacionComercio": $("#identificacion_tab2").val()
			        		}
		        	
				        	$.ajax({
			 		               type: "POST",
			 		               url: '/CBPult/Afiliacion/consultaComercio',
			 		               contentType: "application/json",
			 		               dataType: "json",
			 		               data: JSON.stringify(consulta_comercio_json),
			 		               success: processSuccess,
			 		               error: processError
			 		           });
			 		       
			 		       function processSuccess(data, status, req) {
			 		            //alert(req.responseText + " " + status);
			 		       		console.log("consulta comercio tab6------", data);
			 		       		
			 		           	if(data.return.identificacionComercio != $("#identificacion_tab2").val()){
			 		           		swal("Error al encontrar comercio", data.return.descripcion);
			 		           		valid = false;
			 		           		return valid;
			 		           		
			 		           	}else if(data.return.identificacionComercio == $("#identificacion_tab2").val()){
			 		           		var actividadComercial = data.return.actividadComercial;
			 		           		var afiliadoOtroBanco = data.return.afiliadoOtroBanco;
			 		           		var codigoUsuarioCarga = data.return.codigoUsuarioCarga;
			 		           		var codigoUsuarioModifica = data.return.codigoUsuarioModifica;
			 		           		var comercioId = data.return.comercioId;
			 		           		var email = data.return.email;
			 		           		var fechaCargaDatos = data.return.fechaCargaDatos;
			 		           		var fechaHoraModificacion = data.return.fechaHoraModificacion;
			 		           		var horaFin = data.return.horaFin;
			 		           		var horaInicio = data.return.horaInicio;
			 		           		var identificacionComercio = data.return.identificacionComercio;
			 		           		var nombreComercial = data.return.nombreComercial;
			 		           		var nombreEmpresarial = data.return.nombreEmpresarial;
			 		           		var numCuentaAsociado = data.return.numCuentaAsociado;
			 		           		var statusComercio = data.return.statusComercio;
			 		           		var telefonoAlternativo = data.return.telefonoAlternativo;
			 		           		var telefonoContacto = data.return.telefonoContacto;
			 		           		var telefonoLocal = data.return.telefonoLocal;
			 		           		var tipoIdentificacionId = {
			 		           				"nombre": data.return.tipoIdentificacionId.nombre,
			 		           				"tipoIdentificacionId": data.return.tipoIdentificacionId.tipoIdentificacionId
			 		           		}
			 		           		
			 		           		///// asociacion otro banco......
			 		           		
				 		           		var asociar_otro_banco_json = {
				 		           			"nombreBanco": $("#nombre_banco_tab7").val(),
				 		           			"tipoPos": $("#tipo_POS_tab7").val(),
				 		           			"cantidadPos": $("#cantidad_tab7").val(),
				 		           			"comercioId":{
					 		           			"actividadComercial":actividadComercial,
					 		           			"afiliadoOtroBanco":afiliadoOtroBanco,
					 		           			"codigoUsuarioCarga": codigoUsuarioCarga,
					 		           			"codigoUsuarioModifica": codigoUsuarioModifica,
					 		           			"comercioId":comercioId,
					 		           			"email":email,
					 		           			"fechaCargaDatos":fechaCargaDatos,
					 		           			"fechaHoraModificacion":fechaHoraModificacion,
					 		           			"horaFin": horaFin,
					 		           			"horaInicio": horaInicio,
					 		           			"identificacionComercio":identificacionComercio,
					 		           			"nombreComercial":nombreComercial,
					 		           			"nombreEmpresarial":nombreEmpresarial,
					 		           			"numCuentaAsociado":numCuentaAsociado,
					 		           			"statusComercio":statusComercio,
					 		           			"telefonoAlternativo":telefonoAlternativo,
					 		           			"telefonoContacto":telefonoContacto,
					 		           			"telefonoLocal":telefonoLocal,
					 		           			"tipoIdentificacionId":{
					 		           				"nombre":tipoIdentificacionId.nombre,
					 		           				"tipoIdentificacionId":tipoIdentificacionId.tipoIdentificacionId
					 		           			}
				 		           		}
				 		           	}
					        	
							        	$.ajax({
						 		               type: "POST",
						 		               url: '/CBPult/Afiliacion/asociarComercioOtroBanco',
						 		               contentType: "application/json",
						 		               dataType: "json",
						 		               data: JSON.stringify(asociar_otro_banco_json),
						 		               success: processSuccess,
						 		               error: processError
						 		           });
						 		       
						 		       	function processSuccess(data, status, req) {
						 		            //alert(req.responseText + " " + status);
						 		       		console.log("asociar otro banco tab6------", data);
						 		       		
						 		           	if(data.return.descripcion === "FAIL"){
						 		           		swal("Error al Asociar Procesadora", data.return.descripcion);
						 		           		valid = false;
						 		           		return valid;
						 		           		
						 		           	}else if(data.return.descripcion === "OK"){
						 		           		
						 		           		document.getElementById("nombre_banco_tab7").disabled = true;
						 		           		document.getElementById("tipo_POS_tab7").disabled = true;
						 		           		document.getElementById("cantidad_tab7").disabled = true;
						 		           		
						 		           		swal("Procesadora Asociada");
						 		           		valid = true;
						 		           		return valid;
						 		           	}
					 		           	} 
						 		       	
						       			function processError(data, status, req) {
						 		            //alert(req.responseText + " " + status);
						 		           	swal("Error al contactar el servicio", data);
						 		           	valid = false;
						 		           	return valid;
						       			} 
			 		           		
			 		           	}
		 		           	} 
			 		       	
			       			function processError(data, status, req) {
			 		            //alert(req.responseText + " " + status);
			 		           	swal("Error al contactar el servicio", data);
			 		           	valid = false;
			 		           	return valid;
			       			} 
		        	
			       			///////////////////
				         
			       }
			       if (stepDirection === 'backward') {
			    	   //clientValidator.resetForm();
			       }
			     }
		        /*
		     // tab 7
		        if (currentIndex === 6) {
		        	valid = false;
				
			       if (stepDirection === 'forward') {
			    	   var cont1 = 0;
			    	   
			    	   var comprobante_recibo_tab8 = $("#comprobante_recibo_tab8").val();
			    	   if(comprobante_recibo_tab8.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("comprobante_recibo_tab8").style.border = "1px solid red";
				         }
			    	   
			    	   var monto_tab8 = $("#monto_tab8").val();
			    	   if(monto_tab8.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("monto_tab8").style.border = "1px solid red";
				         }
			    	   
				         
				         if(cont1 == 2){
				        	 console.log(cont1);
				        	 ////////////////////
				        	 
				        	 	var consulta_comercio = {
				        	 		"identificacionComercio": $("#identificacion_tab2").val()
				        	 	}
				        	 	
				        	 		$.ajax({
				 		               type: "POST",
				 		               url: '/CBPult/Afiliacion/consultaComercio',
				 		               contentType: "application/json",
				 		               dataType: "json",
				 		               data: JSON.stringify(consulta_comercio),
				 		               success: processSuccess,
				 		               error: processError
				        	 		});
					 		       
					 		       function processSuccess(data, status, req) {
					 		            //alert(req.responseText + " " + status);
					 		       		console.log("consulta comercio tab7------", data);
					 		       		
					 		           	if(data.return.identificacionComercio != $("#identificacion_tab2").val()){
					 		           		swal("Error al encontrar comercio", data.return.descripcion);
					 		           		valid = false;
					 		           		return valid;
					 		           		
					 		           	}else if(data.return.identificacionComercio == $("#identificacion_tab2").val()){
					 		           		
					 		           		var actividadComercial = data.return.actividadComercial;
					 		           		var afiliadoOtroBanco = data.return.afiliadoOtroBanco;
					 		           		var codigoUsuarioCarga = data.return.codigoUsuarioCarga;
					 		           		var codigoUsuarioModifica = data.return.codigoUsuarioModifica;
					 		           		var comercioId = data.return.comercioId;
					 		           		var email = data.return.email;
					 		           		var fechaCargaDatos = data.return.fechaCargaDatos;
					 		           		var fechaHoraModificacion = data.return.fechaHoraModificacion;
					 		           		var horaFin = data.return.horaFin;
					 		           		var horaInicio = data.return.horaInicio;
					 		           		var identificacionComercio = data.return.identificacionComercio;
					 		           		var nombreComercial = data.return.nombreComercial;
					 		           		var nombreEmpresarial = data.return.nombreEmpresarial;
					 		           		var numCuentaAsociado = data.return.numCuentaAsociado;
					 		           		var statusComercio = data.return.statusComercio;
					 		           		var telefonoAlternativo = data.return.telefonoAlternativo;
					 		           		var telefonoContacto = data.return.telefonoContacto;
					 		           		var telefonoLocal = data.return.telefonoLocal;
					 		           		var tipoIdentificacionId_nombre = data.return.tipoIdentificacionId.nombre;
					 		           		var tipoIdentificacionId_tipoIdentificacionId = data.return.tipoIdentificacionId.tipoIdentificacionId;
					 		           		
					 		           		
							 		           	var crear_pago_comercio = {
					 		           					"modoPago": $("#tipo_pago_tab8").val(),
					 		           					"numComprobanteRecibo": $("#comprobante_recibo_tab8").val(),
					 		           					"pagoStatus": "N",
					 		           					"comercioId":{
					 		           						"actividadComercial": actividadComercial,
					 		           						"afiliadoOtroBanco": afiliadoOtroBanco,
						 		           					"codigoUsuarioCarga": codigoUsuarioCarga,
						 		           					"codigoUsuarioModifica": codigoUsuarioModifica,
						 		           					"comercioId": comercioId,
						 		           					"email": email,
						 		           					"fechaCargaDatos": fechaCargaDatos,
						 		           					"fechaHoraModificacion": fechaHoraModificacion,
						 		           					"horaFin": horaFin,
						 		           					"horaInicio": horaInicio,
						 		           					"identificacionComercio": identificacionComercio,
						 		           					"nombreComercial": nombreComercial,
						 		           					"nombreEmpresarial": nombreEmpresarial,
						 		           					"numCuentaAsociado": numCuentaAsociado,
						 		           					"statusComercio": statusComercio,
						 		           					"telefonoAlternativo": telefonoAlternativo,
						 		           					"telefonoContacto": telefonoContacto,
						 		           					"telefonoLocal": telefonoLocal,
						 		           					"tipoIdentificacionId":{
						 		           						"nombre": tipoIdentificacionId_nombre,
						 		           						"tipoIdentificacionId": tipoIdentificacionId_tipoIdentificacionId
						 		           					}
					 		           					},
					 		           					"entityBankName":$("#tipo_banco_tab8").val()
					 		           			};
							 		           	
							 		           $.ajax({
							 		               type: "POST",
							 		               url: '/CBPult/Afiliacion/crearPagoComercio',
							 		               contentType: "application/json",
							 		               dataType: "json",
							 		               data: JSON.stringify(crear_pago_comercio),
							 		               success: processSuccess,
							 		               error: processError
							        	 		});
							 		           
								 		          function processSuccess(data, status, req) {
									 		            //alert(req.responseText + " " + status);
									 		       		console.log("asociar tab8------", data);
									 		       		
									 		           	if(data.return.descripcion === "FAIL"){
									 		           		swal("Error al Asociar Procesadora", data.return.descripcion);
									 		           		valid = false;
									 		           		return valid;
									 		           		
									 		           	}else if(data.return.descripcion === "OK"){
									 		           		
									 		           		document.getElementById("tipo_pago_tab8").disabled = true;
									 		           		document.getElementById("tipo_banco_tab8").disabled = true;
									 		           		document.getElementById("comprobante_recibo_tab8").disabled = true;
									 		           		document.getElementById("monto_tab8").disabled = true;
									 		           		
									 		           		swal("Datos del Pago Asociado");
									 		           		valid = true;
									 		           		return valid;
									 		           	}
								 		           	} 
									 		       	
									       			function processError(data, status, req) {
									 		            //alert(req.responseText + " " + status);
									 		           	swal("Error al contactar el servicio", data);
									 		           	valid = false;
									 		           	return valid;
									       			} 
					 		           	}
				 		           	} 
					 		       	
			 		       			function processError(data, status, req) {
					 		            //alert(req.responseText + " " + status);
					 		           	swal("Error al contactar el servicio", data);
					 		           	valid = false;
					 		           	return valid;
			 		       			} 
				        	 
				        	 ///////////////////
				         }else if(cont1 < 2){
				        	 valid = false;
				        	 return valid;
				         }
				         
			       }
			       if (stepDirection === 'backward') {
			    	   //clientValidator.resetForm();
			       }
			     }
		        */

		        return true;
		        
		      },
		      onFinish: function () {
		        //alert('Wizard Completed');
		    	 
		    	  location.href = "/CBPult/dashborad";
		      }
		    });
		    
		    ///////////////////////////////////////////////////////////////////////////
		    ///////////////////////////////////////////////////////////////////////////
		    
		    
		    
		    /////////////////////////////////////////////////////////////////////////
		  /////////////////////////validacion de pasos/////////////////////////////////
		    /* file*/
		    
		  	$("#fileCedulaRepresentanteInformationName").change(function(){
		  		if(this.files.length==1){
		  			//$("#viwePDFnombre").prop('disabled', false);
		  			//var formato=$(this).val().split('.');//validaciond del formato del file
		  			if($(this).val().indexOf("pdf") > -1==true){			
		  				if($('#fileCedulaRepresentanteInformationName')[0].files[0].size <=5000000){//validacion del tamaño
		  			      $("#view_CedulaRepresentante").prop('disabled', false);
		  				}else{
		  					swal('El Archivo Seleccionado supera el tamaño permitido!!');
		  					$("#view_CedulaRepresentante").prop('disabled', true);
		  					$("#fileCedulaRepresentanteInformationName").val('');
		  				}
		  		
		  			}else if($(this).val().indexOf("jpeg") > -1==true){
		  				if($('#fileCedulaRepresentanteInformationName')[0].files[0].size <=5000000){//validacion del tamaño
		    			      $("#view_CedulaRepresentante").prop('disabled', false);
		    				}else{
		    					swal('El Archivo Seleccionado supera el tamaño permitido!!');
		    					$("#view_CedulaRepresentante").prop('disabled', true);
		    					$("#fileCedulaRepresentanteInformationName").val('');
		    				}
		  				
		  			}else{
		  				swal('El Archivo Seleccionado no tiene formato PDF o JPEG!!');
		  				$("#view_CedulaRepresentante").prop('disabled', true);
		  				$("#fileCedulaRepresentanteInformationName").val('');
		  			}
		  		
		  		}else{
		  			swal('No Seleccionado ningun Archivo!!');
		  		}
		  	   
		  	});
		    
		    $("#view_CedulaRepresentante").click(function() {
		  	  getBase64($("#fileCedulaRepresentanteInformationName")[0].files[0], 'viweFiles');
		    });
		    
		    /////////////////////////////////////////////////////////////////////////
		    
		  	$("#fileCedulaContactoInformationName").change(function(){
		  		if(this.files.length==1){
		  			//$("#viwePDFnombre").prop('disabled', false);
		  			//var formato=$(this).val().split('.');//validaciond del formato del file
		  			//alert($(this).val().indexOf("pdf") > -1);
		  			if($(this).val().indexOf("pdf") > -1==true){
		  				if($('#fileCedulaContactoInformationName')[0].files[0].size <=5000000){//validacion del tamaño
		  				      $("#view_CedulaContacto").prop('disabled', false);
		  					}else{
		  						swal('El Archivo Seleccionado supera el tamaño permitido!!');
		  						$("#view_CedulaContacto").prop('disabled', true);
		  						$("#fileCedulaContactoInformationName").val('');
		  					}
		  		
		  			}else if($(this).val().indexOf("jpeg") > -1==true){
		  				if($('#fileCedulaContactoInformationName')[0].files[0].size <=5000000){//validacion del tamaño
						      $("#view_CedulaContacto").prop('disabled', false);
							}else{
								swal('El Archivo Seleccionado supera el tamaño permitido!!');
								$("#view_CedulaContacto").prop('disabled', true);
								$("#fileCedulaContactoInformationName").val('');
							}
		  				
		  			}else{
		  				swal('El Archivo Seleccionado no tiene formato PDF o JPEG!!');
		  				$("#view_CedulaContacto").prop('disabled', true);
		  				$("#fileCedulaContactoInformationName").val('');
		  			}
		  		
		  		}else{
		  			swal('No Seleccionado ningun Archivo!!');
		  		}
		  	   
		  	});
		    
		    $("#view_CedulaContacto").click(function() {
		  	  getBase64($("#fileCedulaContactoInformationName")[0].files[0], 'viweFiles');
		    });
		    
		    /////////////////////////////////////////////////////////////////////////////////
		    
		    $("#fileNegocioInformationName").change(function(){
		  		if(this.files.length==1){
		  			//$("#viwePDFnombre").prop('disabled', false);
		  			//var formato=$(this).val().split('.');//validaciond del formato del file
		  			//alert($(this).val().indexOf("pdf") > -1);
		  			if($(this).val().indexOf("pdf") > -1==true){
		  				if($('#fileNegocioInformationName')[0].files[0].size <=5000000){//validacion del tamaño
		  				      $("#view_Negocio").prop('disabled', false);
		  					}else{
		  						swal('El Archivo Seleccionado supera el tamaño permitido!!');
		  						$("#view_Negocio").prop('disabled', true);
		  						$("#fileNegocioInformationName").val('');
		  					}
		  		
		  			}else if($(this).val().indexOf("jpeg") > -1==true){
		  				if($('#fileNegocioInformationName')[0].files[0].size <=5000000){//validacion del tamaño
						      $("#view_Negocio").prop('disabled', false);
							}else{
								swal('El Archivo Seleccionado supera el tamaño permitido!!');
								$("#view_Negocio").prop('disabled', true);
								$("#fileNogocioInformationName").val('');
							}
		  				
		  			}else{
		  				swal('El Archivo Seleccionado no tiene formato PDF o JPEG!!');
		  				$("#view_Negocio").prop('disabled', true);
		  				$("#fileNegocioInformationName").val('');
		  			}
		  		
		  		}else{
		  			swal('No Seleccionado ningun Archivo!!');
		  		}
		  	   
		  	});
		    
		    $("#view_Negocio").click(function() {
		  	  getBase64($("#fileNegocioInformationName")[0].files[0], 'viweFiles');
		    });
		    
		    /////////////////////////////////////////////////////////////////////////////////

		    function getBase64(file, field) {
		  	   var reader = new FileReader();
		  	   reader.readAsDataURL(file);
		  	   reader.onload = function () {
		  	     $('#'+field).attr('src', reader.result);
		  	   };
		  	   reader.onerror = function (error) {
		  		   swal('El Archivo PDF Defetuoso revise por favor!!');
		  	   };
		  	}
		    /**/
		    
	}


////////////////////////////////////////////////////////////////////////
///////////////////////////MODIFICAR//////////////////////////////////////
////////////////////////////////////////////////////////////////////////
	
	if(modificar === "modificar"){
		
			$.get( "/CBPult/Afiliacion/listaBanks", function( data ) {
				console.log("data------", data);
				  console.log("data1------", data[1]);
				  
				  for(var i=0; i<data.length; i++){
					  var bancos = '<option value="'+data[i].idEntityBank+'">'+data[i].entityBankName+'</option>';
					  $("#banco_tab2").append(bancos);
					  $("#nombre_banco_tab7").append(bancos);
					  $("#tipo_banco_tab8").append(bancos);
					  
				  }
				  
				  //////////////////////////////////////////////////////////
					
					var tipo_identificacion;
					var identificacion;
					var nombre_empresa;
					var nombre_comercial;
					var correo;
					var local;
					var numero_IBAN;
					var banco;
					var afiliado;
					var hora_inicio;
					var alternativo;
					var hora_final;
			
				//////////////////////////////////////////////////////////
			
			    	var consulta_comercio = {
			    			"identificacionComercio":id
			    	};
		    	
			    	$.ajax({
			           type: "POST",
			           url: '/CBPult/Afiliacion/consultaComercio',
			           contentType: "application/json",
			           dataType: "json",
			           data: JSON.stringify(consulta_comercio),
			           success: processSuccess,
			           error: processError
			       });
		   	
			       	function processSuccess(data, status, req) {
			            //alert(req.responseText + " " + status);
			       		console.log(data);
			       		
			       		var comercioid = data.return.comercioId;
			       		
			           	tipo_identificacion = data.return.tipoIdentificacionId.nombre;
			           	$("#tipo_identificacion_tab2").val(tipo_identificacion).prop('disabled', true);
			           	identificacion = data.return.identificacionComercio;
			           	$("#identificacion_tab2").val(identificacion).prop('disabled', true);
			           	nombre_empresa = data.return.nombreEmpresarial;
			           	$("#nombre_empresa_tab2").val(nombre_empresa);
			           	nombre_comercial = data.return.nombreComercial;
			           	$("#nombre_comercial_tab2").val(nombre_comercial);
			           	correo = data.return.email;
			           	$("#correo_tab2").val(correo);
			           	local = data.return.telefonoLocal;
			           	$("#telefono_local_tab2").val(local);
			           	numero_IBAN = data.return.numCuentaAsociado;
			           	$("#numero_iban_tab2").val(numero_IBAN);
			           	banco = data.return.actividadComercial;
			           	$("#banco_tab2").val(banco).prop('disabled', true);
			           	if(data.return.afiliadoOtroBanco === "S"){
			           		afiliado = "SI";
			           		$("#afiliado_tab2").val(afiliado);
			           	}
			           	if(data.return.afiliadoOtroBanco === "N"){
			           		afiliado = "NO";
			           		$("#afiliado_tab2").val(afiliado);
			           	}
			           	hora_inicio = data.return.horaInicio;
			           	$("#horario_inicio_tab2").val(hora_inicio);
			           	alternativo = data.return.telefonoAlternativo;
			           	$("#telefono_alternativo_tab2").val(alternativo);
			           	hora_final = data.return.horaFin;
			           	$("#horario_fin_tab2").val(hora_final);
			           	
			           	/////////Consulta Banco Afiliacion/////////////////
			           	
			           	var consulta_banco_afiliacion = {
								"idAsociacion": $("#identificacion_tab2").val()
							}
				    	
					    	$.ajax({
					           type: "POST",
					           url: '/CBPult/Afiliacion/consultaBancoAfiliacionId',
					           contentType: "application/json",
					           dataType: "json",
					           data: JSON.stringify(consulta_banco_afiliacion),
					           success: processSuccess,
					           error: processError
					       });
				   	
					       	function processSuccess(data, status, req) {
					            //alert(req.responseText + " " + status);
					       		console.log("consulta banco afiliacion-----", data);
					       		
					       		$("#nombre_banco_tab3").val(data.return.entityBank.entityBankName).prop('disabled', true);
					       		$("#idbanco").val(data.return.entityBank.idEntityBank);
					       		$("#numero_afiliacion_tab3").val(data.return.numAfiliacionBanco).prop('disabled', true);
					       		$("#cantidad_terminales_tab3").val(data.return.numTerminalesComprar);
					       		
							    /////////Consulta Representante Legal//////////////
										
										var consulta_asociacion_representante_legal = {
											"comercioId": comercioid
										}
							    	
								    	$.ajax({
								           type: "POST",
								           url: '/CBPult/Afiliacion/consultaAsociacionComercioRepresentante',
								           contentType: "application/json",
								           dataType: "json",
								           data: JSON.stringify(consulta_asociacion_representante_legal),
								           success: processSuccess,
								           error: processError
								       });
							   	
								       	function processSuccess(data, status, req) {
								            //alert(req.responseText + " " + status);
								       		console.log("consulta representante asociacion-----", data);
								       		
								       		$("#tipo_identificacion_tab4").val(data.return.representanteLegal.tipoIdentificacionId.nombre).prop('disabled', true);
								       		$("#identificacion_tab4").val(data.return.representanteLegal.identificacionRepresentante).prop('disabled', true);
								       		$("#primer_nombre_tab4").val(data.return.representanteLegal.primerNombre);
								       		$("#segundo_nombre_tab4").val(data.return.representanteLegal.segundoNombre);
								       		$("#primer_apellido_tab4").val(data.return.representanteLegal.primerApellido);
								       		$("#segundo_apellido_tab4").val(data.return.representanteLegal.segundoApellido);
								       		$("#telefono_local_tab4").val(data.return.representanteLegal.telefonoLocal);
								       		$("#telefono_celular_tab4").val(data.return.representanteLegal.telefonoCelular);
								       		$("#correo_tab4").val(data.return.representanteLegal.emailRepresentante);
										       		
										    /////////Consulta Datos Persona Contacto/////////////////////
											       	
											       	var consulta_asociacion_persona_contacto = {
															"comercioId": comercioid
														}
											    	
												    	$.ajax({
												           type: "POST",
												           url: '/CBPult/Afiliacion/consultaAsociacionComercioContacto',
												           contentType: "application/json",
												           dataType: "json",
												           data: JSON.stringify(consulta_asociacion_persona_contacto),
												           success: processSuccess,
												           error: processError
												       });
											   	
												       	function processSuccess(data, status, req) {
												            //alert(req.responseText + " " + status);
												       		console.log("consulta asociacion contacto-----", data);
												       		
												       		$("#cargo_tab6").val(data.return.contacto.cargoContacto).prop('disabled', true);
												       		$("#primer_nombre_tab6").val(data.return.contacto.primerNombre);
												       		$("#segundo_nombre_tab6").val(data.return.contacto.segundoNombre);
												       		$("#primer_apellido_tab6").val(data.return.contacto.primerApellido);
												       		$("#segundo_apellido_tab6").val(data.return.contacto.segundoApellido);
												       		$("#tipo_identificacion_tab6").val(data.return.contacto.tipoIdentificacionId.nombre).prop('disabled', true);
												       		$("#identificacion_tab6").val(data.return.contacto.identificacionContacto).prop('disabled', true);
												       		$("#telefono_tab6").val(data.return.contacto.telefonoLocal);
												       		$("#correo_electronico_tab6").val(data.return.contacto.emailContacto);
												       		
												       		//////////////////Consulta Informacion Otro Bancos(Procesadoras)///////////////////
												       		
													       			var consulta_asociacion_otro_banco = {
																		"comercioId": comercioid
																	}
														    	
															    	$.ajax({
															           type: "POST",
															           url: '/CBPult/Afiliacion/consultaAsociacionComercioOtroBanco',
															           contentType: "application/json",
															           dataType: "json",
															           data: JSON.stringify(consulta_asociacion_otro_banco),
															           success: processSuccess,
															           error: processError
															       });
														   	
															       	function processSuccess(data, status, req) {
															            //alert(req.responseText + " " + status);
															       		console.log("consulta asociacion procesadora-----", data);
															       		
															       		$("#nombre_banco_tab7").val(data.return.nombreBanco);
															       		$("#tipo_POS_tab7").val(data.return.tipoPos);
															       		$("#cantidad_tab7").val(data.return.cantidadPos);
															       		
															       		//////////////////Consulta Datos del Pago///////////////////
															       		
															       		var consulta_Datos_Pago = {
																				"comercioId": comercioid
																			}
																    	
																	    	$.ajax({
																	           type: "POST",
																	           url: '/CBPult/Afiliacion/consultaAsociacionComercioOtroBanco',
																	           contentType: "application/json",
																	           dataType: "json",
																	           data: JSON.stringify(consulta_Datos_Pago),
																	           success: processSuccess,
																	           error: processError
																	       });
															       		
															       	} 
															       	
															       	function processError(data, status, req) {
															            //alert(req.responseText + " " + status);
															           	swal("Error al contacter el servicio", data);
															           	valid = false;
															           	return valid;
														       		}
												       		
												       	} 
												       	
												       	function processError(data, status, req) {
												            //alert(req.responseText + " " + status);
												           	swal("Error al contacter el servicio", data);
												           	valid = false;
												           	return valid;
											       		}
										       		
								       	} 
								       	
								       	function processError(data, status, req) {
								            //alert(req.responseText + " " + status);
								           	swal("Error al contacter el servicio", data);
								           	valid = false;
								           	return valid;
							       		}
					       		
					       	} 
					       	
					       	function processError(data, status, req) {
					            //alert(req.responseText + " " + status);
					           	swal("Error al contacter el servicio", data);
					           	valid = false;
					           	return valid;
				       		}

			       	} 
			       	
			       	function processError(data, status, req) {
			            //alert(req.responseText + " " + status);
			           	swal("Error al contacter el servicio", data);
			           	valid = false;
			           	return valid;
	           		}
				  
				});
	       	
	    //////////////////////////////////////////////////////////
       	
		$('#demo').steps({
		      onChange: function (currentIndex, newIndex, stepDirection) {
		    	  
		        console.log('onChange', currentIndex, newIndex, stepDirection);
		        
		        // tab 1    
		        if (currentIndex === 0) {
		        	valid = false;
		    		
		 	       if (stepDirection === 'forward') {
		 	    	   var cont1 = 0;
		 	    	   
		 		         var nombre_empresa1 = $("#nombre_empresa_tab2").val();
		 		         console.log("nombre empresa", nombre_empresa1.length);
		 		         if(nombre_empresa1.length >= 1){
		 		        	 cont1 = cont1 + 1;
		 		         }else{
		 		        	 cont1 = cont1;
		 		        	document.getElementById("nombre_empresa_tab2").style.border = "1px solid red";
		 		         }
		 		         
		 		         var numero_iban_tab2 = $("#numero_iban_tab2").val();
		 		         if(numero_iban_tab2.length >= 1){
		 		        	 cont1 = cont1 + 1;
		 		         }else{
		 		        	 cont1 = cont1;
		 		        	document.getElementById("numero_iban_tab2").style.border = "1px solid red";
		 		         }
		 		         
		 		         var identificacion_tab2 = $("#identificacion_tab2").val();
		 		         if(identificacion_tab2.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("identificacion_tab2").style.border = "1px solid red";
				         }
		 		         
		 		        var nombre_comercial_tab2 = $("#nombre_comercial_tab2").val();
				         if(nombre_comercial_tab2.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("nombre_comercial_tab2").style.border = "1px solid red";
				         }
				         
				         var telefono_local_tab2 = $("#telefono_local_tab2").val();
		 		         if(telefono_local_tab2.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("telefono_local_tab2").style.border = "1px solid red";
				         }
		 		         
		 		         if(cont1 == 5){
		 		        	 console.log(cont1);
		 		        	 
		 		        	 ////////////////
		 		        	 
		 		        	 var afiliado_1;
		 		        	 
		 		        	 if($("#afiliado_tab2").val() === "SI"){
		 		        		 afiliado_1 = "Y";
		 		        	 }
		 		        	 if($("#afiliado_tab2").val() === "NO"){
		 		        		afiliado_1 = "N";
		 		        	 }
		 		        	 
		 		        	var modificar_comercio = {
		 		        			"identificacionComercio": $("#identificacion_tab2").val(),
		 		        			"nombreEmpresarial": $("#nombre_empresa_tab2").val(),
		 		        			"nombreComercial": $("#nombre_comercial_tab2").val(),
		 		        			"email": $("#correo_tab2").val(),
		 		        			"telefonoContacto": $("#telefono_alternativo_tab2").val(),
		 		        			"telefonoLocal": $("#telefono_local_tab2").val(),
		 		        			"numCuentaAsociado": $("#numero_iban_tab2").val(),
		 		        			"afiliadoOtroBanco": afiliado_1,
		 		        			"actividadComercial": $("#banco_tab2").val(),
		 		        			"horaInicio": $("#horario_inicio_tab2").val(),
		 		        			"horaFin": $("#horario_fin_tab2").val()
		 			    	};
		 			    	
		 			    	$.ajax({
		 			           type: "POST",
		 			           url: '/CBPult/Afiliacion/modificarComercio',
		 			           contentType: "application/json",
		 			           dataType: "json",
		 			           data: JSON.stringify(modificar_comercio),
		 			           success: processSuccess,
		 			           error: processError
		 			       });
		 			   	
		 			       	function processSuccess(data, status, req) {
		 			            //alert(req.responseText + " " + status);
		 			       		console.log(data);
		 			       		
		 			           	if(data.return.descripcion === "FAIL"){
		 			           		swal("FAIL");
		 			           	}
		 			           	if(data.return.descripcion === "OK"){
		 			           		//swal("MODIFICADO");
		 			           	}
		 			           } 
		 			       	
		 			       	function processError(data, status, req) {
		 			            //alert(req.responseText + " " + status);
		 			           	swal("Error al contacter el servicio", data);
		 			           	valid = false;
		 			           	return valid;
		 			           }
				 		       	
		 		         }else if(cont1 < 5){
		 		        	 valid = false;
		 		        	 return valid;
		 		         }
		 		         
		 		        
		 	       }
		 	       if (stepDirection === 'backward') {
		 	    	   //clientValidator.resetForm();
		 	       }
		 	     }
			   
		        // tab 2    
		        if (currentIndex === 1) {
		        	valid = false;
		        	
		        		
		        	
		        	////////////////////////////////
		        	
			       if (stepDirection === 'forward') {
			    	   var cont1 = 0;
			    	   
			    	   var cantidad_terminales_tab3 = $("#cantidad_terminales_tab3").val();
			    	   if(cantidad_terminales_tab3.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("cantidad_terminales_tab3").style.border = "1px solid red";
				         }
				         
				         if(cont1 == 1){
				        	 console.log(cont1);
				        	 
				        	 /////////////////////
				        	 
				        	 	var modificar_banco_afiliacion = {
				        	 			"idAsociacion":id,
				        	 			"idEntityBanck":$("#idbanco").val(),
				        	 			"numeroAfiliacion":$("#numero_afiliacion_tab3").val(),
				        	 			"numTerminalesComprar":$("#cantidad_terminales_tab3").val()
			 			    	};
			 			    	
			 			    	$.ajax({
			 			           type: "POST",
			 			           url: '/CBPult/Afiliacion/editarAsociacionBancoComercio',
			 			           contentType: "application/json",
			 			           dataType: "json",
			 			           data: JSON.stringify(modificar_banco_afiliacion),
			 			           success: processSuccess,
			 			           error: processError
			 			       });
			 			   	
			 			       	function processSuccess(data, status, req) {
			 			            //alert(req.responseText + " " + status);
			 			       		console.log(data);
			 			       		
			 			           	if(data.return.descripcion === "FAIL"){
			 			           		swal("FAIL");
			 			           	}
			 			           	if(data.return.descripcion === "OK"){
			 			           		//swal("MODIFICADO");
			 			           	}
			 			       	} 
			 			       	
			 			       	function processError(data, status, req) {
			 			            //alert(req.responseText + " " + status);
			 			           	swal("Error al contacter el servicio", data);
			 			           	valid = false;
			 			           	return valid;
			 			       	}
				        	 
				        	 ////////////////////
				        	 
				         }else if(cont1 == 0){
				        	 valid = false;
				        	 return valid;
				         }

			       }
			       if (stepDirection === 'backward') {
			    	   //clientValidator.resetForm();
			       }
			     }
		        
		     // tab 3   
		        if (currentIndex === 2) {
		        	valid = false;
				
			       if (stepDirection === 'forward') {
			    	   var cont1 = 0;
			    	   
			    	   var primer_nombre_tab4 = $("#primer_nombre_tab4").val();
			    	   if(primer_nombre_tab4.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("primer_nombre_tab4").style.border = "1px solid red";
				         }
			    	   
			    	   var primer_apellido_tab4 = $("#primer_apellido_tab4").val();
			    	   if(primer_apellido_tab4.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("primer_apellido_tab4").style.border = "1px solid red";
				         }
			    	   
			    	   var identificacion_tab4 = $("#identificacion_tab4").val();
			    	   if(identificacion_tab4.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("identificacion_tab4").style.border = "1px solid red";
				         }
			    	   
			    	   var telefono_celular_tab4 = $("#telefono_celular_tab4").val();
			    	   if(telefono_celular_tab4.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("telefono_celular_tab4").style.border = "1px solid red";
				         }
				         
				         if(cont1 == 4){
				        	 console.log(cont1);
				        	 
				        	 /////////////////////
				        	 
				        	 	var modificar_representante_legal = {
				        	 			"identificacionRepresentante":$("#identificacion_tab4").val(),
				        	 			"primerNombre":$("#primer_nombre_tab4").val(),
				        	 			"segundoNombre":$("#segundo_nombre_tab4").val(),
				        	 			"primerApellido":$("#primer_apellido_tab4").val(),
				        	 			"segundoApellido":$("#segundo_apellido_tab4").val(),
				        	 			"telefonoLocal":$("#telefono_local_tab4").val(),
				        	 			"telefonoCelular":$("#telefono_celular_tab4").val(),
				        	 			"emailRepresentante":$("#correo_tab4").val()
			 			    	};
			 			    	
			 			    	$.ajax({
			 			           type: "POST",
			 			           url: '/CBPult/Afiliacion/editarRepresentanteLegal',
			 			           contentType: "application/json",
			 			           dataType: "json",
			 			           data: JSON.stringify(modificar_representante_legal),
			 			           success: processSuccess,
			 			           error: processError
			 			       });
			 			   	
			 			       	function processSuccess(data, status, req) {
			 			            //alert(req.responseText + " " + status);
			 			       		console.log(data);
			 			       		
			 			           	if(data.return.descripcion === "FAIL"){
			 			           		swal("FAIL");
			 			           	}
			 			           	if(data.return.descripcion === "OK"){
			 			           		//swal("MODIFICADO");
			 			           	}
			 			       	} 
			 			       	
			 			       	function processError(data, status, req) {
			 			            //alert(req.responseText + " " + status);
			 			           	swal("Error al contacter el servicio", data);
			 			           	valid = false;
			 			           	return valid;
			 			       	}
				        	 
				        	 ////////////////////
				        	 
				         }else if(cont1 == 0){
				        	 valid = false;
				        	 return valid;
				         }
				         
			       }
			       if (stepDirection === 'backward') {
			    	   //clientValidator.resetForm();
			       }
			     }
		        
		     // tab 4   
		        if (currentIndex === 3) {
		        	valid = false;
				
			       if (stepDirection === 'forward') {
			    	   var cont1 = 0;
			    	   
			    	   var avenida_calle_tab5 = $("#avenida_calle_tab5").val();
			    	   if(avenida_calle_tab5.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("avenida_calle_tab5").style.border = "1px solid red";
				         }
			    	   
			    	   var localidad_tab5 = $("#localidad_tab5").val();
			    	   if(localidad_tab5.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("localidad_tab5").style.border = "1px solid red";
				         }
			    	   
			    	   var punto_referencia_tab5 = $("#punto_referencia_tab5").val();
			    	   if(punto_referencia_tab5.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("punto_referencia_tab5").style.border = "1px solid red";
				         }
			    	   
			    	   var sector_urbanizacion_tab5 = $("#sector_urbanizacion_tab5").val();
			    	   if(sector_urbanizacion_tab5.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("sector_urbanizacion_tab5").style.border = "1px solid red";
				         }
			    	   
			    	   var codigo_postal_tab5 = $("#codigo_postal_tab5").val();
			    	   if(codigo_postal_tab5.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("codigo_postal_tab5").style.border = "1px solid red";
				         }
			    	   
			    	   var nombre_inmueble_tab5 = $("#nombre_inmueble_tab5").val();
			    	   if(nombre_inmueble_tab5.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("nombre_inmueble_tab5").style.border = "1px solid red";
				         }
			    	   
			    	   var geo_localizacion_tab5 = $("#geo_localizacion_tab5").val();
			    	   if(geo_localizacion_tab5.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("geo_localizacion_tab5").style.border = "1px solid red";
				         }
				         
				         if(cont1 == 7){
				        	 console.log(cont1);
				        	 valid = true;
				         }else if(cont1 == 0){
				        	 valid = false;
				         }
				         
				         return valid;
			       }
			       if (stepDirection === 'backward') {
			    	   //clientValidator.resetForm();
			       }
			     }
		        
		     // tab 5 
		        if (currentIndex === 4) {
		        	valid = false;
				
			       if (stepDirection === 'forward') {
			    	   var cont1 = 0;
			    	   
			    	   var cargo_tab6 = $("#cargo_tab6").val();
			    	   if(cargo_tab6.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("cargo_tab6").style.border = "1px solid red";
				         }
			    	   
			    	   var segundo_nombre_tab6 = $("#segundo_nombre_tab6").val();
			    	   if(segundo_nombre_tab6.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("segundo_nombre_tab6").style.border = "1px solid red";
				         }
			    	   
			    	   var segundo_apellido_tab6 = $("#segundo_apellido_tab6").val();
			    	   if(segundo_apellido_tab6.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("segundo_apellido_tab6").style.border = "1px solid red";
				         }
			    	   
			    	   var identificacion_tab6 = $("#identificacion_tab6").val();
			    	   if(identificacion_tab6.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("identificacion_tab6").style.border = "1px solid red";
				         }
			    	   
			    	   var correo_electronico_tab6 = $("#correo_electronico_tab6").val();
			    	   if(correo_electronico_tab6.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("correo_electronico_tab6").style.border = "1px solid red";
				         }
			    	   
			    	   var primer_nombre_tab6 = $("#primer_nombre_tab6").val();
			    	   if(primer_nombre_tab6.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("primer_nombre_tab6").style.border = "1px solid red";
				         }
			    	   
			    	   var primer_apellido_tab6 = $("#primer_apellido_tab6").val();
			    	   if(primer_apellido_tab6.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("primer_apellido_tab6").style.border = "1px solid red";
				         }
			    	   
			    	   var telefono_tab6 = $("#telefono_tab6").val();
			    	   if(telefono_tab6.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("telefono_tab6").style.border = "1px solid red";
				         }
				         
				         if(cont1 == 8){
				        	 console.log(cont1);
				        	 
				        	 /////////////////////
				        	 
				        	 	var modificar_persona_contacto = {
				        	 			"identificacionContacto": $("#identificacion_tab6").val(),
				        	 			"telefonoCelular": $("#telefono_tab6").val(),
				        	 			"primerNombre": $("#primer_nombre_tab6").val(),
				        	 			"segundoNombre": $("#segundo_nombre_tab6").val(),
				        	 			"primerApellido": $("#primer_apellido_tab6").val(),
				        	 			"segundoApellido": $("#segundo_apellido_tab6").val(),
				        	 			"cargoContacto": $("#cargo_tab6").val(),
				        	 			"telefonoLocal": $("#telefono_tab6").val(),
				        	 			"emailContacto": $("#correo_electronico_tab6").val()
			 			    	};
			 			    	
			 			    	$.ajax({
			 			           type: "POST",
			 			           url: '/CBPult/Afiliacion/editarContacto',
			 			           contentType: "application/json",
			 			           dataType: "json",
			 			           data: JSON.stringify(modificar_persona_contacto),
			 			           success: processSuccess,
			 			           error: processError
			 			       });
			 			   	
			 			       	function processSuccess(data, status, req) {
			 			            //alert(req.responseText + " " + status);
			 			       		console.log(data);
			 			       		
			 			           	if(data.return.descripcion === "FAIL"){
			 			           		swal("FAIL");
			 			           	}
			 			           	if(data.return.descripcion === "OK"){
			 			           		//swal("MODIFICADO");
			 			           	}
			 			       	} 
			 			       	
			 			       	function processError(data, status, req) {
			 			            //alert(req.responseText + " " + status);
			 			           	swal("Error al contacter el servicio", data);
			 			           	valid = false;
			 			           	return valid;
			 			       	}
				        	 
				        	 ////////////////////
				        	 
				         }else if(cont1 == 0){
				        	 valid = false;
				        	 return valid;
				         }
				         
			       }
			       if (stepDirection === 'backward') {
			    	   //clientValidator.resetForm();
			       }
			     }
		        
		     // tab 6
		        if (currentIndex === 5) {
		        	valid = false;
				
			       if (stepDirection === 'forward') {
			    	   
			    	   	var consulta_comercio = {
				    			"identificacionComercio":id
				    	};
			    	
				    	$.ajax({
				           type: "POST",
				           url: '/CBPult/Afiliacion/consultaComercio',
				           contentType: "application/json",
				           dataType: "json",
				           data: JSON.stringify(consulta_comercio),
				           success: processSuccess,
				           error: processError
				    	});
				    	
				    	function processSuccess(data, status, req) {
	 			            //alert(req.responseText + " " + status);
	 			       		console.log("consulta comercio otro banco...", data);
	 			       		
	 			           	var actividadComercial = data.return.actividadComercial;
	 			           	var afiliadoOtroBanco = data.return.afiliadoOtroBanco;
	 			           	var codigoUsuarioCarga = data.return.codigoUsuarioCarga;
	 			           	var codigoUsuarioModifica = data.return.codigoUsuarioModifica;
	 			           	var comercioId = data.return.comercioId;
	 			           	var email = data.return.email;
	 			           	var fechaCargaDatos = data.return.fechaCargaDatos;
	 			           	var fechaHoraModificacion = data.return.fechaHoraModificacion;
	 			           	var horaFin = data.return.horaFin;
	 			           	var horaInicio = data.return.horaInicio;
	 			           	var identificacionComercio = data.return.identificacionComercio;
	 			           	var nombreComercial = data.return.nombreComercial;
	 			           	var nombreEmpresarial = data.return.nombreEmpresarial;
	 			           	var numCuentaAsociado = data.return.numCuentaAsociado;
	 			           	var statusComercio = data.return.statusComercio;
	 			           	var telefonoAlternativo = data.return.telefonoAlternativo;
	 			           	var telefonoContacto = data.return.telefonoContacto;
	 			           	var telefonoLocal = data.return.telefonoLocal;
	 			           	var tipoIdentificacionId_nombre = data.return.tipoIdentificacionId.nombre;
	 			           	var tipoIdentificacionId_tipoIdentificacionId = data.return.tipoIdentificacionId.tipoIdentificacionId;
	 			           	
	 			           	/////////////////////
				        	 
				        	 	var modificar_otro_banco = {
				        	 			"nombreBanco": $("#nombre_banco_tab7").val(),
				        	 			"tipoPos": $("#tipo_POS_tab7").val(),
				        	 			"cantidadPos": $("#cantidad_tab7").val(),
				        	 			"comercioId":{
				        	 				"actividadComercial": actividadComercial,
				        	 				"afiliadoOtroBanco": afiliadoOtroBanco,
				        	 				"codigoUsuarioCarga": codigoUsuarioCarga,
				        	 				"codigoUsuarioModifica": codigoUsuarioModifica,
				        	 				"comercioId": comercioId,
				        	 				"email": email,
				        	 				"fechaCargaDatos": fechaCargaDatos,
				        	 				"fechaHoraModificacion": fechaHoraModificacion,
				        	 				"horaFin": horaFin,
				        	 				"horaInicio": horaInicio,
				        	 				"identificacionComercio": identificacionComercio,
				        	 				"nombreComercial": nombreComercial,
				        	 				"nombreEmpresarial": nombreEmpresarial,
				        	 				"numCuentaAsociado": numCuentaAsociado,
				        	 				"statusComercio": statusComercio,
				        	 				"telefonoAlternativo": telefonoAlternativo,
				        	 				"telefonoContacto": telefonoContacto,
				        	 				"telefonoLocal": telefonoLocal,
				        	 				"tipoIdentificacionId":{
				        	 					"nombre": tipoIdentificacionId_nombre,
				        	 					"tipoIdentificacionId": tipoIdentificacionId_tipoIdentificacionId
				        	 				}
				        	 			}
			 			    	};
			 			    	
			 			    	$.ajax({
			 			           type: "POST",
			 			           url: '/CBPult/Afiliacion/modificarAsociacionComercioOtroBanco',
			 			           contentType: "application/json",
			 			           dataType: "json",
			 			           data: JSON.stringify(modificar_otro_banco),
			 			           success: processSuccess,
			 			           error: processError
			 			    	});
			 			   	
			 			       	function processSuccess(data, status, req) {
			 			            //alert(req.responseText + " " + status);
			 			       		console.log(data);
			 			       		
			 			           	if(data.return.descripcion === "FAIL"){
			 			           		swal("FAIL");
			 			           	}
			 			           	if(data.return.descripcion === "OK"){
			 			           		//swal("MODIFICADO");
			 			           	}
			 			       	} 
			 			       	
			 			       	function processError(data, status, req) {
			 			            //alert(req.responseText + " " + status);
			 			           	swal("Error al contacter el servicio", data);
			 			           	valid = false;
			 			           	return valid;
			 			       	}
				        	 
				        	 ////////////////////
	 			       	} 
	 			       	
	 			       	function processError(data, status, req) {
	 			            //alert(req.responseText + " " + status);
	 			           	swal("Error al contacter el servicio", data);
	 			           	valid = false;
	 			           	return valid;
	 			       	}
			    	   	
			       }
			       if (stepDirection === 'backward') {
			    	   //clientValidator.resetForm();
			       }
			     }
		        
		     // tab 7
		        if (currentIndex === 6) {
		        	valid = false;
				
			       if (stepDirection === 'forward') {
			    	   var cont1 = 0;
			    	   
			    	   var comprobante_recibo_tab8 = $("#comprobante_recibo_tab8").val();
			    	   if(comprobante_recibo_tab8.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("comprobante_recibo_tab8").style.border = "1px solid red";
				         }
			    	   
			    	   var monto_tab8 = $("#monto_tab8").val();
			    	   if(monto_tab8.length >= 1){
				        	 cont1 = cont1 + 1;
				         }else{
				        	 cont1 = cont1;
				        	document.getElementById("monto_tab8").style.border = "1px solid red";
				         }
			    	   
				         
				         if(cont1 == 2){
				        	 console.log(cont1);
				        	 valid = true;
				         }else if(cont1 == 0){
				        	 valid = false;
				         }
				         
				         return valid;
			       }
			       if (stepDirection === 'backward') {
			    	   //clientValidator.resetForm();
			       }
			     }
		        

		        return true;
		        
		      },
		      onFinish: function () {
		        //alert('Wizard Completed');
		    	  location.href = "/CBPult/dashborad";
		      }
		    });
		    
		    ///////////////////////////////////////////////////////////////////////////
		    ///////////////////////////////////////////////////////////////////////////
		    
		    
		    
		    /////////////////////////////////////////////////////////////////////////
		  /////////////////////////validacion de pasos/////////////////////////////////
		    /* file*/
		    
		  	$("#fileCedulaRepresentanteInformationName").change(function(){
		  		if(this.files.length==1){
		  			//$("#viwePDFnombre").prop('disabled', false);
		  			//var formato=$(this).val().split('.');//validaciond del formato del file
		  			if($(this).val().indexOf("pdf") > -1==true){			
		  				if($('#fileCedulaRepresentanteInformationName')[0].files[0].size <=5000000){//validacion del tamaño
		  			      $("#view_CedulaRepresentante").prop('disabled', false);
		  				}else{
		  					swal('El Archivo Seleccionado supera el tamaño permitido!!');
		  					$("#view_CedulaRepresentante").prop('disabled', true);
		  					$("#fileCedulaRepresentanteInformationName").val('');
		  				}
		  		
		  			}else if($(this).val().indexOf("jpeg") > -1==true){
		  				if($('#fileCedulaRepresentanteInformationName')[0].files[0].size <=5000000){//validacion del tamaño
		    			      $("#view_CedulaRepresentante").prop('disabled', false);
		    				}else{
		    					swal('El Archivo Seleccionado supera el tamaño permitido!!');
		    					$("#view_CedulaRepresentante").prop('disabled', true);
		    					$("#fileCedulaRepresentanteInformationName").val('');
		    				}
		  				
		  			}else{
		  				swal('El Archivo Seleccionado no tiene formato PDF o JPEG!!');
		  				$("#view_CedulaRepresentante").prop('disabled', true);
		  				$("#fileCedulaRepresentanteInformationName").val('');
		  			}
		  		
		  		}else{
		  			swal('No Seleccionado ningun Archivo!!');
		  		}
		  	   
		  	});
		    
		    $("#view_CedulaRepresentante").click(function() {
		  	  getBase64($("#fileCedulaRepresentanteInformationName")[0].files[0], 'viweFiles');
		    });
		    
		    /////////////////////////////////////////////////////////////////////////
		    
		  	$("#fileCedulaContactoInformationName").change(function(){
		  		if(this.files.length==1){
		  			//$("#viwePDFnombre").prop('disabled', false);
		  			//var formato=$(this).val().split('.');//validaciond del formato del file
		  			//alert($(this).val().indexOf("pdf") > -1);
		  			if($(this).val().indexOf("pdf") > -1==true){
		  				if($('#fileCedulaContactoInformationName')[0].files[0].size <=5000000){//validacion del tamaño
		  				      $("#view_CedulaContacto").prop('disabled', false);
		  					}else{
		  						swal('El Archivo Seleccionado supera el tamaño permitido!!');
		  						$("#view_CedulaContacto").prop('disabled', true);
		  						$("#fileCedulaContactoInformationName").val('');
		  					}
		  		
		  			}else if($(this).val().indexOf("jpeg") > -1==true){
		  				if($('#fileCedulaContactoInformationName')[0].files[0].size <=5000000){//validacion del tamaño
						      $("#view_CedulaContacto").prop('disabled', false);
							}else{
								swal('El Archivo Seleccionado supera el tamaño permitido!!');
								$("#view_CedulaContacto").prop('disabled', true);
								$("#fileCedulaContactoInformationName").val('');
							}
		  				
		  			}else{
		  				swal('El Archivo Seleccionado no tiene formato PDF o JPEG!!');
		  				$("#view_CedulaContacto").prop('disabled', true);
		  				$("#fileCedulaContactoInformationName").val('');
		  			}
		  		
		  		}else{
		  			swal('No Seleccionado ningun Archivo!!');
		  		}
		  	   
		  	});
		    
		    $("#view_CedulaContacto").click(function() {
		  	  getBase64($("#fileCedulaContactoInformationName")[0].files[0], 'viweFiles');
		    });
		    
		    /////////////////////////////////////////////////////////////////////////////////
		    
		    $("#fileNegocioInformationName").change(function(){
		  		if(this.files.length==1){
		  			//$("#viwePDFnombre").prop('disabled', false);
		  			//var formato=$(this).val().split('.');//validaciond del formato del file
		  			//alert($(this).val().indexOf("pdf") > -1);
		  			if($(this).val().indexOf("pdf") > -1==true){
		  				if($('#fileNegocioInformationName')[0].files[0].size <=5000000){//validacion del tamaño
		  				      $("#view_Negocio").prop('disabled', false);
		  					}else{
		  						swal('El Archivo Seleccionado supera el tamaño permitido!!');
		  						$("#view_Negocio").prop('disabled', true);
		  						$("#fileNegocioInformationName").val('');
		  					}
		  		
		  			}else if($(this).val().indexOf("jpeg") > -1==true){
		  				if($('#fileNegocioInformationName')[0].files[0].size <=5000000){//validacion del tamaño
						      $("#view_Negocio").prop('disabled', false);
							}else{
								swal('El Archivo Seleccionado supera el tamaño permitido!!');
								$("#view_Negocio").prop('disabled', true);
								$("#fileNogocioInformationName").val('');
							}
		  				
		  			}else{
		  				swal('El Archivo Seleccionado no tiene formato PDF o JPEG!!');
		  				$("#view_Negocio").prop('disabled', true);
		  				$("#fileNegocioInformationName").val('');
		  			}
		  		
		  		}else{
		  			swal('No Seleccionado ningun Archivo!!');
		  		}
		  	   
		  	});
		    
		    $("#view_Negocio").click(function() {
		  	  getBase64($("#fileNegocioInformationName")[0].files[0], 'viweFiles');
		    });
		    
		    /////////////////////////////////////////////////////////////////////////////////

		    function getBase64(file, field) {
		  	   var reader = new FileReader();
		  	   reader.readAsDataURL(file);
		  	   reader.onload = function () {
		  	     $('#'+field).attr('src', reader.result);
		  	   };
		  	   reader.onerror = function (error) {
		  		   swal('El Archivo PDF Defetuoso revise por favor!!');
		  	   };
		  	}
		    /**/
		    
	}
	
