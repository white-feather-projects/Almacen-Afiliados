'use strict'

window.addEventListener('load', function(){
	
	document.getElementById("si").checked = true;
	
	$(".wrapper").hide();
	
	document.getElementById("documento1_analisis").disabled = true;
	
	var data_json = JSON.parse(localStorage.getItem("data2"));
	var data_fint = JSON.parse(localStorage.getItem("finantial"));
	var id = data_json.documento_identidad;
    var limit_mount = data_json.monto;
    
    console.log("id: "+data_fint.tres);
    
    //////////////////////////////////////////////////////
    
    $("#si").on("click", function(){
    	console.log("si");
    	
    	$("#div_subida").show();
    });
    
    $("#no").on("click", function(){
    	console.log("no");
    	
    	$("#div_subida").hide();
    });
    
    //////////////////////////////////////////////////////
    
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
	  		 	'tres': data.idClient,
	  		 	'cuatro': data.fileBurot
		       };
		   
	   localStorage.setItem("document", data.clientDocumentId);
	   localStorage.setItem("finantial", JSON.stringify(finantial));
	   
	   /////////////////////////////////////////////////////////////
	              
	  }
	      
	});  
    
    console.log("filefinantial:"+data_fint.uno);
    
    /////////////////////////////////////////////////////
	
	document.querySelector("#limit").value = limit_mount;
	
	var limit = document.querySelector("#limit");
	
	limit.addEventListener('blur', ()=>{
    	soloNumeros(limit);
    	document.getElementById("limit").style.border = "1px solid black";
    });
	
	//////////////////////////////////////////////////
	
	var cont1 = 0;
	
	//////////////////////////////////////////////////////////
	
	var file1;
	
	$("#fileinput").change(function(){
			file1 = document.getElementById('fileinput').files[0];
			
	    	document.getElementById("documento1_analisis").disabled = false;
	    	
			console.log(this.files.length);
			console.log("getFile: "+file1);
			
			if(file1.type != 'application/pdf'){
				document.getElementById('fileinput').value = "";
				swal('Solo PDF');
			}
    });
	
	//////////////////////////////////////////////
	
	
	$("#documento1_analisis").on('click', function(){
		
		if(cont1 == 0){
			
			var formData = new FormData($('#miform')[0]);
        	formData.append('financiero', data_fint.uno);
			formData.append('personal', data_fint.dos);
			formData.append('buro', file1);
        	formData.append('documento', data_json.documento_identidad);
        	console.log(formData);
        	
	          $.ajax( {
	            url: '/uploadDocumentsRiesgos',
	            type: 'POST',
	            data: formData,
	            processData: false,
	            contentType: false,
	            success: proccessSuccess,
	            error: proccessError
	          });
	          
	          function proccessSuccess(){
	        	  swal("Subida Exitosa");
	        	  
	        	  cont1 = cont1 + 1;
	        	  
	        	  $.ajax({          
	     		     
	    			  type: "GET",
	    			  dataType: "json",
	    			  url: "/consultClient/"+id+"",
	    			  success: function(data)
	    		    {
	    		   console.log(data);
	    		   var fileburot = data.fileBurot;
	    			
	    	    	console.log('boton1');
	    	    	$(".wrapper").show();
	    	    	document.getElementById("embed").src = '/viewPdf/'+fileburot+'';
	    	    	$("#close").on('click', function(){
	    	    		$(".wrapper").hide();
	    	    	})
	    		              
	    		  }
	    	      
	    		});
	          }
	          
	          function proccessError(){
	        	  swal("Error al contactar el Servicio");
	          }
		}else if(cont1 == 1){
			$.ajax({          
    		     
  			  type: "GET",
  			  dataType: "json",
  			  url: "/consultClient/"+id+"",
  			  success: function(data)
  		    {
  		   console.log(data);
  		   var fileburot = data.fileBurot;
  			
  	    	console.log('boton1');
  	    	$(".wrapper").show();
  	    	document.getElementById("embed").src = '/viewPdf/'+fileburot+'';
  	    	$("#close").on('click', function(){
  	    		$(".wrapper").hide();
  	    	})
  		              
  		  }
  	      
  		});
		}
            	
    	          
    });
	////////////////////////////////////////////////

    $("#atras_analisis").on('click', function(){
    	
    	var id = data_json.documento_identidad;
    	
        location.href = "/confirmacion2/"+id+"";
    });
    
    /////////////////////////////////////////////////

    $("#negada_analisis").on('click', function(){
    	
    	var cuenta_json = {
    			'clientDocumentId': data_json.documento_identidad,
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
    
    ////////////////////////////////////////////////////

    $("#aprobada_analisis").on('click', function(){
    	
    	if(document.getElementById("limit").value == 0){
        	document.getElementById("limit").style.border = "1px solid Red";
        	swal("Campo Obligatorio");
        }else{
        	var limitesi = document.querySelector("#limit").value;
        	
        	var birth = data_json.fecha_nacimiento.split("-");
        	console.log(birth[2]+"/"+birth[1]+"/"+birth[0]);
        	
        	var updateClientData = {
            		"clientBirthday": birth[2]+"/"+birth[1]+"/"+birth[0],
            	    "clientCellPhone": data_json.celular,
            	    "clientCivilStatus": data_json.estado_civil,
            	    "clientDocumentId": data_json.documento_identidad,
            	    "clientEconomicActivity": data_json.actividad_economica,
            	    "clientEmail": data_json.correo,
            	    "clientFirstName": data_json.primer_nombre,
            	    "clientGender": data_json.genero,
            	    "clientHomePhone": data_json.cellhome,
            	    "clientLaborRelationship": data_json.tipo_laboral,
            	    "clientLastName": data_json.segundo_nombre,
            	    "clientOcupation": data_json.ocupacion,
            	    "clientPreaprovedAmount": limitesi,
            	    "clientProfession": data_json.profesion,
            	    "clientSalary": data_json.sueldo,
            	    "clientSurname": data_json.primer_apellido+` `+data_json.segundo_apellido,
            	    "clientTypeId": data_json.tipo_documento,
            	    "idClient": data_fint.tres
            };
            
                $.ajax({
                    type: "POST",
                    url: '/updateClient',
                    contentType: "application/json",
                    dataType: "json",
                    data: JSON.stringify(updateClientData),
                    success: processSuccess,
                    error: processError
                });

                function processSuccess(data, status, req) {
                	//alert("Exitoso");
                	swal({
                	    title: 'Actualización Exitosa',
                	    text: 'Redirigiendo...',
                	    icon: 'Exitoso',
                	    timer: 1000,
                	    buttons: false,
                	},
                	function() {
                	    location.href = "/bandeja_riesgos";
                	})
                }

                function processError(data, status, req) {
                    //alert(req.responseText + " " + status);
                	swal("Error al actualizar", status);

                }
        	
        	//////////////////////////////////////////////////////
        }
    	
    	
    })

})

function soloNumeros(numero){
	var patron = /^([0-9])*$/;
	if(numero.value.search(patron)){
		swal("Solo Numeros");
		numero.value = "";
	}else{
		return true;
	}
}