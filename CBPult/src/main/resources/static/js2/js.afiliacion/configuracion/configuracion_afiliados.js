'use strict'
$(document).ready(function(){
	
	$.get( "/CBPult/Afiliacion/listaOperadoresTelefonicos", function( data ) {
		  
		  for(var i=0; i<data.length; i++){
			  //console.log(data);
			  $("#body_table").append(`<tr>					                                                            	
			                              	<td>`+data[i].operadortelfNombre+`</td>		                                                            	
			                            	<td>
			                            		<a class="editar-relacion">
			                            			<img alt="Consultar" src="../img2/draw_edit_pen_pencil_tool_write_writing_icon_123200.ico" width="30px">
			                            		</a>	
			                            		<a class="editar-relacion">
			                            			<img alt="Consultar" src="../img2/bin_delete_file_garbage_recycle_remove_trash_icon_123192.ico" width="30px">
			                            		</a>	
			                            		<input type="checkbox" value="`+data[i].operadortelfId+`" class="js-switch-blue_operadora" checked="" data-switchery="false" style="display: none;" id="cbox_BancoAfiliacion`+i+`">			                                                            		
			                            	</td>
			                            </tr>`);
			  
		  }
		  cargarSwitches();
		});
	
	///////////////////////////////////////////////////
	
	var btn_nuevo_operador = $("#btnNweOperador");
	btn_nuevo_operador.on('click', ()=>{

		var nombre_operador = $("#nombre_operador").val();
		if(nombre_operador.length >= 1){
			
			var crear_comercio_json = {
					"nombreOperador": nombre_operador,
					"codOperador": nombre_operador,
					"active":"0"
			};
			
			$.ajax({
	           type: "POST",
	           url: '/CBPult/Afiliacion/crearOperadorTelefonico',
	           contentType: "application/json",
	           dataType: "json",
	           data: JSON.stringify(crear_comercio_json),
	           success: processSuccess,
	           error: processError
			});
			
			function processSuccess(data, status, req) {
				if(data.return.descripcion === "OK"){
					swal("Registrado");
					///////////////////////////////////////////////////////////////
						$.get( "/CBPult/Afiliacion/listaOperadoresTelefonicos", function( data ) {
							  
							  for(var i=0; i<data.length; i++){
								  //console.log(data);
								  $("#body_table").replaceWith(`<tr>					                                                            	
								                              	<td>`+data[i].operadortelfNombre+`</td>		                                                            	
								                            	<td>
								                            		<a class="editar-relacion" onclick="location.href='/almacen_nuevo-editar'">
								                            			<img alt="Consultar" src="../img2/draw_edit_pen_pencil_tool_write_writing_icon_123200.ico" width="30px">
								                            		</a>	
								                            		<a class="editar-relacion" onclick="location.href='/almacen_nuevo-editar'">
								                            			<img alt="Consultar" src="../img2/bin_delete_file_garbage_recycle_remove_trash_icon_123192.ico" width="30px">
								                            		</a>	
								                            		<input type="checkbox" value="`+data[i].operadortelfId+`" class="js-switch-blue_operadora" checked="" data-switchery="true" style="border: 1px solid black" id="switch`+i+`" >		                                                            		
								                            	</td>
								                            </tr>`);
								  
								  
							  }
							  cargarSwitches();
							  

							});
						
						
					///////////////////////////////////////////////////////////////
				}else if(data.rturn.descripcion === "FAIL"){
					swal("Error al Registrar");
				}
	            
	       		
	       	} 
	       	
	       	function processError(data, status, req) {
	            //alert(req.responseText + " " + status);
	           	swal("Error al contacter el servicio", data);
	           	valid = false;
	           	return valid;
     		}
			
		}else{
			swal("Campo Obligatorio");
		}
		
	});
	
});

function cargarSwitches(){
	var blue_switches = $('.js-switch-blue_operadora');
	
	Array.prototype.forEach.call(blue_switches, (item, i)=>{
		var actual_switch = new Switchery(item, {
			color: '#17a2b8'
			
		});
		item.onchange = function(){
			console.log(item.checked);
			console.log(item.value);
			
			var valor;
			
			if(item.checked){
				valor = 1;
			}else{
				valor = 0;
			}
			
			console.log(valor);
			
			var activeorinactive = {
					"operadortelfId": item.value,
					"active": valor
			}
			
			$.ajax({
	           type: "POST",
	           url: '/CBPult/Afiliacion/activeOrInactive',
	           contentType: "application/json",
	           dataType: "json",
	           data: JSON.stringify(activeorinactive),
	           success: processSuccess,
	           error: processError
			});
			
			function processSuccess(data, status, req) {
		            //alert(req.responseText + " " + status);
		       		console.log(data);
		       		
		           	if(data.return.descripcion === "FAIL"){
		           		swal("FAIL");
		           	}
		           	if(data.return.descripcion === "OK"){
		           		swal("MODIFICADO");
		           	}
	       	}
		       	
	       	function processError(data, status, req) {
	            //alert(req.responseText + " " + status);
	           	swal("Error al contactar el servicio", data);
	           	valid = false;
	           	return valid;
	       	}
			
		}
	});
	
};

function cambiarStatus(objeto){
	console.log("asdf");
}