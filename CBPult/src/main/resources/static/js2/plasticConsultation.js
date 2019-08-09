
 $(document).ready(function() {


$("#enviar").click(function(){
	
   listarPlasticos();
   $(".vmodal").toggle(1000);
   });
   });
 
 
 
	function listarPlasticos(){
		
		var lote =  $('#lote').val();
      
	
	    $('#listPlastic').DataTable( {
	    
	    	sort:true,
	    	destroy: true,
	    	searching: true,
	      	
	    	language: {
	    		url: '/js2/Spanish.json'
	        },
	        ajax: {
	        	url:"/CBPult/Gestion_Compras/listPlastic/"+lote,
	            dataSrc: '',
	        	
	        },
	      
	        columns: [ 
	      
	        	   {
		                "data": "plasticNumber", // can be null or undefined
		                "class": "uno",
		                "defaultContent": "",
		                "render": function ( data ) {
		            		return '<center>'+data+'</center>';
		              	}
		            },
	            {
	                "data": "plasticExpDate", // can be null or undefined
	                "class": "uno",
	                "defaultContent": "",
	                "render": function ( data ) {
	            		return '<center>'+data+'</center>';
	              	}
	            },
	            {
	                "data": "plasticCvv", // can be null or undefined
	                "class": "uno",
	                "defaultContent": "",
	                "render": function ( data ) {
	            		return '<center>'+data+'</center>';
	              	}
	            },
	        ]
	        
	    } );

	}
