'use strict'

window.addEventListener('load', () => {

	var user = document.querySelector("#user1");
    var password = document.querySelector("#password1");

    console.log("Usuario: " + user.value);
    console.log("Contraseña: " + password.value);

    ///////////////////////////
    user.addEventListener('keyup', () => {
        var usuario = document.querySelector("#user1").value;
        if (usuario == "")
        {
            //alert("h", "Espacio Obligatorio");
        	swal('Espacio Obligatorio');
        	
        } else if ((/[a-zA-Z]/).test(usuario)) {

        } else if ((/^([0-9])*$/).test(usuario)) {
            //alert("h", "Dato Alfanumerico");
        	swal('Dato Alfanumerico');
            document.getElementById("user1").value = "";
        }
    });
    
    $("#sign1").click(function () {
       
        ///////////////////////////

        if (user.value == 'Esteban' && password.value == '1234') {
            localStorage.setItem('Usuario1', user.value);
            sessionStorage.setItem('Usuario', user.value);
            location.href = '/menu_principal';
        } else if (user.value == 'Karla' && password.value == '2345') {
            localStorage.setItem('Usuario1', user.value);
            sessionStorage.setItem('Usuario', user.value);
            location.href = '/menu_principal';
        } else if (user.value == 'Vielma' && password.value == '3456') {
            localStorage.setItem('Usuario1', user.value);
            sessionStorage.setItem('Usuario', user.value);
            location.href = '/menu_principal';
        } else {
            //alert("Sesion incorrecta, inexistente");
        	swal('Sesion incorrecta, inexistente');
        }

        //location.href = "../html/dashboard.html";
        
    });
});