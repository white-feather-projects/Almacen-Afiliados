
function listarAlmacenesServ(){
		
    $('#configuracionAlmacen').DataTable( {
	    
    	sort:true,
    	destroy: true,
    	searching: true,
      	
    	language: {
    		url: '../js2/Spanish.json'
        },
        ajax: {
        	url:"/CBPult/Almacen/listaAlmacenes",
            dataSrc: '',
        	
        },
      
        columns: [ 
      
    	   {
                "data": "idWarehouse", // can be null or undefined
                "class": "uno",
                "defaultContent": "",
                "render": function ( data ) {
            		return '<center>'+data+'</center>';
              	}
            },
            {
                "data": "warehouseName", // can be null or undefined
                "class": "dos",
                "defaultContent": "",
                "render": function ( data ) {
            		return '<center>'+data+'</center>';
              	}
            },
            {
                "data": "direccion", // can be null or undefined
                "class": "tres",
                "defaultContent": "",
                "render": function ( data ) {
            		return '<center>'+data+'</center>';
              	}
            },
            {
                "data": "tipoAlmacenId", // can be null or undefined
                "class": "cuatro",
                "defaultContent": "",
                "render": function ( data ) {
            		return '<center>'+data+'</center>';
              	}
            },
            {
                "data": "gerenteSucursal", // can be null or undefined
                "class": "cinco",
                "defaultContent": "",
                "render": function ( data ) {
            		return '<center>'+data+'</center>';
              	}
            },
            {
                "data": "idWarehouse", // can be null or undefined
                "class": "seis",
                "defaultContent": "",
                "render": function ( data ) {
                	return '<center><a href="/CBPult/Almacen/almacen_nuevo-wizzard/editar&'+data+'" title="Editar solicitud de orden de compra"><input type="hidden" id="edit" value="'+data+'"><i class="fa fa-edit" agregaryasignar" style="font-size:30px"></i></a></center>';
              	}
            }
        ]
        
    });

}

function cargarDatosAlmacenServ() {
	var url = window.location.pathname;
	var idWarehouse = url.substring(url.lastIndexOf('/') + 1);
	
	var url3='/CBPult/Almacen/consultarAlmacenPorAlmacenId';
	var datos = {
		"idAlmacen": idWarehouse			
	}

	$.ajax({
	    url:url3,
	    dataType: 'json',
	    contentType:'application/json',
	    data:JSON.stringify(datos),
	    type: 'POST',
	    success: function(resp){
		    console.log(resp);		   
		    console.log(resp.return.idWarehouse);
		    
		    document.getElementById('txtCodigo_almacen').value = resp.return.idWarehouse;
			$("#cboxTipo_almacen option[value="+resp.return.tipoAlmacenId+"]").attr("selected",true);
			
		    document.getElementById('txtName_almacen').value = resp.return.warehouseName;
		    
		    document.getElementById('txtUbicacion_almacen').value = resp.return.direccion;
		    $("#cboxEncargado_almacen option[value="+resp.return.gerenteSucursal+"]").attr("selected",true);
		    document.getElementById('numeroAlmacen').value = resp.return.warehouseNumber;
		},
	    error: function(e){
	    	console.log("error:"+e);
		}
	}); 
}

function consultarDatosAlmacenServ() {
	
	var url = window.location.pathname;
	var idWarehouse = url.substring(url.lastIndexOf('&') + 1);
	
	var Id_consulta_Almacen = {
		"idAlmacen": idWarehouse			
	}

	$.ajax({
	    url: '/CBPult/Almacen/consultarAlmacenPorAlmacenId',
	    dataType: 'json',
	    contentType:'application/json',
	    data:JSON.stringify(Id_consulta_Almacen),
	    type: 'POST',
	    success: function(response){
		    console.log(response);		   
		    console.log(response.return.idWarehouse);
		    return response;
		},
	    error: function(e){
	    	swal("Error al consultar el Almacén");	
	    	console.log("error:"+ txt , e);
	    	console.log("Error - Info del Almacén: ", Id_consulta_Almacen);
	    	return e;
		}
	}); 
}

function modificarAlmacenServ(){
	
	var numeroAlmacen = $("#numeroAlmacen").val();
	var nombreAlmacen = $("#txtName_almacen").val();
	var tipoAlmacen = $("#cboxTipo_almacen").val();
	var direccion =  $("#txtUbicacion_almacen").val();
	var gerente =  $("#cboxEncargado_almacen").val();
	  
	var contenido = {
		"numeroAlmacen": numeroAlmacen,
        "nombreAlmacen": nombreAlmacen,
        "tipoAlmacen": tipoAlmacen,
        "direccion": direccion,
        "gerenteSucursal": gerente,		           
	}
	
	$.ajax({
		headers: { 
			'Accept': 'application/json',
	        'Content-Type': 'application/json' 
	    },
   
        type: "POST",	  
        url: "/CBPult/Almacen/modificarAlmacen",
        data: JSON.stringify(contenido),
        dataType: "json",
        success: function(data){
        	if(data.return.descripcion=='OK'){			
        		swal({
        			title: 'Almacen modificado con exito',
		    	    text: 'Redirigiendo...',
		    	    icon: 'Exitoso',
		    	    timer: 1000,
		    	    buttons: false,
        		},
    		    function() {
        			location.href = "/CBPult/Almacen/configuration_almacen";
        		})		    	
        	}
		    else{
		    	swal("Solicitud de orden de compra en carga no Exitosa!!");	          
		    }
        }	   
	}); 
}

