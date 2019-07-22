'use strict'

var thEditar = "/img2/draw_edit_pen_pencil_tool_write_writing_icon_123200.ico";
var thEliminar = "/img2/bin_delete_file_garbage_recycle_remove_trash_icon_123192.ico";

$(document).ready(function(){	
	var contador_zonas = 1;
	var contenedor_zonas = $('.zonas-content');
	var btnNuevaZona = $('#btnNuevaZona_config'); 
	

	
	btnNuevaZona.click(function(){
		
		var html_zona =`
			<!-- Zona -->
            <div class="col-sm-12 card" style="border: none">
            	
            	<div class="row">
            		<!-- Btn Eliminar Zona -->
            		<div class="col-sm-12" style="margin: 5px 0px 5px 0px;">									                                                			
                		<div class="column" align="left">																
							<a href="#" style="margin-right: 5px;" title="Eliminar Zona">
								<i id="btnEliminarZona_config" class="fa fa-plus-square agregaryasignar" style="font-size: 50px"></i>
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
                                            <input type="text" id="txtCodigo_zona" class="form-control" placeholder="Codigo" disabled>
                                        </div>
                                	</div>
                                
                                    <div class="col-sm-12 mobile-inputs">
                                        <label class="col-sm-12 col-form-label">Tipo Zona</label>
                                        <div class="col-sm-12">
                                            <select name="select" id="cboxTipo_zona" class="form-control">
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
                                            <input type="text" id="txtDescripcion_zona" class="form-control" placeholder="">
                                        </div>
                                    </div>	                                                        	
                                    
                                    <div class="col-sm-12 mobile-inputs">
                                        <label class="col-sm-12 col-form-label">Encargado de Zona</label>
                                        <div class="col-sm-12">
                                            <select name="select" id="cboxEncargado_zona" class="form-control">
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
                                                    <input type="text" id="txtNiveles_estanteria" class="form-control" placeholder="Niveles">
                                                </div>
                                        	</div>
                                        	<div class="col-sm-5">														                                                                
                                                <div class="col-sm-12">
                                                    <input type="text" id="txtModulos_estanteria" class="form-control" placeholder="Módulos">
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
                                            <table id="simpletable" class="table-sm table-striped table-bordered display`+contador_zonas+` nowrap">
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
		contenedor_zonas.append(html_zona);
		alert("nueva Zona "+contador_zonas);
		$('table.display'+contador_zonas).DataTable({ 
	        "language": { // Configuración del Lenguaje de la Tabla
	            "lengthMenu": "Mostrar _MENU_ registros",
	            "zeroRecords": "No se encontararon resultados",
	            "info": "Mostrando registros del _START_ al _END_ de un total de _TOTAL_ registros",
	            "infoEmpty": "Mostrando registros del 0 al 0 de un total de 0 registros",
	            "infoFiltered": "(filtrado de un total de _MAX_ registros)",
	            "sSearch": "Buscar:",            
	        },
	        "scrollY": "200px", // Alto de la Tabla
	        "scrollCollapse": true,
	        "paging": false,
	        "searching": false,
	        "info": false
	    });
		contador_zonas++;		
		
	});
	
	
	
});

	
function crearTr(actual){
	$('#tbody'+actual).append(`
			<tr>
		    	<td>6</td>
		    	<td>12</td>
		    	<td>8</td>																														    	
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
	alert(actual);
}
	

