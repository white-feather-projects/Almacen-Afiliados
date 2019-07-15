'use strict'

window.addEventListener('load', function(){
	
	var tipo_identificacion_tab2 = document.querySelector("#tipo_identificacion_tab2");
	var nombre_empresa_tab2 = document.querySelector("#nombre_empresa_tab2");
	var correo_tab2 = document.querySelector("#correo_tab2");
	var numero_iban_tab2 = document.querySelector("#numero_iban_tab2");
	var afiliado_tab2 = document.querySelector("#afiliado_tab2");
	var telefono_alternativo_tab2 = document.querySelector("#telefono_alternativo_tab2");
	var identificacion_tab2 = document.querySelector("#identificacion_tab2");
	var nombre_comercial_tab2 = document.querySelector("#nombre_comercial_tab2");
	var telefono_local_tab2 = document.querySelector("#telefono_local_tab2");
	var banco_tab2 = document.querySelector("#banco_tab2");
	var horario_comercio_tab2 = document.querySelector("#horario_comercio_tab2");
	
	/////////////////////////////////////////////////////////////////////////////////////
	
	tipo_identificacion_tab2.addEventListener('blur', ()=>{
		console.log("tipo identificacion", tipo_identificacion_tab2.value);
		
	});
	
	nombre_empresa_tab2.addEventListener('blur', ()=>{
		console.log("nombre empresa", nombre_empresa_tab2.value);
		soloTexto(nombre_empresa_tab2);
	});
	
	var emailRegex = /^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i;
    var email1;
	correo_tab2.addEventListener('blur', ()=>{
		console.log("correo", correo_tab2.value);
		var email = document.querySelector("#correo_tab2").value;
        email1 = email;
        if(emailRegex.test(email)){

        }else{
            //alert("Espacio Obligatorio, Correo no valido");
            swal("Espacio Obligatorio, Correo no valido");
            document.getElementById("correo_tab2").value = "";
        }
	});
	
	numero_iban_tab2.addEventListener('blur', ()=>{
		console.log("numero iban", numero_iban_tab2.value)
		soloNumeros(numero_iban_tab2);
	});
	
	afiliado_tab2.addEventListener('blur', ()=>{
		console.log("afiliado", afiliado_tab2.value);
		
	});
	
	telefono_alternativo_tab2.addEventListener('blur', ()=>{
		console.log("telefono alternativo", telefono_alternativo_tab2.value);
		soloNumeros(telefono_alternativo_tab2);
	});
	
	identificacion_tab2.addEventListener('blur', ()=>{
		console.log("identificacion", identificacion_tab2.value);
		soloNumeros(identificacion_tab2);
	});
	
	nombre_comercial_tab2.addEventListener('blur', ()=>{
		console.log("nombre comercial", nombre_comercial_tab2.value);
		soloTexto(nombre_comercial_tab2);
	});
	
	telefono_local_tab2.addEventListener('blur', ()=>{
		console.log("telefono local", telefono_local_tab2.value);
		soloNumeros(telefono_local_tab2);
	});
	
	banco_tab2.addEventListener('blur', ()=>{
		console.log("banco", banco_tab2.value);
		
	});
	
	horario_comercio_tab2.addEventListener('blur', ()=>{
		console.log("horario comercio", horario_comercio_tab2.value);
		
	});

});

////////////////////////////////////////////////////////////////////////////////////////

function soloTexto(texto){
	var patron = /^[A-Za-z \u00C0-\u017F]*$/;
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