'use strict'

window.addEventListener('load', ()=>{
	$("#menu_ejecutivo").on('click', function(){
		location.href = "/CBPult/Afiliacion/menu_afiliacion_ejecutivo";
	})
	
	
	$("#menu_operador").on('click', function(){
		location.href = "/CBPult/Afiliacion/menu_operador";
	})
	
	$("#menu_autogestion").on('click', function(){
		location.href = "/CBPult/Afiliacion/pre_carga_autogestion";
	})
	
})