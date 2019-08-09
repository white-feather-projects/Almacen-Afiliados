'use strict'

    window.addEventListener('load', function(){

        $('#bandeja_ventas').on('click', function(){
            location.href = "/CBPult/Solicitudes/bandeja_ventas";
    
        })
        
        $('#bandeja_riesgos').on('click', function(){
            location.href = "/CBPult/Solicitudes/bandeja_riesgos";
    
        })
    
    });