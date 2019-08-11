'use strict'

window.addEventListener('load', ()=>{
	
	
	var url = window.location.pathname;
	var id = url.substring(url.lastIndexOf('/') + 1);
	
	console.log('document: '+id);
	
	$.ajax({          
	     
		  type: "GET",
		  dataType: "json",
		  url: "/CBPult/Solicitudes/consultClient/"+id+"",
		  success: function(data)
	    {
   console.log(data);
   var clientBirthday = data.clientBirthday;
   var Birthday = clientBirthday.split("/");
   var clientCellPhone = data.clientCellPhone;
   var clientCivilStatus = data.clientCivilStatus;
   var clientDocumentId = data.clientDocumentId;
   var clientEconomicActivity = data.clientEconomicActivity;
   var clientEmail = data.clientEmail;
   var clientFirstName = data.clientFirstName;
   var clientGender = data.clientGender;
   var clientHomePhone = data.clientHomePhone;
   var clientLaborRelationship = data.clientLaborRelationship;
   var clientLastName = data.clientLastName;
   var clientOcupation = data.clientOcupation;
   var clientPreaprovedAmount = data.clientPreaprovedAmount;
   var clientProfession = data.clientProfession;
   var clientSalary = data.clientSalary;
   var clientSurname = data.clientSurname;
   var surname = clientSurname.split(" ");
   var clientTypeId = data.clientTypeId;
   
   /////////////////////////////////////////////////////////////77
   
   $("#primer_nombre_confirm").val(clientFirstName).prop("readonly", true);
   $("#segundo_nombre_confirm").val(clientLastName).prop("readonly", true);
   $("#primer_apellido_confirm").val(surname[0]).prop("readonly", true);
   $("#segundo_apellido_confirm").val(surname[1]).prop("readonly", true);
   $("#tipo_identificador_confirm").val(clientTypeId).prop("disabled", true);
   $("#documento_identidad_confirm").val(clientDocumentId).prop("readonly", true);
   
   var genero = document.getElementsByName("radio_genero");

   var indexx;
   for(indexx in genero){
       if(genero[indexx].value == clientGender){
           genero[indexx].checked = true;
       }
   }
   
   $("#example-datetime-local-input").val(Birthday[2]+"-"+Birthday[1]+"-"+Birthday[0]).prop("readonly", true);
   $("#pais_nacimiento_confirm").prop("disabled", true);

   var estado_civil = document.getElementsByName("radio_estado");

       var indexx2;
       for(indexx2 in estado_civil){
           if(estado_civil[indexx2].value == clientCivilStatus){
               estado_civil[indexx2].checked = true;
           }
       }
   
   $("#correo_confirm").val(clientEmail).prop("readonly", true);
   $("#correo_confirm_confirm").val(clientEmail).prop("readonly", true);
   $("#profesion_confirm").val(clientProfession).prop("readonly", true);
   $("#ocupacion_confirm").val(clientOcupation).prop("readonly", true);
   $("#actividad_economica_confirm").val(clientEconomicActivity).prop("readonly", true);
   $("#relacion_laboral_confirm").val(clientLaborRelationship).prop("disabled", true);
   $("#sueldo_confirm").val(clientSalary).prop("readonly", true);
   $("#monto_preaprobado_confirm").val(clientPreaprovedAmount).prop('disabled', true);
              
  }
      
});  

//////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////

    $("#menu_confirm").click(function(){
        location.href = "/CBPult/Solicitudes/bandeja_ventas";
    });

});