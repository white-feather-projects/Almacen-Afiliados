'use strict'

window.addEventListener('load', ()=>{
	$("#menu_ejecutivo").on('click', function(){
		location.href = "/menu_afiliacion_ejecutivo";
	})
	
	
	$("#menu_operador").on('click', function(){
		location.href = "/menu_operador";
	})
	
	$("#menu_autogestion").on('click', function(){
		location.href = "/pre_carga_autogestion";
	})
	
})