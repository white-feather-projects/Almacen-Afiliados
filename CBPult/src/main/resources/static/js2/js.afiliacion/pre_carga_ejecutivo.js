'use strict'

window.addEventListener('load', ()=>{

//////////////////////////////////////////////////////////////////////

	var tipo_identificacion = document.querySelector("#tipo_identificacion");
	var provincia = document.querySelector("#provincia");
    var ciudad = document.querySelector("#ciudad");
    var punto_de_referencia = document.querySelector("#punto_de_referencia");
    var documento = document.querySelector("#documento");
    var canton = document.querySelector("#canton");
    var urbanizacion = document.querySelector("#urbanizacion");
    var nombre_empresa = document.querySelector("#nombre_empresa");
    var distrito = document.querySelector("#distrito");
    var geo_localizacion = document.querySelector("#geo_localizacion");
    var tipo_identificacion2 = document.querySelector("#tipo_identificacion2");
    var primer_nombre = document.querySelector("#primer_nombre");
    var primer_apellido = document.querySelector("#primer_apellido");
    var documento2 = document.querySelector("#documento2");
    var segundo_nombre = document.querySelector("#segundo_nombre");
    var segundo_apellido = document.querySelector("#segundo_apellido");
    var telefono_celular = document.querySelector("#telefono_celular");
    var telefono_local = document.querySelector("#telefono_local");
    var correo_electronico = document.querySelector("#correo_electronico");
    
    tipo_identificacion.addEventListener('blur', ()=>{
    	console.log("tipo identificacion", tipo_identificacion.value);
    	
    });
    
    provincia.addEventListener('blur', ()=>{
    	console.log("provincia", provincia.value);
    	
    });
    
    ciudad.addEventListener('blur', ()=>{
    	console.log("ciudad", ciudad.value);
    	soloTexto(ciudad);
    });
    
    punto_de_referencia.addEventListener('blur', ()=>{
    	console.log("punto de referencia", punto_de_referencia.value);
    	soloTexto(punto_de_referencia);
    });
    
    documento.addEventListener('blur', ()=>{
    	console.log("documento", documento.value);
    	soloNumeros(documento);
    });
    
    canton.addEventListener('blur', ()=>{
    	console.log("canton", canton.value);
    	
    });
    
    urbanizacion.addEventListener('blur', ()=>{
    	console.log("urbanizacion", urbanizacion.value);
    	soloTexto(urbanizacion);
    });
    
    nombre_empresa.addEventListener('blur', ()=>{
    	console.log("nombre empresa", nombre_empresa.value);
    	soloTexto(nombre_empresa);
    });
    
    distrito.addEventListener('blur', ()=>{
    	console.log("distrito", distrito.value);
    	
    });
    
    geo_localizacion.addEventListener('blur', ()=>{
    	console.log("geo localizacion", geo_localizacion.value);
    	
    });
    
    tipo_identificacion2.addEventListener('blur', ()=>{
    	console.log("tipo identificacion 2", tipo_identificacion2.value);
    	
    });
    
    primer_nombre.addEventListener('blur', ()=>{
    	console.log("primer nombre", primer_nombre.value);
    	soloTexto(primer_nombre);
    });
    
    primer_apellido.addEventListener('blur', ()=>{
    	console.log("primer apellido", primer_apellido.value);
    	soloTexto(primer_apellido);
    });
    
    documento2.addEventListener('blur', ()=>{
    	console.log("documento2", documento2.value);
    	soloNumeros(documento2);
    });
    
    segundo_nombre.addEventListener('blur', ()=>{
    	console.log("segundo nombre", segundo_nombre.value);
    	soloTexto(segundo_nombre);
    });
    
    segundo_apellido.addEventListener('blur', ()=>{
    	console.log("segundo apellido", segundo_apellido.value);
    	soloTexto(segundo_apellido);
    });
    
    telefono_celular.addEventListener('blur', ()=>{
    	console.log("telefono celular", telefono_celular.value);
    	soloNumeros(telefono_celular);
    });
    
    telefono_local.addEventListener('blur', ()=>{
    	console.log("telefono local", telefono_local.value);
    	soloNumeros(telefono_local);
    });
    
    var emailRegex = /^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i;
    var email1;
    correo_electronico.addEventListener('blur', ()=>{
    	console.log("correo electronico", correo_electronico.value);
    	var email = document.querySelector("#correo_electronico").value;
        email1 = email;
        if(emailRegex.test(email)){

        }else{
            //alert("Espacio Obligatorio, Correo no valido");
            swal("Espacio Obligatorio, Correo no valido");
            document.getElementById("correo_electronico").value = "";
        }
    });
    
    //////////////////////////////////////////////////////////////////////////////
    ////////////Consumo Service Crear Comercio////////////////////////////////////
    
    
    
});

/////////////////////////////////////////////////////////

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