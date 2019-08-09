$(document).ready(function(){
	var dd;
	var mm;
	var aaaa;
	var i=0;
	var length;
	var tecla;	
	if ($('#example-datetime-local-input').val().length==10){
		var valor = $("#example-datetime-local-input").val();
		dd=valor.substring(0,2);
		mm=valor.substring(3,5);
		aaaa=valor.substring(6,10);
		
	}

	$('#example-datetime-local-input').keypress(function(tecla){//Bloqueo de teclas
		//console.log("tecla: ",tecla.charCode);
		var valor = $("#example-datetime-local-input").val();
		if (valor.length==0 || valor.length==1 || valor.length==3 || valor.length==4 || valor.length>=7){
			if((tecla.charCode != 48) && (tecla.charCode != 49) && 
					   (tecla.charCode != 50) && (tecla.charCode != 51) && 
					   (tecla.charCode != 52) && (tecla.charCode != 53) && 
					   (tecla.charCode != 54) && (tecla.charCode != 55) && 
					   (tecla.charCode != 56) && (tecla.charCode != 57) && 
					   (tecla.charCode != 45)){
						return false;
					}	
		}else if(valor.length==2 || (valor.length==5)){
			if (dd<=3){
				if((tecla.charCode != 48) && (tecla.charCode != 49) && 
						   (tecla.charCode != 50) && (tecla.charCode != 51) && 
						   (tecla.charCode != 52) && (tecla.charCode != 53) && 
						   (tecla.charCode != 54) && (tecla.charCode != 55) && 
						   (tecla.charCode != 56) && (tecla.charCode != 57) && 
						   (tecla.keyCode != 8)  && (tecla.charCode != 45) && 
						   (tecla.keyCode != 47)){
							return false;
						}
			}
		}
	});
	
	   $(function() {
			$("#example-datetime-local-input" ).datepicker({
				inline: true,
				closeText: 'Cerrar',
		        prevText: '<Ant',
		        nextText: 'Sig>',
		        currentText: 'Hoy',
		        monthNames: ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'],
		        monthNamesShort: ['Ene', 'Feb', 'Mar', 'Abr', 'May', 'Jun', 'Jul', 'Ago', 'Sep', 'Oct', 'Nov', 'Dic'],
		        dayNames: ['Domingo', 'Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado'],
		        dayNamesShort: ['Dom', 'Lun', 'Mar', 'Mié', 'Juv', 'Vie', 'Sáb'],
		        dayNamesMin: ['Do', 'Lu', 'Ma', 'Mi', 'Ju', 'Vi', 'Sá'],
		        weekHeader: 'Sm',
				dateFormat : 'dd/mm/yy',
				changeMonth : true,
				changeYear : true,
				yearRange: "-100:NOW",
			    minDate: "NOW, -1200M",
				maxDate: "now, -252M ",
				language: 'es'
				
			});
			
		});
	
	/// Validar fecha introducida desde el input/////////////////////
	  $("#example-datetime-local-input").blur(function(){
		  if ($('#example-datetime-local-input').val().length==10){
				var valor = $("#example-datetime-local-input").val();
				dd=valor.substring(0,2);
				mm=valor.substring(3,5);
				aaaa=valor.substring(6,10);
				var validarEdad= aaaa+"-"+mm+"-"+dd;
				console.log(aaaa+"-"+mm+"-"+dd);
				console.log("validar",validarEdad);
				var years = moment().diff(validarEdad, 'years');
			    if(years >= 21){
				//alert(years);
			    }else{
			   document.getElementById('example-datetime-local-input').value = " ";
			   swal("No tiene la edad suficiente para solicitar una tarjeta de credito!");
			    }
			}
		  });
	
	
	$('#example-datetime-local-input').keyup(function () { 
		var valor = $("#example-datetime-local-input").val();
		//console.log("Long: ",valor.length);
		if (valor.length==1){
			if (valor>=4){
				dd = "0" + valor;
				$("#example-datetime-local-input").val(dd + "/");
				//console.log("Fecha: ", dd + "/" + mm + "/");
			}
		}else if (valor.length==2){
			if (valor<9){
				if (valor.length==1){}
				dd = valor;
				$("#example-datetime-local-input").val(valor + "/");
				//console.log("Fecha: ", dd + "/" + mm + "/");
			}else if(valor<=31){
				dd = valor;
				$("#example-datetime-local-input").val(valor + "/");
				//console.log("Fecha: ", dd + "/" + mm + "/");
			}else if(valor>31){
				dd = "";
				$("#example-datetime-local-input").val("");
			}
		}else if (valor.length==4){
			valor = valor.substring(3,valor.length);
			//console.log("Case 4: ",valor);
			if (valor>=2){
				//console.log("valor>=2: ", valor);
				mm = "0" + valor;				
				//console.log("Fecha: ", dd + "/" + mm + "/");
				$("#example-datetime-local-input").val(dd + "/" + mm + "/");
			}
			
		}else if (valor.length==5){
			valor = valor.substring(3,valor.length);
			//console.log("Case 5: ",valor);
			if (valor > 0 && valor<=12){
				mm = valor;
				$("#example-datetime-local-input").val(dd + "/" + mm + "/");
				//console.log("Fecha: ", dd + "/" + mm + "/");
			}else{
				$("#example-datetime-local-input").val(dd + "/" + valor.substring(0,1));
			}
		}else if (valor.length==10){
			//console.log("Case 10: ",valor);
			var date = new Date();
			//console.log("Date: ",date.getFullYear());
			date = date.getFullYear();
			var a = 0;
			a = date - 15;
			//console.log("A: ", a);
			valor = valor.substring(6,valor.length);
			//console.log("Val: ", valor);
			if ((a) > valor){
				aaaa = valor;
				$("#example-datetime-local-input").val(dd + "/" + mm + "/" + aaaa);
				//console.log("Fecha: ", dd + "/" + mm + "/");
			}
			//console.log("Fecha: ",$("#birthdayStr").val());
		}
	});
	
	if ($('#example-datetime-local-input').val().length==10){
		document.getElementById("example-datetime-local-input").maxLength = 10;
		var valor = $("#example-datetime-local-input").val();
		dd=valor.substring(0,2);
		mm=valor.substring(3,5);
		aaaa=valor.substring(6,10);
	}
	

	


	$('#example-datetime-local-input').keypress(function(tecla){//Bloqueo de teclas
		//console.log("tecla: ",tecla.charCode);
		var valor = $("#example-datetime-local-input").val();
		if (valor.length==0 || valor.length==1 || valor.length==3 || valor.length==4 || valor.length>=7){
			if((tecla.charCode != 48) && (tecla.charCode != 49) && 
					   (tecla.charCode != 50) && (tecla.charCode != 51) && 
					   (tecla.charCode != 52) && (tecla.charCode != 53) && 
					   (tecla.charCode != 54) && (tecla.charCode != 55) && 
					   (tecla.charCode != 56) && (tecla.charCode != 57) && 
					   (tecla.charCode != 45)){
						return false;
					}	
		}else if(valor.length==2 || (valor.length==5)){
			if (dd<=3){
				if((tecla.charCode != 48) && (tecla.charCode != 49) && 
						   (tecla.charCode != 50) && (tecla.charCode != 51) && 
						   (tecla.charCode != 52) && (tecla.charCode != 53) && 
						   (tecla.charCode != 54) && (tecla.charCode != 55) && 
						   (tecla.charCode != 56) && (tecla.charCode != 57) && 
						   (tecla.keyCode != 8)  && (tecla.charCode != 45) && 
						   (tecla.keyCode != 47)){
							return false;
						}
			}
		}
	});
	
	
	

});