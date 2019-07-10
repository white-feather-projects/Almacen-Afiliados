'use strict'

window.addEventListener('load', function(){
	
	document.getElementById("documento_identidad_confirm").disabled = true;
	
	var data_finantial = JSON.parse(localStorage.getItem("finantial"));
	
	var tres = 0;
	
	/////////////////////////////////////////////
	
	var url = window.location.pathname;
	var id = url.substring(url.lastIndexOf('/') + 1);
	
	console.log('document: '+id);
	
	//consult(id);
	
	$.ajax({          
	     
		  type: "GET",
		  dataType: "json",
		  url: "/consultClient/"+id+"",
		  success: function(data)
	    {
     console.log(data);
     var clientBirthday = data.clientBirthday;
     var Birthday = clientBirthday.split("/");
     var clientCellPhone = data.clientCellPhone;
     var clientCivilStatus = data.clientCivilStatus;
     var clientDocumentId = data.clientDocumentId;
     var clientEconomicActivity = data.clientEconomicActivity;
     var clientEmail = data.clientEmail;
     var clientFirstName = data.clientFirstName;
     var clientGender = data.clientGender;
     var clientHomePhone = data.clientHomePhone;
     var clientLaborRelationship = data.clientLaborRelationship;
     var clientLastName = data.clientLastName;
     var clientOcupation = data.clientOcupation;
     var clientPreaprovedAmount = data.clientPreaprovedAmount;
     var clientProfession = data.clientProfession;
     var clientSalary = data.clientSalary;
     var clientSurname = data.clientSurname;
     var surname = clientSurname.split(" ");
     var clientTypeId = data.clientTypeId;
     var finantial = {
    		 	'uno': data.fileFinantial,
    		 	'dos': data.filePersonal,
	      		 'tres': data.idClient
	       };
  	   
     localStorage.setItem("document", data.clientDocumentId);
     localStorage.setItem("finantial", JSON.stringify(finantial));
     
     /////////////////////////////////////////////////////////////77
     
     $("#primer_nombre_confirm").val(clientFirstName);
     $("#segundo_nombre_confirm").val(clientLastName);
     $("#primer_apellido_confirm").val(surname[0]);
     $("#segundo_apellido_confirm").val(surname[1]);
     $("#tipo_identificador_confirm").val(clientTypeId);
     $("#documento_identidad_confirm").val(clientDocumentId);
     
     var genero = document.getElementsByName("radio_genero");

     var indexx;
     for(indexx in genero){
         if(genero[indexx].value == clientGender){
             genero[indexx].checked = true;
         }
     }
     
     $("#example-datetime-local-input").val(Birthday[2]+"-"+Birthday[1]+"-"+Birthday[0]);
     $("#pais_nacimiento_confirm").val();

     var estado_civil = document.getElementsByName("radio_estado");

         var indexx2;
         for(indexx2 in estado_civil){
             if(estado_civil[indexx2].value == clientCivilStatus){
                 estado_civil[indexx2].checked = true;
             }
         }
     
     $("#correo_confirm").val(clientEmail);
     $("#correo_confirm_confirm").val(clientEmail);
     $("#profesion_confirm").val(clientProfession);
     $("#ocupacion_confirm").val(clientOcupation);
     $("#actividad_economica_confirm").val(clientEconomicActivity);
     $("#relacion_laboral_confirm").val(clientLaborRelationship);
     $("#sueldo_confirm").val(clientSalary);
     $("#monto_preaprobado_confirm").val(clientPreaprovedAmount).prop('disabled', true);
                
    }
        
 });  
	/////////////////////////////////////////////

	/*
	if(data_finantial.tres == 0){
		
	}else{
		var tres = data_finantial.tres;
		console.log("tres: "+tres);
	}
	*/
	/*
	if(data_finantial.uno !== null && data_finantial.dos !== null){
	    */
	    //console.log("uno: "+data_finantial.uno);
	    //console.log("dos: "+data_finantial.dos);
	
		$.ajax({          
	  	     
			  type: "GET",
			  dataType: "json",
			  url: "/consultClient/"+id+"",
			  success: function(data)
		    {
		     console.log(data);
		     var uno = data.fileFinantial;
		  	   
		     console.log('boton1');
		  	document.getElementById("verte2").src = '/viewPdf/'+uno+'';
		                
		    }
		        
		 }); 
		    
		$.ajax({          
	  	     
			  type: "GET",
			  dataType: "json",
			  url: "/consultClient/"+id+"",
			  success: function(data)
		    {
		     console.log(data);
		     var dos = data.filePersonal;
		  	   
		     console.log('boton2');
		  	$(".wrapper").show();
		  	document.getElementById("verte1").src = '/viewPdf/'+dos+'';
		  	$("#close").on('click', function(){
		  		$(".wrapper").hide();
		  	})
		                
		    }
		        
		 });
	/*
	    $('#documento1_confirm').on('click', function(){
	    	
		    	$.ajax({          
		   	     
		  		  type: "GET",
		  		  dataType: "json",
		  		  url: "/consultClient/"+id+"",
		  		  success: function(data)
		  	    {
		       console.log(data);
		       var uno = data.fileFinantial;
		    	   
		       console.log('boton1');
		    	document.getElementById("verte1").src = '/viewPdf/'+uno+'';
		                  
		      }
		          
		   }); 
	    	
	    })
	    
	    
	    
	    $('#documento2_confirm').on('click', function(){
	    	
	    	$.ajax({          
		   	     
		  		  type: "GET",
		  		  dataType: "json",
		  		  url: "/consultClient/"+id+"",
		  		  success: function(data)
		  	    {
		       console.log(data);
		       var dos = data.filePersonal;
		    	   
		       console.log('boton2');
		    	$(".wrapper").show();
		    	document.getElementById("embed").src = '/viewPdf/'+dos+'';
		    	$("#close").on('click', function(){
		    		$(".wrapper").hide();
		    	})
		                  
		      }
		          
		   }); 
	    })
	    
	}else if(data_finantial.uno === null && data_finantial.dos === null){
		swal("No tiene documentos");
		
		console.log("uno: "+data_finantial.uno);
	    console.log("dos: "+data_finantial.dos);
		
		$('#documento1_confirm').on('click', function(){
	    	swal("No hay Documento");
	    })
	    
	    $('#documento2_confirm').on('click', function(){
	    	swal("No hay Documento");
	    })
	}
	*/
    
    
//////////////////////////////////////////////////////////////////////

    var primernombre = document.querySelector("#primer_nombre_confirm");
    var segundonombre = document.querySelector("#segundo_nombre_confirm");

    var primerapellido = document.querySelector("#primer_apellido_confirm");
    var segundoapellido = document.querySelector("#segundo_apellido_confirm");

    var tipodocumento = document.querySelector("#tipo_identificador_confirm");
    var documentoidentidad = document.querySelector("#documento_identidad_confirm");
    var genero = document.getElementsByName("radio_genero");

    var fecha_nacimiento = document.querySelector("#example-datetime-local-input");
    var paisnacimiento = document.querySelector("#pais_nacimiento_confirm");

    var estado_civil = document.getElementsByName("radio_estado");

    var correo = document.querySelector("#correo_confirm");
    var correo_confirm = document.querySelector("#correo_confirm_confirm");

    var profesion = document.querySelector("#profesion_confirm");
    var ocupacion = document.querySelector("#ocupacion_confirm");
    var actividad_economica = document.querySelector("#actividad_economica_confirm");

    var tipo_laboral = document.querySelector("#relacion_laboral_confirm");

    var sueldo = document.querySelector("#sueldo_confirm");
    var monto = document.querySelector("#monto_preaprobado_confirm");

    /////////////////////////////////////////////////////////////////////

    primernombre.addEventListener('blur', ()=>{
    	soloTexto(primernombre);
    	document.getElementById("primer_nombre_confirm").style.border = "1px solid black";
    });

    segundonombre.addEventListener('blur', ()=>{
    	soloTexto(segundonombre);
    	document.getElementById("segundo_nombre_confirm").style.border = "1px solid black";
    });

    primerapellido.addEventListener('blur', ()=>{
    	soloTexto(primerapellido);
    	document.getElementById("primer_apellido_confirm").style.border = "1px solid black";
    });

    segundoapellido.addEventListener('blur', ()=>{
    	soloTexto(segundoapellido);
    	document.getElementById("segundo_apellido_confirm").style.border = "1px solid black";
    });

    documentoidentidad.addEventListener('blur', ()=>{
    	soloNumeros(documentoidentidad);
    	document.getElementById("documento_identidad_confirm").style.border = "1px solid black";
    });

    var emailRegex = /^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i;
    var email1;
    correo.addEventListener('blur', ()=>{
        var email = document.querySelector("#correo_confirm").value;
        email1 = email;
        if(emailRegex.test(email)){

        }else{
            //alert("Espacio Obligatorio, Correo no valido");
            swal("Espacio Obligatorio, Correo no valido");
            document.getElementById("correo_confirm").value = "";
        }
        
        document.getElementById("correo_confirm").style.border = "1px solid black";
    });

    correo_confirm.addEventListener('blur', ()=>{
        var email_confirm = document.querySelector("#correo_confirm_confirm").value;

        if(emailRegex.test(email_confirm)){
            if(email1 != email_confirm)
            {
                //alert("Correo Diferente, Vuelva a Confirmar");
                swal("Correo Diferente, Vuelva a Confirmar");
                document.getElementById("correo_confirm_confirm").value = "";
            }else{

            }
        }else{
            //alert("Espacio Obligatorio, Correo no valido");
            swal("Espacio Obligatorio, Correo no valido");
            document.getElementById("correo_confirm_confirm").value = "";
        }
        
        document.getElementById("correo_confirm_confirm").style.border = "1px solid black";
    });

    profesion.addEventListener('blur', ()=>{
    	soloTexto(profesion);
    	document.getElementById("profesion_confirm").style.border = "1px solid black";
    });

    ocupacion.addEventListener('blur', ()=>{
    	soloTexto(ocupacion);
    	document.getElementById("ocupacion_confirm").style.border = "1px solid black";
    });

    actividad_economica.addEventListener('blur', ()=>{
    	soloTexto(actividad_economica);
    	document.getElementById("actividad_economica_confirm").style.border = "1px solid black";
    });

    sueldo.addEventListener('blur', ()=>{
    	soloNumeros(sueldo);
    	document.getElementById("sueldo_confirm").style.border = "1px solid black";
    });

    monto.addEventListener('blur', ()=>{
    	soloNumeros(monto);
    	document.getElementById("monto_preaprobado_confirm").style.border = "1px solid black";
    });

//////////////////////////////////////////////////////////////////////   

    $("#aceptar_confirm").on('click', function(){
    	
    	if(primernombre.value.length == 0 || primerapellido.value.length == 0 || segundoapellido.value.length == 0 || documentoidentidad.value.length == 0 || correo.value.length == 0 || correo_confirm.value.length == 0 || profesion.value.length == 0 || ocupacion.value.length == 0 || actividad_economica.value.length == 0 || sueldo.value.length == 0 || monto.value.length == 0){
            //alert("Datos Obligatorios Vacios");
            swal("Datos Obligatorios Vacios");
            
            if(document.getElementById("primer_nombre_confirm").value == 0){
            	document.getElementById("primer_nombre_confirm").style.border = "1px solid Red";
            }
            if(document.getElementById("primer_apellido_confirm").value == 0){
            	document.getElementById("primer_apellido_confirm").style.border = "1px solid Red";
            }
            if(document.getElementById("segundo_apellido_confirm").value == 0){
            	document.getElementById("segundo_apellido_confirm").style.border = "1px solid Red";
            }
            if(document.getElementById("documento_identidad_confirm").value == 0){
            	document.getElementById("documento_identidad_confirm").style.border = "1px solid Red";
            }
            if(document.getElementById("profesion_confirm").value == 0){
            	document.getElementById("profesion_confirm").style.border = "1px solid Red";
            }
            if(document.getElementById("ocupacion_confirm").value == 0){
            	document.getElementById("ocupacion_confirm").style.border = "1px solid Red";
            }
            if(document.getElementById("actividad_economica_confirm").value == 0){
            	document.getElementById("actividad_economica_confirm").style.border = "1px solid Red";
            }
            if(document.getElementById("sueldo_confirm").value == 0){
            	document.getElementById("sueldo_confirm").style.border = "1px solid Red";
            }
            if(document.getElementById("monto_preaprobado_confirm").value == 0){
            	document.getElementById("monto_preaprobado_confirm").style.border = "1px solid Red";
            }
            if(document.getElementById("correo_confirm").value == 0){
            	document.getElementById("correo_confirm").style.border = "1px solid Red";
            }
            if(document.getElementById("correo_confirm_confirm").value == 0){
            	document.getElementById("correo_confirm_confirm").style.border = "1px solid Red";
            }
    	}else{
    		var genero_respuesta;

            var index;
            for(index in genero){
                if(genero[index].checked){
                    var genero_s = genero[index].value;
                    genero_respuesta = genero_s;
                }
            }

            /////////////////

            var estado_civil_respuesta;

            var index1;
            for(index1 in estado_civil){
                if(estado_civil[index1].checked){
                    var estado_s = estado_civil[index1].value;
                    estado_civil_respuesta = estado_s;
                }
            }
        	
        	var data = {
                    "primer_nombre": primernombre.value,
                    "celular": '3145678900',
                    "segundo_nombre": segundonombre.value,
                    "primer_apellido": primerapellido.value,
                    "segundo_apellido": segundoapellido.value,
                    "tipo_documento": tipodocumento.value,
                    "documento_identidad": documentoidentidad.value,
                    "genero": genero_respuesta,
                    'cellhome': '3456789',
                    "fecha_nacimiento": fecha_nacimiento.value,
                    "pais_nacimiento": paisnacimiento.value,
                    "estado_civil": estado_civil_respuesta,
                    "correo": correo.value,
                    "correo_confirm": correo_confirm.value,
                    "profesion": profesion.value,
                    "ocupacion": ocupacion.value,
                    "actividad_economica": actividad_economica.value,
                    "tipo_laboral": tipo_laboral.value,
                    "sueldo": sueldo.value,
                    "monto": monto.value,
                    "id_cliente": tres
                };
        	
        	localStorage.setItem('data2', JSON.stringify(data));
        	
            location.href = "/analisis";
    	}
    	
    })
    
    
    ///////////////////////////////////////////////////////////7

    $("#negada_confirm").on('click', function(){
    	
    	var document_local = localStorage.getItem("document");
    	console.log(document_local);
    	
    	var cuenta_json = {
    			'clientDocumentId': document_local,
    			'accountStatus': 'NEGADA'
    	}
    	
    	$.ajax({
            type: "POST",
            url: '/updateStatusAccountClientWS',
            contentType: "application/json",
            dataType: "json",
            data: JSON.stringify(cuenta_json),
            success: processSuccess,
            error: processError
        });
    	
    	function processSuccess(data, status, req) {
            //alert(req.responseText + " " + status);
    		console.log(data);
    		localStorage.clear();
    		location.href = "/bandeja_riesgos";
        	swal("Cuenta Negada");
        }  
    	
    	function processError(data, status, req) {
            //alert(req.responseText + " " + status);
        	swal("Error al Negar Cuenta");
        }  
    })

    $("#atras_confirm").on('click', function(){
        location.href = "/bandeja_riesgos";
    })

});

