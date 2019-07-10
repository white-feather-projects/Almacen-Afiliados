'use strict'

window.addEventListener('load', ()=>{
	
	 

//////////////////////////////////////////////////////////////////////

    var data_json = JSON.parse(localStorage.getItem("data"));

    $("#lote_confirmacion").val(data_json.lote).prop("readonly", true);
    $("#cantidadTarjetasSolicitar_confirmacion").val(data_json.cantidadTarjetasSolicitar).prop("readonly", true);
  //  $("#producto_confirmacion").val(data_json.producto).prop("readonly", true);
    $("#descripcionOrden_confirmacion").val(data_json.descripcionOrden).prop("readonly", true);
   // $(".productConfirmation").text(data_json.proName);
    $(".productConfirmation").append('<option selected value=' + data_json.producto + '>' + data_json.proName+ '</option>');


//////////////////////////////////////////////////////////////////////
	
    var lo =  document.querySelector("#lote_confirmacion");
    console.log(lo);
    var cantidad= document.querySelector("#cantidadTarjetasSolicitar_confirmacion");
    var prod = document.querySelector("#producto_confirmacion");
    //alert(data_json.producto);
    var descripcion = document.querySelector("#descripcionOrden_confirmacion");
    //var productName= $(".productConfirmation option:selected").text();

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
	 
	var descripcion = $("#descripcionOrden_confirmacion").val();
    var cantidad = $("#cantidadTarjetasSolicitar_confirmacion").val();
    var usuarioCreadorSolicitud = $("#usuarioCreadorSolicitud").val();
    var status ="CARGADA";
    var producto = $("#producto_confirmacion").val();
	
    	
   
    	    
var contenido = {
	    "descriptionOrder": descripcion,
		"quantity": cantidad,
		"codeUserLouder": usuarioCreadorSolicitud,
		"statusOrder":status,
		"idProduct":producto,
		
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
        console.log("contenido",data);
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
   var usuarioCreadorSolicitud = $("#usuarioCreadorSolicitud").val();
   var status ="EN CARGA";
   var producto = $("#producto_confirmacion").val();
   
var contenido = {
		    
		    "descriptionOrder": descripcion,
			"quantity": cantidad,
			"codeUserLouder": usuarioCreadorSolicitud,
			"statusOrder":status,
			"idProduct":producto,
		       
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