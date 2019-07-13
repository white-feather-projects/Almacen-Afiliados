$(document).ready(function() {
	listarPurchseOrder();
	
var user=$('#username').val();
console.log(user);

	
	if(user=='esteban'|| user=='victor' ){
		$('.generar').show();
	}else{
		
		$('.generar').hide();
	}
	

	
});

function listarPurchseOrder(){
    $('#listPurchaseOrder').DataTable( {
    
    	sort:true,
    	destroy: true,
    	 
        
          
    	
    	language: {
    		url: '/js2/Spanish.json'
        },
        ajax: {
              url: "/listPurchaseOrderRequest",
            dataSrc: '',
        	
        },
      
        columns: [ 
      
        	{
                "data": "numberOrder", // can be null or undefined
                "class": "cero",
                "render": function ( data ) {
                	
            	//	return '<center>'+ data +'</center>';
            		
            		if (data == null) {
                   
            			return '<center>'+ "No generada" +'</center>';                 
                      }else{
                    	return '<center ><a href="/verDetalleCompra/'+data+'">'+data+'</a></center><input type="hidden" id="status" value="'+data+'">'
                    	 // return '<center>'+ data +'</center>';
                      }
              	}	
            },
            {
                "data": "fechaCarga", // can be null or undefined
                "class": "uno",
                "defaultContent": "",
                "render": function ( data ) {
            		return '<center>'+data+'</center>';
              	}
            },
            {
                "data": "statusOrder", // can be null or undefined
                "class": "dos",
                "defaultContent": "",
                "render": function (data, type, full) {
  
                	if (data=='Cancelada'){
                	
                
                		return '<center >'+data+'</center><input type="hidden" id="status" value="'+data+'">';
                	}else if(data=='aprobada'){
                		return '<center ><a >'+data+'</a></center><input type="hidden" id="status" value="'+data+'">'
                		//return '<center ><a href="/viewOrder/'+full.idOrderRequest+'">'+data+'</a></center><input type="hidden" id="status" value="'+data+'">'
                	}else{
                
                		return '<center >'+data+'</center><input type="hidden" id="status" value="'+data+'">';
                	}
                	
               
            		//return '<center >'+data+'</center><input type="hidden" id="status" value="'+data+'">';
              	}
            },          
             {
                "data": "quantity", // can be null or undefined
                "class": "dos",
                "defaultContent": "",
                "render": function ( data ) {
            		return '<center>'+data+'</center>';
              	}
            },
            {
                "data": "descriptionOrder", // can be null or undefined
                "class": "dos",
                "defaultContent": "",
                "render": function ( data ) {
            		return '<center>'+data+'</center>';
              	}
            },
            {
                "data": "idOrderRequest",
                "class": "ver",
                "defaultContent": "",
                "render": function ( data, type, full, meta ) {
                	
                	
                		return '<center><a title="Ver" id="ver" href="/verpurchaseorder/'+data+'"><i class="fa fa-search" style="font-size:30px" aria-hidden="true"></i></a></center>';
                		//return '<center><a class="ui blue button" href="/4track/api/devices?id=">Ver</a></center>';
                }
            },
            
            {
                "data": "idOrderRequest",
                "class": "editar",
                "defaultContent": "",
                "render": function (data, type, full, meta) {
                	if (full.statusOrder == "aprobada") {
                  // console.log(data);
                  // console.log(full.statusOrder);
                		return '<center><i class="fa fa-check" agregaryasignar" title="Solicitud aprobada" style="font-size:30px"></i></center>';                  
                }else{
                	return '<center><a href="/editpurchaceorder/'+data+'" title="Editar solicitud de orden de compra"><input type="hidden" id="edit" value="'+data+'"><i class="fa fa-edit" agregaryasignar" style="font-size:30px"></i></a></center>';
                }
                }
            
            },
            {
                "data": "idOrderRequest",
                "class": "cancelar",
                "defaultContent": "",
                "render": function (data) {
                	
               
                     return '<center><a title="Cancelar solicitud de orden de compra"><input type="hidden" id="cancelPurchace" value="'+data+'"><i class="fa fa-trash id="cancelar" " agregaryasignar" style="font-size:30px"></i></a></center>';                      
                }
            },
            {
                "data": "idOrderRequest",
                "class": "generar",
                "defaultContent": "",
                "render": function (data, type, full, meta) {
              
                	var user=$('#username').val();
                	
                	if(full.statusOrder == "aprobada" && user != 'ROLE_USER'){
                	
                		return '<center><i class="fa fa-check" agregaryasignar" title="Solicitud aprobada" style="font-size:30px"></i></center>';                               
                	}else if(user == 'ROLE_USER'){
                		
                		 return '<center><a href="/generatedpurchaseorder/'+data+'" title="Generar orden de compra"></a></center>';   
                	}else{
                		
                		 return '<center><a href="/generatedpurchaseorder/'+data+'" title="Generar orden de compra"><i class="fa fa-file generar" style="font-size:30px"></i></a></center>';   
                	}                 
                }
            }
        ]
        
    } );

}

$(document).on('click','.cancelar',function(e){
	var id= $(this).find('input').val();
	
	

	 
var status ="Cancelada";

	    
var datos = {
		"idRequest": id,
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
    	    title: 'Seguro de cancelar solicitud de orden de compra?',
    	    text: 'Redirigiendo...',
    	    icon: 'Exitoso',
    	    buttons: true,
    	},
    	function() {
    		
    	    location.href = "/listpurchaseorder";
 
    	}) 

   
	/*    if(true){
	    	 swal("Generacion de orden de compra exitosa");
	            location.href = "/listPurchaseOrder";   
	    }else{
	    	console.log("error");
	    }
	    */
    },
    error: function(e)
	{
		console.log("errro:"+e);
	}
		}); 
})

//////////////////////////////////////////////