// Servicios para crea Almacen
function listarAlmacenesRelServ(){
	
    $('#simpletablerel').DataTable( {
	    
    	sort:false,
    	destroy: false,
    	searching: false,
    	paging: false, // le quito el paging porque no deja cargar los switches de las otras paginas
      	
    	language: {
    		url: '../js2/Spanish.json'
        },
        ajax: {
        	url:"/CBPult/Almacen/listaAlmacenes",
            dataSrc: ''
        	
        },       
        columns: [ 
        	
           {
        	   	"data": "idWarehouse",
                "class": "uno",
                "defaultContent": "",
                "render": function ( data, type, full ) {
                	return '<center><input type="checkbox" class="js-switch-blue js-check-change" data-switchery="true" style="display: none;" ></center>';;
                }
           },
           {
        	   "data:": "idWarehouse",
        	   "class": "info",
        	   "defaultContent": "",
        	   "render": function ( data, type, full ){
        		   return '<center><a title="Consultar Información del Almacén '+full.idWarehouse+'"><input type="hidden" id="dit"><i onclick="swalRelacionesAlmacenServ('+full.idWarehouse+')" class="fa fa-search" agregaryasignar" style="font-size:30px"></i></a></center>';
        	   }
           },
    	   {
                "data": "idWarehouse", // can be null or undefined
                "class": "dos",
                "defaultContent": "",
                "render": function ( data ) {
            		return '<center>'+data+'</center>';
              	}
            },
            {
                "data": "tipoAlmacenId", // can be null or undefined
                "class": "cinco",
                "defaultContent": "",
                "render": function ( data ) {
            		return '<center>'+data+'</center>';
              	}
            },
            {
                "data": "warehouseName", // can be null or undefined
                "class": "tres",
                "defaultContent": "",
                "render": function ( data ) {
            		return '<center>'+data+'</center>';
              	}
            },            
            {
                "data": "direccion", // can be null or undefined
                "class": "cuatro",
                "defaultContent": "",
                "render": function ( data ) {
            		return '<center>'+data+'</center>';
              	}
            },            
            {
                "data": "gerenteSucursal", // can be null or undefined
                "class": "seis",
                "defaultContent": "",
                "render": function ( data ) {
            		return '<center>'+data+'</center>';
              	}
            }            
        ],
        // ejecuta una funcion Despues de Cargar los Registros de la Tabla
        // lo uso para cargar la clase de los Switches
        initComplete: function( settings, json){
            //Cargar Switches
			Array.prototype.forEach.call($('.js-switch-blue'), (item, i)=>{				
				var actual_switch = new Switchery(item, {
					color: '#17a2b8',
					secondaryColor: '#e0e0e0',
					jackSecondaryColor: '#17a2b8'
				});
			});
			
        },
        
    });
    
}

function crearAlmacenServ(){
	
	var info_almacen = {
		"dto": {
			"direccion": data_almacen.direccion,
			"gerenteSucursal": 2,
			"officeId": 1,
			"tipoAlmacenId":{
				"nombre": data_almacen.tipoAlmacen,
				"tipoAlmacenId": data_almacen.tipoAlmacenId
			},
			"warehouseName": data_almacen.direccion
		}
	};
	
	if(data_almacen.zonas.length > 0){
		
		$.ajax({
			
			url: '/CBPult/Almacen/crearAlmacen',
	        type: "POST",         
	        contentType: "application/json",
	        dataType: "json",
	        data: JSON.stringify(info_almacen),
	        success: function(response){
	
	    		console.log("Respuesta Almacén: ", response);
	    		crearListaZonasServ(response.return.idObjetoCreadoCreado);
	        	
	        },
	        error: function(e, txt){
	        	swal("Error al crear el Almacén");	
		    	console.log("error:"+ txt , e);
		    	console.log("Error - Info del Almacén: ", info_almacen, "Error: ", response.return.descripcion);
		    	valid = false;
		    	zonas_creadas = false;
	        }
		
		});
		
	}
	else{
		//////////////////
        Swal.fire({
		      title: "ALMACÉN SIN ZONAS",
		      text: "No se pueden Crear Almacenes sin Zonas",
		      type: "warning",
		      confirmButtonColor: '#3085d6',
		      confirmButtonText: 'Continuar'	               
        });
        //////////////////
        valid = false;
	}
	
}

function crearListaZonasServ(idAlmacen){
	
	var info_zonas = {
		"listZonaDTO":[] // este objeto lo pide el Servicio y lleva toda la lista
	};
	
	// Construyendo el objeto acoplado al servicio de crear Lista Zonas
	for(var i = 0; i < data_zonas.length; i++){
	
		info_zonas.listZonaDTO.push({
			"descripcion": data_zonas[i].descripcionZona,
			"encargadoZona": {
				"empleadoId": 2 // quemado, hace falta la alimentación desde el modulo de Empleados
			},
			"idWarehouse": idAlmacen,
			"tipoZonaId": {
				"nombre": data_zonas[i].tipoZona,
				"tipoZonaId": data_zonas[i].IdTipoZona
			},
			"zonaNombre": data_zonas[i].descripcionZona 			
		});
		
	}
	$.ajax({
		
		url: '/CBPult/Almacen/crearListaZonaWizzard',
        type: "POST",         
        contentType: "application/json",
        dataType: "json",
        data: JSON.stringify(info_zonas),
        success: function(response){
        	
        	console.log("Respuesta Creacion Zonas",response);
        	
	        if(response.return.descripcion == "OK"){
	
	          zonas_response = response; // para cargar las zonas en el Tab de Relaciones de Zonas
	
	          response.return.listZonas.forEach(function(zona, index){
	        	  
	            data_zonas[index].id = zona.zonaId;
	            data_zonas[index].estanteriasZona.forEach(function(estanteria){
	
	             //Construyendo el objeto de Estanteria a Crear
	              var info_estanteria = {
	                "zonaId": {
	                  "zonaId": data_zonas[index].id
	                },
	                "modulos": estanteria[0],
	                "niveles": estanteria[1]
	              }						
	              crearEstanteriaServ(info_estanteria);
	
	            });
	
	          });
	          
	          // - Creacion de Relaciones de Almacén
	          crearRelacionesAlmacenServ(idAlmacen);
	          zonas_creadas = true;
	        }			

      },
      error: function(e, txt){
    	  swal("Error al crear las Zonas");
	      console.log("error:"+ txt + e);
	      console.log("Error - Info de las Zonas: ", info_zonas, "Error: ");
	      valid = false;
	      zonas_creadas = false;
      }
		
	});
	
}

