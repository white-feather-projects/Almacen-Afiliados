'use strict'

window.addEventListener('load', ()=>{
	
    ///////////////////////////////// Enviar a lista //////////////////
    $("#salir").click(function(){
    	 localStorage.clear();
        location.href = "/CBPult/Gestion_Compras/listpurchaseorder";
});
	
	/**
	 * Obtener valor maximo para solicitar tarjetas
	 */
	var valorMaximo=$('#valorMaximo').val();
	var valorMaximoNumber = parseInt(valorMaximo);
	//console.log(valorMaximo);
	//console.log(valorMaximoNumber);
	/**
	 * 
	 */
	
	/**
	 * 
	 */
	var valorMinimo=$('#valorMinimo').val();
	var valorMinimoNumber = parseInt(valorMinimo);
	//console.log(valorMinimo);
	
	
	
      var la = "";
     document.getElementById('cantidadTarjetasSolicitar').value = la;

    var data_json = JSON.parse(localStorage.getItem("data"));
    if(data_json == null)
    {
        //console.log("null: "+data_json);
    }else{
        //console.log("i",data_json);
        $("#cantidadTarjetasSolicitar").val(data_json.cantidadTarjetasSolicitar);
        $("#producto").val(data_json.producto);
        $("#descripcionOrden").val(data_json.descripcionOrden);
        $("#fechaSolicitud").val(data_json.fechaSolicitud);
         
      
    }

// ////////////////////////////////////////////////////////////////////

    var cantidad= document.querySelector("#cantidadTarjetasSolicitar");
    var prod = document.querySelector("#producto");

    var descripcion = document.querySelector("#descripcionOrden");
    var fecha =  document.querySelector("#fechaSolicitud");
    var numberOrder = document.querySelector("#lote");
    
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

////////////////////////////////////////Validar cantidad maxima y minima de tarjetas a solicitar//////////////////////////////////////////////

cantidad.addEventListener('blur', ()=>{
        var cant = document.querySelector("#cantidadTarjetasSolicitar").value;
        var cantNumber = parseInt(cant);
       // console.log("cantNumber"+cantNumber);
       // console.log(cant);
        if(cant == "")
        {   
        	swal("Espacio Obligatorio");
       
        }else if(cantNumber >= valorMaximoNumber+1){
     
        	swal("La cantidad maxima es"+" "+valorMaximoNumber);
        	 document.getElementById("cantidadTarjetasSolicitar").value = "";
        	 
        }else if(cantNumber <= valorMinimoNumber-1){
     
        	swal("La cantidad minima es"+" "+valorMinimoNumber);
        	 document.getElementById("cantidadTarjetasSolicitar").value = "";
        	 
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
        	
        	var productName= $(".product option:selected").text();
        	var userCreador =  $('#creador_Solicitud').val();
        	//alert(userCreador);
  var data = {
                    "cantidadTarjetasSolicitar": cantidad.value,
                    "producto": prod.value,
                    "descripcionOrden": descripcion.value,
                    "fechaSolicitud": fecha.value,
                    "ordenNumero": numberOrder.value,
                    "proName": productName,
                    "usuarioCreador": userCreador
                    
                
                };
  //console.log(data);
  //alert(data);

                localStorage.setItem("data", JSON.stringify(data));
                location.href="/CBPult/Gestion_Compras/generatedpurchaseorderconfirmacion/"+id;
        
        }

    });

    //////////////////////////////////////////////

    $("#cancelar").click(function(){
    	var url = window.location.pathname;
    	var id2 = url.substring(url.lastIndexOf('/') + 1);
    	 
   var status ="EN APROBACIÓN";
   console.log(status);
    	    
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
	    	//location.href = '/'+resp.mensaje;
	    	
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
		  url: "/CBPult/Gestion_Compras/listLastPurchaseOrderRequest",
		  success: function(data)
	    {
      
	    if(data != " ")
	          {
		 var fecha = data.fechaCarga;
         var quantity = data.quantity;
         var descriptionOrder = data.descriptionOrder;
         var numberOrder = data.numberOrder;
         var producto = data.productDTO;
         var productoId = producto.idProduct;
         var productoName= producto.productName;
         
        // console.log("producto",productoId);
        // console.log("producto",productoName);
      
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

//////////////////////////////////// Buscar por id para mostrar datos ///////////////////
function mostrarDatos() {
	var url = window.location.pathname;
	var id = url.substring(url.lastIndexOf('/') + 1);

	
	$.ajax({          
		     
			  type: "GET",
			  dataType: "json",
			  url: "/CBPult/Gestion_Compras/consultId/"+id,
			  success: function(data)
		    {
	   
	         
		    if(data != " "){
			          
	         var quantity = data.quantity;
	         var descriptionOrder = data.descriptionOrder;
	         var fechadesolicitud = data.fechaCarga;
	         var lote = data.numberOrder;
	         var creadorSolicitud= data.codeUserLouder;
	         var producto = data.productDTO;
	         var productoId = producto.idProduct;
	         var productoName= producto.productName;
	         
	         //console.log("producto",productoId);
	        // console.log("producto",productoName);
	         
	        document.getElementById('cantidadTarjetasSolicitar').value = quantity;
	        document.getElementById('descripcionOrden').value = descriptionOrder;
	        document.getElementById('fechaSolicitud').value = fechadesolicitud;
	        document.getElementById('lote').value = lote;
	        document.getElementById('creador_Solicitud').value = creadorSolicitud;
	        $("#producto").append('<option value=' + productoId + '>' + productoName+ '</option>');
	              
	                             
	        }else{
	            	
	        swal("Error en consulta");
	            }
		    }
	              },);  
	              
	} 