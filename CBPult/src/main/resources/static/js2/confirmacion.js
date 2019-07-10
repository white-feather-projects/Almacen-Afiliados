'use strict'

window.addEventListener('load', ()=>{

//////////////////////////////////////////////////////////////////////

    var data_json = JSON.parse(localStorage.getItem("data2"));

    $("#primer_nombre_confirm").val(data_json.primer_nombre).prop("disabled", true);
    $("#segundo_nombre_confirm").val(data_json.segundo_nombre).prop("disabled", true);
    $("#primer_apellido_confirm").val(data_json.primer_apellido).prop("disabled", true);
    $("#segundo_apellido_confirm").val(data_json.segundo_apellido).prop("disabled", true);
    $("#tipo_identificador_confirm").val(data_json.tipo_documento).attr('disabled',true)
    $("#documento_identidad_confirm").val(data_json.documento_identidad).prop("disabled", true);

    var genero = document.getElementsByName("radio_genero");

        var indexx;
        for(indexx in genero){
            if(genero[indexx].value == data_json.genero){
                genero[indexx].checked = true;
            }
            else if(genero[indexx].value==document.querySelector("#masculino_confirm").value){
                    document.querySelector("#masculino_confirm").disabled = true;
                }else if(genero[indexx].value==document.querySelector("#femenino_confirm").value){
                    document.querySelector("#femenino_confirm").disabled = true;
                }
        }
    
    $("#example-datetime-local-input").val(data_json.fecha_nacimiento).attr('disabled',true);
    $("#pais_nacimiento_confirm").val(data_json.pais_nacimiento).attr('disabled',true);

    var estado_civil = document.getElementsByName("radio_estado");

        var indexx2;
        for(indexx2 in estado_civil){
            if(estado_civil[indexx2].value == data_json.estado_civil){
                estado_civil[indexx2].checked = true;
            }else if(estado_civil[indexx2].value==document.querySelector("#soltero_confirm").value){
                    document.querySelector("#soltero_confirm").disabled = true;
                }else if(estado_civil[indexx2].value==document.querySelector("#casado_confirm").value){
                    document.querySelector("#casado_confirm").disabled = true;
                }else if(estado_civil[indexx2].value==document.querySelector("#divorciado_confirm").value){
                    document.querySelector("#divorciado_confirm").disabled = true;
                }else if(estado_civil[indexx2].value==document.querySelector("#viudo_confirm").value){
                    document.querySelector("#viudo_confirm").disabled = true;
                }else if(estado_civil[indexx2].value==document.querySelector("#concubinato_confirm").value){
                    document.querySelector("#concubinato_confirm").disabled = true;
                }
        }
    
    $("#correo_confirm").val(data_json.correo).prop('disabled', true);
    $("#correo_confirm_confirm").val(data_json.correo_confirm).prop('disabled', true);
    $("#profesion_confirm").val(data_json.profesion).prop('disabled', true);
    $("#ocupacion_confirm").val(data_json.ocupacion).prop('disabled', true);
    $("#actividad_economica_confirm").val(data_json.actividad_economica).prop('disabled', true);
    $("#relacion_laboral_confirm").val(data_json.tipo_laboral).attr('disabled', true);
    $("#sueldo_confirm").val(data_json.sueldo).prop('disabled', true);
    $("#monto_preaprobado_confirm").val(data_json.monto).prop('disabled', true);


//////////////////////////////////////////////////////////////////////

    var primernombre = document.querySelector("#primer_nombre_confirm");
    var segundonombre = document.querySelector("#segundo_nombre_confirm");

    var primerapellido = document.querySelector("#primer_apellido_confirm");
    var segundoapellido = document.querySelector("#segundo_apellido_confirm");

    var tipodocumento = document.querySelector("#tipo_identificador_confirm");
    var documentoidentidad = document.querySelector("#documento_identidad_confirm");

    var fecha_nacimiento = document.querySelector("#example-datetime-local-input");
    var paisnacimiento = document.querySelector("#pais_nacimiento_confirm");

    var correo = document.querySelector("#correo_confirm");
    var correo_confirm = document.querySelector("#correo_confirm_confirm");

    var profesion = document.querySelector("#profesion_confirm");
    var ocupacion = document.querySelector("#ocupacion_confirm");
    var actividad_economica = document.querySelector("#actividad_economica_confirm");

    var tipo_laboral = document.querySelector("#relacion_laboral_confirm");

    var sueldo = document.querySelector("#sueldo_confirm");
    var monto = document.querySelector("#monto_preaprobado_confirm");

    /////////////////////////////////////////////////////////////////////

    primernombre.addEventListener('keyup', ()=>{
        var prim_nombre = document.querySelector("#primer_nombre_confirm").value;
        if(prim_nombre == "")
        {   
            //alert("Espacio Obligatorio");
        	swal("Espacio Obligatorio");
        }else if((/[a-zA-Z]/).test(prim_nombre)){

        }else if((/^([0-9])*$/).test(prim_nombre)){
            //alert("Dato Alfanumerico");
            swal("Dato Alfanumerico");
            document.getElementById("primer_nombre_confirm").value = "";
        }
    });

    segundonombre.addEventListener('keyup', ()=>{
        var segun_nombre = document.querySelector("#segundo_nombre_confirm").value;
        if(segun_nombre == ""){
        	//alert("Espacio Obligatorio");
        	swal("Espacio Obligatorio");
        }else if((/[a-zA-Z]/).test(segun_nombre)){

        }else if((/^([0-9])*$/).test(segun_nombre)){
        	//alert("Dato Alfanumerico");
            swal("Dato Alfanumerico");
            document.getElementById("segundo_nombre_confirm").value = "";
        }
    });

    primerapellido.addEventListener('keyup', ()=>{
        var prim_apellido = document.querySelector("#primer_apellido_confirm").value;
        if(prim_apellido == "")
        {   
            //alert("Espacio Obligatorio");
        	swal("Espacio Obligatorio");
        }else if((/[a-zA-Z]/).test(prim_apellido)){

        }else if((/^([0-9])*$/).test(prim_apellido)){
        	//alert("Dato Alfanumerico");
            swal("Dato Alfanumerico");
            document.getElementById("primer_apellido_confirm").value = "";
        }
    });

    segundoapellido.addEventListener('keyup', ()=>{
        var segun_apellido = document.querySelector("#segundo_apellido_confirm").value;
        if(segun_apellido == ""){
        	//alert("Espacio Obligatorio");
        	swal("Espacio Obligatorio");
        }else if((/[a-zA-Z]/).test(segun_apellido)){

        }else if((/^([0-9])*$/).test(segun_apellido)){
        	//alert("Dato Alfanumerico");
            swal("Dato Alfanumerico");
            document.getElementById("segundo_apellido_confirm").value = "";
        }
    });

    documentoidentidad.addEventListener('keyup', ()=>{
        var documento = document.querySelector("#documento_identidad_confirm").value;
        if(documento == "")
        {   
            //alert("Espacio Obligatorio");
        	swal("Espacio Obligatorio");
        }else if((/^([0-9])*$/).test(documento)){

        }else if((/[a-zA-Z]/).test(documento)){
            //alert("Solo numeros");
        	swal("Solo numeros");
            document.getElementById("documento_identidad_confirm").value = "";
        }
    });

    paisnacimiento.addEventListener('keyup', ()=>{
        var pais_nacim = document.querySelector("#pais_nacimiento_confirm").value;
        if(pais_nacim == "")
        {   
            //alert("Espacio Obligatorio");
        	swal("Espacio Obligatorio");
        }else if((/[a-zA-Z]/).test(pais_nacim)){

        }else if((/^([0-9])*$/).test(pais_nacim)){
            //alert("Dato Alfanumerico");
        	swal("Dato Alfanumerico");
            document.getElementById("pais_nacimiento_confirm").value = "";
        }
    });

    var emailRegex = /^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i;
    var email1;
    correo.addEventListener('keyup', ()=>{
        var email = document.querySelector("#correo_confirm").value;
        email1 = email;
        if(emailRegex.test(email)){

        }else{
            //alert("Espacio Obligatorio, Correo no valido");
        	swal("Espacio Obligatorio, Correo no valido");
            document.getElementById("correo_confirm").value = "";
        }
    });

    correo_confirm.addEventListener('keyup', ()=>{
        var email_confirm = document.querySelector("#correo_confirm_confirm").value;

        if(emailRegex.test(email_confirm)){
            if(email1 != email_confirm)
            {
                //alert("Correo Diferente, Vuelva a Confirmar");
            	swal("Correo Diferente, Vuelva a Confirmar");
                document.getElementById("correo_confirm_confirm").value = "";
            }else{

            }
        }else{
            //alert("Espacio Obligatorio, Correo no valido");
            swal("Espacio Obligatorio, Correo no valido");
            document.getElementById("correo_confirm_confirm").value = "";
        }
    });

    profesion.addEventListener('keyup', ()=>{
        var profesi = document.querySelector("#profesion_confirm").value;
        if(profesi == "")
        {   
            //alert("Espacio Obligatorio");
        	swal("Espacio Obligatorio");
        }else if((/[a-zA-Z]/).test(profesi)){

        }else if((/^([0-9])*$/).test(profesi)){
            //alert("Dato Alfanumerico");
        	swal("Dato Alfanumerico");
            document.getElementById("profesion_confirm").value = "";
        }
    });

    ocupacion.addEventListener('keyup', ()=>{
        var ocupa = document.querySelector("#ocupacion_confirm").value;
        if(ocupa == "")
        {   
        	//alert("Espacio Obligatorio");
        	swal("Espacio Obligatorio");
        }else if((/[a-zA-Z]/).test(ocupa)){

        }else if((/^([0-9])*$/).test(ocupa)){
        	//alert("Dato Alfanumerico");
        	swal("Dato Alfanumerico");
            document.getElementById("ocupacion_confirm").value = "";
        }
    });

    actividad_economica.addEventListener('keyup', ()=>{
        var act_econ = document.querySelector("#actividad_economica_confirm").value;
        if(act_econ == "")
        {   
        	//alert("Espacio Obligatorio");
        	swal("Espacio Obligatorio");
        }else if((/[a-zA-Z]/).test(act_econ)){

        }else if((/^([0-9])*$/).test(act_econ)){
        	//alert("Dato Alfanumerico");
        	swal("Dato Alfanumerico");
            document.getElementById("actividad_economica_confirm").value = "";
        }
    });

    sueldo.addEventListener('keyup', ()=>{
        var sueld = document.querySelector("#sueldo_confirm").value;
        if(sueld == "")
        {   
            //alert("Espacio Obligatorio");
        	swal("Espacio Obligatorio");
        }else if((/^([0-9])*$/).test(sueld)){

        }else if((/[a-zA-Z]/).test(sueld)){
            //alert("Dato Numerico");
            swal("Dato Numerico");
            document.getElementById("sueldo_confirm").value = "";
        }
    });

    monto.addEventListener('keyup', ()=>{
        var mont = document.querySelector("#monto_preaprobado_confirm").value;
        if(mont == "")
        {   
        	//alert("Espacio Obligatorio");
        	swal("Espacio Obligatorio");
        }else if((/^([0-9])*$/).test(mont)){

        }else if((/[a-zA-Z]/).test(mont)){
        	//alert("Dato Numerico");
            swal("Dato Numerico");
            document.getElementById("monto_preaprobado_confirm").value = "";
        }
    });

//////////////////////////////////////////////////////////////////////    

    $('#aceptar_confirm').click(function(){

        var genero_respuesta;

        var index;
        for(index in genero){
            if(genero[index].checked){
                var genero_s = genero[index].value;
                genero_respuesta = genero_s;
            }
        }
        console.log(genero_respuesta);

        var estado_civil_respuesta;

        var index1;
        for(index1 in estado_civil){
            if(estado_civil[index1].checked){
                var estado_s = estado_civil[index1].value;
                estado_civil_respuesta = estado_s;
            }
        }
        
        //////////////////////////////////
        var fecha = fecha_nacimiento.value;
        
        var array_fecha = fecha.split("-");
        var fecha_final = array_fecha[2]+"/"+array_fecha[1]+"/"+array_fecha[0];
        console.log(fecha_final);
        
        var createClientData = {
        		"clientBirthday": fecha_final,
        	    "clientCellPhone": '3145678900',
        	    "clientCivilStatus": estado_civil_respuesta,
        	    "clientDocumentId": documentoidentidad.value,
        	    "clientEconomicActivity": actividad_economica.value,
        	    "clientEmail": correo_confirm.value,
        	    "clientFirstName": primernombre.value,
        	    "clientGender": genero_respuesta,
        	    "clientHomePhone": '3456789',
        	    "clientLaborRelationship": tipo_laboral.value,
        	    "clientLastName": segundonombre.value,
        	    "clientOcupation": ocupacion.value,
        	    "clientPreaprovedAmount": monto.value,
        	    "clientProfession": profesion.value,
        	    "clientSalary": sueldo.value,
        	    "clientSurname": primerapellido.value+` `+segundoapellido.value,
        	    "clientTypeId": tipodocumento.value
        };
        
            $.ajax({
                type: "POST",
                url: '/createClient',
                contentType: "application/json",
                dataType: "json",
                data: JSON.stringify(createClientData),
                success: processSuccess,
                error: processError
            });

            function processSuccess(data, status, req) {
            	
            	console.log("status:"+status);
            	console.log("codigo:"+data.codigo+"description:"+data.descripcion);
            	console.log("lista: "+data.listErroresDTO);
            	console.log("json: "+createClientData.clientBirthday+" "+createClientData.clientCellPhone+" "+createClientData.clientCivilStatus+" "+createClientData.clientDocumentId+" "+createClientData.clientEconomicActivity+" "+createClientData.clientEmail+" "+createClientData.clientFirstName+" "+createClientData.clientGender+" "+createClientData.clientHomePhone+" "+createClientData.clientLaborRelationship+" "+createClientData.clientLastName+" "+createClientData.clientOcupation+" "+createClientData.clientPreaprovedAmount+" "+createClientData.clientProfession+" "+createClientData.clientSalary+" "+createClientData.clientSurname+" "+createClientData.clientTypeId+" ");
            	//alert("Exitoso");
            	
            	if(data.descripcion == "FAIL"){
            		swal("Error al crear cliente");
            	}else if(data.descripcion == "OK"){
            		swal({
                	    title: 'Registro Exitoso',
                	    text: 'Redirigiendo...',
                	    icon: 'Exitoso',
                	    timer: 1000,
                	    buttons: false,
                	},
                	function() {
                	    location.href = "/carga_archivos";
                	})
            	}
            	
            }

            function processError(data, status, req) {
                //alert(req.responseText + " " + status);
            	swal("Error al contactar con el servicio", status);

            }

        /////////////////////////////////////////
    });

    ///////////////////////////////////////////////

    $("#atras_confirm").click(function(){
        location.href = "/carga_datos";
    });

});