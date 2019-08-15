'use strict'

window.addEventListener('load', function(){
	
	document.getElementById("tipo_banco_tab8").disabled = true;
	
	var tipo_pago = document.querySelector("#tipo_pago_tab8");
	var tipo_banco = document.querySelector("#tipo_banco_tab8");
	var comprobante_recibo = document.querySelector("#comprobante_recibo_tab8");
	var monto_tab8 = document.querySelector("#monto_tab8");
	
	///////////////////////////////////////////////////////////////////////
	
	tipo_pago.addEventListener('blur', ()=>{
		if(tipo_pago.value === "Efectivo"){
			document.getElementById("tipo_banco_tab8").disabled = true;
		}else{
			document.getElementById("tipo_banco_tab8").disabled = false;
		}
	});
	
	//////////////////////////////////////////////////////////////////////
	
	tipo_pago.addEventListener('blur', ()=>{
		console.log("tipo_pago", tipo_pago.value);
		document.getElementById("tipo_pago_tab8").style.border = "1px solid black";
	});
	
	tipo_banco.addEventListener('blur', ()=>{
		console.log("tipo_banco", tipo_banco.value);
		document.getElementById("tipo_banco_tab8").style.border = "1px solid black";
	});
	
	comprobante_recibo.addEventListener('blur', ()=>{
		console.log("comprobante_recibo", comprobante_recibo.value);
		soloLetrasYNum(comprobante_recibo);
		document.getElementById("comprobante_recibo_tab8").style.border = "1px solid black";
	});
	
	monto_tab8.addEventListener('blur', ()=>{
		console.log("monto", monto_tab8.value);
		soloNumeros(monto_tab8);
		document.getElementById("monto_tab8").style.border = "1px solid black";
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

function soloLetrasYNum(campo) {
	 var validos = " abcdefghijklmnopqrstuvwxyz0123456789";
	 var letra;
	 var bien = true;
	 for (var i=0; i<campo.value.length; i++) {
		  letra=campo.value.charAt(i).toLowerCase()
		  if (validos.indexOf(letra) == -1){bien=false;};
		  }
		  if (!bien) {
			  campo.value = "";
			  swal("Campo Alfanumerico");
			  //campo.focus();
		  }
}