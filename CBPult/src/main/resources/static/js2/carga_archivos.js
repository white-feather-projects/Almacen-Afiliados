 'use strict'

///////////////////////////////////////

window.addEventListener('load', ()=>{
	
	document.getElementById("view_identificacion").disabled = true;
	document.getElementById("view_orden").disabled = true;
	document.getElementById("finalizar").disabled = true;
	
	$(".wrapper").hide();
	
/*
    if (window.FileReader && window.Blob) {
        // All the File APIs are supported.
        console.log("File and Blob Supported");
    } else {
        // File and Blob are not supported
        console.log("File and Blob Unsupported");
    }
*/
	
	
    ///////////////////////////////

    //Documento Identidad de documentos pdf asociado.....
        var data_json = JSON.parse(localStorage.getItem("data2"));
        var documentoidentidad = data_json.documento_identidad;
    	
        //////////////////////////////////
        
        var file1;
        var file2;
        
        var cont1=0;
        
        /////////////////////////////////
        
        $("#fileinput").change(function(){
        	
        	file1 = document.getElementById('fileinput').files[0];
        	
        	var sizeByte = this.files[0].size;
            var siezekiloByte = parseInt(sizeByte / 1024);
            var MegaByte = siezekiloByte / 1000;
        	
    		console.log(this.files.length);
    		console.log("getFile: "+file1.name);
    		console.log("tamaño: "+MegaByte);
    		
    		if(file1.type != 'application/pdf'){
    			document.getElementById('fileinput').value = "";
    			swal('Solo PDF');
    		}else if(MegaByte > 1.0){
    			document.getElementById('fileinput').value = "";
    			swal("Tamaño Maximo Superado");
    		}else if(file1.type == 'application/pdf'){
    			document.getElementById("view_identificacion").disabled = false;
    			document.getElementById("view_orden").disabled = false;
    			document.getElementById("finalizar").disabled = false;
    		}
    		
        });
        
        $("#fileinput2").change(function(){
        	
        	file2 = document.getElementById('fileinput2').files[0];
        	
        	var sizeByte = this.files[0].size;
            var siezekiloByte = parseInt(sizeByte / 1024);
            var MegaByte = siezekiloByte / 1000;
        	
    		console.log(this.files.length);
    		console.log("getFile: "+file2.name);
    		console.log("tamaño: "+MegaByte);
    		
    		if(file2.type != 'application/pdf'){
    			document.getElementById('fileinput2').value = "";
    			swal('Solo PDF');
    		}else if(MegaByte > 1.0){
    			document.getElementById('fileinput2').value = "";
    			swal("Tamaño Maximo Superado");
    		}else if(file2.type == 'application/pdf'){
    			document.getElementById("view_identificacion").disabled = false;
    			document.getElementById("view_orden").disabled = false;
    			document.getElementById("finalizar").disabled = false;
    		}
        });
        
    //////////////////////////////////////////////////
        
        
        ////////////////////////////////////////////7
        
        $('#finalizar').on('click', function(){
        	
        	console.log("boton presionado");
          	var documentocuenta = data_json.documento_identidad;
          	var oficina = '1';
          	var tipodocumento = '3';
          	console.log(documentocuenta);
          	console.log(oficina);
          	console.log(tipodocumento);
          	
          	var cuenta_json = {
          			'officeCode': oficina,
          			'accountType': tipodocumento,
          			'clientDocumentId': documentocuenta
          	}
          	
          	console.log("json: "+cuenta_json.officeCode+", "+cuenta_json.accountType+", "+cuenta_json.clientDocumentId);
          	$.ajax({
                  type: "POST",
                  url: '/createAccountClient',
                  contentType: "application/json",
                  dataType: "json",
                  data: JSON.stringify(cuenta_json),
                  success: processSuccess,
                  error: processError
              });
          	
          	function processSuccess(data, status, req) {
                  //alert(req.responseText + " " + status);
          		console.log(data);
          		
          		if(data.descripcion == "FAIL"){
          			swal("Error al crear cuenta");
          		}else if(data.descripcion == "OK"){
          			swal("Cuenta Creada");
          			
          		}
          		
              }  
          	
          	function processError(data, status, req) {
                //alert(req.responseText + " " + status);
              	swal("Error al contactar con el servicio");
              }  
        	
        	location.href = "/impresion_tarjetas";
        });
        
        //////////////////////////////////////////////////77
        
        $('#view_orden').on('click', function(){
        	
        	if(cont1 == 0){
        		
        		//event.preventDefault();
            	if(file1 != null && file2 != null){
            		
            		if(document.getElementById('fileinput').files[0].name == document.getElementById('fileinput2').files[0].name){
                		swal("Archivos Similares");
                		document.getElementById('fileinput').value = "";
                		document.getElementById('fileinput2').value = "";
                	}else{
                		/*
    						$( '#miform' )
    		            	.submit( function( e ) {
                		 */
    		            		//console.log(e);
    		                	//var formData = new FormData(this);
    	        	
    	        				var formData = new FormData($('#miform')[0]);
    		                	formData.append('documento', documentoidentidad);
    		                	console.log(formData);
    		                	
    		        	          $.ajax( {
    		        	            url: '/uploadDocuments',
    		        	            type: 'POST',
    		        	            data: formData,
    		        	            processData: false,
    		        	            contentType: false,
    		        	            dataType: 'text',
    		        	            success: success,
    		        	            error: processError
    		        	            
    		        	          });
    		        	          
    		        	          function success(data, status, req){
    		        	        	  console.log(data);
    		        	        	  var data_a = JSON.parse(data);
    		        	        	  
    		        	        	  document.getElementById("view_identificacion").disabled = false;
    		        	        	  document.getElementById("view_orden").disabled = false;
    		        	        	  
    		        	        	  if(data_a.descripcion == "FAIL"){
    		        	        		  swal("Error al subir archivos");
    		        	        	  }else if(data_a.descripcion == "OK"){
    		        	        		  swal("Archivos Cargados");
    		        	        		  cont1=cont1+1;
    		        	        		  //console.log("OK: "+data.descripcion);
    		        	        		  $.ajax({          
    		        	        		   	     
    		        	        	  		  type: "GET",
    		        	        	  		  dataType: "json",
    		        	        	  		  url: "/consultClient/"+documentoidentidad+"",
    		        	        	  		  success: function(data)
    		        	        	  	    {
    		        	        	       console.log(data);
    		        	        	       var uno = data.fileFinantial;
    		        	        	    	   
    		        	        	       console.log('boton1');
    		        	        	    	$(".wrapper").show();
    		        	        	    	document.getElementById("embed").src = '/viewPdf/'+uno+'';

    		        	        	                  
    		        	        	      }
    		        	        	          
    		        	        	   }); 
    		        	        		  
    		        	        	  }
    		        	          }
    		        	          
    		        	          function processError(data, status, req) {
    		        	                //alert(req.responseText + " " + status);
    		        	            	swal("Error al contactar con el servicio", status);

    		        	            }
    		        	          //e.preventDefault();
    		                  
    		    	          	////////////////////////////////////////////////////////////////////////////
    		    	          	/*
    		          });
    		          */
                	}
            	}else if(file1 == null && file2 == null){
            		
            		swal("Archivos Obligatorios");
            	}else if(file1 == null){
            		swal("Archivo 1 Obligatorio");
            	}else if(file2 == null){
            		swal("Archivo 2 Obligatorio");
            	}
            	
            	/////////////////////////////////////////////////////////////////
            	/////////////////////////////////////////////////////////////////
        	}else if(cont1 == 1){
	        		$.ajax({          
	       	   	     
	      	  		  type: "GET",
	      	  		  dataType: "json",
	      	  		  url: "/consultClient/"+documentoidentidad+"",
	      	  		  success: function(data)
	      	  	    {
	      	       console.log(data);
	      	       var uno = data.fileFinantial;
	      	    	   
	      	       console.log('boton1');
	      	    	$(".wrapper").show();
	      	    	document.getElementById("embed").src = '/viewPdf/'+uno+'';
	
	      	                  
	      	      }
	      	          
	      	   }); 
        	}
    	
    })
    /*
    $("#close").on('click', function(){
	    		$(".wrapper").hide();
	   })
	   */
    
    ////////////////////////////////////////////////////////////////////////////////////77
    
    	$('#view_identificacion').on('click', function(){
    		
    		if(cont1 == 0){
    			//event.preventDefault();
            	if(file1 != null && file2 != null){
            		
            		if(document.getElementById('fileinput').files[0].name == document.getElementById('fileinput2').files[0].name){
                		swal("Archivos Similares");
                		document.getElementById('fileinput').value = "";
                		document.getElementById('fileinput2').value = "";
                	}else{
                		/*
    						$( '#miform' )
    		            	.submit( function( e ) {
                		 */
    		            		//console.log(e);
    		                	//var formData = new FormData(this);
    	        	
    	        				var formData = new FormData($('#miform')[0]);
    		                	formData.append('documento', documentoidentidad);
    		                	console.log(formData);
    		                	
    		        	          $.ajax( {
    		        	            url: '/uploadDocuments',
    		        	            type: 'POST',
    		        	            data: formData,
    		        	            processData: false,
    		        	            contentType: false,
    		        	            dataType: 'text',
    		        	            success: success,
    		        	            error: processError
    		        	            
    		        	          });
    		        	          
    		        	          function success(data, status, req){
    		        	        	  console.log(data);
    		        	        	  var data_a = JSON.parse(data);
    		        	        	  
    		        	        	  document.getElementById("view_identificacion").disabled = false;
    		        	        	  document.getElementById("view_orden").disabled = false;
    		        	        	  
    		        	        	  if(data_a.descripcion == "FAIL"){
    		        	        		  swal("Error al subir archivos");
    		        	        	  }else if(data_a.descripcion == "OK"){
    		        	        		  swal("Archivos Cargados");
    		        	        		  cont1=cont1+1;
    		        	        		  //console.log("OK: "+data.descripcion);
    		        	        		  $.ajax({          
    		        	     		   	     
    		        	    		  		  type: "GET",
    		        	    		  		  dataType: "json",
    		        	    		  		  url: "/consultClient/"+documentoidentidad+"",
    		        	    		  		  success: function(data)
    		        	    		  	    {
    		        	    		       console.log(data);
    		        	    		       var dos = data.filePersonal;
    		        	    		    	   
    		        	    		       console.log('boton2');
    		        	    		    	$(".wrapper").show();
    		        	    		    	document.getElementById("embed").src = '/viewPdf/'+dos+'';
    		        	    		                  
    		        	    		      }
    		        	    		          
    		        	    		   }); 
    		        	        		  
    		        	        	  }
    		        	          }
    		        	          
    		        	          function processError(data, status, req) {
    		        	                //alert(req.responseText + " " + status);
    		        	            	swal("Error al contactar con el servicio", status);

    		        	            }
    		        	          //e.preventDefault();
    		                  
    		    	          	////////////////////////////////////////////////////////////////////////////
    		    	          	/*
    		          });
    		          */
                	}
            	}else if(file1 == null && file2 == null){
            		
            		swal("Archivos Obligatorios");
            	}else if(file1 == null){
            		swal("Archivo 1 Obligatorio");
            	}else if(file2 == null){
            		swal("Archivo 2 Obligatorio");
            	}
            	
            	/////////////////////////////////////////////////////////////////
            	/////////////////////////////////////////////////////////////////
    		}else if(cont1 == 1){
	    			$.ajax({          
	    		   	     
	  		  		  type: "GET",
	  		  		  dataType: "json",
	  		  		  url: "/consultClient/"+documentoidentidad+"",
	  		  		  success: function(data)
	  		  	    {
	  		       console.log(data);
	  		       var dos = data.filePersonal;
	  		    	   
	  		       console.log('boton2');
	  		    	$(".wrapper").show();
	  		    	document.getElementById("embed").src = '/viewPdf/'+dos+'';
	  		                  
	  		      }
	  		          
	  		   }); 
    		}
	    	
	    })
    	
    /////////////////////////////////////////////////
    //Atras.....

    $("#anterior").click(function(){
    	
        location.href = "/confirmacion";
    });

    /////////////////////////////////////////////////

    $("#cancelar").click(function(){
        localStorage.clear();
        location.href = "/bandeja_ventas";
    });
        
});