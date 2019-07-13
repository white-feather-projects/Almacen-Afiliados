'use strict'

window.addEventListener('load', ()=>{
	
	/**
	 * Obtener valor maximo para solicitar tarjetas
	 */
	var valorMaximo=$('#valorMaximo').val();
	var valorMaximoNumber = parseInt(valorMaximo);
	console.log(valorMaximo);
	console.log(valorMaximoNumber);
	/**
	 * 
	 */
	
	/**
	 * 
	 */
	var valorMinimo=$('#valorMinimo').val();
	var valorMinimoNumber = parseInt(valorMinimo);
	console.log(valorMinimo);
	console.log(valorMinimoNumber);
	/**
	 * 
	 */
	
	
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
   
////////////////////////////////////////Validar campos//////////////////////////////////////////////

cantidad.addEventListener('blur', ()=>{
        var cant = document.querySelector("#cantidadTarjetasSolicitar").value;
        var cantNumber = parseInt(cant);
        console.log("cantNumber"+cantNumber);
        console.log(cant);
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

    
////////////////////////////Enviar a pantalla de confirmacion//////////////////////////////////////////

    $('#siguiente').click(function(){

        if(cantidad.value.length == 0 || prod.value.length == 0 || descripcion.value.length == 0){
        	swal("Datos Obligatorios Vacios");
        }else{
          
           var data = {
           "cantidadTarjetasSolicitar": cantidad.value,
           "producto": prod.value,
           "descripcionOrden": descripcion.value,
                
             };

            localStorage.setItem("data", JSON.stringify(data));
            location.href="/corfirmationcreatepurchaseorder";
        
        }

    });
    

    ///////////////////////////////Volver a lista de solicitud de orden de compra////////////////////////////
    

    $("#cancelar").click(function(){
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
        document.getElementById('lote').value = loteSiguiente;
        document.getElementById('fecha').value = fecha;
        console.log(data);
                
                             
            }
            
      },);  
              
}   