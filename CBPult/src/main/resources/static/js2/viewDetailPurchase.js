'use strict'

window.addEventListener('load', ()=>{
	$('#enviar').hide();

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
	         var producto = data.productDTO;
	         var productoId = producto.idProduct;
	         var productoName= producto.productName;
	         //console.log("status"+status);
	         
	         document.getElementById('lote').value = NumberOrder;
	         document.getElementById('cantidadTarjetasSolicitar').value = quantity;
	         document.getElementById('descripcionOrden').value = descripcion;
	         document.getElementById('status').value = Orderstatus;
	         document.getElementById('fecha').value = fechadeaprovacion;
	         $("#producto").append('<option value=' + productoId + '>' + productoName+ '</option>');
	       
	         

	 		$.ajax({          
	 			     
	 				  type: "GET",
	 				  dataType: "json",
	 				  url:"/listPlastic/"+NumberOrder,
	 			
	 				  success: function(data)
	 			    {
	 		        	 		         
	 		          if(data != ""){
	 		        	 $('#enviar').show();
	 		          //$('#lista').show();
	 		        // $('.generada').show();
	 		        	 $('#lista').show();
	 		        	
	 		          }else{

	 		         // $('#listaVacia').show();
	 		        // $('.por_generar').show();
	 		        	
	 		        	$("#statusCheck").removeClass("border-checkbox-group border-checkbox-group-success");
	 		        	$("#statusCheck").addClass("border-checkbox-group border-checkbox-group-danger");
	 		        	$('#checkbox2').filter(':checkbox').prop('checked',false);
	 		        	$('#lista').show();
	 		          }
	 		              
	 		                             
	 		            }
	 		            
	 		   },);  
	              
	          }
	            
	              },);  
	              
	} 





	
