'use strict'

window.addEventListener('load', ()=>{
   
 /*Datos Trabajo*/   

    
    var nombreEmpresa = document.querySelector("#nombreEmpresa");
    var tipoNegocio = document.querySelector("#actividadEmpresa");

    var cargo = document.querySelector("#cargo");
    var telefonoEmpresa = document.querySelector("#telefonoEmpresa");
    
    var sueldoMensual = document.querySelector("#sueldoMensual");
    var provinciaTrabajo = document.querySelector("#provinciaTrabajo");

    var cantonTrabajo = document.querySelector("#cantonTrabajo");
    var distritoTrabajo = document.querySelector("#distritoTrabajo");
    
   // var correo_trabajo = document.querySelector(".correo_trabajo");
    var correo_trabajo_confirm = document.querySelector(".correo_trabajo_confirm");
    
    var antiguedad = document.querySelector("#antiguedad");
    var cargoOtraEmpresa = document.querySelector("#cargoOtraEmpresa");
    
    var ultimoSueldo = document.querySelector("#ultimoSueldo");
 
  /*Campos Trabajo*/  
    
   
    nombreEmpresa.addEventListener('keyup', ()=>{
    	soloTextoNumeros(nombreEmpresa);
        document.getElementById("nombreEmpresa").style.border = "1px solid black";
    }); 
    
    tipoNegocio.addEventListener('keyup', ()=>{
    	soloTexto(tipoNegocio);
    	document.getElementById("tipoNegocio").style.border = "1px solid black";
    });  
    
    /////////////////////////////////////////////////
    
    cargo.addEventListener('keyup', ()=>{
    	soloTexto(cargo);
    	document.getElementById("cargo").style.border = "1px solid black";
    });  
    
    telefonoEmpresa.addEventListener('keyup', ()=>{
    	soloNumeros(telefonoEmpresa);
    	document.getElementById("telefonoEmpresa").style.border = "1px solid black";
    }); 
    
    /////////////////////////////////////////////////
    
    sueldoMensual.addEventListener('keyup', ()=>{
    	 soloNumeros(sueldoMensual);
        document.getElementById("sueldoMensual").style.border = "1px solid black";
    }); 
    
    
    provinciaTrabajo.addEventListener('keyup', ()=>{
    	soloNumeros(provinciaTrabajo);
    	document.getElementById("provinciaTrabajo").style.border = "1px solid black";
    }); 
    
    /////////////////////////////////////////////////
    
    cantonTrabajo.addEventListener('keyup', ()=>{
        soloNumeros(cantonTrabajo);
        document.getElementById("cantonTrabajo").style.border = "1px solid black";
    }); 
    
    distritoTrabajo.addEventListener('keyup', ()=>{
        soloNumeros(distritoTrabajo);
        document.getElementById("distritoTrabajo").style.border = "1px solid black";
    }); 
    
    /////////////////////////////////////////////////
    
    antiguedad.addEventListener('keyup', ()=>{
    	soloTextoNumeros(antiguedad);
        document.getElementById("antiguedad").style.border = "1px solid black";
    }); 
    
    
    
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
    correo_trabajo.addEventListener('blur', ()=>{
        var email = document.querySelector(".correo_trabajo").value;
        email1 = email;
        if(emailRegex.test(email)){
        	
        }else{
            //alert("Espacio Obligatorio, Correo no valido");
        	swal("Espacio Obligatorio, Correo no valido");
            document.getElementById("correo_trabajo").value = "";
        }
        
        document.getElementById("correo_trabajo").style.border = "1px solid black";
    });

    correo_trabajo_confirm.addEventListener('blur', ()=>{
        var email_confirm = document.querySelector(".correo_trabajo_confirm").value;

        if(emailRegex.test(email_confirm)){
            if(email1 != email_confirm)
            {
                //alert("Correo Diferente, Vuelva a Confirmar");
            	swal("Correo Diferente, Vuelva a Confirmar");
                document.getElementById("correo_trabajo_confirm").value = "";
            }else{
            	
            }
        }else{
            //alert("Espacio Obligatorio, Correo no valido");
        	swal("Espacio Obligatorio, Correo no valido");
            document.getElementById("correo_trabajo_confirm").value = "";
        }
        
        document.getElementById("correo_trabajo_confirm").style.border = "1px solid black";
    });
    
    
    /////////////////////////////////////////////////
    
});
    
    
    
  