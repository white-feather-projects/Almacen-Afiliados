'use strict'

window.addEventListener('load', ()=>{
 

    $("#cancelar").click(function(){
        localStorage.clear();
        location.href = "/listpurchaseorder";
    });

});

///////////////////////////////////////////////////////////////

$(document).ready(function() {	
	mostrarDatos();
});

///////////////////////////////////////////////////////////////

function mostrarDatos() {
	var url = window.location.pathname;
	var id = url.substring(url.lastIndexOf('/') + 1);

	
	$.ajax({          
		     
			  type: "GET",
			  dataType: "json",
			  url: "/consultNumberOrder/"+id,
			  success: function(data)
		    {
	          console.log(data);
	         
	         console.log(data.quantity);
	         var quantity = data.quantity;
	         var descriptionOrder = data.descriptionOrder;
	         var status = data.statusOrder;
	         var Orderstatus = data.orderStatus;
	         var NumberOrder = data.purchaseOrderNumber;
	         var descripcion = data.orderCommetns;
	         var fechadeaprovacion = data.purchaseOrderAprovedDate;
	         //console.log("status"+status);
	         
	         document.getElementById('lote').value = NumberOrder;
	        document.getElementById('cantidadTarjetasSolicitar').value = quantity;
	           document.getElementById('descripcionOrden').value = descripcion;
	           document.getElementById('status').value = Orderstatus;
	           document.getElementById('fecha').value = fechadeaprovacion;
	          
	          console.log(data);
	              
	                             
	            }
	            
	              },);  
	              
	} 