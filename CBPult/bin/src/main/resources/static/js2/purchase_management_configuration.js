'use strict'

window.addEventListener('load', ()=>{
	
//////////////////////////////////////////////////////////////////////

    var Maximo= document.querySelector("#maximo");
    var Minimo = document.querySelector("#minimo");
 /////////////////////////////////////////////////////////////////////////
    
    
    Maximo.addEventListener('keyup', ()=>{
        var max = document.querySelector("#maximo").value;
        if(max == "")
        {   
        	swal("Espacio Obligatorio");
       
        }else if((/^([0-9])*$/).test(max)){

        }else if((/[a-zA-Z]/).test(max)){
        	swal("Dato Alfanumerico");
   
            document.getElementById("maximo").value = "";
        }
    });
    
    Minimo.addEventListener('keyup', ()=>{
        var min = document.querySelector("#minimo").value;
        if(min == "")
        {   
        	swal("Espacio Obligatorio");
       
        }else if((/^([0-9])*$/).test(min)){

        }else if((/[a-zA-Z]/).test(min)){
        	swal("Dato Alfanumerico");
   
            document.getElementById("minimo").value = "";
        }
    });
    
    ////////////////////////////////////////////////////////////////////////////////////////////



  $('#siguiente').click(function(){
    	
    	   var maximo = $("#maximo").val();
    	   var minimo = $("#minimo").val();
    	   var status ="Cargada";
    	   console.log(status);

    	    
var contenido = {
		 "maximo":maximo,
		  "minimo": minimo


		
}
      	$.ajax({      headers: { 
            'Accept': 'application/json',
            'Content-Type': 'application/json' 
        },     
            
  		  type: "POST",
  		  
  		  url: "/CBPult/Gestion_Compras/guardar",
  		  data: JSON.stringify(contenido),
  		dataType: "json",
  		  success: function(data)
  	    {
        
  			swal({
        	    title: 'Pedido de orden de compra exitosa',
        	    text: 'Redirigiendo...',
        	    icon: 'Exitoso',
        	    timer: 1000,
        	    buttons: false,
        	},
        	function() {
        	    location.href = "/CBPult/dashborad";
        	})   
                               
              }
              
                },);  

      
    });
 
//////////////////////////////////Salir //////////////////////////////    
   $("#cancelar").click(function(){
  
 	   localStorage.clear();
        location.href = "/CBPult/dashborad";
    });
    
    
   });


  
  