function crearEstanteriaServ(info_estanteria){
	
	$.ajax({
		
		url: '/CBPult/Almacen/crearEstanteria',
        type: "POST",         
        contentType: "application/json",
        dataType: "json",
        data: JSON.stringify(info_estanteria),
        success: function(response){
        	
        	console.log("Respuesta Creacion Estanteria",response);
          
        },
        error: function(e, txt){
        	swal("Error al crear las Estanterias de la Zona ", info_estanteria.zonaId.zonaId);
	    	console.log("error:"+ txt + e);
	    	console.log("Error - Info de las Estanterias: ", info_estanteria, " Error: ", response.return.descripcion);
	    	valid = false;
	    	zonas_creadas = false;
        }
		
	});
	
}

function crearRelacionesAlmacenServ(idAlmacen){
	
	// Construyendo Relaciones de Almacén
    $('#simpletablerel .dos center').map(function(i, center){
    	
    	if($('#simpletablerel .uno center .js-switch-blue')[i].checked){
    		
    		var info_Relacion_almacen = {
    			"almacenActualId": {
    				"idWarehouse": idAlmacen
    			},
    			"almacenDestinoId": {
    				"idWarehouse": parseInt(center.innerHTML)
    			}
    		};
    		
    		$.ajax({
    			
    			url: '/CBPult/Almacen/crearRelacionAlmacenes',
    	        type: "POST",         
    	        contentType: "application/json",
    	        dataType: "json",
    	        data: JSON.stringify(info_Relacion_almacen),
    	        success: function(response){    	        	
    	        	
    	        	console.log(i, "Relacion Almacén: ", info_Relacion_almacen);
    	        	console.log("Respuesta... ", response);
    	        	
    	        },
    	        error: function(e, txt){
    	        	swal("Error al crear las Relaciones del Almacén");
    	        	console.log("error:"+ txt + e);
    	        	console.log("Error - Info de las Relaciones de Almacén: ", info_Relacion_almacen, "Error: ", response.return.descripcion);
    	        }
    			
    		});
    		
    	}
    });
    
    //////////////////
    Swal.fire({
	      title: "NUEVO ALMACÉN CREADO",
	      text: "Creación del Almacén ID: [ " +idAlmacen+ " ], Tipo: [ "+ data_almacen.tipoAlmacen +" ] Exitosa!!! Presiona (Siguiente) para Personalizar las Relaciones de tus Zonas",
	      type: "success",
	      confirmButtonColor: '#3085d6',
	      confirmButtonText: 'OK'	               
    });
    //////////////////
    
}

function crearRelacionesZonasServ(){
	
	data_zonas.map(function(zona, i){
		
		// Construyendo Relaciones de Almacén
		$('#tbodyrel_'+i+' tr').map(function(j, tr){
			
			if($('#tbodyrel_'+i+' tr td .js-switch-blue_rel')[j].checked){
	    		
	    		var info_Relacion_zona = {
    				"zonaActualId": {
    					"zonaId": $('#txtCodigo_zona_rel'+i).val()
    				},
    				"zonaDestinoId": {
    					"zonaId": $('#tbodyrel_'+i+' tr th.id_zonaRel')[j].innerHTML
    				}
	    		};
	    		
	    		$.ajax({
	    			
	    			url: '/CBPult/Almacen/crearRelacionZonas',
	    	        type: "POST",         
	    	        contentType: "application/json",
	    	        dataType: "json",
	    	        data: JSON.stringify(info_Relacion_zona),
	    	        success: function(response){    	        	
	    	        	
	    	        	console.log(i, "Relacion Zona ["+i+", "+j+"]: ", info_Relacion_zona);
	    	        	console.log("Respuesta Relacion Zona ... ", response);
	    	        	
	    	        },
	    	        error: function(e, txt){
	    	        	swal("Error al crear las Relaciones de las Zonas");
	    	        	console.log("error:"+ txt + e);
	    	        	console.log("Error - Info de las Relaciones de Zonas: ", info_Relacion_zona);
	    	        	zonas_creadas = false;
	    	        }
	    			
	    		});
	    		
	    	}
			
	    
		});
		
		
	});
	
}

