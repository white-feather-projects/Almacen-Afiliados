'use strict'

window.addEventListener('load', ()=>{
	
	 

// ////////////////////////////////////////////////////////////////////

    var data_json = JSON.parse(localStorage.getItem("data"));

    $("#lote_confirmacion").val(data_json.lote).prop("disabled", true);
    $("#cantidadTarjetasSolicitar_confirmacion").val(data_json.cantidadTarjetasSolicitar).prop("disabled", true);
    $("#producto_confirmacion").val(data_json.producto).prop("disabled", true);
    $("#descripcionOrden_confirmacion").val(data_json.descripcionOrden).prop("disabled", true);
   


//////////////////////////////////////////////////////////////////////
	
var lo =  document.querySelector("#lote_confirmacion");
console.log(lo);
    var cantidad= document.querySelector("#cantidadTarjetasSolicitar_confirmacion");
    var prod = document.querySelector("#producto_confirmacion");

    var descripcion = document.querySelector("#descripcionOrden_confirmacion");
    var descripcion = document.querySelector("#descripcionOrden_confirmacion");

    /////////////////////////////////////////////////////////////////////

    cantidad.addEventListener('keyup', ()=>{
        var cant = document.querySelector("#cantidadTarjetasSolicitar_confirmacion").value;
        if(cant == "")
        {   
            swal("Espacio Obligatorio");
        }else if((/^([0-9])*$/).test(cant)){

        }else if((/[a-zA-Z]/).test(cant)){
            swal("Dato Alfanumerico");
            document.getElementById("cantidadTarjetasSolicitar_confirmacion").value = "";
        }
    });
    
        prod.addEventListener('keyup', ()=>{
        var pro = document.querySelector("#producto_confirmacion").value;
        if(pro == "")
        {   
            swal("Espacio Obligatorio");
        }else if((/[a-zA-Z]/).test(pro)){

        }else if((/^([0-9])*$/).test(pro)){
            swal("Dato Alfanumerico");
            document.getElementById("producto_confirmacion").value = "";
        }
    });
    
    
    
    descripcion.addEventListener('keyup', ()=>{
        var descripOrden = document.querySelector("#descripcionOrden_confirmacion").value;
        if(descripOrden == "")
        {   
            swal("Espacio Obligatorio");
        }else if((/[a-zA-Z]/).test(descripOrden)){

        }else if((/^([0-9])*$/).test(descripOrden)){
            swal("Dato Alfanumerico");
            document.getElementById("descripcionOrden_confirmacion").value = "";
        }
    });

/////////////////////////////Aceptar solicitud de orden de compra/////////////////////////////////////////    
    
$('#aceptar_confirmacion').click(function(){
    	
    	   var cantidad = $("#cantidadTarjetasSolicitar_confirmacion").val();
    	   var descripcion = $("#descripcionOrden_confirmacion").val();
    	   console.log(descripcion);
    	   var usuarioCreadorSolicitud = $("#usuarioCreadorSolicitud").val();
           console.log(usuarioCreadorSolicitud);
    	   var status ="Cargada";
    	   console.log(status);
   
    	    
var contenido = {
		 "statusOrder":status,
		   "descriptionOrder": descripcion,
		    "quantity": cantidad,
		    "codeUserLouder": usuarioCreadorSolicitud,
		    "codeUserAproved": "002"
		
}
      
    	$.ajax({      headers: { 
            'Accept': 'application/json',
            'Content-Type': 'application/json' 
        },     
            
  		  type: "POST",
  		  
  		  url: "/createPurchaseOrdeRequestr",
  		  data: JSON.stringify(contenido),
  		dataType: "json",
  		  success: function(data)
  	    {
        
  			swal({
        	    title: 'Pedido de orden de compra exitosa',
        	    text: 'Redirigiendo...',
        	    icon: 'Exitoso',
        	    timer: 1000,
        	    buttons: false,
        	},
        	function() {
        	    location.href = "/listpurchaseorder";
        	})   
                               
              }
              
                },);  

      
    });


////////////////////////// Cancelar solicitud de orden de compra ////////////////////////////
   $("#cancelar_confirmacion").click(function(){
   var cantidad = $("#cantidadTarjetasSolicitar_confirmacion").val();
   var descripcion = $("#descripcionOrden_confirmacion").val();
    	   console.log(descripcion);
    	   var usuarioCreadorSolicitud = $("#usuarioCreadorSolicitud").val();
           console.log(usuarioCreadorSolicitud);
   var status ="En Carga";
   console.log(status);
    	    
var contenido = {
		   "statusOrder":status,
		   "descriptionOrder": descripcion,
		    "quantity": cantidad,
		    "codeUserLouder": usuarioCreadorSolicitud,
		    "codeUserAproved": "002"
		
}
      
    	$.ajax({      headers: { 
            'Accept': 'application/json',
            'Content-Type': 'application/json' 
        },     
            
  		  type: "POST",
  		  
  		  url: "/createPurchaseOrdeRequestr",
  		  data: JSON.stringify(contenido),
  		dataType: "json",
  		  success: function(data)
  	    {
        
          
  			swal({
        	    title: 'Pedido de orden de compra en carga',
        	    text: 'Redirigiendo...',
        	    icon: 'Exitoso',
        	    timer: 1000,
        	    buttons: false,
        	},
        	function() {
        	    location.href = "/listpurchaseorder";
        	})   
                               
              }
              
                },);  
    });
   
   
//////////////////////////////////Salir //////////////////////////////    
   $("#salir").click(function(){
  
 	   localStorage.clear();
        location.href = "/listpurchaseorder";
    });
    
    
   });


  
  
/////////////////////////////Mostrar ultima orden de compra////////////////////////////////////////

  $(document).ready(function() {	
		listarLastOrder();
	});

	function listarLastOrder() {

	$.ajax({          
	             
			  type: "GET",
			  dataType: "json",
			  url: "/listLastPurchaseOrderRequest",
			  success: function(data)
		    {
	          
	          
			 var fecha = data.fechaCarga;
	         var quantity = data.quantity;
	         var descriptionOrder = data.descriptionOrder;
	         var numberOrder = data.numberOrder;
	         var number = parseInt(numberOrder);
	         var loteSiguiente = number+1;
	      
	        document.getElementById('cantidadTarjetasAnterior').value = quantity;
	        document.getElementById('descripcionAnterior').value = descriptionOrder;
	        document.getElementById('anteriorLote').value = number;
	        document.getElementById('lote_confirmacion').value = loteSiguiente;
	        document.getElementById('fecha').value = fecha;
	        console.log(data);
	                
	                             
	            }
	            
	      },);  
	              
	}   