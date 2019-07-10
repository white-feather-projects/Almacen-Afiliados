'use strict'

window.addEventListener('load', function(){
	
	var nombre_empresa = document.querySelector("#nombre_empresa");
	var tipo_identificacion = document.querySelector("#tipo_identificacion");
	var identificacion = document.querySelector("#identificacion");
	var correo = document.querySelector("#correo");
	var nombre_comercial = document.querySelector("#nombre_comercial");
	var numero_cuenta_asociado = document.querySelector("#numero_cuenta_asociado");
	var actividad_comercial = document.querySelector("#actividad_comercial");
	var horario_comercio = document.querySelector("#horario_comercio");
	var telefono_local = document.querySelector("#telefono_local");
	var telefono_alternativo = document.querySelector("#telefono_alternativo");
	var afiliado = document.querySelector("#afiliado");
	
	////////////////////////////////////////////////////////////////////////////////////
	
	nombre_empresa.addEventListener('blur', ()=>{
		console.log("nombre_empresa", nombre_empresa.value);
		soloTexto(nombre_empresa);
	});
	
	tipo_identificacion.addEventListener('blur', ()=>{
		console.log("tipo_identificacion", tipo_identificacion.value);
		
	});
	
	identificacion.addEventListener('blur', ()=>{
		console.log("identificacion", identificacion.value);
		soloNumeros(identificacion);
	});
	
	var emailRegex = /^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i;
    var email1;
	correo.addEventListener('blur', ()=>{
		console.log("correo", correo.value);
		var email = document.querySelector("#correo").value;
        email1 = email;
        if(emailRegex.test(email)){

        }else{
            //alert("Espacio Obligatorio, Correo no valido");
            swal("Espacio Obligatorio, Correo no valido");
            document.getElementById("correo").value = "";
        }
	});
	
	nombre_comercial.addEventListener('blur', ()=>{
		console.log("nombre_comercial", nombre_comercial.value);
		soloTexto(nombre_comercial);
	});
	
	numero_cuenta_asociado.addEventListener('blur', ()=>{
		console.log("numero_cuenta_asociado", numero_cuenta_asociado.value);
		soloNumeros(numero_cuenta_asociado);
	});
	
	actividad_comercial.addEventListener('blur', ()=>{
		console.log("actividad_comercial", actividad_comercial.value);
		soloTexto(actividad_comercial);
	});
	
	horario_comercio.addEventListener('blur', ()=>{
		console.log("horario_comercio", horario_comercio.value);

	});
	
	telefono_local.addEventListener('blur', ()=>{
		console.log("telefono_local", telefono_local.value);
		soloNumeros(telefono_local);
	});
	
	telefono_alternativo.addEventListener('blur', ()=>{
		console.log("telefono_alternativo", telefono_alternativo.value);
		soloNumeros(telefono_alternativo);
	});
	
	afiliado.addEventListener('blur', ()=>{
		console.log("afiliado", afiliado.value);
	});
	
	/////////////////////////////////////////////////////////////////
	
	$("#aceptar").on('click', function(){
		location.href="/representante_legal";
	})

});

////////////////////////////////////////////////////////////////////////////////////////

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