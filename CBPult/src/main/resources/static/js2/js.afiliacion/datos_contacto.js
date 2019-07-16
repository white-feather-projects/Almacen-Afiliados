'use strict'

window.addEventListener('load', function(){
	
	var cargo = document.querySelector("#cargo_tab6");
	var primer_nombre = document.querySelector("#primer_nombre_tab6");
	var segundo_nombre = document.querySelector("#segundo_nombre_tab6");
	var primer_apellido = document.querySelector("#primer_apellido_tab6");
	var segundo_apellido = document.querySelector("#segundo_apellido_tab6");
	var tipo_identificacion = document.querySelector("#tipo_identificacion_tab6");
	var identificacion = document.querySelector("#identificacion_tab6");
	var telefono = document.querySelector("#telefono_tab6");
	var correo_electronico_tab6 = document.querySelector("#correo_electronico_tab6");
	
	///////////////////////////////////////////////////////////////////////////
	
	cargo.addEventListener('blur', ()=>{
		console.log("cargo", cargo.value);
		soloTexto(cargo);
		document.getElementById("cargo_tab6").style.border = "1px solid black";
	});
	
	primer_nombre.addEventListener('blur', ()=>{
		console.log("primer_nombre", primer_nombre.value);
		soloTexto(primer_nombre);
		document.getElementById("primer_nombre_tab6").style.border = "1px solid black";
	});
	
	segundo_nombre.addEventListener('blur', ()=>{
		console.log("segundo_nombre", segundo_nombre.value);
		soloTexto(segundo_nombre);
		document.getElementById("segundo_nombre_tab6").style.border = "1px solid black";
	});
	
	primer_apellido.addEventListener('blur', ()=>{
		console.log("primer_apellido", primer_apellido.value);
		soloTexto(primer_apellido);
		document.getElementById("primer_apellido_tab6").style.border = "1px solid black";
	});
	
	segundo_apellido.addEventListener('blur', ()=>{
		console.log("segundo_apellido", segundo_apellido.value);
		soloTexto(segundo_apellido);
		document.getElementById("segundo_apellido_tab6").style.border = "1px solid black";
	});
	
	tipo_identificacion.addEventListener('blur', ()=>{
		console.log("tipo_identificacion", tipo_identificacion.value);
		document.getElementById("tipo_identificacion_tab6").style.border = "1px solid black";
	});
	
	identificacion.addEventListener('blur', ()=>{
		console.log("identificacion", identificacion.value);
		soloNumeros(identificacion);
		document.getElementById("identificacion_tab6").style.border = "1px solid black";
	});
	
	telefono.addEventListener('blur', ()=>{
		console.log("telefono", telefono.value);
		soloNumeros(telefono);
		document.getElementById("telefono_tab6").style.border = "1px solid black";
	});
	
	var emailRegex = /^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i;
    var email1;
	correo_electronico_tab6.addEventListener('blur', ()=>{
		console.log("correo electronico", correo_electronico_tab6.value);
		var email = document.querySelector("#correo_electronico_tab6").value;
        email1 = email;
        if(emailRegex.test(email)){

        }else{
            //alert("Espacio Obligatorio, Correo no valido");
            swal("Espacio Obligatorio, Correo no valido");
            document.getElementById("correo_electronico_tab6").value = "";
        }
        document.getElementById("correo_electronico_tab6").style.border = "1px solid black";
	});
	
});

///////////////////////////////////////////////////////

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