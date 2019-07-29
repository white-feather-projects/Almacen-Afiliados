 	var cliente = $('#cliente');
    var clientValidator = cliente.validate();
  
    var frmInfo = $('#frmInfo');
    var frmInfoValidator = frmInfo.validate();
    
    var frmInfo2 = $('#frmInfo2');
    var frmInfo2Validator = frmInfo2.validate();

    var frmLogin = $('#frmLogin');
    var frmLoginValidator = frmLogin.validate();

    var divFiles = $('#divFiles');
    var divFilesValidator = divFiles.validate();

    $('#demo').steps({
      onChange: function (currentIndex, newIndex, stepDirection) {
        console.log('onChange', currentIndex, newIndex, stepDirection);
        // tab1
        
   if (currentIndex === 3) {
          if (stepDirection === 'forward') {
            var valid = frmLogin.valid();
            return valid;
          }
          if (stepDirection === 'backward') {
            frmLoginValidator.resetForm();
          }
        } 
        

    // tab 1    
   if (currentIndex === 0) {
	
       if (stepDirection === 'forward') {
         var valid = cliente.valid();
         
       
         return valid;
       }
       if (stepDirection === 'backward') {
    	   clientValidator.resetForm();
       }
     } 
       
        

        // tab2
        if (currentIndex === 1) {
          if (stepDirection === 'forward') {
            var valid = frmInfo.valid();
            return valid;
          }
          if (stepDirection === 'backward') {
            frmInfoValidator.resetForm();
          }
        }
        
        
        if (currentIndex === 2) {
          if (stepDirection === 'forward') {
            var valid = frmInfo2.valid();
            return valid;
          }
          if (stepDirection === 'backward') {
            frmInfoValidator.resetForm();
          }
        }

        // tab3
        if (currentIndex === 4) {
          if (stepDirection === 'forward') {
            var valid = divFiles.valid();
            return valid;
          }
          if (stepDirection === 'backward') {
        	  divFilesValidator.resetForm();
          }
        }

        return true;

      },
      onFinish: function () {
        alert('Wizard Completed');
      }
    });
    
    
    
  //select dinamicos
    getPais();
    getCatOcupacional();
    validatClientPre();
    function getPais() {
  	$.ajax({
  		type : "GET",
  		url : '/listPaises',
  		dataType : "json",
  		success : function(data) {
  			paisActual(data);
  			
  			$("#pais_nacimiento").append('<option value="0">Selecione un Pais</option>');
  			$.each(data, function(key, pais) {
  				$("#pais_nacimiento").append('<option value=' + pais.idPais + '>' + pais.nombrePais+ '</option>');
  			});
  			
  		},
  		error : function(data) {
  		swal(errorSolicitud);
  		}
  	});
    }
    
    function paisActual(data){
  	  $("#pais_vivienda").find('option').remove();
  	  $("#pais_vivienda").append('<option value="0">Selecione un Pais</option>');
  		$.each(data, function(key, pais) {
  			$("#pais_vivienda").append('<option value=' + pais.idPais + '>' + pais.nombrePais+ '</option>');
  		});
  	  
    }
    
    function getCatOcupacional() {
  		$.ajax({
  			type : "GET",
  			url : '/listCatOpaciobal',
  			dataType : "json",
  			success : function(data) {
  				
  				$("#CatOcupacion").append('<option value="0">Selecione Categoria</option>');
  				$.each(data, function(key, cat) {
  					$("#CatOcupacion").append('<option value=' + cat.idCatOcu + '>' + cat.descripcion+ '</option>');
  				});
  				
  			},
  			error : function(data) {
  				swal(errorSolicitud);
  			}
  		});
  	  }
    
   $("#pais_vivienda").change(function() {
      var idPais= $("#pais_vivienda option:selected").val();
      if(idPais!=0){
      	getProvincias(idPais);
      }
    
    });
       
    function getProvincias(idPais) {
  		$.ajax({
  			type : "GET",
  			url : '/listProvincia/'+idPais,
  			dataType : "json",
  			success : function(data) {
  				getproviciaTrabajo(data);//referecias
  				$("#provinciaVivienda").find('option').remove();
  				$("#provinciaVivienda").append('<option value="0">Selecione un Provincia</option>');
  				$.each(data, function(key, provincia) {
  				$("#provinciaVivienda").append('<option value=' + provincia.idProvincia + '>' + provincia.nombreProvincia+ '</option>');
  				});
  				
  			},
  			error : function(data) {
  				swal(errorSolicitud);
  			}
  		});
  	  }
   
    $("#provinciaVivienda").change(function() {
  	    var idProvincia= $("#provinciaVivienda option:selected").val();
  	    if(idProvincia!=0){
  	    	getCanton(idProvincia)
  	    }
  	  
  	  });
    
    function getCanton(idProvincia) {
  		$.ajax({
  			type : "GET",
  			url : '/listCanton/'+idProvincia,
  			dataType : "json",
  			success : function(data) {
  				$("#cantonVivienda").find('option').remove();
  				$("#cantonVivienda").append('<option value="0">Selecione un Canton</option>');
  				$.each(data, function(key, canton) {
  				$("#cantonVivienda").append('<option value=' + canton.idCanton + '>' + canton.nombreCanton+ '</option>');
  				});
  				
  			},
  			error : function(data) {
  				swal(errorSolicitud);
  			}
  		});
  	  }
    
    $("#cantonVivienda").change(function() {
  	    var idCanton= $("#cantonVivienda option:selected").val();
  	    if(idCanton!=0){
  	    	getDistrito(idCanton)
  	    }
  	  
  	  });
    
    function getDistrito(idCanton) {
  		$.ajax({
  			type : "GET",
  			url : '/listDistrito/'+idCanton,
  			dataType : "json",
  			success : function(data) {
  				$("#distritoVivienda").find('option').remove();
  				$("#distritoVivienda").append('<option value="0">Selecione un Distrito</option>');
  				$.each(data, function(key, distrito) {
  				$("#distritoVivienda").append('<option value=' + distrito.idDistrito + '>' +distrito.nombreDistrito+ '</option>');
  				});
  				
  			},
  			error : function(data) {
  				swal(errorSolicitud);
  			}
  		});
  	  }//
    
  //adress cliente
   function getproviciaTrabajo(data){
  		$("#provinciaTrabajo").find('option').remove();
  		$("#provinciaTrabajo").append('<option value="0">Selecione un Provincia</option>');
  		$.each(data, function(key, provincia) {
  		$("#provinciaTrabajo").append('<option value=' + provincia.idProvincia + '>' + provincia.nombreProvincia+ '</option>');
  		});
  	 
   }
   $("#provinciaTrabajo").change(function() {
  	    var idProvincia= $("#provinciaTrabajo option:selected").val();
  	    if(idProvincia!=0){
  	    	getcantonTrabajo(idProvincia);
  	    }
  	  
  	  });

    function getcantonTrabajo(idProvincia){
  	  $.ajax({
  			type : "GET",
  			url : '/listCanton/'+idProvincia,
  			dataType : "json",
  			success : function(data) {
  				$("#cantonTrabajo").find('option').remove();
  				$("#cantonTrabajo").append('<option value="0">Selecione un Canton</option>');
  				$.each(data, function(key, canton) {
  				$("#cantonTrabajo").append('<option value=' + canton.idCanton + '>' + canton.nombreCanton+ '</option>');
  				});
  				
  			},
  			error : function(data) {
  				swal(errorSolicitud);
  			}
  		});
  	
  }
    function getDistritoTrabajo(idCanton){
  	  $.ajax({
  			type : "GET",
  			url : '/listDistrito/'+idCanton,
  			dataType : "json",
  			success : function(data) {
  				$("#distritoTrabajo").find('option').remove();
  				$("#distritoTrabajo").append('<option value="0">Selecione un Distrito</option>');
  				$.each(data, function(key, distrito) {
  				$("#distritoTrabajo").append('<option value=' + distrito.idDistrito + '>' +distrito.nombreDistrito+ '</option>');
  				});
  				
  			},
  			error : function(data) {
  				swal(errorSolicitud);
  			}
  		});
  	  
  	  
    }
    $("#cantonTrabajo").change(function() {
  	    var idCanton= $("#cantonTrabajo option:selected").val();
  	    if(idCanton!=0){
  	    	getDistritoTrabajo(idCanton)
  	    }
  	  
  	  });
    
  //  
    
    
   
    //pasocliente
    jQuery.extend({
  	    compare: function (arrayA, arrayB) {
  	        if (arrayA.length != arrayB.length) { return false; }
  	        // sort modifies original array
  	        // (which are passed by reference to our method!)
  	        // so clone the arrays before sorting
  	        var a = jQuery.extend(true, [], arrayA);
  	        var b = jQuery.extend(true, [], arrayB);
  	        a.sort(); 
  	        b.sort();
  	        for (var i = 0, l = a.length; i < l; i++) {
  	            if (a[i] !== b[i]) { 
  	                return false;
  	            }
  	        }
  	        return true;
  	    }
  	});
    
    //campos del paso 1
    /* select
     * tipo_identificador
     * pais_nacimiento
     */
    
    /*radios
     * radio_genero
     * radio_estado
     */
    
    function camposVacios(arrayBase, arrayCreate){
  	  var res=[];
  	 // var res = new Map();
  	  arrayBase.forEach(function (fieldB, indice, array){  
  			//console.log('Campos Base: '+fieldB);
  		  var valor=0;//inicio de la variable
  			arrayCreate.forEach(function (fieldC, indice, array){
  					if(fieldB==fieldC){
  						valor=1;
  						res.push(fieldB+':'+true);
  						// console.log('Campos que Coinciden: '+fieldC);
  					}		
  			  })
  			if(valor==0){
  				res.push(fieldB+':'+false);
  			}  
  	  })
  	  //indicar cuales esytan vacios
  	  
  	  return res;
  	  
  }
    
    
    //formulario 1cliente
    var fieldClient = ['primer_nombre', 'segundo_nombre', 'primer_apellido', 'segundo_apellido','tipo_identificador', 'documento_identidad', 'radio_genero', 'example-datetime-local-input', 'pais_nacimiento', 'radio_estado', 'correo', 'correo_confirm', 'profesion', 'celular', 'personaEP','tell_home', 'CatOcupacion','preAprobado'];
       $("#validateClient").click(function() {    	 
      	 var fieldClientConten=[];
  	  //validacion de campos
  	  fieldClient.forEach(function (field, indice, array){
  		  if($('#'+field).val().length <= 0){
  			  if(field=='segundo_nombre'){
  				  fieldClientConten.push('segundo_nombre');
  			  }else if(field=='personaEP'){
  				  fieldClientConten.push('personaEP');
  			  }else if(field=='tell_home'){
  				  fieldClientConten.push('tell_home');
  			  }
  			 // alert(field+'campos -o'+$('#'+field).val());
  		  }else{	

  			 // alert(field+'campos'+$('#'+field).val());
  			  if($('#'+field).val()!=0){ //validar que los campo pais este en cero 
  				 
  				  fieldClientConten.push(field); 
  			  }
  		  }
  	  });
  	  	  
  	  //
  	  
  	if(jQuery.compare(fieldClient, fieldClientConten)==true){
  		// $("#saveClient").prop("disabled",false);
  		
  		 crearCliente();
  	
  	}else{
  		var sinV=''; //agregar los comentarios!
  		var res=camposVacios(fieldClient , fieldClientConten);//validacion de campos
  		res.forEach(function (f, indice, array){
  		  var ca=f.split(':');
  		  if(ca[1]=='false'){
  			  //sinV+="<span class='red'>"+ca[0]+"</b></span></br>"; 
  			  switch(ca[0]) {
  			  case 'primer_nombre':
  				sinV+="<span class='red'>El campo Primer Nombre Esta Vacio</b></span></br>"
  			    break;
  			  case 'primer_apellido':
  				  sinV+="<span class='red'>El campo Primer Apellido Esta Vacio</b></span></br>"
  			    break;
  			  case 'documento_identidad':
  				  sinV+="<span class='red'>El campo Documento de Identidad Esta Vacio</b></span></br>"
  			    break;
  			  case 'pais_nacimiento':
  				  sinV+="<span class='red'>Debe Seleccionar un Pais!!</b></span></br>"
  			    break;
  			  case 'correo':
  				  sinV+="<span class='red'>El campo Email Esta Vacio</b></span></br>"
  			    break;
  			   case 'correo_confirm':
  				   sinV+="<span class='red'>El campo Confirmacion de Email Esta Vacio</b></span></br>"
  				   break;
  			    case 'celular':
  			    	 sinV+="<span class='red'>El campo Celullar Esta Vacio</b></span></br>"
  				    break;
  				 case 'CatOcupacion':
  					 sinV+="<span class='red'>Debe Seleccionar una Ocupacion!!</b></span></br>"
  				    break;
  				 case 'profesion':
  					 sinV+="<span class='red'>El campo Profesion Esta Vacio!!</b></span></br>"
  				    break;
  			}
  			  console.log("idCampo que no tiene valor:"+ca[0]);
  		  }else if(ca[1]=='true'){
  			  console.log("idCampo que si tiene valor:"+ca[0]);
  		  }    
  	  })
  		swal({
  			  html:true,
  			  title: "Campo Por Validar!!",
  			  text: sinV  
  			});
  	}
  	console.log(jQuery.compare(fieldClient, fieldClientConten));
     });
    
    /* expuesta*/
    //funcion persoan expuesta
    $("#divRadiosExpuesto input[name='radio_expuesto']").click(function() {
  	  if($(this).val()=='Si'){
  		  $('.personaEP').show();
  	  }else if($(this).val()=='No'){
  		 $('.personaEP').hide();
  	  }	 
    });
    //ocultar el campo
    $('.personaEP').hide();
    /*expuesta */
    
    /* tarjeta credito*/
    //funcion posee tarjeta credito
    $("#divRadiosTarjetaCredito input[name='tarjeta_credito']").click(function() {
  	  if($(this).val()=='Si'){
  		  $('#poseeTarjeta').show();
  	  }else if($(this).val()=='No'){
  		 $('#poseeTarjeta').hide();
  	  }	 
    });
    //ocultar el campo
    $('#poseeTarjeta').hide(); 
    
    
    /* validacion de cliente*/
    $("#documento_identidad").blur(function() {
  	  var ident=$("#documento_identidad").val();
  	  if(ident.length != 0){
  		 $.ajax({
  			type : "GET",
  			url : '/validateIdent/'+ident,
  			dataType : "json",
  			success : function(data) {
  				
  				var bloqueo=['example-datetime-local-input', 'pais_nacimiento', 'radio_estado', 'correo', 'correo_confirm', 'profesion', 'celular', 'personaEP', 'tell_home', 'CatOcupacion'];
  				if(data.existeClient==1){
  				//bloqueo de campo para  no registrar doble
  					swal('El nuevo cliente, ya se encuentra registrado!!');
  					bloqueo.forEach(function (field, indice, array){
  						$('#'+field).attr('disabled','disabled')
  					  });
  					
  				}else{
  					bloqueo.forEach(function (field, indice, array){
  						$('#'+field).removeAttr('disabled');
  					  });
  			
  				}
  			
  			},
  			error : function(data) {
  			swal(errorSolicitud);
  			}
  		});
  	    
  		  
  	  }
  	  
  	 
    });
    var errorSolicitud='Error en consulta, Intentelo nuevamente, de persistir el error notificar al personal de soporte!!';
    
    
    //variables universales
    var paso1=false;
    var paso2=false;
    /**/
    
    function crearCliente(){
  	  //procesando
  	  $('#procesando').prop("hidden",false);
  	  var json= {
  			    idcategoriOcuId:$('#CatOcupacion').val(),
  			    clientBirthday:$('#example-datetime-local-input').val(),
  			    clientCellPhone:$('#celular').val(),
  			    clientCivilStatus:$('input:radio[name=radio_estado]:checked').val(),
  			    clientDocumentId:$('#documento_identidad').val(),
  			    clientEmail:$('#correo_confirm').val(),
  			    clientFirstName:$('#primer_nombre').val(),
  			    clientGender:$('input:radio[name=radio_genero]:checked').val(),//
  			    clientHomePhone:$('#tell_home').val(),
  			    clientLastName:$('#segundo_nombre').val(),
  			    clientNationality:$('#pais_nacimiento').val(),
  			    clientPreaprovedAmount:$('#preAprobado').val(),
  			    clientProfession:$('#profesion').val(),
  			    clientSurname:$('#primer_apellido').val()+' '+$('#segundo_apellido').val(),
  			    clientTypeId:$('#tipo_identificador').val(),
  			    comentariosPersonaExpuesta:$('#personaEP').val(),
  			    paisId:$('#pais_nacimiento').val(),   
  	  };

  	  $("#validateClient").prop("disabled",true);
  	  $.ajax({
  			type : "POST",
  			url : '/createNewClient',
  			dataType : "json",
  			data:json,
  			success : function(data) {
  				
  				$('#procesando').prop("hidden",true);
  				if(data.descripcion=='OK'){
  					$('#client').val(data.idClientCreado);
  					swal('Registro del Cliente Exitoso!!');
  					$('#siguiente').prop("disabled",false);
  		    	 }else{
  		    		 //revisar validar si el registra esta para el mensje
  		    		 swal('Registro No Exitoso'); 
  		    	 }
  				
  			},
  			error : function(data) {
  				swal(errorSolicitud);
  			}
  		});  
    }
    $("#saveClient").click(function() {
  	 
  	 
  		
    });
    
    //validacion de pasos
    /* file*/
    
  	$("#fileFinantialInformationName").change(function(){
  		if(this.files.length==1){
  			//$("#viwePDFnombre").prop('disabled', false);
  			//var formato=$(this).val().split('.');//validaciond del formato del file
  			if($(this).val().indexOf("pdf") > -1==true){			
  				if($('#fileFinantialInformationName')[0].files[0].size <=1000000){//validacion del tamaño
  			      $("#view_identificacion").prop('disabled', false);
  				}else{
  					swal('El Archivo Seleccionado super el tamaño permitido!!');
  					$("#view_identificacion").prop('disabled', true);
  					$("#fileFinantialInformationName").val('');
  				}
  		
  			}else{
  				swal('El Archivo Seleccionado no tiene formato PDF!!');
  				$("#view_identificacion").prop('disabled', true);
  				$("#fileFinantialInformationName").val('');
  			}
  		
  		}else{
  			swal('No Seleccionado ningun Archivo!!');
  		}
  	   
  	});
    
    $("#view_identificacion").click(function() {
  	  getBase64($("#fileFinantialInformationName")[0].files[0], 'viweFiles');
    });
    
    //
    
  	$("#filePersonalInformationName").change(function(){
  		if(this.files.length==1){
  			//$("#viwePDFnombre").prop('disabled', false);
  			//var formato=$(this).val().split('.');//validaciond del formato del file
  			//alert($(this).val().indexOf("pdf") > -1);
  			if($(this).val().indexOf("pdf") > -1==true){
  				if($('#filePersonalInformationName')[0].files[0].size <=1000000){//validacion del tamaño
  				      $("#view_personal").prop('disabled', false);
  					}else{
  						swal('El Archivo Seleccionado super el tamaño permitido!!');
  						$("#view_personal").prop('disabled', true);
  						$("#filePersonalInformationName").val('');
  					}
  		
  			}else{
  				swal('El Archivo Seleccionado no tiene formato PDF!!');
  				$("#view_personal").prop('disabled', true);
  				$("#filePersonalInformationName").val('');
  			}
  		
  		}else{
  			swal('No Seleccionado ningun Archivo!!');
  		}
  	   
  	});
    
    $("#view_personal").click(function() {
  	  getBase64($("#filePersonalInformationName")[0].files[0], 'viweFiles');
    });
    

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
    
    $("#saveComplet").click(function() {
     var campos=['client','tenenciaVivienda','cuotaMensual', 'provinciaVivienda', 'cantonVivienda','distritoVivienda', 'ciudad', 'sector', 'ptoReferencia', 'codPostal' ,'client','nombreEmpresa','actividadEmpresa', 'cargo','sueldoMensual','provinciaTrabajo', 'cantonTrabajo', 'distritoTrabajo', 'telefonoEmpresa','email', 'antiguedad', 'cargoOtraEmpresa', 'ultimoSueldo','primerNombre','segundoNombre', 'apellidos', 'tipoDocumento', 'numeroDocumento','genero', 'telefonoCelular', 'telefonoFijo', 'emailReferencia', 'banco', 'ctaAhorro', 'ctaCorriente', 'TDC','filePersonalInformationName','fileFinantialInformationName'];
     var form = new FormData();
     
    
     //solo paara desarollo
    // $("#client").val('115');

    var camposValidate=[];
     campos.forEach(function (field, indice, array){  
  	  
  	   if($('#'+field).val().length <= 0){
  			  
  		  }else{
  			  if(field=='filePersonalInformationName'||field=='fileFinantialInformationName'){
  				   form.append(field , $('#'+field)[0].files[0]);
  			   }
  			  camposValidate.push(field);
  		  }
  		  
  	  })
  	 
  	  //insertar en formdata los campos ya validada
  	//  alert(jQuery.compare(camposValidate, campos));
      // alert( $("#client").val());
  	  if(jQuery.compare(camposValidate, campos)==true){
  		  
  		  camposValidate.forEach(function (field, indice, array){  
  			  form.append(field , $('#'+field).val()); 
  		  })
  		  $.ajax({
  			    url:'/asoosiateNewClient',
  			    data: form,
  			    dataType: 'json',
  			    processData: false,
  			    contentType: false,
  			    type: 'POST',
  			    success: function(data){
  			    	
  			   // alert(data.descripcion);
  			    	 if(data.descripcion=='OK'){
  			    		 
  			    		 swal({
  			    			  title: "Cliente Generado",
  			    			  text: "El registo fue Exitoso!",
  			    			  type: "warning",
  			    			  showCancelButton: true,
  			    			  confirmButtonClass: "btn-danger",
  			    			  confirmButtonText: "Asigar TDC",
  			    			  cancelButtonText: "Salir",
  			    			  closeOnConfirm: false,
  			    			  closeOnCancel: false
  			    			},
  			    			function(isConfirm) {
  			    			  if (isConfirm) {
  			    				  location.href = "/impresion_tarjetas/"+$('#documento_identidad').val();
  			    			  } else {
  			    				 location.href = "/client";
  			    			  }
  			    			});
  	
  			    	 }else{
  			    		 swal('Registro No Exitoso'); 
  			    	 }
  				},
  				error: function(e)
  				{
  				swal(errorSolicitud);
  				}
  			    	
  			    
  			  });
  		  
  		}else{
  			swal('Estimado Usuario Por favor valide los campos antes Ingresado.. Hay un campo Vacio o una Lista No selecionda!!'); 
  		}
  	  
    });
    // validacion del si hay una solicitud abierta
    

    function validatClientPre(){
  	  $.ajax({
  			type : "GET",
  			url : '/queryRequestClient',
  			dataType : "json",
  			success : function(data) {
  				console.log(data.existeClient);
  				if(data.existeClient!=0){
  					swal({
  						  title: "Estimado Usuario!!",
  						  text: "Posee un Cliente sin Completar desea Completar la Solicitud!!",
  						  type: "success",
  						  showCancelButton: true,
  						  confirmButtonClass: "btn-danger",
  						  confirmButtonText: "Recuperar Ahora?",
  						  closeOnConfirm: true
  						},
  						function(){
  							fieldClient.forEach(function (field, indice, array){  
  								$('#'+field).prop("disabled",true);
  							  })
  							 
  							  $('#client').val(data.client.idClient);
  							  $('#primer_nombre').val(data.client.clientFirstName);
  							  $('#documento_identidad').val(data.client.clientDocumentId);		
  							  $('#segundo_nombre').val(data.client.clientLastName);
  							  $('#primer_apellido').val(data.client.clientSurname);
  							  $('#segundo_apellido').val("");//revisar
  							  $('#tipo_identificador').val(data.client.clientTypeId);	  
  							  $('#correo').val(data.client.clientEmail);
  							  $('#correo_confirm').val(data.client.clientEmail);
  							  $('#profesion').val(data.client.clientProfession);	  
  							  $('#celular').val(data.client.clientCellPhone);
  							  $('#personaEP').val(data.client.comentariosPersonaExpuesta);
  							  $('#tell_home').val(data.client.clientHomePhone);
  							  //fecha
  							  var str=data.client.clientBirthday;
  							  var strd=str.split("-"); //split()
  							  var dia=strd[2].split('T');
  							  $('#example-datetime-local-input').val(dia[0]+'/'+strd[1]+'/'+strd[0]);

  							  //radio button
  							  $("input[name=radio_genero][value='"+data.client.clientGender+"']").prop("checked",true);
  							  $("input[name=radio_estado][value='"+data.client.clientCivilStatus+"']").prop("checked",true);
  							  //select
  							  $("#pais_nacimiento option[value="+data.client.paisId.idPais+"]").attr("selected",true); pais_nacimiento
  							  //personaExpuesta
  							  
  							  if(data.client.personaExpuestaPoliticamente=='Si'){
  								  $("input[name=radio_expuesto][value='"+data.client.personaExpuestaPoliticamente+"']").prop("checked",true);
  								  $('#personaEP').val(data.client.comentariosPersonaExpuesta);
  								  $('.personaEP').show();
  							  }else{
  								  $("input[name=radio_expuesto][value='"+data.client.personaExpuestaPoliticamente+"']").prop("checked",true);
  								  $('#personaEP').val(data.client.comentariosPersonaExpuesta);
  								  $('.personaEP').hide();
  							  }
  							  
  							  //ocultar botones de confirmacion
  							  $('#validateClient').hide();
  							  $('#saveClient').hide();
  							  $('#siguiente').prop("disabled",false);
  							 
  					
  						});


  				}else{
  					
  				}
  			},
  			error : function(data) {
  				swal(errorSolicitud);
  			}
  		});
  	  
  	  
    }