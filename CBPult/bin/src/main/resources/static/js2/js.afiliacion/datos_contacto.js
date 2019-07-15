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
	
	///////////////////////////////////////////////////////////////////////////
	
	cargo.addEventListener('blur', ()=>{
		console.log("cargo", cargo.value);
		soloTexto(cargo);
	});
	
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
	
	telefono.addEventListener('blur', ()=>{
		console.log("telefono", telefono.value);
		soloNumeros(telefono);
	});
	
	//////////////////////////////////////////////////////////////////
	
	$("#aceptar").on('click', function(){
		location.href="/informacion_bancos";
	})

});

///////////////////////////////////////////////////////

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