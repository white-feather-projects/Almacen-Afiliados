'use strict'

window.addEventListener('load', function(){

    var nombre_banco = document.querySelector("#nombre_banco");
    var numero_afiliacion = document.querySelector("#numero_afiliacion");
    var cantidad_terminales = document.querySelector("#cantidad_terminales");
    var cantidad_movistar = document.querySelector("#cantidad_movistar");
    var cantidad_digitel = document.querySelector("#cantidad_digitel");
    
    /////////////////////////////////////////////////////////////////////
    
    nombre_banco.addEventListener('blur', ()=>{
    	console.log("nombre_banco", nombre_banco.value);
    	soloTexto(nombre_banco);
    });
    
    numero_afiliacion.addEventListener('blur', ()=>{
    	console.log("numero_afiliacion", numero_afiliacion.value);
    	soloNumeros(numero_afiliacion);
    });
    
    cantidad_terminales.addEventListener('blur', ()=>{
    	console.log("cantidad_terminales", cantidad_terminales.value);
    	
    });
    
    cantidad_movistar.addEventListener('blur', ()=>{
    	console.log("cantidad_movistar", cantidad_movistar.value);
    	soloNumeros(cantidad_movistar);
    });
    
    cantidad_digitel.addEventListener('blur', ()=>{
    	console.log("cantidad_digitel", cantidad_digitel.value);
    	soloNumeros(cantidad_digitel);
    });
    
    //////////////////////////////////////////////////////////////////
    
    $("#aceptar").on('click', function(){
    	location.href="datos_comercio";
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