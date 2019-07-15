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