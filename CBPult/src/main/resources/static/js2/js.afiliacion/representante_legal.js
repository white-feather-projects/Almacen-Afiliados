'use strict'

window.addEventListener('load', function(){
	
	var primer_nombre = document.querySelector("#primer_nombre_tab4");
	var segundo_nombre = document.querySelector("#segundo_nombre_tab4");
	var primer_apellido = document.querySelector("#primer_apellido_tab4");
	var segundo_apellido = document.querySelector("#segundo_apellido_tab4");
	var tipo_identificacion = document.querySelector("#tipo_identificacion_tab4");
	var identificacion = document.querySelector("#identificacion_tab4");
	var telefono_local = document.querySelector("#telefono_local_tab4");
	var telefono_celular = document.querySelector("#telefono_celular_tab4");
	var correo = document.querySelector("#correo_tab4");
	
	/////////////////////////////////////////////////////////////////////////
	
	primer_nombre.addEventListener('blur', ()=>{
		console.log("primer_nombre", primer_nombre.value);
		soloTexto(primer_nombre);
		document.getElementById("primer_nombre_tab4").style.border = "1px solid black";
	});
	
	segundo_nombre.addEventListener('blur', ()=>{
		console.log("segundo_nombre", segundo_nombre.value);
		soloTexto(segundo_nombre);
		document.getElementById("segundo_nombre_tab4").style.border = "1px solid black";
	});
	
	primer_apellido.addEventListener('blur', ()=>{
		console.log("primer_apellido", primer_apellido.value);
		soloTexto(primer_apellido);
		document.getElementById("primer_apellido_tab4").style.border = "1px solid black";
	});
	
	segundo_apellido.addEventListener('blur', ()=>{
		console.log("segundo_apellido", segundo_apellido.value);
		soloTexto(segundo_apellido);
		document.getElementById("segundo_apellido_tab4").style.border = "1px solid black";
	});
	
	tipo_identificacion.addEventListener('blur', ()=>{
		console.log("tipo_identificacion", tipo_identificacion.value);
		document.getElementById("tipo_identificacion_tab4").style.border = "1px solid black";
		
		if(tipo_identificacion.value === "Cedula de Residente"){
			document.getElementById("identificacion_tab4").setAttribute("maxlength", "9");
		}else if(tipo_identificacion.value === "DIMEX"){
			document.getElementById("identificacion_tab4").setAttribute("maxlength", "11");
		}else if(tipo_identificacion.value === "Cedula de Persona Jurídica"){
			document.getElementById("identificacion_tab4").setAttribute("maxlength", "10");
		}
	});
	
	identificacion.addEventListener('blur', ()=>{
		console.log("identificacion", identificacion.value);
		soloNumeros(identificacion);
		document.getElementById("identificacion_tab4").style.border = "1px solid black";
	});
	
	telefono_local.addEventListener('blur', ()=>{
		console.log("telefono_local", telefono_local.value);
		soloNumeros(telefono_local);
		document.getElementById("telefono_local_tab4").style.border = "1px solid black";
	});
	
	telefono_celular.addEventListener('blur', ()=>{
		console.log("telefono_celular", telefono_celular.value);
		soloNumeros(telefono_celular);
		document.getElementById("telefono_celular_tab4").style.border = "1px solid black";
	});
	
	var emailRegex = /^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i;
    var email1;
	correo.addEventListener('blur', ()=>{
		console.log("correo", correo.value);
		var email = document.querySelector("#correo_tab4").value;
        email1 = email;
        if(emailRegex.test(email)){

        }else{
            //alert("Espacio Obligatorio, Correo no valido");
            swal("Espacio Obligatorio, Correo no valido");
            document.getElementById("correo_tab4").value = "";
        }
        document.getElementById("correo_tab4").style.border = "1px solid black";
	});

});

////////////////////////////////////////////////////

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