function swalRelacionesAlmacenServ(id_Almacen){
	
	console.log(typeof id_Almacen);
	var idAlmacenConsulta = {					
		"idAlmacen": id_Almacen				
	};
	
	$.ajax({
		
		url: '/CBPult/Almacen/consultarAlmacenPorAlmacenId',
        type: "POST",         
        contentType: "application/json",
        dataType: "json",
        data: JSON.stringify(idAlmacenConsulta),
        success: function(response){
        	console.log("Almacen ", response);
        	var almacen = response.return;
        	var tipoAlm;
        	
        	if(almacen.tipoAlmacenId == 1){
        		tipoAlm = "Almacén";
        	}
        	else if(almacen.tipoAlmacenId == 2){
        		tipoAlm = "Laboratorio";
        	}
        	else if(almacen.tipoAlmacenId == 3){
        		tipoAlm = "Sucursal";
        	}
        	else{
        		tipoAlm = "Desconocido";
        	}
        	
        	var htmlAlmacen = `
    			<div class="row">
    									                                            
    	        	<!-- Card 1 -->
    	            <div class="col-sm-12">
    	                <div class="card">
    	                    <div class="card-header">
    	                        <div class="card-header-rigth">									                                                            	
    	                        </div>
    	                    </div>
    	                    <div class="card-block">
    	                    	<!-- Titulo de Card -->
    	                    	<h4 id="titleAlmacen" class="sub-title">Información de Almacén `+almacen.idWarehouse+`</h4>
    	                    	
    	                    	<!-- Row -->                                                        	
    	                    	<div class="row">
    	                    		
    	                    		<!-- Contenido de Card -->
    	                    		
    	                    		<div id="contentCodigo_almacen" class="col-sm-12">
    	                                <label class="col-sm-12 col-form-label">Código de Almacén</label>
    	                                <div class="col-sm-12">
    	                                    <input type="text" id="txtCodigo_almacen" value="`+almacen.warehouseNumber+`" class="form-control" placeholder="Codigo" disabled>
    	                                </div>
    	                        	</div>
    	                        	
    	                        
    	                            <div class="col-sm-6 mobile-inputs">
    	                                <label class="col-sm-12 col-form-label">Tipo Almacén</label>
    	                                <div class="col-sm-12">
    	                                    <input id="cboxTipo_almacen"  value="`+tipoAlm+`"class="form-control" disabled>
    	                         		</div>
    	                            </div>
    	                            
    	                            <div class="col-sm-6 mobile-inputs">
    	                            	<label class="col-sm-12 col-form-label">Descripción Almacén</label>
    	                            	<div class="col-sm-12">
    	                                    <input type="text" id="txtDesc_almacen" value="`+almacen.warehouseName+`" class="form-control"  data-type="danger" data-from="top" data-align="left" data-icon="fa fa-check" disabled>
    	                            	</div>
    	                            </div>
    	                            
    	                            <div class="col-sm-6 mobile-inputs">
    	                                <label class="col-sm-12 col-form-label">Gerente de Sucursal</label>
    	                                <div class="col-sm-12">
    	                                    <input type="text" id="cboxEncargado_almacen" value="`+almacen.gerenteSucursal+`" class="form-control" disabled> <!-- Comsumir servicio de Consulta de Empleados -->    	                            											                                                          
    	                    			</div>
    	                    		</div>
    	                        	
    	                        	<div class="col-sm-6 mobile-inputs">
    	                                <label class="col-sm-12 col-form-label solo_texto ">Ubicación (Dirección)</label>
    	                                <div class="col-sm-12">
    	                                    <input id="txtUbicacion_almacen" value="`+almacen.direccion+`" type="text" class="form-control" disabled>
    	                                </div>
    	                            </div>
    	                            
    	                            
    	                    		<!-- Contenido de Card -->  
    	                                
    	                		</div>
    	            			<!-- Row -->                                                      		                                                        	
    	                	 	                                                 
    	        			</div>
    	                	
    	    			</div>
    				</div>
    	            <!-- Card 1 -->
    	            
    	            <!-- Card 1 -->
                    <div class="col-sm-12">
                        <div class="card">
                            <div class="card-header">
                                <!-- Titulo de Card -->
                            	<h4 class="sub-title" style="margin:0px">Zonas del Almacén</h4>
                            </div>
                            
                            <div class="card-block">										                                                    	
                            										                                                        	
                            	<!-- Row -->                                                        	
                            	<div class="row">
                            		
                            		<!-- Contenido de Card -->
                            		 
                            		<!-- Fila 1 -->										                                                        	
                            		<div class="col-sm-12">
                            			<div class="dt-responsive table-responsive">
                                            <table id="tableZonasSwal" class="table table-striped table-bordered display2 nowrap">
                                                <thead>
                                                    <tr>
                                                        <th>Código Zona</th>
                                                        <th>Tipo Zona</th>
                                                        <th>Descripción</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    
                                                </tbody>
                                            </table>														                                                    
                                       	</div>
                            		</div>                                                                                                                            
                                	
                                	<!-- Fila 1 --> 										                                                            
                                    
                            		<!-- Contenido de Card -->  
                                        
                        		</div>
                    			<!-- Row -->                                                      		                                                        	
                        	 	                                                 
                			</div>
                        	
            			</div>
        			</div>
                    <!-- Card 1 -->	
    	            
    			</div>
    		`
        	
        	Swal.fire({
        		title: '<strong>Información del Almacén '+response.return.idWarehouse+'</strong>',
        		type: 'info',
        		html: htmlAlmacen,
        		showCloseButton: true,
        		focusConfirm: false,
        		confirmButtonText:'<i class="fa fa-thumbs-up"></i> OK!',
        	});
        	
        	$('#tableZonasSwal').DataTable( {
        	    
            	sort: false,
            	destroy: true,
            	searching: false,
            	paging: true, // le quito el paging porque no deja cargar los switches de las otras paginas
              	
            	language: {
            		url: '../js2/Spanish.json'
                },
                ajax: {
                	url:"/CBPult/Almacen/listaZonasByIdAlmacen/"+id_Almacen,
                    dataSrc: ''
                	
                },       
                columns: [
                	{
                		"data": "zonaId",
                        "class": "uno",
                        "defaultContent": "",
                        "render": function ( data, type, full ) {
                        	return '<center>'+data+'</center>';
                        }
                   },
                   {
                	   "data:": "idTipoZona",
                	   "class": "info",
                	   "defaultContent": "",
                	   "render": function ( data, type, full ){
                		   var tipoZona;

                		   if(full.idTipoZona == 1){
                			   tipoZona = "Recibo";
                		   }
                		   else if(full.idTipoZona == 2){
                			   tipoZona = "Almacenaje";
                		   }
                		   else if(full.idTipoZona == 3){
                			   tipoZona = "Restringido";
                		   }
                		   else if(full.idTipoZona == 4){
                			   tipoZona = "Despacho";
                		   }
                		   else{
                			   tipoZona = "Desconocido";
                		   }
                		   
                		   return '<center>'+tipoZona+'</center>';
                	   }
                   },
            	   {
                        "data": "descripcion", // can be null or undefined
                        "class": "dos",
                        "defaultContent": "",
                        "render": function ( data ) {
                    		return '<center>'+data+'</center>';
                      	}
            	   }
                ]
        	});
        
        },					
		error: function(e, txt){
			console.log("Error: ", e, txt);
		}
		
	});		
	
}

