'use strict'

window.addEventListener('load', ()=>{

//////////////////////////////////////////////////////////////////////

    var identificacion = document.querySelector("#identificacion");
    var nombre_empresa = document.querySelector("#nombre_empresa");
    var tipo_identificacion = document.querySelector("#tipo_identificacion");
    var identificacion2 = document.querySelector("#identificacion2");
    var correo = document.querySelector("#correo_electronico");
    var numero_contacto = document.querySelector("#numero_contacto");
    var tipo_geografia = document.querySelector("#tipo_geografia");
    
    identificacion.addEventListener('blur', ()=>{
    	console.log("identificacion", identificacion.value);
    	soloNumeros(identificacion);
    });
    
    nombre_empresa.addEventListener('blur', ()=>{
    	console.log("nombre_empresa", nombre_empresa.value);
    	soloTexto(nombre_empresa);
    });
    
    tipo_identificacion.addEventListener('blur', ()=>{
    	console.log("tipo_identificacion", tipo_identificacion.value);
    });
    
    identificacion2.addEventListener('blur', ()=>{
    	console.log("identificacion2", identificacion2.value);
    	soloNumeros(identificacion2);
    });
    
    var emailRegex = /^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i;
    var email1;
    correo.addEventListener('blur', ()=>{
    	console.log("Correo", correo.value);
    	var email = document.querySelector("#correo_electronico").value;
        email1 = email;
        if(emailRegex.test(email)){

        }else{
            //alert("Espacio Obligatorio, Correo no valido");
            swal("Espacio Obligatorio, Correo no valido");
            document.getElementById("correo_electronico").value = "";
        }
    });
    
    numero_contacto.addEventListener('blur', ()=>{
    	console.log("numero_contacto", numero_contacto.value);
    	soloNumeros(numero_contacto);
    });
    
    tipo_geografia.addEventListener('blur', ()=>{
    	console.log("tipo_geografia", tipo_geografia.value);
    });
    
});

/////////////////////////////////////////////////////////

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