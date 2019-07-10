'use strict'

window.addEventListener('load', ()=>{




    //////////////////////////////////////////////

    $("#cancelar").click(function(){
        localStorage.clear();
        location.href = "/bandeja_ventas";
    });

});

////////////////////////////////////////////////////////7

function soloTexto(texto){
	var patron = /^[a-z A-Z ñÑ]*$/;
	if(texto.value.search(patron)){
		swal("Solo Texto");
		texto.value = "";
	}else{
		return true;
	}
}

function soloNumeros(numero){                           
	var patron = /^[0-9a-zA-Z]+$/;
	if(numero.value.search(patron)){
		swal("Solo Numeros");
		numero.value = "";
	}else{
		return true;
	}
}



function addViviendaList()

{
  var combo = document.getElementById('tenenciaVivienda');
  var opcion = combo.value;
  
 

  
  if(document.getElementById('tenenciaVivienda').value == 'ALQUILADA'){
        
	  $('#cuotaMensual').prop("disabled",false);

      
    
    }else{
    	
    	 $('#cuotaMensual').prop("disabled",true);
 
    	
    }
  

}


function addMajorList()

{
  var combo = document.getElementById('tipo_identificador');
  var opcion = combo.value;
  
 

  
  if(document.getElementById('tipo_identificador').value == 'Cedula'){
        

var va= document.getElementById("documento_identidad").maxLength = 9;
alert(va);      
    
    }else{
    	 alert("chao");
    	var longitud = documento = document.getElementById("documento_identidad").maxLength = 11;
 
    	
    }
  

}