// Servicios Edit Wizzard
function listarModificarAlmacenesRelServ(){
	
    $('#simpletablerel').DataTable( {
	    
    	sort:false,
    	destroy: false,
    	searching: false,
    	paging: false, // le quito el paging porque no deja cargar los switches de las otras paginas
      	
    	language: {
    		url: '../js2/Spanish.json'
        },
        ajax: {
        	url:"/CBPult/Almacen/listaAlmacenes",
            dataSrc: ''
        	
        },       
        columns: [ 
        	
           {
        	   	"data": "idWarehouse",
                "class": "uno",
                "defaultContent": "",
                "render": function ( data, type, full ) {
                	// Para Filtrar las Relaciones ya Existentes del Almacén
                	var ret = '<center><input type="checkbox" class="js-switch-blue js-check-change" data-switchery="true" style="display: none;" ></center>';
                	data_almacen.relaciones.map(function(rel, j){
    					
    					if(rel.almacenDestinoId.idWarehouse == data){
    						ret = '<center><input type="checkbox" class="js-switch-blue js-check-change" data-switchery="true" style="display: none;" checked></center>';
    					}
    					
    				});
                	return ret;
                }
           },
           {
        	   "data:": "idWarehouse",
        	   "class": "info",
        	   "defaultContent": "",
        	   "render": function ( data, type, full ){
        		   return '<center><a title="Consultar Información del Almacén '+full.idWarehouse+'"><input type="hidden" id="dit"><i onclick="swalRelacionesAlmacenServ('+full.idWarehouse+')" class="fa fa-search" agregaryasignar" style="font-size:30px"></i></a></center>';
        	   }
           },
    	   {
                "data": "idWarehouse", // can be null or undefined
                "class": "dos",
                "defaultContent": "",
                "render": function ( data ) {
            		return '<center>'+data+'</center>';
              	}
            },
            {
                "data": "tipoAlmacenId", // can be null or undefined
                "class": "cinco",
                "defaultContent": "",
                "render": function ( data ) {
            		return '<center>'+data+'</center>';
              	}
            },
            {
                "data": "warehouseName", // can be null or undefined
                "class": "tres",
                "defaultContent": "",
                "render": function ( data ) {
            		return '<center>'+data+'</center>';
              	}
            },            
            {
                "data": "direccion", // can be null or undefined
                "class": "cuatro",
                "defaultContent": "",
                "render": function ( data ) {
            		return '<center>'+data+'</center>';
              	}
            },            
            {
                "data": "gerenteSucursal", // can be null or undefined
                "class": "seis",
                "defaultContent": "",
                "render": function ( data ) {
            		return '<center>'+data+'</center>';
              	}
            }            
        ],
        // ejecuta una funcion Despues de Cargar los Registros de la Tabla
        // lo uso para cargar la clase de los Switches
        initComplete: function( settings, json){
            //Cargar Switches
			Array.prototype.forEach.call($('.js-switch-blue'), (item, i)=>{				
				var actual_switch = new Switchery(item, {
					color: '#17a2b8',
					secondaryColor: '#e0e0e0',
					jackSecondaryColor: '#17a2b8'
				});
			});
			
        },
        
    });
    
}

