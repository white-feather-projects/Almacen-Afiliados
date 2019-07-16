    $('#demo').steps({/*
      onChange: function (currentIndex, newIndex, stepDirection) {
        console.log('onChange', currentIndex, newIndex, stepDirection);
        // tab1
        
   if (currentIndex === 3) {
          if (stepDirection === 'forward') {
            var valid = frmLogin.valid();
            return valid;
          }
          if (stepDirection === 'backward') {
            frmLoginValidator.resetForm();
          }
        } 
        

    // tab 1    
   if (currentIndex === 0) {
	
       if (stepDirection === 'forward') {
         var valid = cliente.valid();
         
       
         return valid;
       }
       if (stepDirection === 'backward') {
    	   clientValidator.resetForm();
       }
     } 
       
        

        // tab2
        if (currentIndex === 1) {
          if (stepDirection === 'forward') {
            var valid = frmInfo.valid();
            return valid;
          }
          if (stepDirection === 'backward') {
            frmInfoValidator.resetForm();
          }
        }
        
        
        if (currentIndex === 2) {
          if (stepDirection === 'forward') {
            var valid = frmInfo2.valid();
            return valid;
          }
          if (stepDirection === 'backward') {
            frmInfoValidator.resetForm();
          }
        }

        // tab3
        if (currentIndex === 4) {
          if (stepDirection === 'forward') {
            var valid = divFiles.valid();
            return valid;
          }
          if (stepDirection === 'backward') {
        	  divFilesValidator.resetForm();
          }
        }

        return true;

      },
      onFinish: function () {
        alert('Wizard Completed');
      }*/
    });
    
    ///////////////////////////////////////////////////////////////////////////
    
    
    
    
    /////////////////////////////////////////////////////////////////////////
  /////////////////////////validacion de pasos/////////////////////////////////
    /* file*/
    
  	$("#fileCedulaRepresentanteInformationName").change(function(){
  		if(this.files.length==1){
  			//$("#viwePDFnombre").prop('disabled', false);
  			//var formato=$(this).val().split('.');//validaciond del formato del file
  			if($(this).val().indexOf("pdf") > -1==true){			
  				if($('#fileCedulaRepresentanteInformationName')[0].files[0].size <=5000000){//validacion del tamaño
  			      $("#view_CedulaRepresentante").prop('disabled', false);
  				}else{
  					swal('El Archivo Seleccionado supera el tamaño permitido!!');
  					$("#view_CedulaRepresentante").prop('disabled', true);
  					$("#fileCedulaRepresentanteInformationName").val('');
  				}
  		
  			}else if($(this).val().indexOf("jpeg") > -1==true){
  				if($('#fileCedulaRepresentanteInformationName')[0].files[0].size <=5000000){//validacion del tamaño
    			      $("#view_CedulaRepresentante").prop('disabled', false);
    				}else{
    					swal('El Archivo Seleccionado supera el tamaño permitido!!');
    					$("#view_CedulaRepresentante").prop('disabled', true);
    					$("#fileCedulaRepresentanteInformationName").val('');
    				}
  				
  			}else{
  				swal('El Archivo Seleccionado no tiene formato PDF o JPEG!!');
  				$("#view_CedulaRepresentante").prop('disabled', true);
  				$("#fileCedulaRepresentanteInformationName").val('');
  			}
  		
  		}else{
  			swal('No Seleccionado ningun Archivo!!');
  		}
  	   
  	});
    
    $("#view_CedulaRepresentante").click(function() {
  	  getBase64($("#fileCedulaRepresentanteInformationName")[0].files[0], 'viweFiles');
    });
    
    /////////////////////////////////////////////////////////////////////////
    
  	$("#fileCedulaContactoInformationName").change(function(){
  		if(this.files.length==1){
  			//$("#viwePDFnombre").prop('disabled', false);
  			//var formato=$(this).val().split('.');//validaciond del formato del file
  			//alert($(this).val().indexOf("pdf") > -1);
  			if($(this).val().indexOf("pdf") > -1==true){
  				if($('#fileCedulaContactoInformationName')[0].files[0].size <=5000000){//validacion del tamaño
  				      $("#view_CedulaContacto").prop('disabled', false);
  					}else{
  						swal('El Archivo Seleccionado supera el tamaño permitido!!');
  						$("#view_CedulaContacto").prop('disabled', true);
  						$("#fileCedulaContactoInformationName").val('');
  					}
  		
  			}else if($(this).val().indexOf("jpeg") > -1==true){
  				if($('#fileCedulaContactoInformationName')[0].files[0].size <=5000000){//validacion del tamaño
				      $("#view_CedulaContacto").prop('disabled', false);
					}else{
						swal('El Archivo Seleccionado supera el tamaño permitido!!');
						$("#view_CedulaContacto").prop('disabled', true);
						$("#fileCedulaContactoInformationName").val('');
					}
  				
  			}else{
  				swal('El Archivo Seleccionado no tiene formato PDF o JPEG!!');
  				$("#view_CedulaContacto").prop('disabled', true);
  				$("#fileCedulaContactoInformationName").val('');
  			}
  		
  		}else{
  			swal('No Seleccionado ningun Archivo!!');
  		}
  	   
  	});
    
    $("#view_CedulaContacto").click(function() {
  	  getBase64($("#fileCedulaContactoInformationName")[0].files[0], 'viweFiles');
    });
    
    /////////////////////////////////////////////////////////////////////////////////
    
    $("#fileNegocioInformationName").change(function(){
  		if(this.files.length==1){
  			//$("#viwePDFnombre").prop('disabled', false);
  			//var formato=$(this).val().split('.');//validaciond del formato del file
  			//alert($(this).val().indexOf("pdf") > -1);
  			if($(this).val().indexOf("pdf") > -1==true){
  				if($('#fileNegocioInformationName')[0].files[0].size <=5000000){//validacion del tamaño
  				      $("#view_Negocio").prop('disabled', false);
  					}else{
  						swal('El Archivo Seleccionado supera el tamaño permitido!!');
  						$("#view_Negocio").prop('disabled', true);
  						$("#fileNegocioInformationName").val('');
  					}
  		
  			}else if($(this).val().indexOf("jpeg") > -1==true){
  				if($('#fileNegocioInformationName')[0].files[0].size <=5000000){//validacion del tamaño
				      $("#view_Negocio").prop('disabled', false);
					}else{
						swal('El Archivo Seleccionado supera el tamaño permitido!!');
						$("#view_Negocio").prop('disabled', true);
						$("#fileNogocioInformationName").val('');
					}
  				
  			}else{
  				swal('El Archivo Seleccionado no tiene formato PDF o JPEG!!');
  				$("#view_Negocio").prop('disabled', true);
  				$("#fileNegocioInformationName").val('');
  			}
  		
  		}else{
  			swal('No Seleccionado ningun Archivo!!');
  		}
  	   
  	});
    
    $("#view_Negocio").click(function() {
  	  getBase64($("#fileNegocioInformationName")[0].files[0], 'viweFiles');
    });
    
    /////////////////////////////////////////////////////////////////////////////////

    function getBase64(file, field) {
  	   var reader = new FileReader();
  	   reader.readAsDataURL(file);
  	   reader.onload = function () {
  	     $('#'+field).attr('src', reader.result);
  	   };
  	   reader.onerror = function (error) {
  		   swal('El Archivo PDF Defetuoso revise por favor!!');
  	   };
  	}
    /**/