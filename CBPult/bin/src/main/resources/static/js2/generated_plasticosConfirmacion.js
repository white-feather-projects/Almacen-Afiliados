'use strict'

window.addEventListener('load', ()=>{

// ////////////////////////////////////////////////////////////////////

    var data_json = JSON.parse(localStorage.getItem("data"));

    $("#lote_confirmacion").val(data_json.lote);
    $("#cantidadTarjetasSolicitar_confirmacion").val(data_json.cantidadTarjetasSolicitar);
    $("#producto_confirmacion").val(data_json.producto);
    $("#descripcionOrden_confirmacion").val(data_json.descripcionOrden);
    $("#fechaSolicitud_confimacion").val(data_json.fechaSolicitud);
    $("#lote_confirmacion").val(data_json.ordenNumero);
    $("#creador_Solicitud_confirmacion").val(data_json.usuarioCreador);
    $(".productConfirmation").append('<option selected value=' + data_json.producto + '>' + data_json.proName+ '</option>');
    
// ////////////////////////////////////////////////////////////////////
	
 var lo =  document.querySelector("#lote_confirmacion");
console.log(lo);
    var cantidad= document.querySelector("#cantidadTarjetasSolicitar_confirmacion");
    var prod = document.querySelector("#producto_confirmacion");

    var descripcion = document.querySelector("#descripcionOrden_confirmacion");
    var fecha =  document.querySelector("#fechaSolicitud_confimacion");
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

//////////////////////////////////////////////////////////////////////    
   
    $('#aceptar_confirmacion').click(function(){
       var url = window.location.pathname;
       var id = url.substring(url.lastIndexOf('/') + 1);
      
       var cantidad = $("#cantidadTarjetasSolicitar_confirmacion").val();
     
	   var descripcion = $("#descripcionOrden_confirmacion").val();
       var status ="Cargada";
	   var producto = $("#producto_confirmacion").val();
	   var fechaSolicitudOrdenCompra = $("#fechaSolicitud_confimacion").val();
	   var loteSiguiente = $("#lote_confirmacion").val();
	   var usuarioCreadorSolicitud = $("#creador_Solicitud_confirmacion").val();
	   //alert(usuarioCreadorSolicitud);
	   var usuarioAprovadorSolicitud = $("#usuarioAprovador").val();
	   
	   //alert(usuarioAprovadorSolicitud);
		var contenido = {
    			"orderDescription": descripcion,
    			"orderCommetns": descripcion,
    			"orderType": "orderType",
    			"purchaseOrderDate": fechaSolicitudOrdenCompra,
    			"quantity": cantidad,
    			"orderStatus":"EN_PROCESO_DE_GENERAR_DETALLE_ORDEN",
    			"idProduct": producto,
    			"idOrderRequest": id,
    			"purchaseOrderNumber":loteSiguiente,
    			"codUserLoader":usuarioCreadorSolicitud,
    			"codAprovedUser":usuarioAprovadorSolicitud
    			}
		
    	      
        var url='/CBPult/Gestion_Compras/generated';
    	
        $.ajax({
    	    url:url,
    	    dataType: 'json',
    	    contentType:'application/json',
    	    data:JSON.stringify(contenido),
    	    type: 'POST',
    	    success: function(resp){
    	    	//location.href = '/'+resp.mensaje;
    	    	console.log("data",Object.values(resp));
    	    	var respuesta = Object.values(resp);
    	    	   if(respuesta != " ")
    		          {
    	   	
    	    	swal({
            	    title: 'Generando lista,input file y ftp',
            	    text: 'Redirigiendo...',
            	    icon: 'Exitoso',
            	    timer: 3000,
            	    buttons: false,
            	},
            	function() {
            	   location.href = "/CBPult/Gestion_Compras/listpurchaseorder";
            	})   
    		  }else{
	    		
	    	swal("Error al generar orden de compra");
	    	 }
	    	
    	    },
    	    error: function(e)
    		{
    	    	swal("Error al generar orden de compra");
    			console.log("errro:"+e);
    		}
        		});
        
  //////////////////// Cambiar status en lista principal /////////////////////////      
        var datos = {
        		"idRequest": id,
        		"statusOrder": "APROBADA"
        		}
        
  var url2='/CBPult/Gestion_Compras/cambio';
    	
        $.ajax({
    	    url:url2,
    	    dataType: 'json',
    	    contentType:'application/json',
    	    data:JSON.stringify(datos),
    	    type: 'POST',
    	    success: function(resp){
    	
    	    },
    	    error: function(e)
    		{
    			console.log("errro:"+e);
    		}
        		});
        
        
        
        });    
        
        
   

    $("#cancelar_confirmacion").click(function(){
    	var url = window.location.pathname;
    	var id2 = url.substring(url.lastIndexOf('/') + 1);
    	 
   var status ="EN APROBACIÓN";

    	    
   var datos = {
   		"idRequest": id2,
   		"statusOrder": status
   		}
   
var url3='/CBPult/Gestion_Compras/cambio';
	
   $.ajax({
	    url:url3,
	    dataType: 'json',
	    contentType:'application/json',
	    data:JSON.stringify(datos),
	    type: 'POST',
	    success: function(resp){

	    	if(resp.descripcion=='OK'){	
	    	swal({
        	    title: 'Generacion de orden en aprobacion',
        	    text: 'Redirigiendo...',
        	    icon: 'Exitoso',
        	    timer: 1000,
        	    buttons: false,
        	},
        	function() {
        	    location.href = "/CBPult/Gestion_Compras/listpurchaseorder";
        	}) 
	    	}else{
	        	  swal("No se pudo realizar la generacion de orden en aprobacion");
	          }
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
          location.href = "/CBPult/Gestion_Compras/listpurchaseorder";
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
	    if(data != " ") {
          
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
                
                             
            }else{
           swal("No hay ultima orden de compra");	
            
            }
            }
            
      },);  
              
}  