function cargaDatosModificarAlmacenIdServ(){ // Carga toda la información del Almacén, Zonas, Estanterias y Relaciones
	
	var datos = {
		"idAlmacen": IdAlmacen			
	}

	$.ajax({
	    url:'/CBPult/Almacen/consultarAlmacenPorAlmacenId',
	    dataType: 'json',
	    contentType:'application/json',
	    data:JSON.stringify(datos),
	    type: 'POST',
	    success: function(resp){
		    
	    	console.log("Respuesta Consulta Almacen: ",resp);
	    	
	    	var response_tipoAlmacen = resp.return.tipoAlmacenId;
	    	if(response_tipoAlmacen == 1){
	    		response_tipoAlmacen = "ALMACEN"
	    	}
	    	else if(response_tipoAlmacen == 2){
	    		response_tipoAlmacen = "LABORATORIO"
	    	}
	    	else if(response_tipoAlmacen == 3){
	    		response_tipoAlmacen = "SUCURSAL"
	    	}
	    	
	    	// Llenando los campos del Tab de Almacén
	    	$('#txtCodigo_almacen').val(resp.return.warehouseNumber);	    	
			$("#cboxTipo_almacen option[value="+response_tipoAlmacen+"]").attr("selected",true);			
		    document.getElementById('txtDesc_almacen').value = resp.return.warehouseName;		    
		    document.getElementById('txtUbicacion_almacen').value = resp.return.direccion;
		    
		    $.get("/CBPult/Almacen/listaZonasByIdAlmacen/"+IdAlmacen+"", function(getZonas){
				
				//console.log("Zonas del Almacén: ", getZonas);
				
				var tipoZona;				
				
				if(getZonas.length != 0){					
					
					getZonas.map(function(zona, i){
						
						var estanteriasZona = [];
						var relacionesZona = [];
						
						if(zona.idTipoZona == 1){
							tipoZona = "Recibo"
						}
						else if(zona.idTipoZona == 2){
							tipoZona = "Almacenaje"
						}
						else if(zona.idTipoZona == 3){
							tipoZona = "Restringido"
						}
						else if(zona.idTipoZona == 4){
							tipoZona = "Despacho"
						}
						
						//Lista de Estanterias de la Zona 
						$.get("/CBPult/Almacen/listaEstanteriasByIdZona/"+zona.zonaId+"", function(getEstanterias){
							
							getEstanterias.map(function(estanteria){
								estanteriasZona.push(estanteria);								
							});
							//estanteriasZona.push(getEstanterias);
							
						});
						//Lista de Estanterias de la Zona 
						
						//console.log("Almacen: "+IdAlmacen+" Zona: "+i+" ID ( "+zona.zonaId+" )"); console.log(zona)
						//console.log("Estanterias de la Zona: "+i, estanteriasZona);
						
						
						
						//Lista de Relaciones de la Zona 
						$.get("/CBPult/Almacen/listaRelacionZonas", function(getRelaciones){
							
							//console.log("Info Rel: ", zona.zonaId, getRelaciones);
							
							getRelaciones.map(function(relacion, j){
								
								//console.log("Info Rel: ", zona.zonaId);
								
								if(relacion.zonaActualId.zonaId == zona.zonaId){
									relacionesZona.push(relacion);
								}
								
							});
							
						});
						//console.log("Relaciones Zona ["+zona.zonaId+"]: ", relacionesZona);
						
						//Lista de Relaciones de la Zona 
						
						data_zonasTemp_editar.push({
							"id": zona.zonaId,
							"tipoZona": tipoZona,
							"IdTipoZona": zona.idTipoZona,
							"descripcionZona": zona.descripcion,
							"encargadoZona": zona.encargadoZona,
							"estanteriasZona": estanteriasZona,
							"relacionesZona": relacionesZona
						});
						
					});
					
					//console.log("Data: ", data_zonas);
					
				}
				else{
					data_zonasTemp_editar.push({
						"id": 1,
						"tipoZona": "Recibo",
						"IdTipoZona": 1,
						"descripcionZona": "",
						"encargadoZona": "",
						"estanteriasZona": [],
						"relacionesZona": []
					});
					swal("Almacén sin Zonas, puedes crearle nuevas!");
				}
				
			});
		    
		    
		    // Relaciones del Almacén			
			$.get('/CBPult/Almacen/listaAlmacenesRelacionados/'+IdAlmacen+"", function(relacionesAlmacen){
				
				data_relacionesTemp_Almacen = relacionesAlmacen;
				console.log("Relaciones Almacen: ", data_relacionesTemp_Almacen);
				
			});
			
		},
	    error: function(e){
	    	console.log("Almacen error: "+ e);
		}
		
	}); 
	
}

