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
 		        			"horaFin": hora_final
 		        	 };
 		        	 
	 		        	$.ajax({
	 		               type: "POST",
	 		               url: '/crearClienteComercio',
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
		 		           		swal("Comercio Creado", data.return.descripcion);
		 		           		valid = true;
		 		           		return valid;
		 		           		swal("Comercio Creado", data.return.descripcion);
		 		           	}
		 		           } 
		 		       	
		 		       	function processError(data, status, req) {
		 		            //alert(req.responseText + " " + status);
		 		           	swal("Error al contacter el servicio", data);
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
        alert('Wizard Completed');
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