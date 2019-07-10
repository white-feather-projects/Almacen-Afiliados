'use strict'

window.addEventListener('load', ()=>{

var form = document.getElementById("example-datetime-local-input");

///////////////////////Verificar que la cedula del cliente no sea la misma de referencias

//document.getElementById("correo_confirm").value = "jose@gmail.com";
//$("#correo_confirm").val('jose@gmail.com');

$("#numeroDocumento").blur(function(){
	var var1 = document.getElementById('documento_identidad');
	var cedula = var1.value;
	
	var var2 = document.getElementById('numeroDocumento');
	var cedula2 = var2.value;
    //alert(cedula);
    //alert(cedula2);

 if(cedula === cedula2){
	 document.getElementById("numeroDocumento").value = "";correo_confirm
	 swal("La cedula del cliente no puede estar como referencia");
	}
 
 
 var ident=$("#numeroDocumento").val();
	  if(ident.length != 0){
		 $.ajax({
			type : "GET",
			url : '/validateIdent/'+ident,
			dataType : "json",
			success : function(data) {
				console.log("data",data);
				
				var cliente = data.client;
				//alert(cliente);
				console.log("cliente",cliente);
				if(cliente === null){
					  document.getElementById('primerNombre').value = " ";
			      document.getElementById('segundoNombre').value = " ";
			      
			  	document.getElementById('apellidos').value = " "; 
			      document.getElementById('segundo_apellido').value = " ";
			      


					
					document.getElementById('correo_referencia').value = " ";
					document.getElementById('emailReferencia').value = " ";
					document.getElementById('telefonoFijo').value = " ";
					document.getElementById('telefonoCelular').value = " ";
					
				    $("#primerNombre").prop('disabled', false);
				    $("#segundoNombre").prop('disabled', false);
				    $("#apellidos").prop('disabled', false);
				    $("#segundo_apellido").prop('disabled', false);
					  
					  
					  
					  
			}
				
				
				var nombrePrimer = cliente.clientFirstName;
				
				//alert(nombrePrimer);
				console.log(nombrePrimer);
				var nombreSegundo = cliente.clientLastName;
				var apellido = cliente.clientSurname.split('-');
				var genero = cliente.clientGender;
				var email = cliente.clientEmail;
				var celular = cliente.clientCellPhone;
				var telefonoCasa = cliente.clientHomePhone;
				
				
				
				
				document.getElementById('primerNombre').value = nombrePrimer;
	            document.getElementById('segundoNombre').value = nombreSegundo;
	            
	        	document.getElementById('apellidos').value = apellido[0];
	            document.getElementById('segundo_apellido').value = apellido[1];
	            
	            $("input[name=radio_genero][value='"+genero+"']").prop("checked",true);
				
				document.getElementById('correo_referencia').value = email;
				document.getElementById('emailReferencia').value = email;
				document.getElementById('telefonoFijo').value = telefonoCasa;
				document.getElementById('telefonoCelular').value = celular;
				
				
				
				
				var bloqueo=['primerNombre', 'segundoNombre','apellidos','segundo_apellido'];
				if(data.existeClient==1){
				//bloqueo de campo para  no registrar doble
					swal('La referencia, ya se encuentra registrada!!');
					
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
	    
		  
	  }else{
		  
		  document.getElementById('primerNombre').value = " ";
          document.getElementById('segundoNombre').value = " ";
          
      	document.getElementById('apellidos').value = " "; 
          document.getElementById('segundo_apellido').value = " ";
          
          $("input[name=radio_genero][value='"+genero+"']").prop("checked",true);
			
			document.getElementById('correo_referencia').value = " ";
			document.getElementById('emailReferencia').value = " ";
			document.getElementById('telefonoFijo').value = " ";
			document.getElementById('telefonoCelular').value = " ";
			
		    $("#primerNombre").prop('disabled', false);
		    $("#segundoNombre").prop('disabled', false);
		    $("#apellidos").prop('disabled', false);
		    $("#segundo_apellido").prop('disabled', false);
			
		  
		  
	  }
	
	});

	

$("#verificar").click(function(){
	var client = document.getElementById('client'); 
	  var info = client.value;
	  //alert($("#validateClient").text());
var boton=	$("#validateClient").text();
console.log(boton);


if(boton === "Crear Cliente"){
	
	  $("#detener").val('listo');
	
}

if(info === ""){
	swal("Debe llenar campos vacios y crear cliente");

	
}
	
});
    //////////////////////////////////////////////

    $("#cancelar").click(function(){
        localStorage.clear();
        location.href = "/bandeja_ventas";
    });

});



////////////////////////////////////////////////////////7

function soloTexto(texto){
	var patron = /^[a-z A-ZZñÑáéíóúÁÉÍÓÚ ]*$/;
	if(texto.value.search(patron)){
		swal("Solo Texto");
		texto.value = "";
	}else{
		return true;
	}
}

function soloTextoNumeros(texto){
	var patron = /^[0-9a-zA-ZñÑáéíóúÁÉÍÓÚ ]+$/;
	if(texto.value.search(patron)){
		swal("Solo Alfanumerico");
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


function addCedulaReferencia()

{
  var combo2 = document.getElementById('tipoDocumento');
  var opcion2 = combo2.value;
  
 

  
  if(document.getElementById('tipoDocumento').value == 'Cedula'){
        

document.getElementById("numeroDocumento").maxLength = 9;
var variable2 = document.getElementById('numeroDocumento');

//alert(variable.value.length);     
//console.log("variable"+variable.value.length);




if(variable2.value.length != 10){
	
	
    document.getElementById("numeroDocumento").value = "";
}
    
    }else{
    
         document.getElementById("numeroDocumento").maxLength = 11;
         
         var variable2 = document.getElementById('numeroDocumento');

        // alert(variable.value.length);     
         //console.log("variable"+variable.value.length);

         if(variable2.value.length === 9){
         	
         	
             document.getElementById("numeroDocumento").value = "";
         }
 
    	
    }
  

}

function addViviendaList()

{
  var combo = document.getElementById('tenenciaVivienda');
  var opcion = combo.value;
  
 

  
  if(document.getElementById('tenenciaVivienda').value == 'ALQUILADA' || document.getElementById('tenenciaVivienda').value == 'PROPIA'){
	  document.getElementById("cuotaMensual").value = ""; 
	  $('#cuotaMensual').prop("disabled",false);

      
    
    }else{
    	
    	document.getElementById("cuotaMensual").value = "";
    	 $('#cuotaMensual').prop("disabled",true);
 
    	
    }
  

}


function addMajorList()

{
  var combo = document.getElementById('tipo_identificador');
  var opcion = combo.value;
  
 

  
  if(document.getElementById('tipo_identificador').value == 'Cedula'){
        

document.getElementById("documento_identidad").maxLength = 9;
var variable = document.getElementById('documento_identidad');

//alert(variable.value.length);     
//console.log("variable"+variable.value.length);




if(variable.value.length != 10){
	
	
    document.getElementById("documento_identidad").value = "";
}
    
    }else{
    
         document.getElementById("documento_identidad").maxLength = 11;
         
         var variable = document.getElementById('documento_identidad');

        // alert(variable.value.length);     
         //console.log("variable"+variable.value.length);

         if(variable.value.length === 9){
         	
         	
             document.getElementById("documento_identidad").value = "";
         }
 
    	
    }
  

}






