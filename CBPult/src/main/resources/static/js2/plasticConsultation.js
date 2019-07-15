

$(document).ready(function() {
	
	
	
	listarPlasticos();

		
	});




	function listarPlasticos(){
		
		
		var url = window.location.pathname;
		var id = url.substring(url.lastIndexOf('/') + 1);
		
	
	    $('#listPlastic').DataTable( {
	    
	    	sort:true,
	    	destroy: true,
	    	 
	        
	          
	    	
	    	language: {
	    		url: '/js2/Spanish.json'
	        },
	        ajax: {
	        	url:"/listPlastic/"+id,
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
