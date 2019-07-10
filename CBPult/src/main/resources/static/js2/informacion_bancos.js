'use strict'

window.addEventListener('load', function(){
	
	var nombre_banco = document.querySelector("#nombre_banco");
	var tipo_POS = document.querySelector("#tipo_POS");
	var cantidad_POS = document.querySelector("#cantidad_POS");
	
	//////////////////////////////////////////////////////////////////
	
	nombre_banco.addEventListener('blur', ()=>{
		console.log("nombre_banco", nombre_banco.value);
		soloTexto(nombre_banco);
	});
	
	tipo_POS.addEventListener('blur', ()=>{
		console.log("tipo_POS", tipo_POS.value);
		
	});
	
	cantidad_POS.addEventListener('blur', ()=>{
		console.log("cantidad_POS", cantidad_POS.value);
		soloNumeros(cantidad_POS);
	});
	
	//////////////////////////////////////////////////////////////////
	
	$("#aceptar").on('click', function(){
		location.href="/datos_pago";
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