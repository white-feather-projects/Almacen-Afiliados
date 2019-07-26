'use strict'

window.addEventListener('load', function(){
	
	var nombre_banco_tab7 = document.querySelector("#nombre_banco_tab7");
	var tipo_POS_tab7 = document.querySelector("#tipo_POS_tab7");
	var cantidad_tab7 = document.querySelector("#cantidad_tab7");
	
	//////////////////////////////////////////////////////////////////
	
	nombre_banco_tab7.addEventListener('blur', ()=>{
		console.log("nombre_banco", nombre_banco_tab7.value);
		soloTexto(nombre_banco_tab7);
		document.getElementById("nombre_banco_tab7").style.border = "1px solid black";
	});
	
	tipo_POS_tab7.addEventListener('blur', ()=>{
		console.log("tipo_POS", tipo_POS_tab7.value);
		document.getElementById("tipo_POS_tab7").style.border = "1px solid black";
	});
	
	cantidad_tab7.addEventListener('blur', ()=>{
		console.log("cantidad_POS", cantidad_tab7.value);
		soloNumeros(cantidad_tab7);
		document.getElementById("cantidad_tab7").style.border = "1px solid black";
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