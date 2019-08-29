'use strict'

window.addEventListener('load', function(){
	
	var url = window.location.pathname;
	var id = url.substring(url.lastIndexOf('&') + 1);
	
	console.log("id--------", id);
	
//////////////////Consulta Recaudos Subidos ///////////////////
	
	$.ajax({
        type: "GET",
        url: '/CBPult/Afiliacion/consultaComercio/'+id+'',
        dataType: "json",
        success: processSuccess,
        error: processError
 	});
	
	function processSuccess(data, status, req) {
        //alert(req.responseText + " " + status);
   		console.log("consulta comercio-----", data);
   		
   		var aid = data.return.comercioId;
   		
   		$('#Cedula_Representante_confirm').on('click', function(){
			
			//document.getElementById("viweFiless").src = 'https://ruc.udc.es/dspace/bitstream/handle/2183/13995/2006_BICE%20n%C2%BA%202884_Importancia%20de%20algunas%20caracter%C3%ADsticas%20relevantes%20de%20los%20sucesores%20en%20las%20EFG.pdf?sequence=2&isAllowed=y';
			
			var lista_recaudos = {
			"comercioId": aid
		}
	
    	$.ajax({
           type: "POST",
           url: '/CBPult/Afiliacion/listaRecaudosByComercio',
           contentType: "application/json",
           dataType: "json",
           data: JSON.stringify(lista_recaudos),
           success: processSuccess,
           error: processError
    	});
			
			function processSuccess(data, status, req) {
            //alert(req.responseText + " " + status);
       		console.log("consulta recaudos comercio-----", data);
       		
       			console.log(data);
       			var uno = data[0].recaudoNombre;
		    	   
		       	console.log('boton1', uno);
		       	
		       	//alert($("#view_fileFinantial_save").val());
		    	 var url='/CBPult/Afiliacion/viewFile/'+uno+'';
		    	 console.log(url.substr(0, url.length-3));
		    	 var urlformat = url.substr(-3);
		    	 console.log("type---", urlformat);
		    	 if(url.substr(-3) === "png"){
		    		 console.log("Estoy en PNG");
		    		 $('#viweFiless').prop("type", "image/png");
		    		 console.log($('#viweFiless'));
		    		 $('#viweFiless').attr('src', url);
		    	 }else if(url.substr(-3) === "jpg"){
		    		 console.log("Estoy en JPEG");
		    		 $('#viweFiless').prop("type", "image/jpeg");
		    		 console.log($('#viweFiless'));
		    		 $('#viweFiless').attr('src', url);
		    	 }else if(url.substr(-3) === "pdf"){
		    		 console.log("Estoy en PDF");
		    		 $('#viweFiless').prop("type", "application/pdf");
		    		 console.log($('#viweFiless'));
		    		 $('#viweFiless').attr('src', url);
		    	 }
			}
			
			function processError(data, status, req) {
	            //alert(req.responseText + " " + status);
	           	swal("Error al contacter el servicio", data);
			}
	
		});
		
		///////
		
		$('#Cedula_Contacto_confirm').on('click', function(){
			
		var lista_recaudos = {
			"comercioId": aid
		}
	
    	$.ajax({
           type: "POST",
           url: '/CBPult/Afiliacion/listaRecaudosByComercio',
           contentType: "application/json",
           dataType: "json",
           data: JSON.stringify(lista_recaudos),
           success: processSuccess,
           error: processError
    	});
			
			function processSuccess(data, status, req) {
            //alert(req.responseText + " " + status);
       		console.log("consulta cedula contacto-----", data);
       		
       			console.log(data);
       			var uno = data[1].recaudoNombre;
		    	   
		       	console.log('boton2', uno);
		       	
		      //alert($("#view_fileFinantial_save").val());
		    	 var url='/CBPult/Afiliacion/viewFile/'+uno+'';
		    	 console.log(url.substr(0, url.length-3));
		    	 var urlformat = url.substr(-3);
		    	 console.log("type---", urlformat);
		    	 if(url.substr(-3) === "png"){
		    		 console.log("Estoy en PNG");
		    		 $('#viweFiless').prop("type", "image/png");
		    		 console.log($('#viweFiless'));
		    		 $('#viweFiless').attr('src', url);
		    	 }else if(url.substr(-3) === "jpg"){
		    		 console.log("Estoy en JPEG");
		    		 $('#viweFiless').prop("type", "image/jpeg");
		    		 console.log($('#viweFiless'));
		    		 $('#viweFiless').attr('src', url);
		    	 }else if(url.substr(-3) === "pdf"){
		    		 console.log("Estoy en PDF");
		    		 $('#viweFiless').prop("type", "application/pdf");
		    		 console.log($('#viweFiless'));
		    		 $('#viweFiless').attr('src', url);
		    	 }
			}
			
			function processError(data, status, req) {
            //alert(req.responseText + " " + status);
           	swal("Error al contacter el servicio", data);
   		}
	
		});
		
		///////
		
		$('#Fachada_confirm').on('click', function(){
			
			var lista_recaudos = {
			"comercioId": aid
		}
	
    	$.ajax({
           type: "POST",
           url: '/CBPult/Afiliacion/listaRecaudosByComercio',
           contentType: "application/json",
           dataType: "json",
           data: JSON.stringify(lista_recaudos),
           success: processSuccess,
           error: processError
    	});
			
			function processSuccess(data, status, req) {
            //alert(req.responseText + " " + status);
       		console.log("consulta fachada-----", data);
       		
       			console.log(data);
       			var uno = data[2].recaudoNombre;
		    	   
		       	console.log('boton3', uno);
		    	
		      //alert($("#view_fileFinantial_save").val());
		    	 var url='/CBPult/Afiliacion/viewFile/'+uno+'';
		    	 console.log(url.substr(0, url.length-3));
		    	 var urlformat = url.substr(-3);
		    	 console.log("type---", urlformat);
		    	 if(url.substr(-3) === "png"){
		    		 console.log("Estoy en PNG");
		    		 $('#viweFiless').prop("type", "image/png");
		    		 console.log($('#viweFiless'));
		    		 $('#viweFiless').attr('src', url);
		    	 }else if(url.substr(-3) === "jpg"){
		    		 console.log("Estoy en JPEG");
		    		 $('#viweFiless').prop("type", "image/jpeg");
		    		 console.log($('#viweFiless'));
		    		 $('#viweFiless').attr('src', url);
		    	 }else if(url.substr(-3) === "pdf"){
		    		 console.log("Estoy en PDF");
		    		 $('#viweFiless').prop("type", "application/pdf");
		    		 console.log($('#viweFiless'));
		    		 $('#viweFiless').attr('src', url);
		    	 }
			}
			
			function processError(data, status, req) {
	            //alert(req.responseText + " " + status);
	           	swal("Error al contacter el servicio", data);
			}
	
		});
	}
		
	function processError(data, status, req) {
	    //alert(req.responseText + " " + status);
	   	swal("Error al contacter el servicio", data);
	   	
	}
		
		
		
		
		/////Botones///////
		
		$("#atras").on('click', function(){
			location.href = "/CBPult/Afiliacion/bandeja_analista_comercial";
		});
		
		$("#negar").on('click', function(){
			
			var actualizar_status = {
				"identificacionComercio": id,
				"statusComecio": "N"
			};
			
			$.ajax({
		           type: "POST",
		           url: '/CBPult/Afiliacion/actualizarStatusComercio',
		           contentType: "application/json",
		           dataType: "json",
		           data: JSON.stringify(actualizar_status),
		           success: processSuccess,
		           error: processError
		    	});
			
			function processSuccess(data, status, req) {
	            //alert(req.responseText + " " + status);
	       		console.log("actualizar Status-----", data);
	       		
	       		$.ajax({
			           type: "GET",
			           url: '/CBPult/Afiliacion/consultaComercio/'+id+'',
			           dataType: "json",
			           success: processSuccess,
			           error: processError
			    	});
	       		
	       		function processSuccess(data, status, req) {
		            //alert(req.responseText + " " + status);
		       		console.log("Consulta Correo-----", data);
		       		
		       		var correo = data.return.email;
		       		
		       		$.ajax({
				           type: "POST",
				           url: '/CBPult/Afiliacion/enviarCorreo3/'+correo+'',
				           dataType: "json",
				           success: processSuccess,
				           error: processError
				    	});
		       		
		       		function processSuccess(data, status, req) {
			            //alert(req.responseText + " " + status);
			       		console.log("Enviar Correo-----", data);
			       		
			       		swal({
   	        		     title: "EXITO!",
   	        		     text: "Correo Enviado...",
   	        		     type: "success",
   	        		     timer: 3000
   	        		     },
   	        		     function () {
   	        		            location.href = "/CBPult/Afiliacion/bandeja_analista_comercial"
   	        		     });
		       		}
		       		
		       		function processError(data, status, req) {
			            //alert(req.responseText + " " + status);
			           	console.log("Error al contacter el servicio", data);
			           	
			           	swal({
     	        		     title: "EXITO!",
     	        		     text: "Correo Enviado...",
     	        		     type: "success",
     	        		     timer: 3000
     	        		     },
     	        		     function () {
     	        		            location.href = "/CBPult/Afiliacion/bandeja_analista_comercial"
     	        		     });
			           	
					}
		       		
	       		}
	       		
	       		function processError(data, status, req) {
		            //alert(req.responseText + " " + status);
		           	console.log("Error al contacter el servicio", data);
				}
	       			
			}
				
			function processError(data, status, req) {
	            //alert(req.responseText + " " + status);
	           	swal("Error al contacter el servicio", data);
			}
			
		});
		
		$("#aprobar").on('click', function(){
			
			var actualizar_status = {
				"identificacionComercio": id,
				"statusComecio": "A"
			};
			
			$.ajax({
		           type: "POST",
		           url: '/CBPult/Afiliacion/actualizarStatusComercio',
		           contentType: "application/json",
		           dataType: "json",
		           data: JSON.stringify(actualizar_status),
		           success: processSuccess,
		           error: processError
		    	});
			
			function processSuccess(data, status, req) {
	            //alert(req.responseText + " " + status);
	       		console.log("actualizar Status-----", data);
	       		
	       		
	       		//////////////Consulta Comercio para Cantidades de terminales y Simss//////////
	       		
	       		$.ajax({
			           type: "GET",
			           url: '/CBPult/Afiliacion/consultaBancoAfiliacionId/'+id+'',
			           dataType: "json",
			           success: processSuccess,
			           error: processError
			    	});
	       		
	       		function processSuccess(data, status, req) {
		            //alert(req.responseText + " " + status);
		       		console.log("consulta cantidades-----", data);
		       		
		       		var cantidad = data.return.numTerminalesComprar;
		       		console.log("cantidad----", cantidad);
		       		
		       			var crear_orden_relacionada = {
		       					"ordenRelacionadaNumber": "1",
		       					"tipoOrdenId": {
		       						"nombre": "DESPACHO",
		       						"tipoOrdenId": 2 
		       					},
		       					"descripcion": "Orden de Despacho desde Adquiriencia",
		       					"idProduct": {
		       						"catalogueId": {
		       				            "catalogueActive": "1",
		       				            "catalogueName": "1",
		       				            "codigoUsuarioModifica": "1",
		       				            "fechaHoraCarga": "1",
		       				            "fechaHoraModificacion": "1",
		       				            "idCatalogue": "1"
		       				        },
		       				        "codigoUsuarioModifica": "1",
		       				        "fechaHoraCarga": "1",
		       				        "fechaHoraModificacion": "1",
		       				        "idProduct": 2,
		       				        "productActive": 1,
		       				        "productLogo": "A",
		       				        "productName": "INGENICO",
		       				        "warehouseId": "89"
		       					},
		       					"cantidad": cantidad,
		       					"fechaCargaDatos": ""
		       				};
			       		
			       		$.ajax({
					           type: "POST",
					           url: '/CBPult/Afiliacion/crearOrdenRelacionada',
					           contentType: "application/json",
					           dataType: "json",
					           data: JSON.stringify(crear_orden_relacionada),
					           success: processSuccess,
					           error: processError
					    	});
			       		
			       		function processSuccess(data, status, req) {
				            //alert(req.responseText + " " + status);
				       		console.log("crear orden de despacho-----", data);
				       		
				       		$.ajax({
						           type: "GET",
						           url: '/CBPult/Afiliacion/consultaComercio/'+id+'',
						           dataType: "json",
						           success: processSuccess,
						           error: processError
						    	});
				       		
				       		function processSuccess(data, status, req) {
					            //alert(req.responseText + " " + status);
					       		console.log("Consulta Correo-----", data);
					       		
					       		var correo = data.return.email;
					       		
					       		$.ajax({
							           type: "POST",
							           url: '/CBPult/Afiliacion/enviarCorreo2/'+correo+'',
							           dataType: "json",
							           success: processSuccess,
							           error: processError
							    	});
					       		
					       		function processSuccess(data, status, req) {
						            //alert(req.responseText + " " + status);
						       		console.log("Enviar Correo-----", data);
						       		
						       		swal({
			      	        		     title: "EXITO!",
			      	        		     text: "Correo Enviado...",
			      	        		     type: "success",
			      	        		     timer: 3000
			      	        		     },
			      	        		     function () {
			      	        		            location.href = "/CBPult/Afiliacion/bandeja_analista_comercial"
			      	        		     });
					       		}
					       		
					       		function processError(data, status, req) {
						            //alert(req.responseText + " " + status);
						           	console.log("Error al contacter el servicio", data);
						           	
						           	swal({
			      	        		     title: "EXITO!",
			      	        		     text: "Correo Enviado...",
			      	        		     type: "success",
			      	        		     timer: 3000
			      	        		     },
			      	        		     function () {
			      	        		            location.href = "/CBPult/Afiliacion/bandeja_analista_comercial"
			      	        		     });
								}
					       		
				       		}
				       		
				       		function processError(data, status, req) {
					            //alert(req.responseText + " " + status);
					           	console.log("Error al contacter el servicio", data);
							}
				       		
				       		
			       		}
			       		
			       		function processError(data, status, req) {
				            //alert(req.responseText + " " + status);
				           	console.log("Error al contacter el servicio", data);
						}
		       		
	       		}
	       		
	       		function processError(data, status, req) {
		            //alert(req.responseText + " " + status);
		           	swal("Error al contacter el servicio", data);
				}
	       		
	       		///////////////////////////////////////////////////////////////////////////////
	       		
	       		
	       			
			}
				
			function processError(data, status, req) {
	            //alert(req.responseText + " " + status);
	           	swal("Error al contacter el servicio", data);
			}
			
		});
	
});