////////////////////////////////////////////////////777

function soloTexto(texto){
	var patron = /^[A-Za-z\u00C0-\u017F]*$/;
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
/*
function consult(id){
	$.ajax({          
	     
		  type: "GET",
		  dataType: "json",
		  url: "/consultClient/"+id+"",
		  success: function(data)
	    {
       console.log(data);
       var clientBirthday = data.clientBirthday;
       var Birthday = clientBirthday.split("/");
       var clientCellPhone = data.clientCellPhone;
       var clientCivilStatus = data.clientCivilStatus;
       var clientDocumentId = data.clientDocumentId;
       var clientEconomicActivity = data.clientEconomicActivity;
       var clientEmail = data.clientEmail;
       var clientFirstName = data.clientFirstName;
       var clientGender = data.clientGender;
       var clientHomePhone = data.clientHomePhone;
       var clientLaborRelationship = data.clientLaborRelationship;
       var clientLastName = data.clientLastName;
       var clientOcupation = data.clientOcupation;
       var clientPreaprovedAmount = data.clientPreaprovedAmount;
       var clientProfession = data.clientProfession;
       var clientSalary = data.clientSalary;
       var clientSurname = data.clientSurname;
       var surname = clientSurname.split(" ");
       var clientTypeId = data.clientTypeId;
       
       if(data.fileFinantial === null && data.filePersonal === null){
    	   uno = "0";
    	   dos = "0";
    	   var finantial = {
    	      		 'uno': '0',
    	      		 'dos': '0',
    	      		 'tres': data.idClient
    	       }
       }else{
    	   uno = data.fileFinantial;
    	   dos = data.filePersonal;
    	   var finantial = {
    	      		 'uno': data.fileFinantial,
    	      		 'dos': data.filePersonal,
    	      		 'tres': data.idClient
    	       }
       }
       localStorage.setItem("document", data.clientDocumentId);
       localStorage.setItem("finantial", JSON.stringify(finantial));
       
       /////////////////////////////////////////////////////////////77
       
       $("#primer_nombre_confirm").val(clientFirstName);
       $("#segundo_nombre_confirm").val(clientLastName);
       $("#primer_apellido_confirm").val(surname[0]);
       $("#segundo_apellido_confirm").val(surname[1]);
       $("#tipo_identificador_confirm").val(clientTypeId);
       $("#documento_identidad_confirm").val(clientDocumentId);
       
       var genero = document.getElementsByName("radio_genero");

       var indexx;
       for(indexx in genero){
           if(genero[indexx].value == clientGender){
               genero[indexx].checked = true;
           }
       }
       
       $("#example-datetime-local-input").val(Birthday[2]+"-"+Birthday[1]+"-"+Birthday[0]);
       $("#pais_nacimiento_confirm").val();

       var estado_civil = document.getElementsByName("radio_estado");

           var indexx2;
           for(indexx2 in estado_civil){
               if(estado_civil[indexx2].value == clientCivilStatus){
                   estado_civil[indexx2].checked = true;
               }
           }
       
       $("#correo_confirm").val(clientEmail);
       $("#correo_confirm_confirm").val(clientEmail);
       $("#profesion_confirm").val(clientProfession);
       $("#ocupacion_confirm").val(clientOcupation);
       $("#actividad_economica_confirm").val(clientEconomicActivity);
       $("#relacion_laboral_confirm").val(clientLaborRelationship);
       $("#sueldo_confirm").val(clientSalary);
       $("#monto_preaprobado_confirm").val(clientPreaprovedAmount).prop('disabled', true);
                  
      }
          
   }); 
}
/*
function mostrarPdf1(file1) {
	   if ($(".txtNumero"))
	    window.open("/opt/bitnami/apache-tomcat/webapps/temp/archivos/"+file1+"");
	  }   
	  
function mostrarPdf2(file2) {
		if ($(".txtNumero2"))
		window.open("/opt/bitnami/apache-tomcat/webapps/temp/archivos/"+file2+"");
	}  */