function cargaDatosModificarZonasServ(){
		
		// Mensaje de Carga
		let timerInterval;
		Swal.fire({
			title: 'Cargando Información de Las Zonas de tu Almacén!',
			html: 'Espera un Momento',
			allowOutsideClick: false,
			timer: 3000,
			onBeforeOpen: () => {
				Swal.showLoading()
				timerInterval = setInterval(() => {}, 100)
			},
			onClose: () => {
				
				data_zonasTemp_editar.map(function(zona, i, data){
					
					//console.log(zona);
					
					var html_zona = `
						<!-- Zona --> 
				        <div id="zona`+zona.id+`" class="zona_zonas col-sm-12 card" style="border: none">
				    	
				    	<div class="row">
				    		<!-- Btn Eliminar Zona -->
				    		<div class="col-sm-12" style="margin: 5px 0px 5px 0px;">									                                                			
				        		<div class="column" align="left">																
									<a style="margin-right: 5px;" title="Eliminar Zona">
										<img id="btnEliminarZona_config" onClick="eliminarZona(`+zona.id+`)" src="`+thEliminar+`" style="width: 60px"></img>
									</a>
								</div>											                                                	
				    		</div>
				    		<!-- Btn Eliminar Zona -->
				    		<!-- Card 1 -->
				        	<div class="col-sm-4">											                                            	                                   
				            	<div class="card">                                                   
				                	<div class="card-block">
				                		<!-- Titulo de Card -->
				                    	<h4 class="sub-title">Información de Zona `+zona.id+`</h4>
				                    	
				                    	<!-- Row -->                                                        	
				                    	<div class="row">
				                    		
				                    		<!-- Contenido de Card -->  
				                    		<div class="col-sm-12">
				                                <label class="col-sm-12 col-form-label">Código de Zona</label>
				                                <div class="col-sm-12">
				                                    <input type="text" id="txtCodigo_zona`+zona.id+`" class="form-control" placeholder="Codigo" disabled>
				                                </div>
				                        	</div>
				                        
				                            <div class="col-sm-12 mobile-inputs">
				                                <label class="col-sm-12 col-form-label">Tipo Zona</label>
				                                <div class="col-sm-12">
				                                    <select name="select" id="cboxTipo_zona`+zona.id+`" class="form-control">
				                                        <option value="Recibo" name="1">Recibo</option>
				                                        <option value="Almacenaje" name="2">Almacenaje</option>
				                                        <option value="Restringido" name="3">Restringido</option>
				                                        <option value="Despacho" name="4">Despacho</option>
				                                    </select>
				                         		</div>
				                            </div>
				                            
				                            <div class="col-sm-12 mobile-inputs">
				                            	<label class="col-sm-12 col-form-label">Descripción Zona</label>
				                            	<div class="col-sm-12">
				                                    <input type="text" id="txtDescripcion_zona`+zona.id+`" onblur="lleno(`+zona.id+`)" class="form-control solo_texto" placeholder="">
				                                </div>
				                            </div>	                                                        	
				                            
				                            <div class="col-sm-12 mobile-inputs">
				                                <label class="col-sm-12 col-form-label">Encargado de Zona</label>
				                                <div class="col-sm-12">
				                                    <select name="select" id="cboxEncargado_zona`+zona.id+`" class="form-control">
				                                        <option value="Elon Musk">Elon Musk</option>
				                                        <option value="Einstein">Einstein</option>
				                                        <option value="Jack Ma">Jack Ma</option>
				                                    </select>
				                         		</div>
				                            </div>
				                            <!-- Contenido de Card -->  
				                            
				                    	</div>
				                    	<!-- Row -->                                                      		                                                        	
				                                                                  
				                	</div>
				            	</div> 
				        	                                
				            </div>
				            <!-- Card 1 -->											                                            
				            
				            <!-- Card 2 -->
				        	<div class="col-sm-8"> 
				        	                                           
				            	<div class="card">                                                   
				                	<div class="card-block">
				                		<!-- Titulo de Card -->
				                    	<h4 class="sub-title">Información Estanterias</h4>
				                    	
				                    	<!-- Fila 1 -->                                      
				                    	<div class="row">
				                    		<div class="col-sm-12">
				                    		
				                    			<!-- inputs Estanteria -->
				                    			<div class="row">
				                                    
				                                    <div class="col-sm-5">														                                                                
				                                        <div class="col-sm-12">
				                                            <input type="text" id="txtModulos_estanteria`+zona.id+`" class="form-control solo_num" onblur="modulos(`+zona.id+`)" placeholder="Módulos">
				                                        </div>
				                                	</div>
				                    			
				                    				<div class="col-sm-5">														                                                                
				                                        <div class="col-sm-12">
				                                            <input type="text" id="txtNiveles_estanteria`+zona.id+`" class="form-control solo_num"  onblur="niveles(`+zona.id+`)" placeholder="Niveles">
				                                        </div>
				                                	</div>
				                                	
				                                	<div class="col-sm-2">									                                                			
				                                		<div class="column" align="right">																
															<a onClick="crearTrEditar(`+zona.id+`)" style="margin-right: 5px;" title="Nueva Estanteria">
																<i class="fa fa-plus-square agregaryasignar" style="font-size: 50px"></i>
															</a>
														</div>											                                                	
				                            		</div>
				                            		
				                    			</div>
				                    			<!-- inputs Estanteria -->
				                    			
				                    			<div class="dt-responsive table-responsive">
				                                    <table id="simpletable`+zona.id+`" class="table-sm table-striped table-bordered display`+zona.id+` nowrap">
				                                        <thead>
															<tr>
																<th>IdEstanteria</th>
																<th>Módulos</th>
																<th>Niveles</th>
																<th>Acciones</th>																														
															 </tr>
														</thead>
														<tbody id="tbody`+zona.id+`">
														    
														    
														</tbody>
				                                    </table>
				                               	</div>                                                        			
				                               	
				                               	
				                    		</div> 
				                    	</div>                                                                                                                           
				                	</div>
				                	<!-- Fila 1 -->                                                   	
				                	                                                         
				            	</div>
				        	</div>
				        	<!-- Card 2 -->
				    	                                
				        </div>
				    </div>										                                            
				    <!-- Zona -->
				    `;
					$('#zonas-content').append(html_zona);
					
					$("#simpletable"+zona.id).DataTable({ 
						"language": { // Configuración del Lenguaje de la Tabla
				            "lengthMenu": "Mostrar _MENU_ registros",
				            "zeroRecords": false,
				            "info": "Mostrando registros del _START_ al _END_ de un total de _TOTAL_ registros",
				            "infoEmpty": "Mostrando registros del 0 al 0 de un total de 0 registros",
				            "infoFiltered": "(filtrado de un total de _MAX_ registros)",
				            "sSearch": "Buscar:",            
				        },
				        "scrollY": "200px", // Alto de la Tabla
				        "scrollCollapse": true,
				        "paging": false,
				        "searching": false,
				        "info": false,		        
				    });
					
					// Para remover la fila de las tablas que aparece cuando no hay registros
					var body = $('#simpletable'+zona.id);
					body.find( 'tbody tr:eq(0)').remove();
					
					//console.log("Estanterias Zona: ", zona.estanteriasZona);
					zona.estanteriasZona.map(function(est, j){
						
						$('#tbody'+zona.id).append(`
							<tr id="est_`+est.estanteriaId+`">
								<td>`+est.estanteriaId+`</td>
						    	<td>`+est.modulos+`</td>
						    	<td>`+est.niveles+`</td>																												    	
						    	<td></td>
						    </tr>
						`);
						
					});		
					
					var tipo_zona;
					if(zona.IdTipoZona == 1){
						tipo_zona = "Recibo";
					}
					else if(zona.IdTipoZona == 2){
						tipo_zona = "Almacenaje";
					}
					else if(zona.IdTipoZona == 3){
						tipo_zona = "Restringido";
					}
					else if(zona.IdTipoZona == 4){
						tipo_zona = "Despacho";
					}
					
					$('#txtCodigo_zona'+zona.id).val(zona.id);    	
					$("#cboxTipo_zona"+zona.id+" option[value="+tipo_zona+"]").attr("selected",true);
					$('#txtDescripcion_zona'+zona.id).val(zona.descripcionZona);
					//$('#cboxEncargado_zona'+zona.encargadoZona);
				});
				clearInterval(timerInterval);
			}
		});
		// Mensaje de Carga		

	
	
}

function modificarAlmacenServ(){
	
	var infoEdit_almacen = {
		"numeroAlmacen": data_almacen.warehouseNumber,
		"nombreAlmacen": data_almacen.warehouseName,
		"identificacionOficina": 1,
		"tipoAlmacen": data_almacen.tipoAlmacenId,
		"direccion": data_almacen.direccion,
		"gerenteSucursal": 2
	}
	console.log(infoEdit_almacen);
	$.ajax({
		
		url: '/CBPult/Almacen/modificarAlmacen',
        type: "POST",         
        contentType: "application/json",
        dataType: "json",
        data: JSON.stringify(infoEdit_almacen),
        success: function(response){
        	
    		console.log("Respuesta Edicion Almacén: ", response);
        	
        },
		
	});
	
}

