'use strinct'

$(document).ready(function(){
	
	/////Lista de Almacenes....//// cbox_Almacenes Carga
	
	$.ajax({
        type: "GET",
        url: '/CBPult/Almacen/listaAlmacenes',
        dataType: "json",
        success: processSuccess,
        error: processError
 	});	
	function processSuccess(data, status, req) {
        //alert(req.responseText + " " + status);
		console.log("lista almacenes", data);
		
		for(var i=0; i<data.length; i++){
			
			var almacen = '<option value="'+data[i].idWarehouse+'">'+data[i].warehouseNumber+'</option>';
			$("#cbox_almacen").append(almacen);
		
	  	}
		
	}	
	function processError(data, status, req) {
	    //alert(req.responseText + " " + status);
	   	swal("Error al contactar el servicio", data);
	}	
	
	// cbox_Almacenes
	$('#cbox_almacen').change(function(){
		
		$('#cbox_zona option').remove();
		$('#cbox_zona').append('<option value="Todas">Todas</option>');
		$('#cbox_estanteria option').remove();
		$('#cbox_estanteria').append('<option value="Todas">Todas</option>');
		
		$.get('/CBPult/Almacen/listaZonasByIdAlmacen/'+$('#cbox_almacen').val()+'', function(zonasAlmacen){
			console.log("Zonas Almacen: ", zonasAlmacen);			
			for(var i = 0; i<zonasAlmacen.length; i++){
				var zona = '<option value="'+zonasAlmacen[i].zonaId+'">'+zonasAlmacen[i].zonaId+'</option>';
				$("#cbox_zona").append(zona);
			}
		});
		
	});
	
	// cbox_Zonas
	$('#cbox_zona').change(function(){
		
		$('#cbox_estanteria option').remove();
		$('#cbox_estanteria').append('<option value="Todas">Todas</option>');
		
		$.get('/CBPult/Almacen/listaEstanteriasByIdZona/'+$('#cbox_zona').val()+'', function(estanteriasZona){
			console.log("Estanterias Zona: ", estanteriasZona);			
			for(var i = 0; i<estanteriasZona.length; i++){
				var estanteria = '<option value="'+estanteriasZona[i].estanteriaId+'">'+estanteriasZona[i].estanteriaId+'</option>';
				$("#cbox_estanteria").append(estanteria);
			}
		});
		
	});
	
	
	// Queda Hacer la Consulta de la Mercancia
	
	
});