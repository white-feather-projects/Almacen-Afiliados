'use strict'

window.addEventListener('load', ()=>{

// ////////////////////////////////////////////////////////////////////

    var data_json = JSON.parse(localStorage.getItem("data"));


    $("#cantidadTarjetasSolicitar_confirmacion").val(data_json.cantidadTarjetasSolicitar);
    $("#producto_confirmacion").val(data_json.producto);
    $("#descripcionOrden_confirmacion").val(data_json.descripcionOrden);
    $("#lote_confirmacion").val(data_json.ordenNumero);
    $(".productConfirmation").append('<option selected value=' + data_json.producto + '>' + data_json.proName+ '</option>');


// ////////////////////////////////////////////////////////////////////
	
 

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
    	      
        var url='/CBPult/Gestion_Compras/changePurchaceOrder';
    	
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
            	    location.href = "/CBPult/Gestion_Compras/listpurchaseorder";
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
    	    location.href = "/CBPult/Gestion_Compras/listpurchaseorder";
    	}) 
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
		  url: "/CBPult/Gestion_Compras/listLastPurchaseOrderRequest",
		  success: function(data)
	    {
         console.log(data);
          
		 var fecha = data.fechaCarga;
         var quantity = data.quantity;
         var descriptionOrder = data.descriptionOrder;
         var numberOrder = data.numberOrder;
         var producto = data.productDTO;
         var productoId = producto.idProduct;
         var productoName= producto.productName;
         
         console.log("producto",productoId);
         console.log("producto",productoName);
      
        document.getElementById('cantidadTarjetasAnterior').value = quantity;
        document.getElementById('descripcionAnterior').value = descriptionOrder;
        document.getElementById('anteriorLote').value = numberOrder;
        document.getElementById('fecha').value = fecha;
        $("#productoAnterior").append('<option value=' + productoId + '>' + productoName+ '</option>');
                
                             
            }
            
      },);  
              
}   