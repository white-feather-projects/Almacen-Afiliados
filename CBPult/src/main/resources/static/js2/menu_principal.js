'use strict'

    window.addEventListener('load', function(){
    	
    	
 /*si esta en el menu principal se mostraran los link de menu de emision 
    	  * y aquiriencia de lo contrario se mostrara el link para ir al menu principal*/
    	       
    	        
  var url = window.location.pathname;
  var id = url.substring(url.lastIndexOf('/') + 1);
  var roleUserMenu=$('#roleUserMenu').val();
    	    	
  if(id == "dashborad" && roleUserMenu == "ROLE_ADMIN")
   {
   $('#menu_principal').hide();
   $('#menu_emision').show();
   $('#menu_adquiriencia').show();
   }else{
   $('#menu_principal').hide();
   $('#menu_emision').show();
   $('#menu_adquiriencia').hide();   
	   
   }
   /*Fin*/   	
    	
   /***
    * Acceder a los modulos*/
    
    	
    	$('#gestion_plasticos').on('click', function(){
    	    //location.href = "../";
    	    location.href = "/CBPult/Gestion_Compras/managementpurchases";
    	})
    	
        $('#gestion_solicitudes').on('click', function(){
            location.href = "/CBPult/gestion_solicitudes";
    
        })
    
        $('#gestion_clientes').on('click', function(){
    //        location.href = "../";
        	location.href = "/CBPult/Afiliacion/menu_afiliacion";
        	/*
            if (!window.__cfRLUnblockHandlers) return false; 
            _gaq.push(['_trackEvent', 'example', 'try', 'sweet-3']);
            */
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
        	 location.href = "/CBPult/configuration";
        })
        
         $('#gestion_configuracionEmision').on('click', function(){
    //        location.href = "../";
        	 location.href = "/CBPult/configurationEmision";
        })
    
        $('#gestion_reportes').on('click', function(){
    //        location.href = "../";
            if (!window.__cfRLUnblockHandlers) return false; 
            _gaq.push(['_trackEvent', 'example', 'try', 'sweet-7']);
        })
    
        $('#gestion_inventario').on('click', function(){
            location.href = "/CBPult/Almacen/menu_movimiento-mercancia";        	
        })
        
    
 
        
 /*Ocultar modulos */

  $('#inventario').hide();
  $('#requerimientos').hide();
  $('#solicitudes').hide();
  $('#reportes_consultas').hide();
  $('#cierres').hide();
  $('#compras').hide();
  $('#configuracion').hide();
  $('#configuracionEmision').hide();
  $('#adquiriente').hide();
                
/*Fin*/       
        
        
   /*Menu de emision*/
   
   $('#menu_emision').on('click', function(){
	   
    //alert("menu_emision");
	$("#fondoMenu").removeClass("login-block");
	$("#logo").remove();
    $('#inventario').show();
    $('#requerimientos').show();
    $('#solicitudes').show();
    $('#reportes_consultas').show();
    $('#cierres').show();
    $('#compras').show();
    $('#configuracion').hide();
    $('#adquiriente').hide();
    $('#configuracionEmision').show();
	
 

   })
   
   /*Fin*/
   
   
   
/*Menu de emision*/
   
   $('#menu_adquiriencia').on('click', function(){
	   
  
    //alert("menu_adquiriencia");
	$("#fondoMenu").removeClass("login-block");
	$("#logo").remove();
	$('#inventario').show();
	$('#requerimientos').show();
	$('#solicitudes').hide();
	$('#reportes_consultas').show();
	$('#cierres').show();
	$('#compras').show();
	$('#configuracion').show();
	$('#adquiriente').show();
	$('#configuracionEmision').hide();
   
   })
   
   /*Fin*/
   
   
    
    })