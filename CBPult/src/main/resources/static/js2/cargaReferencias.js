'use strict'

window.addEventListener('load', ()=>{
   
	  /*Datos Referencias*/   

    var primerNombre = document.querySelector("#primerNombre");
    var segundoNombre = document.querySelector("#segundoNombre");

    var apellidos = document.querySelector("#apellidos");
    var segundo_apellido = document.querySelector("#segundo_apellido");
    
    var tipoDocumento = document.querySelector("#tipoDocumento");
    var numeroDocumento = document.querySelector("#numeroDocumento");

    var genero = document.querySelector("#genero");
    var correo_referencia = document.querySelector("#correo_referencia");
    
    var emailReferencia = document.querySelector("#emailReferencia");
    var telefonoFijo = document.querySelector("#telefonoFijo");
    
    var telefonoCelular = document.querySelector("#telefonoCelular");
    var banco = document.querySelector("#banco");
    
    var ctaAhorro = document.querySelector("#ctaAhorro");
    var ctaCorriente = document.querySelector("#ctaCorriente");
    var TDC = document.querySelector("#TDC");
    
 
/*Campos Referencias*/  
    
    
    primerNombre.addEventListener('keyup', ()=>{
    	soloTexto(primerNombre);
    	document.getElementById("primerNombre").style.border = "1px solid black";
    });  
    
    segundoNombre.addEventListener('keyup', ()=>{
    	soloTexto(segundoNombre);
    	document.getElementById("segundoNombre").style.border = "1px solid black";
    });  
    
    ////////////////////////////////////////////////
    
    apellidos.addEventListener('keyup', ()=>{
    	soloTexto(apellidos);
    	document.getElementById("apellidos").style.border = "1px solid black";
    });  
    
    segundo_apellido.addEventListener('keyup', ()=>{
    	soloTexto(segundo_apellido);
    	document.getElementById("segundo_apellido").style.border = "1px solid black";
    }); 
    
    ////////////////////////////////////////////////
    
    tipoDocumento.addEventListener('keyup', ()=>{
    	soloTexto(tipoDocumento);
        document.getElementById("tipoDocumento").style.border = "1px solid black";
    }); 
    
    
    numeroDocumento.addEventListener('keyup', ()=>{
    	soloNumeros(numeroDocumento);
    	document.getElementById("numeroDocumento").style.border = "1px solid black";
    }); 
    
   ////////////////////////////////////////////////
    
    genero.addEventListener('keyup', ()=>{
        soloTexto(genero);
        document.getElementById("genero").style.border = "1px solid black";
    }); 
    
    telefonoFijo.addEventListener('keyup', ()=>{
    	soloNumeros(telefonoFijo);
    	document.getElementById("telefonoFijo").style.border = "1px solid black";
    }); 
    
  ////////////////////////////////////////////////
    
    telefonoCelular.addEventListener('keyup', ()=>{
    	soloNumeros(telefonoCelular);
        document.getElementById("telefonoCelular").style.border = "1px solid black";
    }); 
    
    
    banco.addEventListener('keyup', ()=>{
    	soloTexto(banco);
    	document.getElementById("banco").style.border = "1px solid black";
    }); 
   
  ////////////////////////////////////////////////
    
    ctaAhorro.addEventListener('keyup', ()=>{
        soloNumeros(ctaAhorro);
        document.getElementById("ctaAhorro").style.border = "1px solid black";
    }); 
    
    ctaCorriente.addEventListener('keyup', ()=>{
        soloNumeros(ctaCorriente);
        document.getElementById("ctaCorriente").style.border = "1px solid black";
    }); 
    
  /////////////////////////////////////////////
    
    TDC.addEventListener('keyup', ()=>{
        soloNumeros(TDC);
        document.getElementById("TDC").style.border = "1px solid black";
    }); 
    
    var emailRegex = /^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i;
    var email1;
    correo_referencia.addEventListener('blur', ()=>{
        var email = document.querySelector("#correo_referencia").value;
        email1 = email;
        if(emailRegex.test(email)){
        	
        }else{
            //alert("Espacio Obligatorio, Correo no valido");
        	swal("Espacio Obligatorio, Correo no valido");
            document.getElementById("correo_referencia").value = "";
        }
        
        document.getElementById("correo_referencia").style.border = "1px solid black";
    });

    emailReferencia.addEventListener('blur', ()=>{
        var email_confirm = document.querySelector("#emailReferencia").value;

        if(emailRegex.test(email_confirm)){
            if(email1 != email_confirm)
            {
                //alert("Correo Diferente, Vuelva a Confirmar");
            	swal("Correo Diferente, Vuelva a Confirmar");
                document.getElementById("emailReferencia").value = "";
            }else{
            	
            }
        }else{
            //alert("Espacio Obligatorio, Correo no valido");
        	swal("Espacio Obligatorio, Correo no valido");
            document.getElementById("emailReferencia").value = "";
        }
        
        document.getElementById("emailReferencia").style.border = "1px solid black";
    });
    
});
    
    
    
  