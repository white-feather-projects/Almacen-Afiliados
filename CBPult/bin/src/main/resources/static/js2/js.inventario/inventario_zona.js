'use strict'

	var url = window.location.pathname;
	var id = url.substring(url.lastIndexOf('&') + 1);
	var idAlmacen = id.indexOf("_");
	var idAlmacen_1 = id.substring(0, idAlmacen);
	var idZona = id.substring(id.lastIndexOf('_') + 1);
	
	console.log("id--------", id);
	console.log("idZona", idZona);
	console.log("idAlmacen", idAlmacen_1);

window.addEventListener('load', function(){
	
	$("#btnCancelar_zona").on('click', function(){
		location.href = "/CBPult/Almacen/inventario_almacen&"+idAlmacen_1+"";
	});
	
	var consulta_detalle_zona = {
		"zonaId": idZona
	};

	$.ajax({
        type: "POST",
        url: '/CBPult/Almacen/consultaZonaPorZonaId',
        contentType: "application/json",
        dataType: "json",
        data: JSON.stringify(consulta_detalle_zona),
        success: processSuccess,
        error: processError
 	});
	
	function processSuccess(data, status, req) {
        //alert(req.responseText + " " + status);
		console.log("Informacion Almacen", data);
   		
		$("#txtCodigo_zona").val(data.return.zonaId).prop('disabled', true);
		$('select[id="cboxTipo_zona"] option:selected').val(data.return.tipoZonaId.nombre);
		document.getElementById("cboxTipo_zona").disabled = true;
		$("#txtDescripcion_zona").val(data.return.descripcion).prop('disabled', true);
		$('select[id="cboxEncargado_zona"] option:selected').val(data.return.encargadoZona.cargoId.cargoNombre);
		document.getElementById("cboxEncargado_zona").disabled = true;
		
		listarZonasRelacionadas(idAlmacen_1, idZona);
		
	}
		
	function processError(data, status, req) {
	    //alert(req.responseText + " " + status);
	   	swal("Error al contacter el servicio", data);
	}
	
});

function listarZonasRelacionadas(idAlmacen, idZona){
	
    $('#simpletable').DataTable( {
	   
	    sort:true,
	    destroy: true,
	    searching: true,
	    language: {
    		url: '/CBPult/js2/Spanish.json'
        },
	        ajax: {
	              url: "/CBPult/Almacen/listaZonasRelacionadasPorZonaIdActual/"+idZona+"",
	            dataSrc: ''
	        },
	        columns: [ 
	        	
	        {
	                "data": "zonaDestinoId.zonaId", // can be null or undefined
	                "class": "codigo_zona",
	                "render": function ( data ) {
	          
	            return '<center class="p1">'+ data +'</center>';
	              }	
	            },
	            {
	                "data": "zonaDestinoId.tipoZonaId.nombre", // can be null or undefined
	                "class": "tipo_zona",
	                "defaultContent": "",
	                "render": function ( data ) {
	            return '<center class="p2">'+data+'</center>';
	              }
	            },
	            {
	                "data": "zonaDestinoId.descripcion", // can be null or undefined
	                "class": "descripcion_zona",
	                "defaultContent": "",
	                "render": function ( data ) {
            	return '<center class="p3">'+data+'</center>';
	              }
	            },          
	            {
	                "data": "zonaDestinoId.encargadoZona.nombreEmpleado", // can be null or undefined
	                "class": "encargado_zona",
	                "defaultContent": "",
	                "render": function ( data ) {
	            return '<center class="p4">'+data+'</center>';
	              }
	            },
	            {
	                "data": "zonaDestinoId.zonaId",
	                "class": "ver",
	                "defaultContent": "",
	                "render": function ( data, type, full, meta ) {
	                		return '<center><a title="Visualizar Zona" href="/CBPult/Almacen/relacion-zona_consulta/'+idAlmacen+'_'+idZona+'&'+data+'"><i class="fa fa-search" style="font-size:30px" aria-hidden="true"></i></a></center>';
	                
	                }
	            }
	            
	        ]
	        
    });
	    
}