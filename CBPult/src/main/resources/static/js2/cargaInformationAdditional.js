'use strict'

window.addEventListener('load', ()=>{


    
/* Datos Vivienda*/

    var vivienda = document.querySelector("#tenenciaVivienda");
    var cuota = document.querySelector("#cuotaMensual");
    
    var paisVivienda = document.querySelector("#pais_vivienda");
    var provinciaVivienda = document.querySelector("#provinciaVivienda");
    
    var cantonVivienda = document.querySelector("#cantonVivienda");
    var distritoVivienda = document.querySelector("#distritoVivienda");

    var ciudadVivienda = document.querySelector("#ciudad");
    var sectorVivienda = document.querySelector("#sector");

    var ptoReferenciaVivienda = document.querySelector("#ptoReferencia");
    var codPostalVivienda = document.querySelector("#codPostal");

//////////////////////////////////////////////////////////////////////

    
  /*Campos Vivienda*/  
    
    
    vivienda.addEventListener('keyup', ()=>{
    	soloTexto(vivienda);
    	document.getElementById("vivienda").style.border = "1px solid black";
    });  
    
    cuota.addEventListener('keyup', ()=>{
    	soloNumeros(cuota);
    	document.getElementById("cuota").style.border = "1px solid black";
    });  
    
  //////////////////////////////////////////////////////////////  
    
    paisVivienda.addEventListener('keyup', ()=>{
    	soloNumeros(paisVivienda);
    	document.getElementById("paisVivienda").style.border = "1px solid black";
    });  
    
    provinciaVivienda.addEventListener('keyup', ()=>{
    	soloNumeros(provinciaVivienda);
    	document.getElementById("provinciaVivienda").style.border = "1px solid black";
    }); 
    
    //////////////////////////////////////////////////////////////    
    
    cantonVivienda.addEventListener('keyup', ()=>{
    	soloNumeros(cantonVivienda);
        document.getElementById("cantonVivienda").style.border = "1px solid black";
    }); 
    
    
    
    distritoVivienda.addEventListener('keyup', ()=>{
    	soloNumeros(distritoVivienda);
    	document.getElementById("distritoVivienda").style.border = "1px solid black";
    }); 
    
    //////////////////////////////////////////////////////////////   
    
    ciudadVivienda.addEventListener('keyup', ()=>{
        soloTexto(ciudadVivienda);
        document.getElementById("ciudadVivienda").style.border = "1px solid black";
    }); 
    
    sectorVivienda.addEventListener('keyup', ()=>{
        soloTexto(sectorVivienda);
        document.getElementById("sectorVivienda").style.border = "1px solid black";
    }); 
    
    //////////////////////////////////////////////////////////////  
    
    ptoReferenciaVivienda.addEventListener('keyup', ()=>{
        soloTexto(ptoReferenciaVivienda);
        document.getElementById("ptoReferenciaVivienda").style.border = "1px solid black";
    }); 
    
    codPostalVivienda.addEventListener('keyup', ()=>{
        soloNumeros(codPostalVivienda);
        document.getElementById("codPostalVivienda").style.border = "1px solid black";
    }); 
    
    //////////////////////////////////////////////////////////////  
   
});
    
    
    
  