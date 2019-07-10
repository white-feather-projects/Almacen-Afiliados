'use strict'

window.addEventListener('load', ()=>{
      var la = "";
     document.getElementById('cantidadTarjetasSolicitar').value = la;

    var data_json = JSON.parse(localStorage.getItem("data"));
    if(data_json == null)
    {
        console.log("null: "+data_json);
    }else{
        console.log("i");
        $("#cantidadTarjetasSolicitar").val(data_json.cantidadTarjetasSolicitar);
        $("#producto").val(data_json.producto);
        $("#descripcionOrden").val(data_json.descripcionOrden);
           var la = "";
     document.getElementById('cantidadTarjetasSolicitar').value = la;
      var lo = "";
     document.getElementById('descripcionOrden').value = lo;
      
    }

//////////////////////////////////////////////////////////////////////

    var cantidad= document.querySelector("#cantidadTarjetasSolicitar");
    var prod = document.querySelector("#producto");

    var descripcion = document.querySelector("#descripcionOrden");
   
//////////////////////////////////////////////////////////////////////

cantidad.addEventListener('keyup', ()=>{
        var cant = document.querySelector("#cantidadTarjetasSolicitar").value;
        if(cant == "")
        {   
            alert("Espacio Obligatorio");
        }else if((/^([0-9])*$/).test(cant)){

        }else if((/[a-zA-Z]/).test(cant)){
            alert("Dato Alfanumerico");
            document.getElementById("cantidadTarjetasSolicitar").value = "";
        }
    });
    
        prod.addEventListener('keyup', ()=>{
        var pro = document.querySelector("#producto").value;
        if(pro == "")
        {   
            alert("Espacio Obligatorio");
        }else if((/[a-zA-Z]/).test(pro)){

        }else if((/^([0-9])*$/).test(pro)){
            alert("Dato Alfanumerico");
            document.getElementById("producto").value = "";
        }
    });
    
    
    
    descripcion.addEventListener('keyup', ()=>{
        var descripOrden = document.querySelector("#descripcionOrden").value;
        if(descripOrden == "")
        {   
            alert("Espacio Obligatorio");
        }else if((/[a-zA-Z]/).test(descripOrden)){

        }else if((/^([0-9])*$/).test(descripOrden)){
            alert("Dato Alfanumerico");
            document.getElementById("descripcionOrden").value = "";
        }
    });

    
//////////////////////////////////////////////////////////////////////



    $("#cancelar").click(function(){
        localStorage.clear();
        location.href = "/listpurchaseorder";
    });

});


/////////////////////////////Mostrar ultima orden de compra////////////////////////////////////////


$(document).ready(function() {	
	listarLastOrder();
	mostrarDatos();
});

function listarLastOrder() {

$.ajax({          
             
		  type: "GET",
		  dataType: "json",
		  url: "/listLastPurchaseOrderRequest",
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

function mostrarDatos() {
	var url = window.location.pathname;
	var id = url.substring(url.lastIndexOf('/') + 1);

	
	$.ajax({          
		     
			  type: "GET",
			  dataType: "json",
			  url: "/consultId/"+id,
			  success: function(data)
		    {
	         
	         
	         console.log(data.quantity);
	         var quantity = data.quantity;
	         var descriptionOrder = data.descriptionOrder;
	         var status = data.statusOrder;
	         var producto = data.productDTO;
	         var productoId = producto.idProduct;
	         var productoName= producto.productName;
	         var lote = data.numberOrder; 
	         
	        
	         
	        document.getElementById('cantidadTarjetasSolicitar').value = quantity;
	        document.getElementById('descripcionOrden').value = descriptionOrder;
	        document.getElementById('status').value = status;
	        $("#producto").append('<option value=' + productoId + '>' + productoName+ '</option>');
	        document.getElementById('lote_confirmacion').value = lote;
	  
	              
	                             
	            }
	            
	              },);  
	              
	} 