'use strict'

    window.addEventListener('load', function(){
    	
    	$('#gestion_plasticos').on('click', function(){
    	    //location.href = "../";
    	    location.href = "/managementpurchases";
    	})
    	
        $('#gestion_solicitudes').on('click', function(){
            location.href = "/gestion_solicitudes";
    
        })
    
        $('#gestion_clientes').on('click', function(){
    //        location.href = "../";
            if (!window.__cfRLUnblockHandlers) return false; 
            _gaq.push(['_trackEvent', 'example', 'try', 'sweet-3']);
        })
    
        $('#gestion_cierres').on('click', function(){
    //        location.href = "../";
            if (!window.__cfRLUnblockHandlers) return false; 
            _gaq.push(['_trackEvent', 'example', 'try', 'sweet-4']);
        })
    
        $('#gestion_requerimientos').on('click', function(){
    //        location.href = "../";
            if (!window.__cfRLUnblockHandlers) return false; 
            _gaq.push(['_trackEvent', 'example', 'try', 'sweet-5']);
        })
    
     $('#gestion_configuracion').on('click', function(){
    //        location.href = "../";
        	 location.href = "/configuration";
        })
    
        $('#gestion_reportes').on('click', function(){
    //        location.href = "../";
            if (!window.__cfRLUnblockHandlers) return false; 
            _gaq.push(['_trackEvent', 'example', 'try', 'sweet-7']);
        })
    
        $('#gestion_inventario').on('click', function(){
    //        location.href = "../";
            if (!window.__cfRLUnblockHandlers) return false; 
            _gaq.push(['_trackEvent', 'example', 'try', 'sweet-8']);
        })
    
    })