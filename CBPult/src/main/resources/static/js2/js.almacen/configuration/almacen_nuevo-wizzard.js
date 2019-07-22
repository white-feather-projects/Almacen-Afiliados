$('#demo').steps({

	onChange: function (currentIndex, newIndex, stepDirection) {
		/*
		// tab Almacen
		if(currentIndex === 0){
			
			if(stepDirection === 'forward'){
				
				var validated = 0;			
				// Inputs del tab
				var txtDescAlmacen = $('#txtDesc_almacen');
				var txtUbicacionAlmacen = $('#txtUbicacion_almacen');
				
				// Validaciones del tab
				if(txtDescAlmacen.val().length >= 1){
					txtDescAlmacen.css("border" , "1px solid #20c997");
					validated++;
				}else{
					txtDescAlmacen.css("border" , "1px solid red");
				}				
				txtDescAlmacen.blur(function(){
					if(txtDescAlmacen.val().length >= 1){
						txtDescAlmacen.css("border" , "1px solid #20c997");
						validated++;
					}else{
						txtDescAlmacen.css("border" , "1px solid red");
					}
				});
				
				///
				if(txtUbicacionAlmacen.val().length >= 1){
					txtUbicacionAlmacen.css("border" , "1px solid #20c997");
					validated++;
				}else{
					txtUbicacionAlmacen.css("border" , "1px solid red");
				}
				txtUbicacionAlmacen.blur(function(){
					if(txtUbicacionAlmacen.val().length >= 1){
						txtUbicacionAlmacen.css("border" , "1px solid #20c997");
						validated++;
					}else{
						txtUbicacionAlmacen.css("border" , "1px solid red");
					}
				});				
						
				if(validated == 2){
					alert("Valido");
				}else if(validated != 2){
					alert("invalido");
					return false;
				}				
				
			}
			
			if(stepDirection === 'backward'){
				alert("atras");				
			}
		}
		// tab Almacen
		
		// tab Zonas
		if(currentIndex === 1){
			alert("Zonas");
			if(stepDirection === 'forward'){
				alert("Hola");
			}
			if(stepDirection === 'backward'){
				alert("atras");
				
			}
		}
		*/
		
    	
		return true;        
	},
	onFinish: function () {
		alert('Wizard Completed');
	}

});