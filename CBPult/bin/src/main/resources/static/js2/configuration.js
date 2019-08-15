'use strict'

    window.addEventListener('load', function(){

        $('#generationPurchases').on('click', function(){
            location.href = "/CBPult/purchaseManagementConfiguration";
    
        })
        
        $('#configuration_almacen').on('click', function(){
            location.href = "/CBPult/Almacen/configuration_almacen";
    
        })
        
        $('#configuration_afiliados').on('click', function(){
            location.href = "/CBPult/Afiliacion/configuration_afiliados";
    
        })
        
    });