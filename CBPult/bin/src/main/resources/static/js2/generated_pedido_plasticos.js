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
         
      
    }

// ////////////////////////////////////////////////////////////////////

    var cantidad= document.querySelector("#cantidadTarjetasSolicitar");
    var prod = document.querySelector("#producto");

    var descripcion = document.querySelector("#descripcionOrden");
   
// ////////////////////////////////////////////////////////////////////

cantidad.addEventListener('keyup', ()=>{
        var cant = document.querySelector("#cantidadTarjetasSolicitar").value;
        if(cant == "")
        {   
        	swal("Espacio Obligatorio");
        }else if((/^([0-9])*$/).test(cant)){

        }else if((/[a-zA-Z]/).test(cant)){
        	swal("Dato Alfanumerico");
            document.getElementById("cantidadTarjetasSolicitar").value = "";
        }
    });
    
        prod.addEventListener('keyup', ()=>{
        var pro = document.querySelector("#producto").value;
        if(pro == "")
        {   
        	swal("Espacio Obligatorio");
        }else if((/[a-zA-Z]/).test(pro)){

        }else if((/^([0-9])*$/).test(pro)){
        	swal("Dato Alfanumerico");
            document.getElementById("producto").value = "";
        }
    });
    
    
    
    descripcion.addEventListener('keyup', ()=>{
        var descripOrden = document.querySelector("#descripcionOrden").value;
        if(descripOrden == "")
        {   
        	swal("Espacio Obligatorio");
        }else if((/[a-zA-Z]/).test(descripOrden)){

        }else if((/^([0-9])*$/).test(descripOrden)){
        	swal("Dato Alfanumerico");
            document.getElementById("descripcionOrden").value = "";
        }
    });

    
//////////////////////////////////////////////////////////////////////

    $('#siguiente').click(function(){
    	var url = window.location.pathname;
    	var id = url.substring(url.lastIndexOf('/') + 1);
        if(cantidad.value.length == 0 || prod.value.length == 0 || descripcion.value.length == 0){
        	swal("Datos Obligatorios Vacios");
        }else{
          
  var data = {
                    "cantidadTarjetasSolicitar": cantidad.value,
                    "producto": prod.value,
                    "descripcionOrden": descripcion.value,
                
                };

                localStorage.setItem("data", JSON.stringify(data));
                location.href="/generatedpurchaseorderconfirmacion/"+id;
        
        }

    });

    //////////////////////////////////////////////

    $("#cancelar").click(function(){
    	var url = window.location.pathname;
    	var id2 = url.substring(url.lastIndexOf('/') + 1);
    	 
   var status ="En aprobacion";
   console.log(status);
    	    
   var datos = {
   		"idRequest": id2,
   		"fechaModificacion": "24/05/2019",
   		"statusOrder": status
   		}
   
var url3='/cambio';
	
   $.ajax({
	    url:url3,
	    dataType: 'json',
	    contentType:'application/json',
	    data:JSON.stringify(datos),
	    type: 'POST',
	    success: function(resp){
	    	//location.href = '/'+resp.mensaje;
	    	
	    	swal({
        	    title: 'Generacion de orden en aprobacion',
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
    
    ///////////////////////////////// Enviar a lista //////////////////
    $("#salir").click(function(){
    	 localStorage.clear();
        location.href = "/listpurchaseorder";
});

});

///////////////////////////////////Listar ultima orden de compra///////////////////////////
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
             document.getElementById('lote').value = loteSiguiente;
          console.log(data);
                
                             
            }
            
              },);  
              
}   


//////////////////////////////////// Buscar por mid para mostrar datos ///////////////////
function mostrarDatos() {
	var url = window.location.pathname;
	var id = url.substring(url.lastIndexOf('/') + 1);

	
	$.ajax({          
		     
			  type: "GET",
			  dataType: "json",
			  url: "/consultId/"+id,
			  success: function(data)
		    {
	          console.log(data);
	         
	         console.log(data.quantity);
	         var quantity = data.quantity;
	         var descriptionOrder = data.descriptionOrder;
	         
	        document.getElementById('cantidadTarjetasSolicitar').value = quantity;
	           document.getElementById('descripcionOrden').value = descriptionOrder;
	          
	          console.log(data);
	              
	                             
	            }
	            
	              },);  
	              
	} 