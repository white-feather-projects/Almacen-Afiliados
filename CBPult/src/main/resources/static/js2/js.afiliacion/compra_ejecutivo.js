'use strict'

window.addEventListener('load', function(){

    var nombre_banco = document.querySelector("#nombre_banco_tab3");
    var numero_afiliacion = document.querySelector("#numero_afiliacion_tab3");
    var cantidad_terminales = document.querySelector("#cantidad_terminales_tab3");
    var cantidad_claro = document.querySelector("#cantidad_claro_tab3");
    
    /////////////////////////////////////////////////////////////////////
    
    nombre_banco.addEventListener('blur', ()=>{
    	console.log("nombre_banco", nombre_banco.value);
    	soloTexto(nombre_banco);
    	document.getElementById("nombre_banco_tab3").style.border = "1px solid black";
    });
    
    numero_afiliacion.addEventListener('blur', ()=>{
    	console.log("numero_afiliacion", numero_afiliacion.value);
    	soloNumeros(numero_afiliacion);
    	document.getElementById("numero_afiliacion_tab3").style.border = "1px solid black";
    });
    
    cantidad_terminales.addEventListener('blur', ()=>{
    	console.log("cantidad_terminales", cantidad_terminales.value);
    	document.getElementById("cantidad_terminales_tab3").style.border = "1px solid black";
    });
    
    cantidad_claro.addEventListener('blur', ()=>{
    	console.log("cantidad_claro", cantidad_claro.value);
    	soloNumeros(cantidad_claro);
    	document.getElementById("cantidad_claro_tab3").style.border = "1px solid black";
    });
    
    //////////////////////////////////////////////////////////////////
    
    $("#aceptar").on('click', function(){
    	location.href="/Afiliacion/datos_comercio";
    })

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