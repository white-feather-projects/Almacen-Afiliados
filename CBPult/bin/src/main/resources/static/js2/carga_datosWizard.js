'use strict'

window.addEventListener('load', ()=>{



   



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

    profesion.addEventListener('blur', ()=>{
    	soloTexto(profesion);
    	document.getElementById("profesion").style.border = "1px solid black";
    });

    ocupacion.addEventListener('blur', ()=>{
    	soloTexto(ocupacion);
    	document.getElementById("ocupacion").style.border = "1px solid black";
    });

    actividad_economica.addEventListener('blur', ()=>{
    	soloTexto(actividad_economica);
    	document.getElementById("actividad_economica").style.border = "1px solid black";
    });

    sueldo.addEventListener('blur', ()=>{
    	soloNumeros(sueldo);
    	document.getElementById("sueldo").style.border = "1px solid black";
    });

    monto.addEventListener('blur', ()=>{
    	soloNumeros(monto);
    	document.getElementById("monto_preaprobado").style.border = "1px solid black";
    });



////////////////////////////////////////////////////////7

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
