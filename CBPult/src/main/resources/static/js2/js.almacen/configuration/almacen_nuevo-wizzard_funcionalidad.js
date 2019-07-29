'use strict'

var thEditar = "/img2/draw_edit_pen_pencil_tool_write_writing_icon_123200.ico";
var thEliminar = "/img2/bin_delete_file_garbage_recycle_remove_trash_icon_123192.ico";

$(document).ready(function(){	
	var contador_zonas = 1;
	var contenedor_zonas = $('#zonas-content');
	var contenedor_relZonas = $('#relaciones_zonas');
	var btnNuevaZona = $('#btnNuevaZona_config');	
	var btnContar = $('#contar');
	var num_zonas=0;
	
	btnNuevaZona.click(function(){
		
		// Estas variables se usan simultaneamente con el mismo boton y crean Zonas en los 2 Tabs al mismo tempo
		// Se usa para Crear una nueva Zona en el Tab de Zonas Cuando se presiona btnNuevaZona
		var html_zona = `
			<!-- Zona --> 
            <div id="zona`+contador_zonas+`" class="zona_zonas col-sm-12 card" style="border: none">
            	
            	<div class="row">
            		<!-- Btn Eliminar Zona -->
            		<div class="col-sm-12" style="margin: 5px 0px 5px 0px;">									                                                			
                		<div class="column" align="left">																
							<a style="margin-right: 5px;" title="Eliminar Zona">
								<i id="btnEliminarZona_config" onClick="eliminarZona(`+contador_zonas+`)" class="fa fa-plus-square agregaryasignar" style="font-size: 50px"></i>
							</a>
						</div>											                                                	
            		</div>
            		<!-- Btn Eliminar Zona -->
            		<!-- Card 1 -->
                	<div class="col-sm-4">											                                            	                                   
                    	<div class="card">                                                   
                        	<div class="card-block">
                        		<!-- Titulo de Card -->
                            	<h4 class="sub-title">Información de Zona `+contador_zonas+`</h4>
                            	
                            	<!-- Row -->                                                        	
                            	<div class="row">
                            		
                            		<!-- Contenido de Card -->  
                            		<div class="col-sm-12">
                                        <label class="col-sm-12 col-form-label">Código de Zona</label>
                                        <div class="col-sm-12">
                                            <input type="text" id="txtCodigo_zona`+contador_zonas+`" class="form-control" placeholder="Codigo" disabled>
                                        </div>
                                	</div>
                                
                                    <div class="col-sm-12 mobile-inputs">
                                        <label class="col-sm-12 col-form-label">Tipo Zona</label>
                                        <div class="col-sm-12">
                                            <select name="select" id="cboxTipo_zona`+contador_zonas+`" class="form-control">
                                                <option value="Recibo">Recibo</option>
                                                <option value="Almacenaje">Almacenaje</option>
                                                <option value="Almacenaje Restringido">Almacenaje Restringido</option>
                                                <option value="Despacho">Despacho</option>
                                            </select>
                                 		</div>
                                    </div>
                                    
                                    <div class="col-sm-12 mobile-inputs">
                                    	<label class="col-sm-12 col-form-label">Descripción Zona</label>
                                    	<div class="col-sm-12">
                                            <input type="text" id="txtDescripcion_zona`+contador_zonas+`" onblur="soloTexto(`+contador_zonas+`)" class="form-control solo_texto" placeholder="">
                                        </div>
                                    </div>	                                                        	
                                    
                                    <div class="col-sm-12 mobile-inputs">
                                        <label class="col-sm-12 col-form-label">Encargado de Zona</label>
                                        <div class="col-sm-12">
                                            <select name="select" id="cboxEncargado_zona`+contador_zonas+`" class="form-control">
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
                                                    <input type="text" id="txtModulos_estanteria`+contador_zonas+`" class="form-control solo_num" onblur="modulos(`+contador_zonas+`)" placeholder="Módulos">
                                                </div>
                                        	</div>
                            			
                            				<div class="col-sm-5">														                                                                
                                                <div class="col-sm-12">
                                                    <input type="text" id="txtNiveles_estanteria`+contador_zonas+`" class="form-control solo_num"  onblur="niveles(`+contador_zonas+`)" placeholder="Niveles">
                                                </div>
                                        	</div>
                                        	
                                        	<div class="col-sm-2">									                                                			
                                        		<div class="column" align="right">																
													<a onClick="crearTr(`+contador_zonas+`)" style="margin-right: 5px;" title="Nueva Estanteria">
														<i class="fa fa-plus-square agregaryasignar" style="font-size: 50px"></i>
													</a>
												</div>											                                                	
                                    		</div>
                                    		
                            			</div>
                            			<!-- inputs Estanteria -->
                            			
                            			<div class="dt-responsive table-responsive">
                                            <table id="simpletable`+contador_zonas+`" class="table-sm table-striped table-bordered display`+contador_zonas+` nowrap">
                                                <thead>
													<tr>
														<th>Código</th>
														<th>Módulos</th>
														<th>Niveles</th>
														<th>Acciones</th>																														
													 </tr>
												</thead>
												<tbody id="tbody`+contador_zonas+`">
												    
												    
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
            <!-- Zona -->`;
		
		// Se usa para Crear una nueva Zona en el Tab de Relaciones Cuando se presiona btnNuevaZona		
		var html_relacion_zona = `
			<!-- Zona Relacion -->
            <div id="" class="zona col-sm-12 card" style="border: none">
            	
            	<div class="row">
            		
            		<!-- Card 1 -->
                	<div class="col-sm-4">											                                            	                                   
                    	<div class="card">                                                   
                        	<div class="card-block">
                        		<!-- Titulo de Card -->
                            	<h4 class="sub-title">Información de Zona</h4>
                            	
                            	<!-- Row -->                                                        	
                            	<div class="row">
                            		
                            		<!-- Contenido de Card -->  
                            		<div class="col-sm-12">
                                        <label class="col-sm-12 col-form-label">Código de Zona</label>
                                        <div class="col-sm-12">
                                            <input type="text" id="txtCodigo_zona" class="form-control" placeholder="Codigo" disabled>
                                        </div>
                                	</div>
                                
                                    <div class="col-sm-12 mobile-inputs">
                                        <label class="col-sm-12 col-form-label">Tipo Zona</label>
                                        <div class="col-sm-12">
                                            <select name="select" id="cboxTipo_zona" class="form-control" disabled>
                                                <option value="Recibo">Recibo</option>
                                                <option value="Almacenaje">Almacenaje</option>
                                                <option value="Almacenaje Restringido">Almacenaje Restringido</option>
                                                <option value="Despacho">Despacho</option>
                                            </select>
                                 		</div>
                                    </div>
                                    
                                    <div class="col-sm-12 mobile-inputs">
                                    	<label class="col-sm-12 col-form-label">Descripción Zona</label>
                                    	<div class="col-sm-12">
                                            <input type="text" id="txtDescripcion_zona" class="form-control" placeholder="" disabled>
                                        </div>
                                    </div>	                                                        	
                                    
                                    <div class="col-sm-12 mobile-inputs">
                                        <label class="col-sm-12 col-form-label">Encargado de Zona</label>
                                        <div class="col-sm-12">
                                            <select name="select" id="cboxEncargado_zona" class="form-control" disabled>
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
                            	<h4 class="sub-title">Zonas Relacionadas</h4>
                            	
                            	<!-- Fila 1 -->                                      
                            	<div class="row">
                            		<div class="col-sm-12">
                            		
                            			
                            			
                            			<div class="dt-responsive table-responsive">
                                            <table id="simpletable" class="table table-striped table-bordered displayrel`+contador_zonas+` nowrap">
                                                <thead>
													<tr>
														<th>Relacionar</th>
														<th>Código de Zona</th>
														<th>Tipo de Zona</th>
														<th>Descripción</th>							                                                        
														<th>Encargado</th>																																																																
													 </tr>
												</thead>
												<tbody id="rel-zona`+contador_zonas+`">
												    <tr>
												    	<td>
												    		<div><input type="checkbox" class="js-switch-blue-zona" data-switchery="true" style="display: none;"></div>
												    	</td>
												    	<td>R1 ( OBLIGATORIO )</td>
												    	<td>Recibo</td>
												    	<td>Recibo de Nueva Mercancia</td>
												    	<td>Alfred Newman</td>																														    																														    	
												    </tr>
												    <tr>
												    	<td>
												    		<div><input type="checkbox" class="js-switch-blue-zona" data-switchery="true" style="display: none;"></div>
												    	</td>
												    	<td>R2</td>
												    	<td>Recibo</td>
												    	<td>Recibo de Mercancia en Reparaciones</td>
												    	<td>Carlos Rater</td>																														    	
												    </tr>
												    <tr>
												    	<td>
												    		<div><input type="checkbox" class="js-switch-blue-zona" data-switchery="true" style="display: none;"></div>
												    	</td>
												    	<td>A1</td>
												    	<td>Alcenaje</td>
												    	<td>Almacenaje General</td>
												    	<td>Carlos Rater</td>																														    	
												    </tr>
												    <tr>
												    	<td>
												    		<div><input type="checkbox" class="js-switch-blue-zona" data-switchery="true" style="display: none;"></div>
												    	</td>
												    	<td>X1</td>
												    	<td>Alcenaje Restringido</td>
												    	<td>Almacenaje de Mercancia de alto valor</td>
												    	<td>Empleado X</td>																														    	
												    </tr>
												    <tr>
												    	<td>
												    		<div><input type="checkbox" class="js-switch-blue-zona"  data-switchery="true" style="display: none;"></div>
												    	</td>
												    	<td>D1 ( OBLIGATORIO )</td>
												    	<td>Despacho</td>
												    	<td>Despacho de Mercancias</td>
												    	<td>Stiven Rutherford</td>																														    	
												    </tr>
												    
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
            <!-- Zona Relacion -->
		`;

		
		contenedor_zonas.append(html_zona);
		contenedor_relZonas.append(html_relacion_zona);
		alert("nueva Zona "+contador_zonas);
		
		// tablas del Tab de Zonas
		$('table.display'+contador_zonas).DataTable({ 
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
		
		// tablas del Tab de Relaciones
		$("table.displayrel"+contador_zonas).DataTable({ 
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
		var body = $('#simpletable'+contador_zonas);
		body.find( 'tbody tr:eq(0)').remove();
		contador_zonas++;
		
	});		
});
	
function crearTr(actual){
	
	var niveles = $('#txtNiveles_estanteria'+actual);
	var modulos = $('#txtModulos_estanteria'+actual);
	
	if(niveles.val() != "" && modulos.val() != ""){
		
		var body = $('#tbody'+actual+' tr');
		console.log(body);
		$('#tbody'+actual).append(`
				<tr>
			    	<td>1</td>
			    	<td>`+modulos.val()+`</td>
			    	<td>`+niveles.val()+`</td>																														    	
			    	<td>
			    		<a onclick="location.href = '/relacion-zona_nuevo-editar'">
			    			<img alt="Editar" src="`+thEditar+`" width="30px">
			    		</a>
			    		<a onclick="alert('Relación Eliminada')">
			    			<img alt="Eliminar" src="`+thEliminar+`" width="30px">
			    		</a>
			    	</td>
			    </tr>
		`);		
		niveles.val("");
		modulos.val("");
	}
	else{
		niveles.css("border", "1px solid red");
		modulos.css("border", "1px solid red");
		niveles.val("");
		modulos.val("");
		alert("llenar los campos de la Estanteria");
	}
	
	
}

function eliminarZona(actual){
	var zona = $('#zona'+actual).remove();
}


/* Todas estas funciones se disparan desde el "onBlur" de los inputs de las Zonas */

function soloTexto(desc){
	
	var texto = $('#txtDescripcion_zona'+desc);
	var patron = /^[A-Za-z \u00C0-\u017F]*$/;
	
	if(texto.val().length > 0){
		if(texto.val().search(patron)){
			texto.css("border", "1px solid red");
			texto.val("");
			swal("Solo Texto");
		}
		else{
			texto.css("border", "1px solid #20c997");
		}
	}
	else{
		texto.css("border", "1px solid red");
	}
	
}

// Validaciones Modulos
function modulos(_modulo){
	console.log(_modulo);

	var modulo = $('#txtModulos_estanteria'+_modulo);
	var patron = /^([0-9])*$/;
	
	if(modulo.val().length > 0){
		if(modulo.val().search(patron)){
			modulo.css("border", "1px solid red");
			modulo.val("");	
			swal("Solo Numeros");			
		}else{
			modulo.css("border", "1px solid #20c997");
		}
	}
	else{
		modulo.css("border", "1px solid red");
	}
	
}
//Validaciones Modulos


//Validaciones Niveles
function niveles(_nivel){
	console.log(_nivel);

	var nivel = $('#txtNiveles_estanteria'+_nivel);
	var patron = /^([0-9])*$/;
	
	if(nivel.val().length > 0){
		if(nivel.val().search(patron)){
			nivel.css("border", "1px solid red");
			nivel.val("");	
			swal("Solo Numeros");			
		}else{
			nivel.css("border", "1px solid #20c997");
		}
	}
	else{
		nivel.css("border", "1px solid red");
	}
	
}
//Validaciones Niveles

	
