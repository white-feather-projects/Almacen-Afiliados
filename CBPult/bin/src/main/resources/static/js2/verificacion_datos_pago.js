'use strict'

window.addEventListener('load', function(){
	
	var tipo_pago = document.querySelector("#tipo_pago");
	var tipo_banco = document.querySelector("#tipo_banco");
	var comprobante_recibo = document.querySelector("#comprobante_recibo");
	
	///////////////////////////////////////////////////////////////////////
	
	tipo_pago.addEventListener('blur', ()=>{
		console.log("tipo_pago", tipo_pago.value);
		
	});
	
	tipo_banco.addEventListener('blur', ()=>{
		console.log("tipo_banco", tipo_banco.value);
		
	});
	
	comprobante_recibo.addEventListener('blur', ()=>{
		console.log("comprobante_recibo", comprobante_recibo.value);
		soloNumeros(comprobante_recibo);
	});

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