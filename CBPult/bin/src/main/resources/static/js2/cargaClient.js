'use strict'

window.addEventListener('load', ()=>{
   
 /*Datos Cliente*/   

    
    var primer_nombre = document.querySelector("#primer_nombre");
    var segundo_nombre = document.querySelector("#segundo_nombre");

    var primer_apellido = document.querySelector("#primer_apellido");
    var segundo_apellido = document.querySelector("#segundo_apellido");
    
    var tipo_identificador = document.querySelector("#tipo_identificador");
    var documento_identidad = document.querySelector("#documento_identidad");

    var profesion = document.querySelector("#profesion");
    var celular = document.querySelector("#celular");
    
    var correo = document.querySelector("#correo");
    var email = document.querySelector("#email");
    
    var tell_home = document.querySelector("#tell_home");
    var cargoOtraEmpresa = document.querySelector("#cargoOtraEmpresa");
    
    var ultimoSueldo = document.querySelector("#ultimoSueldo");
 
  /*Campos Cliente*/  
    
    
    primer_nombre.addEventListener('keyup', ()=>{
    	soloTexto(primer_nombre);
        document.getElementById("primer_nombre").style.border = "1px solid black";
    }); 
    
    segundo_nombre.addEventListener('keyup', ()=>{
    	soloTexto(segundo_nombre);
    	document.getElementById("segundo_nombre").style.border = "1px solid black";
    });  
    
    /////////////////////////////////////////////////
    
    primer_apellido.addEventListener('keyup', ()=>{
    	soloTexto(primer_apellido);
    	document.getElementById("primer_apellido").style.border = "1px solid black";
    });  
    
    segundo_apellido.addEventListener('keyup', ()=>{
    	soloTexto(segundo_apellido);
    	document.getElementById("segundo_apellido").style.border = "1px solid black";
    }); 
    
    /////////////////////////////////////////////////
    
    documento_identidad.addEventListener('keyup', ()=>{
   	 soloNumeros(documento_identidad);
   	 
   	 var cedula = document.querySelector("#tipo_identificador").value;

     if(cedula === "Cedula"){
    	 
    	var va= document.getElementById("documento_identidad").maxLength = 9;
    	
     }else{
    	 var longitud = documento = document.getElementById("documento_identidad").maxLength = 11;
     }
   
    
   }); 
    

    documento_identidad.addEventListener('keyup', ()=>{
    	 soloNumeros(documento_identidad);
    	 document.getElementById("documento_identidad").style.border = "1px solid black";
       
    }); 
    
    
    profesion.addEventListener('keyup', ()=>{
    	soloTexto(profesion);
    	document.getElementById("profesion").style.border = "1px solid black";
    }); 
    
    /////////////////////////////////////////////////
    
    celular.addEventListener('keyup', ()=>{
        soloNumeros(celular);
        document.getElementById("celular").style.border = "1px solid black";
    }); 
    
    tell_home.addEventListener('keyup', ()=>{
        soloNumeros(tell_home);
        document.getElementById("tell_home").style.border = "1px solid black";
    }); 
    
    /////////////////////////////////////////////////
 /*   
    antiguedad.addEventListener('keyup', ()=>{
        soloTexto(antiguedad);
        document.getElementById("antiguedad").style.border = "1px solid black";
    }); 
    */
    cargoOtraEmpresa.addEventListener('keyup', ()=>{
        soloTexto(cargoOtraEmpresa);
        document.getElementById("cargoOtraEmpresa").style.border = "1px solid black";
    }); 
    
    /////////////////////////////////////////////////
    
    ultimoSueldo.addEventListener('keyup', ()=>{
        soloNumeros(ultimoSueldo);
        document.getElementById("ultimoSueldo").style.border = "1px solid black";
    }); 
    
    
    var emailRegex = /^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i;
    var email1;
    correo.addEventListener('blur', ()=>{
        var email = document.querySelector("#correo").value;
        email1 = email;
        if(emailRegex.test(email)){
        	
        }else{
            //alert("Espacio Obligatorio, Correo no valido");
        	swal("Espacio Obligatorio, Correo no valido");
            document.getElementById("correo").value = "";
        }
        
        document.getElementById("correo").style.border = "1px solid black";
    });

    correo_confirm.addEventListener('blur', ()=>{
        var email_confirm = document.querySelector("#correo_confirm").value;

        if(emailRegex.test(email_confirm)){
            if(email1 != email_confirm)
            {
                //alert("Correo Diferente, Vuelva a Confirmar");
            	swal("Correo Diferente, Vuelva a Confirmar");
                document.getElementById("correo_confirm").value = "";
            }else{
            	
            }
        }else{
            //alert("Espacio Obligatorio, Correo no valido");
        	swal("Espacio Obligatorio, Correo no valido");
            document.getElementById("correo_confirm").value = "";
        }
        
        document.getElementById("correo_confirm").style.border = "1px solid black";
    });
    
    /////////////////////////////////////////////////
    
});
    
    
    
  