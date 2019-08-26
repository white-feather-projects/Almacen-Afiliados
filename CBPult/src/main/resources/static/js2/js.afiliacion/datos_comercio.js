'use strict'

window.addEventListener('load', function(){
	
	var tipo_identificacion_tab2 = document.querySelector("#tipo_identificacion_tab2");
	var nombre_empresa_tab2 = document.querySelector("#nombre_empresa_tab2");
	var correo_tab2 = document.querySelector("#correo_tab2");
	var numero_iban_tab2 = document.querySelector("#numero_iban_tab2");
	var afiliado_tab2 = document.querySelector("#afiliado_tab2");
	var telefono_alternativo_tab2 = document.querySelector("#telefono_alternativo_tab2");
	var identificacion_tab2 = document.querySelector("#identificacion_tab2");
	var nombre_comercial_tab2 = document.querySelector("#nombre_comercial_tab2");
	var telefono_local_tab2 = document.querySelector("#telefono_local_tab2");
	var banco_tab2 = document.querySelector("#banco_tab2");
	var horario_inicio_tab2 = document.querySelector("#horario_inicio_tab2");
	var horario_fin_tab2 = document.querySelector("#horario_fin_tab2");
	
	/////////////////////////////////////////////////////////////////////////////////////
	
	tipo_identificacion_tab2.addEventListener('blur', ()=>{
		console.log("tipo identificacion", tipo_identificacion_tab2.value);
		document.getElementById("tipo_identificacion_tab2").style.border = "1px solid black";
		
		
		
		if(tipo_identificacion_tab2.value === "Cedula de Residente"){
			document.getElementById("identificacion_tab2").setAttribute("maxlength", "9");
			
		}else if(tipo_identificacion_tab2.value === "DIMEX"){
			document.getElementById("identificacion_tab2").setAttribute("maxlength", "11");
			
		}else if(tipo_identificacion_tab2.value === "Cedula de Persona Jurídica"){
			document.getElementById("identificacion_tab2").setAttribute("maxlength", "10");
			
		}
	});
	
	nombre_empresa_tab2.addEventListener('blur', ()=>{
		console.log("nombre empresa", nombre_empresa_tab2.value);
		document.getElementById("nombre_empresa_tab2").style.border = "1px solid black";
	});
	
	var emailRegex = /^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i;
    var email1;
	correo_tab2.addEventListener('blur', ()=>{
		console.log("correo", correo_tab2.value);
		var email = document.querySelector("#correo_tab2").value;
        email1 = email;
        if(emailRegex.test(email)){

        }else{
            //alert("Espacio Obligatorio, Correo no valido");
            swal("Espacio Obligatorio, Correo no valido");
            document.getElementById("correo_tab2").value = "";
        }
        document.getElementById("correo_tab2").style.border = "1px solid black";
	});
	
	numero_iban_tab2.addEventListener('blur', ()=>{
		console.log("numero iban", numero_iban_tab2.value)
		soloLetrasYNum(numero_iban_tab2);
		document.getElementById("numero_iban_tab2").style.border = "1px solid black";
		
		var primeros = numero_iban_tab2.value.substring(0, 2);
		//console.log("primeros----", primeros);
		if(primeros != "CR"){
			swal("Formato Incorrecto");
			numero_iban_tab2.value = "CR";
		}
		
		if($("#numero_iban_tab2").attr("maxlength") === "22"){
			if($("#numero_iban_tab2").val().length < 22){
				swal("Longitud debe ser de 22");
				document.getElementById("numero_iban_tab2").style.border = "1px solid red";
				$("#numero_iban_tab2").val("CR");
			}
		}
	});
	
	afiliado_tab2.addEventListener('blur', ()=>{
		console.log("afiliado", afiliado_tab2.value);
		document.getElementById("afiliado_tab2").style.border = "1px solid black";
	});
	
	telefono_alternativo_tab2.addEventListener('blur', ()=>{
		console.log("telefono alternativo", telefono_alternativo_tab2.value);
		soloNumeros(telefono_alternativo_tab2);
		document.getElementById("telefono_alternativo_tab2").style.border = "1px solid black";
	});
	
	identificacion_tab2.addEventListener('blur', ()=>{
		console.log("identificacion", identificacion_tab2.value);
		soloNumeros(identificacion_tab2);
		document.getElementById("identificacion_tab2").style.border = "1px solid black";
		
		if($("#identificacion_tab2").attr("maxlength") === "9"){
			if($("#identificacion_tab2").val().length < 9){
				swal("Longitud debe ser de 9");
				document.getElementById("identificacion_tab2").style.border = "1px solid red";
				$("#identificacion_tab2").val("");
			}
		}
		
		if($("#identificacion_tab2").attr("maxlength") === "11"){
			if($("#identificacion_tab2").val().length < 11){
				swal("Longitud debe ser de 11");
				document.getElementById("identificacion_tab2").style.border = "1px solid red";
				$("#identificacion_tab2").val("");
			}
		}
		
		if($("#identificacion_tab2").attr("maxlength") === "10"){
			if($("#identificacion_tab2").val().length < 10){
				swal("Longitud debe ser de 10");
				document.getElementById("identificacion_tab2").style.border = "1px solid red";
				$("#identificacion_tab2").val("");
			}
		}
	});
	
	nombre_comercial_tab2.addEventListener('blur', ()=>{
		console.log("nombre comercial", nombre_comercial_tab2.value);
		//soloLetrasYNum(nombre_comercial_tab2);
		document.getElementById("nombre_comercial_tab2").style.border = "1px solid black";
	});
	
	telefono_local_tab2.addEventListener('blur', ()=>{
		console.log("telefono local", telefono_local_tab2.value);
		soloNumeros(telefono_local_tab2);
		document.getElementById("telefono_local_tab2").style.border = "1px solid black";
	});
	
	banco_tab2.addEventListener('blur', ()=>{
		console.log("banco", banco_tab2.value);
		document.getElementById("banco_tab2").style.border = "1px solid black";
	});
	
	horario_inicio_tab2.addEventListener('blur', ()=>{
		console.log("horario inicio", horario_inicio_tab2.value);
		document.getElementById("horario_inicio_tab2").style.border = "1px solid black";
	});
	
	horario_fin_tab2.addEventListener('blur', ()=>{
		console.log("horario fin", horario_fin_tab2.value);
		document.getElementById("horario_fin_tab2").style.border = "1px solid black";
	});

});

////////////////////////////////////////////////////////////////////////////////////////

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