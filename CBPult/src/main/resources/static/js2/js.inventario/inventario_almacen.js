'use strict'

	var url = window.location.pathname;
	var id = url.substring(url.lastIndexOf('&') + 1);
	
	console.log("id--------", id);

window.addEventListener('load', function(){
	
	$("#btnGenerarOrden").on('click', function(){
		
		location.href='/CBPult/Almacen/inventario_movimiento&'+id+'';
		
	});
	
	var consulta_Detalles_Almacen = {
			"idAlmacen": id
	};
	
	$.ajax({
        type: "POST",
        url: '/CBPult/Almacen/consultarAlmacenPorAlmacenId',
        contentType: "application/json",
        dataType: "json",
        data: JSON.stringify(consulta_Detalles_Almacen),
        success: processSuccess,
        error: processError
 	});	
	function processSuccess(data, status, req) {
        //alert(req.responseText + " " + status);
		console.log("Informacion Almacen", data);	
		
		$("#txtCodigo_almacen").val(data.return.warehouseNumber).prop('disabled', true);
		if(data.return.tipoAlmacenId == 1){
			$("#cboxTipo_almacen").val("ALMACEN");
			document.getElementById("cboxTipo_almacen").disabled = true;
		}else if(data.return.tipoAlmacenId == 2){
			$("#cboxTipo_almacen").val("LABORATORIO");
			document.getElementById("cboxTipo_almacen").disabled = true;
		}else if(data.return.tipoAlmacenId == 3){
			$("#cboxTipo_almacen").val("SUCURSAL");
			document.getElementById("cboxTipo_almacen").disabled = true;
		}
		
		$("#txtName_almacen").val(data.return.warehouseName).prop('disabled', true);
		$("#txtUbicacion_almacen").val(data.return.direccion).prop('disabled', true);
		$('select[id="cboxEncargado_almacen"] option:selected').val(data.return.gerenteSucursal);
		document.getElementById("cboxEncargado_almacen").disabled = true;
		
		//////Listar Almacenes Relacionados///////
		listarAlmacenesRelacionados(id);
		
		/////Lista ZOnas de Almacen////////
		
		// Consulta Zonas Almacen (para Filtros Mercancias)
		$('#cbox_almacen').append('<option value="'+id+'">'+data.return.idWarehouse+'</option>');	
		
		$.get('/CBPult/Almacen/listaZonasByIdAlmacen/'+$('#cbox_almacen').val()+'', function(zonasAlmacen){
			console.log("Zonas Almacen: ", zonasAlmacen);			
			for(var i = 0; i<zonasAlmacen.length; i++){
				var zona = '<option value="'+zonasAlmacen[i].zonaId+'">'+zonasAlmacen[i].zonaId+'</option>';
				$("#cbox_zona").append(zona);
			}
		});
		// Consulta Zonas Almacen	
		
		listarZonasAlmacen(id);
	}		
	function processError(data, status, req) {
	    //alert(req.responseText + " " + status);
	   	swal("Error al contacter el servicio", data);
	}
	
	//cbox_Zonas
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
	
});

function listarAlmacenesRelacionados(idAlmacen){
	
    $('#simpletable1').DataTable( {
	   
	    sort:true,
	    destroy: true,
	    searching: true,
	    language: {
    		url: '/CBPult/js2/Spanish.json'
        },
	        ajax: {
	              url: "/CBPult/Almacen/listaAlmacenesRelacionados/"+idAlmacen+"",
	            dataSrc: ''
	        },
	        columns: [ 
	        	
	        {
	                "data": "almacenDestinoId.warehouseNumber", // can be null or undefined
	                "class": "codigo_almacen",
	                "render": function ( data ) {
	          
	            return '<center class="p1">'+ data +'</center>';
	              }	
	            },
	            {
	                "data": "almacenDestinoId.warehouseName", // can be null or undefined
	                "class": "nombre_almacen",
	                "defaultContent": "",
	                "render": function ( data ) {
	            return '<center class="p2">'+data+'</center>';
	              }
	            },
	            {
	                "data": "almacenDestinoId.direccion", // can be null or undefined
	                "class": "direccion_almacen",
	                "defaultContent": "",
	                "render": function ( data ) {
            	return '<center class="p3">'+data+'</center>';
	              }
	            },          
	            {
	                "data": "almacenDestinoId.tipoAlmacenId", // can be null or undefined
	                "class": "tipo_almacen",
	                "defaultContent": "",
	                "render": function ( data ) {
	                	if(data == 1){
	                		return '<center class="p4">Almacen</center>';
	                	}else if(data == 2){
	                		return '<center class="p4">Laboratorio</center>';
	                	}else if(data == 3){
	                		return '<center class="p4">Sucursal</center>';
	                	}
	            
	              }
	            },
	            {
	                "data": "almacenDestinoId.gerenteSucursal",
	                "class": "encargado_almacen",
	                "defaultContent": "",
	                "render": function ( data ) {
            	return '<center class="p5">'+data+'</center>';
	              }
	            },
	            {
	                "data": "almacenDestinoId.idWarehouse",
	                "class": "ver",
	                "defaultContent": "",
	                "render": function ( data, type, full, meta ) {
	                		return '<center><a title="Visualizar Almacen" href="/CBPult/Almacen/relacion-almacen_consulta&'+idAlmacen+'_'+data+'"><i class="fa fa-edit" style="font-size:30px" aria-hidden="true"></i></a></center>';
	                
	                }
	            }
	            
	        ]
	        
    });
	    
}

function listarZonasAlmacen(idAlmacen){
	
    $('#simpletable2').DataTable( {
	   
	    sort:true,
	    destroy: true,
	    searching: true,
	    language: {
    		url: '/CBPult/js2/Spanish.json'
        },
	        ajax: {
	              url: "/CBPult/Almacen/listaZonasByIdAlmacen/"+idAlmacen+"",
	            dataSrc: ''
	        },
	        columns: [ 
	        	
	        {
	                "data": "zonaId", // can be null or undefined
	                "class": "codigo_zona",
	                "render": function ( data ) {
	          
	            return '<center class="p1">'+ data +'</center>';
	              }	
	            },
	            {
	                "data": "idTipoZona", // can be null or undefined
	                "class": "tipo_zona",
	                "defaultContent": "",
	                "render": function ( data ) {
	                	if(data == 1){
	                		return '<center class="p2">Recibo</center>';
	                	}else if(data == 2){
	                		return '<center class="p2">Almacenaje</center>';
	                	}else if(data == 3){
	                		return '<center class="p2">Restringido</center>';
	                	}else if(data == 4){
	                		return '<center class="p2">Despacho</center>';
	                	}
	            
	              }
	            },
	            {
	                "data": "descripcion", // can be null or undefined
	                "class": "descripcion_zonas",
	                "defaultContent": "",
	                "render": function ( data ) {
            	return '<center class="p3">'+data+'</center>';
	              }
	            },          
	            {
	                "data": "encargadoZona", // can be null or undefined
	                "class": "encargado_zona",
	                "defaultContent": "",
	                "render": function ( data ) {
	            return '<center class="p4">'+data+'</center>';
	              }
	            },
	            {
	                "data": "zonaId",
	                "class": "ver",
	                "defaultContent": "",
	                "render": function ( data, type, full, meta ) {
                		return '<center><a title="Visualizar Zona" href="/CBPult/Almacen/inventario_zona&'+idAlmacen+'_'+data+'"><i class="fa fa-edit" style="font-size:30px" aria-hidden="true"></i></a></center>';
	                
	                }
	            }
	            
	        ]
	        
    });
	    
}