function crearNuevasZonasServ(){
	
	console.log("modServ");
	
	// creando Zonas nuevas
	var info_zonas_nuevas = {
		"listZonaDTO":[] // este objeto lo pide el Servicio y lleva toda la lista
	};
	
	// Construyendo el objeto acoplado al servicio de crear Lista Zonas
	for(var i = 0; i < data_nuevas_zonas.length; i++){
	
		info_zonas_nuevas.listZonaDTO.push({
			"descripcion": data_nuevas_zonas[i].descripcionZona,
			"encargadoZona": {
				"empleadoId": 2 // quemado, hace falta la alimentación desde el modulo de Empleados
			},
			"idWarehouse": IdAlmacen,
			"tipoZonaId": {
				"nombre": data_nuevas_zonas[i].tipoZona,
				"tipoZonaId": data_nuevas_zonas[i].IdTipoZona
			},
			"zonaNombre": data_nuevas_zonas[i].descripcionZona 			
		});
		
	}
	console.log("info_zonas_nuevas a crear: ", info_zonas_nuevas);
	$.ajax({
		
		url: '/CBPult/Almacen/crearListaZonaWizzard',
        type: "POST",         
        contentType: "application/json",
        dataType: "json",
        data: JSON.stringify(info_zonas_nuevas),
        success: function(response){
        	
        	console.log("Respuesta Creacion Zonas Nuevas: ",response);
        	
	        if(response.return.descripcion == "OK"){
	
	        	zonas_response = response; // para cargar las zonas en el Tab de Relaciones de Zonas
	
	        	response.return.listZonas.forEach(function(zona, index){
	        	  
	        		data_nuevas_zonas[index].id = zona.zonaId;
	        		data_nuevas_zonas[index].estanteriasZona.forEach(function(estanteria){
	
	        			//Construyendo el objeto de Estanteria a Crear
	        			var info_estanteria = {
	        					"zonaId": {
	        						"zonaId": data_nuevas_zonas[index].id
	        					},
	        					"modulos": estanteria[0],
	        					"niveles": estanteria[1]
	        			}						
	        			crearEstanteriaServ(info_estanteria);
	
	        		});
	
	        	});
	          
	        	// - Creacion de Relaciones de Almacén
	        	//crearRelacionesAlmacenServ(idAlmacen);
	        	zonas_creadas = true;
	        }		

        },
        error: function(e, txt){
        	swal("Error al crear las Zonas");
        	console.log("error:"+ txt + e);
        	console.log("Error - Info de las Zonas: ", info_zonas, "Error: ");
        	valid = false;
        	zonas_creadas = false;
        }
		
	});
	
}

function modificarZonasServ(){
	
	data_zonas.map(function(zona, i){
		
		var info_zona = {
			"zonaId": zona.id,
			"zonaNombre": zona.descripcionZona,
			"descripcion": zona.descripcionZona,
			"encargadoZona":{
				"empleadoId": 2
			},
			"tipoZonaId":{
				"tipoZonaId": zona.IdTipoZona
			},
			"idWarehouse":{
				"idWarehouse": IdAlmacen
			}
		}
		$.ajax({
			
			url: '/CBPult/Almacen/modificarZona',
	        type: "POST",         
	        contentType: "application/json",
	        dataType: "json",
	        data: JSON.stringify(info_zona),
	        success: function(response){
	        	
	        	console.log("Respuesta Edicion Zona",response);
	        	
	        },
	        error: function(e, txt){
	        	swal("Error al Editar la Zona");
	        	console.log("error:"+ txt + e);
		  	    console.log("Error - Info de las Zonas: ", info_zona, "Error: ");
		  	    valid = false;
	        }
			
		});
		
		
	});
	
}

function modificarRelacionesAlmServ(){
	
	console.log("Relaciones Almacen...")
	
	// Construyendo Relaciones de Almacén
    $('#simpletablerel .dos center').map(function(i, center){
    	
    	
    	if($('#simpletablerel .uno center .js-switch-blue')[i].checked){
    		
    		data_almacen.map(function(zona, j){
    			
    			
    			
    		});
    		
    		/*var info_Relacion_almacen = {
    			"almacenActualId": {
    				"idWarehouse": idAlmacen
    			},
    			"almacenDestinoId": {
    				"idWarehouse": parseInt(center.innerHTML)
    			}
    		};
    		
    		$.ajax({
    			
    			url: '/CBPult/Almacen/crearRelacionAlmacenes',
    	        type: "POST",         
    	        contentType: "application/json",
    	        dataType: "json",
    	        data: JSON.stringify(info_Relacion_almacen),
    	        success: function(response){    	        	
    	        	
    	        	console.log(i, "Relacion Almacén: ", info_Relacion_almacen);
    	        	console.log("Respuesta... ", response);
    	        	
    	        },
    	        error: function(e, txt){
    	        	swal("Error al crear las Relaciones del Almacén");
    	        	console.log("error:"+ txt + e);
    	        	console.log("Error - Info de las Relaciones de Almacén: ", info_Relacion_almacen, "Error: ", response.return.descripcion);
    	        }
    			
    		});*/
    		
    	}
    });
    
    //////////////////
    Swal.fire({
	      title: "NUEVO ALMACÉN CREADO",
	      text: "Creación del Almacén ID: [ " +idAlmacen+ " ], Tipo: [ "+ data_almacen.tipoAlmacen +" ] Exitosa!!! Presiona (Siguiente) para Personalizar las Relaciones de tus Zonas",
	      type: "success",
	      confirmButtonColor: '#3085d6',
	      confirmButtonText: 'OK'	               
    });
    //////////////////
	
}
