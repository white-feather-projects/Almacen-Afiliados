'use strict'

$(document).ready(function(){
	
	// $('#example').DataTable(); --Tabla Simple

    $('table.display').DataTable({ 
        "language": { // Configuración del Lenguaje de la Tabla
            "lengthMenu": "Mostrar _MENU_ registros",
            "zeroRecords": "No se encontararon resultados",
            "info": "Mostrando registros del _START_ al _END_ de un total de _TOTAL_ registros",
            "infoEmpty": "Mostrando registros del 0 al 0 de un total de 0 registros",
            "infoFiltered": "(filtrado de un total de _MAX_ registros)",
            "sSearch": "Buscar:",            
        },
        "scrollY": "165px", // Alto de la Tabla
        "scrollCollapse": true,
        "paging": true 
    });
    
    $('table.display2').DataTable({ 
        "language": { // Configuración del Lenguaje de la Tabla
            "lengthMenu": "Mostrar _MENU_ registros",
            "zeroRecords": "No se encontararon resultados",
            "info": "Mostrando registros del _START_ al _END_ de un total de _TOTAL_ registros",
            "infoEmpty": "Mostrando registros del 0 al 0 de un total de 0 registros",
            "infoFiltered": "(filtrado de un total de _MAX_ registros)",
            "sSearch": "Buscar:",            
        },
        "scrollY": "410px", // Alto de la Tabla
        "scrollCollapse": true,
        "paging": true 
    });
	
});