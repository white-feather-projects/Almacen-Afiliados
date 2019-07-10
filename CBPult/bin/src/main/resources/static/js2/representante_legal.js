'use strict'

window.addEventListener('load', function(){
	
	var primer_nombre = document.querySelector("#primer_nombre");
	var segundo_nombre = document.querySelector("#segundo_nombre");
	var primer_apellido = document.querySelector("#primer_apellido");
	var segundo_apellido = document.querySelector("#segundo_apellido");
	var tipo_identificacion = document.querySelector("#tipo_identificacion");
	var identificacion = document.querySelector("#identificacion");
	var telefono_local = document.querySelector("#telefono_local");
	var telefono_celular = document.querySelector("#telefono_celular");
	var correo = document.querySelector("#correo");
	
	/////////////////////////////////////////////////////////////////////////
	
	primer_nombre.addEventListener('blur', ()=>{
		console.log("primer_nombre", primer_nombre.value);
		soloTexto(primer_nombre);
	});
	
	segundo_nombre.addEventListener('blur', ()=>{
		console.log("segundo_nombre", segundo_nombre.value);
		soloTexto(segundo_nombre);
	});
	
	primer_apellido.addEventListener('blur', ()=>{
		console.log("primer_apellido", primer_apellido.value);
		soloTexto(primer_apellido);
	});
	
	segundo_apellido.addEventListener('blur', ()=>{
		console.log("segundo_apellido", segundo_apellido.value);
		soloTexto(segundo_apellido);
	});
	
	tipo_identificacion.addEventListener('blur', ()=>{
		console.log("tipo_identificacion", tipo_identificacion.value);
		
	});
	
	identificacion.addEventListener('blur', ()=>{
		console.log("identificacion", identificacion.value);
		soloNumeros(identificacion);
	});
	
	telefono_local.addEventListener('blur', ()=>{
		console.log("telefono_local", telefono_local.value);
		soloNumeros(telefono_local);
	});
	
	telefono_celular.addEventListener('blur', ()=>{
		console.log("telefono_celular", telefono_celular.value);
		soloNumeros(telefono_celular);
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
	
	//////////////////////////////////////////////////////////////////
	
	$("#aceptar").on('click', function(){
		location.href="/direccion_establecimiento";
	})

});

////////////////////////////////////////////////////

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