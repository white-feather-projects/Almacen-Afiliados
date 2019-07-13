'use strict'

window.addEventListener('load', ()=>{

// ////////////////////////////////////////////////////////////////////

    var data_json = JSON.parse(localStorage.getItem("data"));

    $("#lote_confirmacion").val(data_json.lote).prop("disabled", true);
    $("#cantidadTarjetasSolicitar_confirmacion").val(data_json.cantidadTarjetasSolicitar).prop("disabled", true);
    $("#producto_confirmacion").val(data_json.producto).prop("disabled", true);
    $("#descripcionOrden_confirmacion").val(data_json.descripcionOrden).prop("disabled", true);
   


// ////////////////////////////////////////////////////////////////////
	
 

var lo =  document.querySelector("#lote_confirmacion");
console.log(lo);
      var cantidad= document.querySelector("#cantidadTarjetasSolicitar_confirmacion");
    var prod = document.querySelector("#producto_confirmacion");

    var descripcion = document.querySelector("#descripcionOrden_confirmacion");

    // ///////////////////////////////////////////////////////////////////

    cantidad.addEventListener('keyup', ()=>{
        var cant = document.querySelector("#cantidadTarjetasSolicitar_confirmacion").value;
        if(cant == "")
        {   
            alert("Espacio Obligatorio");
        }else if((/^([0-9])*$/).test(cant)){

        }else if((/[a-zA-Z]/).test(cant)){
            alert("Dato Alfanumerico");
            document.getElementById("cantidadTarjetasSolicitar_confirmacion").value = "";
        }
    });
    
        prod.addEventListener('keyup', ()=>{
        var pro = document.querySelector("#producto_confirmacion").value;
        if(pro == "")
        {   
            alert("Espacio Obligatorio");
        }else if((/[a-zA-Z]/).test(pro)){

        }else if((/^([0-9])*$/).test(pro)){
            alert("Dato Alfanumerico");
            document.getElementById("producto_confirmacion").value = "";
        }
    });
    
    
    
    descripcion.addEventListener('keyup', ()=>{
        var descripOrden = document.querySelector("#descripcionOrden_confirmacion").value;
        if(descripOrden == "")
        {   
            alert("Espacio Obligatorio");
        }else if((/[a-zA-Z]/).test(descripOrden)){

        }else if((/^([0-9])*$/).test(descripOrden)){
            alert("Dato Alfanumerico");
            document.getElementById("descripcionOrden_confirmacion").value = "";
        }
    });

// ////////////////////////////////////////////////////////////////////
   
    $('#aceptar_confirmacion').click(function(){
    	var url = window.location.pathname;
    	var id = url.substring(url.lastIndexOf('/') + 1);

 	   var cantidad = $("#cantidadTarjetasSolicitar_confirmacion").val();
 
	   
	 var contenido = {
    			"idRequest": id,
    			"cantidad": cantidad
    			}
    	      
        var url='/changePurchaceOrder';
    	
        $.ajax({
    	    url:url,
    	    dataType: 'json',
    	    contentType:'application/json',
    	    data:JSON.stringify(contenido),
    	    type: 'POST',
    	    success: function(resp){
    	    	// location.href = '/'+resp.mensaje;
    	    	
    	    	swal({
            	    title: 'Edicion de solicitud orden de compra exitosa',
            	    text: 'Redirigiendo...',
            	    icon: 'Exitoso',
            	    timer: 1000,
            	    buttons: false,
            	},
            	function() {
            	    location.href = "/listpurchaseorder";
            	}) 
	  
	    
    	    },
    	    error: function(e)
    		{
    			console.log("errro:"+e);
    		}
        		});
       
        
        });    
        
        
    
    ////////////////////////////////////////////

    ///////////////////////////////////////////////

    $("#cancelar_confirmacion").click(function(){

	swal({
    	    title: 'Cancelada edicion de orden de compra',
    	    text: 'Redirigiendo...',
    	    icon: 'Exitoso',
    	    timer: 1000,
    	    buttons: false,
    	},
    	function() {
    	    location.href = "/listpurchaseorder";
    	}) 
    });


});


// ////////////////////////////////////Listar ultima orden de
// compra/////////////////////////
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
          
         console.log(data.quantity);
         var quantity = data.quantity;
         var descriptionOrder = data.descriptionOrder;
         var numberOrder = data.numberOrder;
         var number = parseInt(numberOrder);
         var loteSiguiente = number+1;
         console.log(loteSiguiente);
         console.log(number);
         console.log(numberOrder);
        document.getElementById('cantidadTarjetasAnterior').value = quantity;
           document.getElementById('descripcionAnterior').value = descriptionOrder;
            document.getElementById('anteriorLote').value = number;
             document.getElementById('lote_confirmacion').value = loteSiguiente;
          console.log(data);
                
                             
            }
            
              },);  
              
}   
