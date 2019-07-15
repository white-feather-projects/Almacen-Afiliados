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





});


$(document).ready(function() {	
	listarLastOrder();
	
	$("#cancelar").click(function(){
	    localStorage.clear();
	    location.href = "/listpurchaseorder";
	});
	
});

function listarLastOrder() {

$.ajax({          
             
		  type: "GET",
		  dataType: "json",
		  url: "/listLastPurchaseOrderRequest",
		  success: function(data)
	    {
          
        $("#tbodyProducto").html('');
        /* Vemos que la respuesta no este vacía y sea una arreglo */
         
         console.log(data.quantity);
         var quantity = data.quantity;
         var fecha = data.fechaCarga;
         console.log(fecha);
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
            document.getElementById('fecha').value = fecha;
             document.getElementById('lote').value = loteSiguiente;
          console.log(data);
                
                             
            }
            
              },);  
              
}   
