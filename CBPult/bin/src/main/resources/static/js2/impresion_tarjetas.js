'use strict'

window.addEventListener('load', function(){
	document.getElementById("imprimirButton").disabled = true;

	var documento_identidad=$('#documentId').val();
	//var data_json = JSON.parse(localStorage.getItem("data2"));
   // var documento_identidad = data_json.documento_identidad;
    console.log(documento_identidad);
    
    ///////////////////////////////////////////////////////////////
   //$('#dataCvv').html('555');
   //$('#numeroUltimos').html('5555');
 //$('#dateExperition').html('14/05');
  //$('#dateEmison').html('14/05');
    var accountIban;
	var accountNumber;
	var accountStatus;
	var clientDTO_clientFirstName;
	var clientDTO_clientLastName;
	var clientDTO_clientSurname;
	var idclient;
	var surname;
	
    $.getJSON( "/CBPult/Solicitudes/consultAccountByClientWS/"+documento_identidad+"")
	  .done(function( json ) {
		  console.log(json);                
		  console.log(json.idDocument);
		  accountIban = json.iban;
		  accountNumber = json.account;
		 // accountStatus = json.accountStatus;
		  clientDTO_clientFirstName = json.firtName.toUpperCase();
		  clientDTO_clientLastName = json.lastName;
		  clientDTO_clientSurname = json.lastSurname.toUpperCase();
		  idclient = json.idClient;
		
		  if(clientDTO_clientSurname.indexOf("-") > -1==true){
			  surname = clientDTO_clientSurname.split("-");
			 
		  }else{
			  surname = clientDTO_clientSurname.split(" ");
		  }
		 
		  //console.log(surname[0]);
		  console.log(idclient);
		  
	    //console.log( "JSON Data: " + json.clientDTO.clientSurname );
	    //console.log(json.length);
		 document.getElementById('textodos_unoPrinted').innerHTML = clientDTO_clientFirstName+" "+surname[0] + " "+surname[1].charAt(0);
		 document.getElementById('textodos_uno').innerHTML = clientDTO_clientFirstName+" "+surname[0] + " "+surname[1].charAt(0);
		 document.getElementById('textotres').innerHTML = accountIban;
		 document.getElementById('textotresPrinted').innerHTML = accountIban;
	    
	  })
	  .fail(function( jqxhr, textStatus, error ) {
	    var err = textStatus + ", " + error;
	    //console.log( "Request Failed: " + err );
	    swal("Error al Cargar Datos Basicos Tarjeta, Error: "+err);
	});
	
	
	///////////////////////////////////////////////////////

    $('#input2').on('keyup', function(){
        if($('#input2').val().length == 4){
            $('#input3').focus();
        }
    });

    $('#input3').on('keyup', function(){
        if($('#input3').val().length == 4){
            $('#input4').focus();
        }
    });

    //////////////////////////////////////////////
    
    var input3_1;
    var input4_1;

 //   $('#input1').blur(function(){
    var texto = $('#input1').val();
    $('#textouno_do').html(texto);
    $('#textouno_doPrinted').html(texto);

    var texto = $('#input2').val();
    $('#textouno_dos').html(texto);
    $('#textouno_dosPrinted').html(texto);
 //   })

    $('#input3').keyup(function(){
        var texto = $(this).val();
        $('#textouno_tres').html(texto);
        $('#textouno_tresPrinted').html(texto);
        input3_1 = texto;
    })

    $('#input4').keyup(function(){
        var texto = $(this).val();
        $('#textouno_cuatro').html(texto);
        $('#textouno_cuatroPrinted').html(texto);
        input4_1 = texto;
    })

    //////////////////////////////////////

    var input1 = document.querySelector('#input1');
    var input2 = document.querySelector('#input2');
    var input3 = document.querySelector('#input3');
    var input4 = document.querySelector('#input4');
    
    var numerotarjeta1 = input1.value+input2.value;
    var numerotarjeta2 = input3.value;

    input3.addEventListener('keyup', ()=>{
        soloNumeros(input3);
    });

    input4.addEventListener('keyup', ()=>{
    	soloNumeros(input4);
    });
    
    ////////////////////////////////////////
    
    $('#input4').blur(function(){
    	
    	var numerotarjeta = input1.value+input2.value+input3_1+input4_1;
    	
    	$.getJSON("/CBPult/Solicitudes/consultPlasticByNumber/"+numerotarjeta+"")
  	  .done(function( json ) {
  		  idPlastic = json.idPlastic;
  		  plasticAsigned = json.plasticAsigned;
  		  plasticCvv = json.plasticCvv;
  		  plasticDateIssue = json.plasticDateIssue;
  		  plasticExpDate = json.plasticExpDate;
  		  plasticNumber = json.plasticNumber;
  		  plasticStatus = json.plasticStatus;
  	    
  		 
  		  //console.log('Json: '+json.idPlastic+", "+json.plasticAsigned+", "+json.plasticCvv+", "+json.plasticDateIssue+", "+json.plasticExpDate+", "+json.plasticNumber+", "+json.plasticStatus);
  		  if(json.idPlastic == null){
  			  swal("Tarjeta no Encontrada");
  			  document.getElementById("imprimirButton").disabled = true;
  		  }else
  			  {
  			  	if(json.plasticAsigned == 0){
  			  		 			  		
  			  		//$('#textouno_uno').html(plasticExpDate);
  			  		//$('#textouno_uno_a').html(input4_1);
  			  		$('#dateEmison').html(''+plasticDateIssue+'');
  			  		$('#dateExperition').html(''+plasticExpDate+'');
  			  	    $('#dataCvv').html(''+json.plasticCvv+'');
  			  	    $('#numeroUltimos').html(''+$('#input4').val()+'');
  			  	    
  			  	    $('#dateEmisonPrinted').html(''+plasticDateIssue+'');
			  		$('#dateExperitionPrinted').html(''+plasticExpDate+'');
			  	    $('#dataCvvPrinted').html(''+json.plasticCvv+'');
			  	    $('#numeroUltimosPrinted').html(''+$('#input4').val()+'');
  			  	  
  			  		document.getElementById("imprimirButton").disabled = false;
  			  		///////////////////////////////////////////
  			  	    swal("Tarjeta disponible");
		  			  //	console.log('idClient: '+idclient+', clientFirstName: '+clientDTO_clientFirstName+', clientLastName: '+clientDTO_clientLastName+', clientSurname: '+clientDTO_clientSurname);
		  	        //	console.log('idPlastic: '+idPlastic+', plasticAsigned: '+plasticAsigned+', plasticCvv: '+plasticCvv+', plasticDateIssue: '+plasticDateIssue+', plasticExpDate: '+plasticExpDate+', plasticNumber: '+plasticNumber+', plasticStatus: '+plasticStatus);
  			  		
  			  	}else
  			  		{
  			  			stattarjet = 1;
  			  			swal("Tarjeta en uso");
  			  			document.getElementById("imprimirButton").disabled = true;
  			  		$('#dateEmison').html('');
  			  		$('#dateExperition').html('');
  			  	    $('#dataCvv').html('');
  			  	    $('#numeroUltimos').html('');
  			     	$('#dateEmisonPrinted').html('');
			  		$('#dateExperitionPrinted').html('');
			  	    $('#dataCvvPrinted').html('');
			  	    $('#numeroUltimosPrinted').html('');
  			  	  
  			  		}
  			  }
  	  })
  	  .fail(function( jqxhr, textStatus, error ) {
  	    var err = textStatus + ", " + error;
  	    //console.log( "Request Failed: " + err );
  	    swal("Error al conectar con el servicio, Error: "+err);
  	  });
    })
    
    ////////////////////////////////////////
    var stattarjet = 0;
    
    var idPlastic = "";
	var plasticAsigned = "";
	var plasticCvv = "";
	var plasticDateIssue = "";
	var plasticExpDate = "";
	var plasticNumber = "";
	var plasticStatus = "";
    
    ////////////////////////////////////////
    
    $("#atrasButton").click(function(){
    	localStorage.clear();
        location.href = "/CBPult/Solicitudes/bandeja_ventas";
    });
    
    ////////////////////////////////////////
  /*  
    $("#imprimirButton").click(function(){
    	
    	var numerotarjeta = input1.value+input2.value+input3_1+input4_1;
    	
    	$.getJSON("/consultPlasticByNumber/"+numerotarjeta+"")
  	  .done(function( json ) {
  		  idPlastic = json.idPlastic;
  		  plasticAsigned = json.plasticAsigned;
  		  plasticCvv = json.plasticCvv;
  		  plasticDateIssue = json.plasticDateIssue;
  		  plasticExpDate = json.plasticExpDate;
  		  plasticNumber = json.plasticNumber;
  		  plasticStatus = json.plasticStatus;
  	    
  		  //console.log('Json: '+json.idPlastic+", "+json.plasticAsigned+", "+json.plasticCvv+", "+json.plasticDateIssue+", "+json.plasticExpDate+", "+json.plasticNumber+", "+json.plasticStatus);
  		  if(json.idPlastic == null){
  			  swal("Tarjeta no Encontrada");
  		  }else
  			  {
  			  	if(json.plasticAsigned == 0){
  			  		swal("Tarjeta disponible");
  			  		$('#textouno_uno').html(plasticExpDate);
  			  		$('#textouno_uno_a').html(input4_1);
  			  		$('#textouno_dos_a').html(plasticCvv);
  			  		///////////////////////////////////////////
  			  		
		  			  	console.log('idClient: '+idclient+', clientFirstName: '+clientDTO_clientFirstName+', clientLastName: '+clientDTO_clientLastName+', clientSurname: '+clientDTO_clientSurname);
		  	        	console.log('idPlastic: '+idPlastic+', plasticAsigned: '+plasticAsigned+', plasticCvv: '+plasticCvv+', plasticDateIssue: '+plasticDateIssue+', plasticExpDate: '+plasticExpDate+', plasticNumber: '+plasticNumber+', plasticStatus: '+plasticStatus);
		  	        	
		  	        	var data_json = {
		  	        			'clientDTO': {
		  	        				'idClient': idclient,
		  	        				'clientFirstName': clientDTO_clientFirstName,
		  	        				'clientLastName': clientDTO_clientLastName,
		  	        				'clientSurname': clientDTO_clientSurname
		  	        			},
		  	        			'plasticDTO': {
		  	        				'idPlastic': idPlastic,
		  	        				'plasticAsigned': plasticAsigned,
		  	        				'plasticCvv': plasticCvv,
		  	        				'plasticDateIssue': plasticDateIssue,
		  	        				'plasticExpDate': plasticExpDate,
		  	        				'plasticNumber': plasticNumber,
		  	        				'plasticStatus': '1'
		  	        			}
		  	        	}
		  	        	
		  	        	$.ajax({
		  	                type: "POST",
		  	                url: '/assignPlasticToClient',
		  	                contentType: "application/json",
		  	                dataType: "json",
		  	                data: JSON.stringify(data_json),
		  	                success: processSuccess,
		  	                error: processError
		  	            });
		  	        	
		  	        	function processSuccess(data, status, req) {
		  	                //alert(req.responseText + " " + status);
		  	        		console.log(data);
		  	        		//location.href = "/dashborad";
		  	            	//swal("Exito al Asignar Tarjeta");
		  	            	
		  	            	swal({
		  	            	    title: 'Exito al Asignar Tarjeta',
		  	            	    text: 'Redirigiendo...',
		  	            	    icon: 'Exitoso',
		  	            	    timer: 1000,
		  	            	    buttons: false,
		  	            	},
		  	            	function() {
		  	            	    location.href = "/dashborad";
		  	            	})
		  	            }  
		  	        	
		  	        	function processError(data, status, req) {
		  	                //alert(req.responseText + " " + status);
		  	            	swal("Error al Asignar Tarjeta");
		  	            }  
  			  		
  			  	}else
  			  		{
  			  			stattarjet = 1;
  			  			swal("Tarjeta en uso");
  			  		}
  			  }
  	  })
  	  .fail(function( jqxhr, textStatus, error ) {
  	    var err = textStatus + ", " + error;
  	    //console.log( "Request Failed: " + err );
  	    swal("Error al conectar con el servicio, Error: "+err);
  	  });
    	
    });

});
*/
    
    $("#imprimirButton").click(function(){
    	
    	
    	
    	if (document.getElementById("input3").value != "" && document.getElementById("input4").value != ""){
    		
    		var data_json = {
	        			'clientDTO': {
	        				'idClient': idclient,
	        				'clientFirstName': clientDTO_clientFirstName,
	        				'clientLastName': clientDTO_clientLastName,
	        				'clientSurname': clientDTO_clientSurname
	        			},
	        			'plasticDTO': {
	        				'idPlastic': idPlastic,
	        				'plasticAsigned': plasticAsigned,
	        				'plasticCvv': plasticCvv,
	        				'plasticDateIssue': plasticDateIssue,
	        				'plasticExpDate': plasticExpDate,
	        				'plasticNumber': plasticNumber,
	        				'plasticStatus': '1'
	        			}
	        	}
	        	
	        	$.ajax({
	                type: "POST",
	                url: '/CBPult/Solicitudes/assignPlasticToClient',
	                contentType: "application/json",
	                dataType: "json",
	                data: JSON.stringify(data_json),
	                success: processSuccess,
	                error: processError
	            });
	        	
	        	function processSuccess(data, status, req) {
	                //alert(req.responseText + " " + status);
	        		console.log(data);
	        		 $('#asignada').val("asignada");
	        		 $('#imprimirButton').prop("hidden",true);
  					 $('#siguiente').prop("hidden",false);
  					 $('#input3').prop('readonly', true); 
  					 $('#input4').prop('readonly', true);
	        		//location.href = "/dashborad";
	            	//swal("Exito al Asignar Tarjeta");
	        		
	            	
	            	swal({
	            	    title: 'Exito al Asignar Tarjeta',
	            	    //text: 'Redirigiendo...',
	            	    icon: 'Exitoso',
	            	    timer: 1000,
	            	    buttons: false,
	            	},
	            	function() {
	            	  //  location.href = "/dashborad";
	            	})
	            }  
	        	
	        	function processError(data, status, req) {
	                //alert(req.responseText + " " + status);
	            	swal("Error al Asignar Tarjeta");
	        	}
    	}else if(document.getElementById("input3").value == "" && document.getElementById("input4").value == ""){
    		swal("Campos Obligatorios");
    		document.getElementById("imprimirButton").disabled = true;
    	}else if(document.getElementById("input3").value == "" && document.getElementById("input4").value != ""){
    		swal("Campos Obligatorios");
    		document.getElementById("imprimirButton").disabled = true;
    	}else if(document.getElementById("input3").value != "" && document.getElementById("input4").value == ""){
    		swal("Campos Obligatorios");
    		document.getElementById("imprimirButton").disabled = true;
    	}
		  	        	
		  	        	

    });
    
    
    $("#prueba").click(function(){
   	 $('#asignada').val("asignada");
    });  
    
$("#saveComplet").click(function(){
    	
    	//Asignacion campos a variables de server impresion...
        uno_digit_impre = input3_1+input4_1;
        console.log("numero tarjeta", input3_1+input4_1);
    	
    	var data_json = {
    			"parsImpresoraIP":"190.147.1.53",
    			"parsClienteNom": nomb_clien_impre,//nombre cliente
    			"parsTarjeta":uno_digit_impre//numero tarjeta
    		};
    	
    	$.ajax({
            type: "POST",
            url: '/CBPult/Solicitudes/emitirTarjetaVerificada',
            contentType: "application/json",
            dataType: "json",
            data: JSON.stringify(data_json),
            success: processSuccess,
            error: processError
        });
    	
    	function processSuccess(data, status, req) {
            //alert(req.responseText + " " + status);
    		console.log(data.emitirTarjetaVerificadaResult);
    		//location.href = "/dashborad";
        	//swal("Exito al Asignar Tarjeta");
    		
        	
        	swal({
        	    title: data.emitirTarjetaVerificadaResult,
        	    //text: 'Redirigiendo...',
        	    icon: 'Exitoso',
        	    timer: 1000,
        	    buttons: false,
        	},
        	function() {
        	  //  location.href = "/dashborad";
        	})
        }  
    	
    	function processError(data, status, req) {
            //alert(req.responseText + " " + status);
    		console.log(data);
        	swal("Error al Contactar con el Servicio");
    	}
    }); 
    
    
});



/////////////////////////////////////////////////////7

function soloNumeros(numero){
	var patron = /^([0-9])*$/;
	if(numero.value.search(patron)){
		swal("Solo Numeros");
		numero.value = "";
	}else{
		return true;
	}
}