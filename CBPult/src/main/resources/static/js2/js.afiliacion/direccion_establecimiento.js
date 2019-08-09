'use strict'

window.addEventListener('load', function(){
	
	var estado = document.querySelector("#estado_tab5");
	var ciudad = document.querySelector("#ciudad_tab5");
	var municipio_tab5 = document.querySelector("#municipio_tab5");
	var sector_urbanizacion = document.querySelector("#sector_urbanizacion_tab5");
	var avenida_calle = document.querySelector("#avenida_calle_tab5");
	var codigo_postal = document.querySelector("#codigo_postal_tab5");
	var localidad = document.querySelector("#localidad_tab5");
	var nombre_inmueble = document.querySelector("#nombre_inmueble_tab5");
	var geo_localizacion_tab5 = document.querySelector("#geo_localizacion_tab5");
	var punto_referencia = document.querySelector("#punto_referencia_tab5");
	
	/////////////////////////////////////////////////////////////////////////
	
	document.getElementById("ciudad_tab5").innerHTML =`<option value='San José'>San José</option>
		<option value='Escazú'>Escazú</option>
		<option value='Desamparados'>Desamparados</option>
		<option value='Puriscal'>Puriscal</option>
		<option value='Tarrazu'>Tarrazu</option>
		<option value='Aserrí'>Aserrí</option>
		<option value='Mora'>Mora</option>
		<option value='Goicoechea'>Goicoechea</option>
		<option value='Santa Ana'>Santa Ana</option>
		<option value='Alajuelita'>Alajuelita</option>
		<option value='Vázquez de Coronado'>Vázquez de Coronado</option>
		<option value='Acosta'>Acosta</option>
		<option value='Tibás'>Tibás</option>
		<option value='Moravia'>Moravia</option>
		<option value='Montes de Oca'>Montes de Oca</option>
		<option value='Turrubares'>Turrubares</option>
		<option value='Dota'>Dota</option>
		<option value='Curridabat'>Curridabat</option>
		<option value='Pérez Zeledón'>Pérez Zeledón</option>
		<option value='León Cortés'>León Cortés</option>`;
	
	/////////////////////////////////////////////////////////////////////////
	
	document.getElementById("municipio_tab5").innerHTML =`<option value='Carmen'>Carmen</option>
		<option value='Merced'>Merced</option>
		<option value='Hospital'>Hospital</option>
		<option value='Catedral'>Catedral</option>
		<option value='Zapote'>Zapote</option>
		<option value='San Francisco de Dos Ríos'>San Francisco de Dos Ríos</option>
		<option value='Uruca'>Uruca</option>
		<option value='Mata Redonda'>Mata Redonda</option>
		<option value='Pavas'>Pavas</option>
		<option value='Hatillo'>Hatillo</option>
		<option value='San Sebastian'>San Sebastian</option>`;
	
	/////////////////////////////////////////////////////////////////////////
	
	estado.addEventListener('blur', ()=>{
		console.log("estado", estado.value);
		console.log("estado.....-------", estado.value);
		if(estado.value === "San José"){
			
			document.getElementById("ciudad_tab5").innerHTML =`<option value='San José'>San José</option>
			<option value='Escazú'>Escazú</option>
			<option value='Desamparados'>Desamparados</option>
			<option value='Puriscal'>Puriscal</option>
			<option value='Tarrazu'>Tarrazu</option>
			<option value='Aserrí'>Aserrí</option>
			<option value='Mora'>Mora</option>
			<option value='Goicoechea'>Goicoechea</option>
			<option value='Santa Ana'>Santa Ana</option>
			<option value='Alajuelita'>Alajuelita</option>
			<option value='Vázquez de Coronado'>Vázquez de Coronado</option>
			<option value='Acosta'>Acosta</option>
			<option value='Tibás'>Tibás</option>
			<option value='Moravia'>Moravia</option>
			<option value='Montes de Oca'>Montes de Oca</option>
			<option value='Turrubares'>Turrubares</option>
			<option value='Dota'>Dota</option>
			<option value='Curridabat'>Curridabat</option>
			<option value='Pérez Zeledón'>Pérez Zeledón</option>
			<option value='León Cortés'>León Cortés</option>`;
			
		}else if(estado.value === "Alajuela"){
			
			document.getElementById("ciudad_tab5").innerHTML =`<option value='Alajuela'>Alajuela</option>
			<option value='San Ramón'>San Ramón</option>
			<option value='Grecia'>Grecia</option>
			<option value='San Mateo'>San Mateo</option>
			<option value='Atenas'>Atenas</option>
			<option value='Naranjo'>Naranjo</option>
			<option value='Palmares'>Palmares</option>
			<option value='Poas'>Poas</option>
			<option value='Orotina'>Orotina</option>
			<option value='San Carlos'>San Carlos</option>
			<option value='Alfaro Ruiz'>Alfaro Ruiz</option>
			<option value='Valverde Vega'>Valverde Vega</option>
			<option value='Upala'>Upala</option>
			<option value='Los Chiles'>Los Chiles</option>
			<option value='Guatuso'>Guatuso</option>`;			
			
		}else if(estado.value === "Cartago"){
			
			document.getElementById("ciudad_tab5").innerHTML =`<option value='Cartago'>Cartago</option>
				<option value='Paraíso'>Paraíso</option>
				<option value='La Uníon'>La Uníon</option>
				<option value='Jiménez'>Jiménez</option>
				<option value='Turrialba'>Turrialba</option>
				<option value='Alvarado'>Alvarado</option>
				<option value='Oreamuno'>Oreamuno</option>
				<option value='El Guarco'>El Guarco</option>`;	
			
		}else if(estado.value === "Heredia"){
			
			document.getElementById("ciudad_tab5").innerHTML =`<option value='Heredia'>Heredia</option>
				<option value='Barva'>Barva</option>
				<option value='Santo Domingo'>Santo Domingo</option>
				<option value='Santa Barbara'>Santa Barbara</option>
				<option value='San Rafael'>San Rafael</option>
				<option value='San Isidro'>San Isidro</option>
				<option value='Belen'>Belen</option>
				<option value='Flores'>Flores</option>
				<option value='San Pablo'>San Pablo</option>
				<option value='Sarapiquí'>Sarapiquí</option>`;	
			
		}else if(estado.value === "Guanacaste"){
			
			document.getElementById("ciudad_tab5").innerHTML =`<option value='Liberia'>Liberia</option>
				<option value='Nicoya'>Nicoya</option>
				<option value='Santa Cruz'>Santa Cruz</option>
				<option value='Bagaces'>Bagaces</option>
				<option value='Carrillo'>Carrillo</option>
				<option value='Cañas'>Cañas</option>
				<option value='Abangares'>Abangares</option>
				<option value='Tilaran'>Tilaran</option>
				<option value='Nandayure'>Nandayure</option>
				<option value='La Cruz'>La Cruz</option>
				<option value='Hojancha'>Hojancha</option>`;	
			
		}else if(estado.value === "Puntarenas"){
			
			document.getElementById("ciudad_tab5").innerHTML =`<option value='Puntarenas'>Puntarenas</option>
				<option value='Esparza'>Esparza</option>
				<option value='Buenos Aires'>Buenos Aires</option>
				<option value='Montes de Oro'>Montes de Oro</option>
				<option value='Osa'>Osa</option>
				<option value='Aguirre'>Aguirre</option>
				<option value='Golfito'>Golfito</option>
				<option value='Coto Brus'>Coto Brus</option>
				<option value='Parrita'>Parrita</option>
				<option value='Corredores'>Corredores</option>
				<option value='Garabito'>Garabito</option>`;
			
		}else if(estado.value === "Limón"){
			
			document.getElementById("ciudad_tab5").innerHTML =`<option value='Limón'>Limón</option>
				<option value='Pococí'>Pococí</option>
				<option value='Siquirres'>Siquirres</option>
				<option value='Talamanca'>Talamanca</option>
				<option value='Matina'>Matina</option>
				<option value='Guácimo'>Guácimo</option>`;
			
		}
		
		document.getElementById("estado_tab5").style.border = "1px solid black";
	});
	
	ciudad.addEventListener('blur', ()=>{
		console.log("ciudad", ciudad.value);
		if(ciudad.value === "San José"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Carmen'>Carmen</option>
				<option value='Merced'>Merced</option>
				<option value='Hospital'>Hospital</option>
				<option value='Catedral'>Catedral</option>
				<option value='Zapote'>Zapote</option>
				<option value='San Francisco de Dos Ríos'>San Francisco de Dos Ríos</option>
				<option value='Uruca'>Uruca</option>
				<option value='Mata Redonda'>Mata Redonda</option>
				<option value='Pavas'>Pavas</option>
				<option value='Hatillo'>Hatillo</option>
				<option value='San Sebastian'>San Sebastian</option>`;
			
		}else if(ciudad.value === "Escazú"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Escazú'>Escazú</option>
				<option value='San Antonio'>San Antonio</option>
				<option value='San Rafael'>San Rafael</option>`;
			
		}else if(ciudad.value === "Desamparados"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Desamparados'>Desamparados</option>
				<option value='San Miguel'>San Miguel</option>
				<option value='San Juan de Dios'>San Juan de Dios</option>
				<option value='San Rafael Arriba'>San Rafael Arriba</option>
				<option value='San Antonio'>San Antonio</option>
				<option value='Frailes'>Frailes</option>
				<option value='Patarra'>Patarra</option>
				<option value='San Cristobal'>San Cristobal</option>
				<option value='Rosario'>Rosario</option>
				<option value='Damas'>Damas</option>
				<option value='San Rafael Abajo'>San Rafael Abajo</option>
				<option value='Gravilias'>Gravilias</option>
				<option value='Los Guido'>Los Guido</option>`;
			
		}else if(ciudad.value === "Puriscal"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Santiago'>Santiago</option>
				<option value='Mercedes Sur'>Mercedes Sur</option>
				<option value='Barbacoas'>Barbacoas</option>
				<option value='Grifo Alto'>Grifo Alto</option>
				<option value='San Rafael'>San Rafael</option>
				<option value='Candelaria'>Candelaria</option>
				<option value='Desamparaditos'>Desamparaditos</option>
				<option value='San Antonio'>San Antonio</option>
				<option value='Chires'>Chires</option>`;
			
		}else if(ciudad.value === "Tarrazu"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='San Marcos'>San Marcos</option>
				<option value='San Lorenzo'>San Lorenzo</option>
				<option value='San Carlos'>San Carlos</option>`;
			
		}else if(ciudad.value === "Aserrí"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Aserrí'>Aserrí</option>
				<option value='Tarbaca'>Tarbaca</option>
				<option value='Vuelta de Jorco'>Vuelta de Jorco</option>
				<option value='San Gabriel'>San Gabriel</option>
				<option value='Legua'>Legua</option>
				<option value='Monterrey'>Monterrey</option>
				<option value='Salitrillos'>Salitrillos</option>`;
			
		}else if(ciudad.value === "Mora"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Colon'>Colon</option>
				<option value='Guayabo'>Guayabo</option>
				<option value='Tabarcia'>Tabarcia</option>
				<option value='Piedras Negras'>Piedras Negras</option>
				<option value='Picagres'>Picagres</option>`;
			
		}else if(ciudad.value === "Goicoechea"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Guadalupe'>Guadalupe</option>
				<option value='San Francisco'>San Francisco</option>
				<option value='Calle Blancos'>Calle Blancos</option>
				<option value='Mata de Platano'>Mata de Platano</option>
				<option value='Ipis'>Ipis</option>
				<option value='Rancho Redondo'>Rancho Redondo</option>
				<option value='Purral'>Purral</option>`;
			
		}else if(ciudad.value === "Santa Ana"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Santa Ana'>Santa Ana</option>
				<option value='Salitral'>Salitral</option>
				<option value='Pozos'>Pozos</option>
				<option value='Uruca'>Uruca</option>
				<option value='Piedades'>Piedades</option>
				<option value='Brasil'>Brasil</option>`;
			
		}else if(ciudad.value === "Alajuelita"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Alajuelita'>Alajuelita</option>
				<option value='San Josécito'>San Josécito</option>
				<option value='San Antonio'>San Antonio</option>
				<option value='Concepcion'>Concepcion</option>
				<option value='San Felipe'>San Felipe</option>`;
			
		}else if(ciudad.value === "Vázquez de Coronado"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='San Isidro'>San Isidro</option>
				<option value='San Rafael'>San Rafael</option>
				<option value='Dulce Nombre de Jesús'>Dulce Nombre de Jesús</option>
				<option value='Patalillo'>Patalillo</option>
				<option value='Cascajal'>Cascajal</option>`;
			
		}else if(ciudad.value === "Acosta"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='San Ignacio de Acosta'>San Ignacio de Acosta</option>
				<option value='Guaitil'>Guaitil</option>
				<option value='Palmichal'>Palmichal</option>
				<option value='Cangrejal'>Cangrejal</option>
				<option value='Sabanillas'>Sabanillas</option>`;
			
		}else if(ciudad.value === "Tibás"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='San Juan'>San Juan</option>
				<option value='Cinco esquinas'>Cinco esquinas</option>
				<option value='Anselmo Llorente'>Anselmo Llorente</option>
				<option value='Leon XIII'>Leon XIII</option>
				<option value='Colima'>Colima</option>`;
			
		}else if(ciudad.value === "Moravia"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='San Vicente'>San Vicente</option>
				<option value='San Jeronimo'>San Jeronimo</option>
				<option value='Trinidad'>Trinidad</option>`;
			
		}else if(ciudad.value === "Montes de Oca"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='San Pedro'>San Pedro</option>
				<option value='Sabanilla'>Sabanilla</option>
				<option value='Mercedes'>Mercedes</option>
				<option value='San Rafael'>San Rafael</option>`;
			
		}else if(ciudad.value === "Turrubares"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='San Pablo'>San Pablo</option>
				<option value='San Pedro'>San Pedro</option>
				<option value='San Juan de Mata'>San Juan de Mata</option>
				<option value='San Luis'>San Luis</option>
				<option value='Carara'>Carara</option>`;
			
		}else if(ciudad.value === "Dota"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Santa María'>Santa María</option>
				<option value='Jardin'>Jardin</option>
				<option value='Copey'>Copey</option>`;
			
		}else if(ciudad.value === "Curridabat"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Curridabat'>Curridabat</option>
				<option value='Granadilla'>Granadilla</option>
				<option value='Sánchez'>Sánchez</option>
				<option value='Tirrases'>Tirrases</option>`;
			
		}else if(ciudad.value === "Pérez Zeledón"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='San Isidro del General'>San Isidro del General</option>
				<option value='General'>General</option>
				<option value='Daniel Flores'>Daniel Flores</option>
				<option value='Rivas'>Rivas</option>
				<option value='San Pedro'>San Pedro</option>
				<option value='Platanares'>Platanares</option>
				<option value='Pejibaye'>Pejibaye</option>
				<option value='Cajon'>Cajon</option>
				<option value='Baru'>Baru</option>
				<option value='Río Nuevo'>Río Nuevo</option>
				<option value='Paramo'>Paramo</option>`;
			
		}else if(ciudad.value === "León Cortés"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='San Pablo'>San Pablo</option>
				<option value='San Andres'>San Andres</option>
				<option value='Llano Bonito'>Llano Bonito</option>
				<option value='San Isidro'>San Isidro</option>
				<option value='Santa Cruz'>Santa Cruz</option>
				<option value='San Antonio'>San Antonio</option>`;
			
		}else if(ciudad.value === "Alajuela"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Alajuela'>Alajuela</option>
				<option value='San José'>San José</option>
				<option value='Carrizal'>Carrizal</option>
				<option value='San Antonio'>San Antonio</option>
				<option value='Guacima'>Guacima</option>
				<option value='San Isidro'>San Isidro</option>
				<option value='Sabanilla'>Sabanilla</option>
				<option value='San Rafael'>San Rafael</option>
				<option value='Río Segundo'>Río Segundo</option>
				<option value='Desamparados'>Desamparados</option>
				<option value='Turrucares'>Turrucares</option>
				<option value='Tambor'>Tambor</option>
				<option value='Garita'>Garita</option>
				<option value='Sarapiquí'>Sarapiquí</option>`;
			
		}else if(ciudad.value === "San Ramón"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='San Ramón'>San Ramón</option>
				<option value='Santiago'>Santiago</option>
				<option value='San Juan'>San Juan</option>
				<option value='Piedades Norte'>Piedades Norte</option>
				<option value='Piedades Sur'>Piedades Sur</option>
				<option value='San Rafael'>San Rafael</option>
				<option value='San Isidro'>San Isidro</option>
				<option value='angeles'>angeles</option>
				<option value='Alfaro'>Alfaro</option>
				<option value='Volio'>Volio</option>
				<option value='Concepcion'>Concepcion</option>
				<option value='Zapotal'>Zapotal</option>
				<option value='Peñas Blancas'>Peñas Blancas</option>`;
			
		}else if(ciudad.value === "Grecia"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Grecia'>Grecia</option>
				<option value='San Isidro'>San Isidro</option>
				<option value='San José'>San José</option>
				<option value='San Roque'>San Roque</option>
				<option value='Tacares'>Tacares</option>
				<option value='Río Cuarto'>Río Cuarto</option>
				<option value='Puente de Piedra'>Puente de Piedra</option>
				<option value='Bolivar'>Bolivar</option>`;
			
		}else if(ciudad.value === "San Mateo"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='San Mateo'>San Mateo</option>
				<option value='Desmonte'>Desmonte</option>
				<option value='Jesús María'>Jesús María</option>`;
			
		}else if(ciudad.value === "Atenas"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Atenas'>Atenas</option>
				<option value='Jesús'>Jesús</option>
				<option value='Mercedes'>Mercedes</option>
				<option value='San Isidro'>San Isidro</option>
				<option value='Concepcion'>Concepcion</option>
				<option value='San José'>San José</option>
				<option value='Santa Eulalia'>Santa Eulalia</option>
				<option value='Escobal'>Escobal</option>`;
			
		}else if(ciudad.value === "Naranjo"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Naranjo'>Naranjo</option>
				<option value='San Miguel'>San Miguel</option>
				<option value='San José'>San José</option>
				<option value='Cirri Sur'>Cirri Sur</option>
				<option value='San Jeronimo'>San Jeronimo</option>
				<option value='San Juan'>San Juan</option>
				<option value='Rosario'>Rosario</option>
				<option value='Palmitos'>Palmitos</option>`;
			
		}else if(ciudad.value === "Palmares"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Palmares'>Palmares</option>
				<option value='Zaragoza'>Zaragoza</option>
				<option value='Buenos Aires'>Buenos Aires</option>
				<option value='Santiago'>Santiago</option>
				<option value='Candelaria'>Candelaria</option>
				<option value='Esquipulas'>Esquipulas</option>
				<option value='Granja'>Granja</option>`;
			
		}else if(ciudad.value === "Poas"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='San Pedro'>San Pedro</option>
				<option value='San Juan'>San Juan</option>
				<option value='San Rafael'>San Rafael</option>
				<option value='Carrillos'>Carrillos</option>
				<option value='Sabana Redonda'>Sabana Redonda</option>`;
			
		}else if(ciudad.value === "Orotina"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Orotina'>Orotina</option>
				<option value='Mastate'>Mastate</option>
				<option value='Hacienda Vieja'>Hacienda Vieja</option>
				<option value='Coyolar'>Coyolar</option>
				<option value='Ceiba'>Ceiba</option>`;
			
		}else if(ciudad.value === "San Carlos"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Quesada'>Quesada</option>
				<option value='Florencia'>Florencia</option>
				<option value='Buenavista'>Buenavista</option>
				<option value='Aguas Zarcas'>Aguas Zarcas</option>
				<option value='Venecia'>Venecia</option>
				<option value='Pital'>Pital</option>
				<option value='Fortuna'>Fortuna</option>
				<option value='Tigra'>Tigra</option>
				<option value='Palmera'>Palmera</option>
				<option value='Venado'>Venado</option>
				<option value='Cutris'>Cutris</option>
				<option value='Monterrey'>Monterrey</option>
				<option value='Pocosol'>Pocosol</option>`;
			
		}else if(ciudad.value === "Alfaro Ruiz"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Zarcero'>Zarcero</option>
				<option value='Laguna'>Laguna</option>
				<option value='Tapezco'>Tapezco</option>
				<option value='Guadalupe'>Guadalupe</option>
				<option value='Palmira'>Palmira</option>
				<option value='Zapote'>Zapote</option>
				<option value='Brisas'>Brisas</option>`;
			
		}else if(ciudad.value === "Valverde Vega"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Sarchi Norte'>Sarchi Norte</option>
				<option value='Sarchi Sur'>Sarchi Sur</option>
				<option value='Toro Amarillo'>Toro Amarillo</option>
				<option value='San Pedro'>San Pedro</option>
				<option value='Rodriguez'>Rodriguez</option>`;
			
		}else if(ciudad.value === "Upala"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Upala'>Upala</option>
				<option value='Aguas Claras'>Aguas Claras</option>
				<option value='San José (Pizote)'>San José (Pizote)</option>
				<option value='Bijagua'>Bijagua</option>
				<option value='Delicias'>Delicias</option>
				<option value='Dos Ríos'>Dos Ríos</option>
				<option value='Yoliyllal'>Yoliyllal</option>`;
			
		}else if(ciudad.value === "Los Chiles"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Los Chiles'>Los Chiles</option>
				<option value='Caño Negro'>Caño Negro</option>
				<option value='El Amparo'>El Amparo</option>
				<option value='San Jorge'>San Jorge</option>`;
			
		}else if(ciudad.value === "Guatuso"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='San Rafael'>San Rafael</option>
				<option value='Buenavista'>Buenavista</option>
				<option value='Cote'>Cote</option>
				<option value='Katira'>Katira</option>`;
			
		}else if(ciudad.value === "Cartago"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Oriental'>Oriental</option>
				<option value='Occidental'>Occidental</option>
				<option value='Carmen'>Carmen</option>
				<option value='San Nicolas'>San Nicolas</option>
				<option value='Aguacaliente (San Francisco)'>Aguacaliente (San Francisco)</option>
				<option value='Guadalupe (Arenilla)'>Guadalupe (Arenilla)</option>
				<option value='Corralillo'>Corralillo</option>
				<option value='Tierra Blanca'>Tierra Blanca</option>
				<option value='Dulce Nombre'>Dulce Nombre</option>
				<option value='Llano Grande'>Llano Grande</option>
				<option value='Quebradilla'>Quebradilla</option>`;
			
		}else if(ciudad.value === "Paraíso"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Paraíso'>Paraíso</option>
				<option value='Santiago'>Santiago</option>
				<option value='Orosi'>Orosi</option>
				<option value='Cachi'>Cachi</option>
				<option value='Llanos de Santa Lucia'>Llanos de Santa Lucia</option>`;
			
		}else if(ciudad.value === "La Uníon"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Tres Ríos'>Tres Ríos</option>
				<option value='San Diego'>San Diego</option>
				<option value='San Juan'>San Juan</option>
				<option value='San Rafael'>San Rafael</option>
				<option value='Concepcion'>Concepcion</option>
				<option value='Dulce Nombre'>Dulce Nombre</option>
				<option value='San Ramón'>San Ramón</option>
				<option value='Río Azul'>Río Azul</option>`;
			
		}else if(ciudad.value === "Jiménez"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Juan Viñas'>Juan Viñas</option>
				<option value='Tucurrique'>Tucurrique</option>
				<option value='Pejibaye'>Pejibaye</option>`;
			
		}else if(ciudad.value === "Turrialba"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Turrialba'>Turrialba</option>
				<option value='La Suiza'>La Suiza</option>
				<option value='Peralta'>Peralta</option>
				<option value='Santa Cruz'>Santa Cruz</option>
				<option value='Santa Teresita'>Santa Teresita</option>
				<option value='Pavones'>Pavones</option>
				<option value='Tuis'>Tuis</option>
				<option value='Tayutic'>Tayutic</option>
				<option value='Santa Rosa'>Santa Rosa</option>
				<option value='Tres Equis'>Tres Equis</option>
				<option value='La Isabel'>La Isabel</option>
				<option value='Chirripo'>Chirripo</option>`;
			
		}else if(ciudad.value === "Alvarado"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Pacayas'>Pacayas</option>
				<option value='Cervantes'>Cervantes</option>
				<option value='Capellades'>Capellades</option>`;
			
		}else if(ciudad.value === "Oreamuno"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='San Rafael'>San Rafael</option>
				<option value='Cot'>Cot</option>
				<option value='Potrero Cerrado'>Potrero Cerrado</option>
				<option value='Cipreses'>Cipreses</option>
				<option value='Santa Rosa'>Santa Rosa</option>`;
			
		}else if(ciudad.value === "El Guarco"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Tejar'>Tejar</option>
				<option value='San Isidro'>San Isidro</option>
				<option value='Tobosi'>Tobosi</option>
				<option value='Patio de Agua'>Patio de Agua</option>`;
			
		}else if(ciudad.value === "Heredia"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Heredia'>Heredia</option>
				<option value='Mercedes'>Mercedes</option>
				<option value='San Francisco'>San Francisco</option>
				<option value='Ulloa'>Ulloa</option>
				<option value='Varablanca'>Varablanca</option>`;
			
		}else if(ciudad.value === "Barva"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Barva'>Barva</option>
				<option value='San Pedro'>San Pedro</option>
				<option value='San Pablo'>San Pablo</option>
				<option value='San Roque'>San Roque</option>
				<option value='Santa Lucia'>Santa Lucia</option>
				<option value='San José de la Montaña'>San José de la Montaña</option>`;
			
		}else if(ciudad.value === "Santo Domingo"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Santo Domingo'>Santo Domingo</option>
				<option value='San Vicente'>San Vicente</option>
				<option value='San Miguel'>San Miguel</option>
				<option value='Paracito'>Paracito</option>
				<option value='Santo Tomas'>Santo Tomas</option>
				<option value='Santa Rosa'>Santa Rosa</option>
				<option value='Tures'>Tures</option>
				<option value='Para'>Para</option>`;
			
		}else if(ciudad.value === "Santa Barbara"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Santa Barbara'>Santa Barbara</option>
				<option value='San Pedro'>San Pedro</option>
				<option value='San Juan'>San Juan</option>
				<option value='Jesús'>Jesús</option>
				<option value='Santo Domingo'>Santo Domingo</option>
				<option value='Puraba'>Puraba</option>`;
			
		}else if(ciudad.value === "San Rafael"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='San Rafael'>San Rafael</option>
				<option value='San Josécito'>San Josécito</option>
				<option value='Santiago'>Santiago</option>
				<option value='angeles'>angeles</option>
				<option value='Concepcion'>Concepcion</option>`;
			
		}else if(ciudad.value === "San Isidro"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='San Isidro'>San Isidro</option>
				<option value='San José'>San José</option>
				<option value='Concepcion'>Concepcion</option>
				<option value='San Francisco'>San Francisco</option>`;
			
		}else if(ciudad.value === "Belen"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='San Antonio'>San Antonio</option>
				<option value='Ribera'>Ribera</option>
				<option value='Asuncion'>Asuncion</option>`;
			
		}else if(ciudad.value === "Flores"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='San Joaquín de Flores'>San Joaquín de Flores</option>
				<option value='Barrantes'>Barrantes</option>
				<option value='Llorente'>Llorente</option>`;
			
		}else if(ciudad.value === "San Pablo"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='San Pablo'>San Pablo</option>
				<option value='Rincón de Sabanilla'>Rincón de Sabanilla</option>`;
			
		}else if(ciudad.value === "Sarapiquí"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Puerto Viejo'>Puerto Viejo</option>
				<option value='La Virgen'>La Virgen</option>
				<option value='Horquetas'>Horquetas</option>
				<option value='Llanuras del Gaspar'>Llanuras del Gaspar</option>
				<option value='Cureña'>Cureña</option>`;
			
		}else if(ciudad.value === "Liberia"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Liberia'>Liberia</option>
				<option value='Cañas Dulces'>Cañas Dulces</option>
				<option value='Mayorga'>Mayorga</option>
				<option value='Nacascolo'>Nacascolo</option>
				<option value='Curubande'>Curubande</option>`;
			
		}else if(ciudad.value === "Nicoya"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Nicoya'>Nicoya</option>
				<option value='Mansion'>Mansion</option>
				<option value='San Antonio'>San Antonio</option>
				<option value='Quebrada Honda'>Quebrada Honda</option>
				<option value='Samara'>Samara</option>
				<option value='Nosara'>Nosara</option>
				<option value='Belen de Nosarita'>Belen de Nosarita</option>`;
			
		}else if(ciudad.value === "Santa Cruz"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Santa Cruz'>Santa Cruz</option>
				<option value='Bolson'>Bolson</option>
				<option value='Veintisiete de Abril'>Veintisiete de Abril</option>
				<option value='Tempate'>Tempate</option>
				<option value='Cartagena'>Cartagena</option>
				<option value='Cuajiniquil'>Cuajiniquil</option>
				<option value='Diria'>Diria</option>
				<option value='Cabo Velas'>Cabo Velas</option>
				<option value='Tamarindo'>Tamarindo</option>`;
			
		}else if(ciudad.value === "Bagaces"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Bagaces'>Bagaces</option>
				<option value='Fortuna'>Fortuna</option>
				<option value='Mogote'>Mogote</option>
				<option value='Río Naranjo'>Río Naranjo</option>`;
			
		}else if(ciudad.value === "Carrillo"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Filadelfia'>Filadelfia</option>
				<option value='Palmira'>Palmira</option>
				<option value='Sardinal'>Sardinal</option>
				<option value='Belen'>Belen</option>`;
			
		}else if(ciudad.value === "Cañas"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Cañas'>Cañas</option>
				<option value='Palmira'>Palmira</option>
				<option value='San Miguel'>San Miguel</option>
				<option value='Bebedero'>Bebedero</option>
				<option value='Porozal'>Porozal</option>`;
			
		}else if(ciudad.value === "Abangares"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Juntas'>Juntas</option>
				<option value='Sierra'>Sierra</option>
				<option value='San Juan'>San Juan</option>
				<option value='Colorado'>Colorado</option>`;
			
		}else if(ciudad.value === "Tilaran"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Tilaran'>Tilaran</option>
				<option value='Quebrada Grande'>Quebrada Grande</option>
				<option value='Tronadora'>Tronadora</option>
				<option value='Santa Rosa'>Santa Rosa</option>
				<option value='Libano'>Libano</option>
				<option value='Tierras Morenas'>Tierras Morenas</option>
				<option value='Arenal'>Arenal</option>`;
			
		}else if(ciudad.value === "Nandayure"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Carmona'>Carmona</option>
				<option value='Santa Rita'>Santa Rita</option>
				<option value='Zapotal'>Zapotal</option>
				<option value='San Pablo'>San Pablo</option>
				<option value='Porvenir'>Porvenir</option>
				<option value='Bejuco'>Bejuco</option>`;
			
		}else if(ciudad.value === "La Cruz"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='La Cruz'>La Cruz</option>
				<option value='Santa Cecilia'>Santa Cecilia</option>
				<option value='Garita'>Garita</option>
				<option value='Santa Elena'>Santa Elena</option>`;
			
		}else if(ciudad.value === "Hojancha"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Hojancha'>Hojancha</option>
				<option value='Monte Romo'>Monte Romo</option>
				<option value='Puerto Carrillo'>Puerto Carrillo</option>
				<option value='Huacas'>Huacas</option>`;
			
		}else if(ciudad.value === "Puntarenas"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Puntarenas'>Puntarenas</option>
				<option value='Pitahaya'>Pitahaya</option>
				<option value='Chomes'>Chomes</option>
				<option value='Lepanto'>Lepanto</option>
				<option value='Paquera'>Paquera</option>
				<option value='Manzanillo'>Manzanillo</option>
				<option value='Guacimal'>Guacimal</option>
				<option value='Barranca'>Barranca</option>
				<option value='Monte Verde'>Monte Verde</option>
				<option value='Isla del Coco'>Isla del Coco</option>
				<option value='Cobano'>Cobano</option>
				<option value='Chacarita'>Chacarita</option>
				<option value='Chira'>Chira</option>
				<option value='Acapulco'>Acapulco</option>
				<option value='El Roble'>El Roble</option>
				<option value='Arancibia'>Arancibia</option>`;
			
		}else if(ciudad.value === "Esparza"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Espiritu Santo'>Espiritu Santo</option>
				<option value='San Juan Grande'>San Juan Grande</option>
				<option value='Macacona'>Macacona</option>
				<option value='San Rafael'>San Rafael</option>
				<option value='San Jeronimo'>San Jeronimo</option>`;
			
		}else if(ciudad.value === "Buenos Aires"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Buenos Aires'>Buenos Aires</option>
				<option value='Volcan'>Volcan</option>
				<option value='Potrero Grande'>Potrero Grande</option>
				<option value='Boruca'>Boruca</option>
				<option value='Pilas'>Pilas</option>
				<option value='Colinas'>Colinas</option>
				<option value='Changena'>Changena</option>
				<option value='Briolley'>Briolley</option>
				<option value='Brunka'>Brunka</option>`;
			
		}else if(ciudad.value === "Montes de Oro"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Miramar'>Miramar</option>
				<option value='Uníon'>Uníon</option>
				<option value='San Isidro'>San Isidro</option>`;
			
		}else if(ciudad.value === "Osa"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Puerto Cortes'>Puerto Cortes</option>
				<option value='Palmar'>Palmar</option>
				<option value='Sierpe'>Sierpe</option>
				<option value='Bahia Ballena'>Bahia Ballena</option>
				<option value='Piedras Blancas'>Piedras Blancas</option>`;
			
		}else if(ciudad.value === "Aguirre"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Quepos'>Quepos</option>
				<option value='Savegre'>Savegre</option>
				<option value='Naranjito'>Naranjito</option>`;
			
		}else if(ciudad.value === "Golfito"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Golfito'>Golfito</option>
				<option value='Puerto Jiménez'>Puerto Jiménez</option>
				<option value='Guaycara'>Guaycara</option>
				<option value='Pavon'>Pavon</option>`;
			
		}else if(ciudad.value === "Coto Brus"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='San Vito'>San Vito</option>
				<option value='Sabalito'>Sabalito</option>
				<option value='Aguabuena'>Aguabuena</option>
				<option value='Limóncito'>Limóncito</option>
				<option value='Pittier'>Pittier</option>`;
			
		}else if(ciudad.value === "Parrita"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Parrita'>Parrita</option>`;
			
		}else if(ciudad.value === "Corredores"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Corredor'>Corredor</option>
				<option value='La Cuesta'>La Cuesta</option>
				<option value='Canoas'>Canoas</option>
				<option value='Laurel'>Laurel</option>`;
			
		}else if(ciudad.value === "Garabito"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Jaco'>Jaco</option>
				<option value='Tarcoles'>Tarcoles</option>`;
			
		}else if(ciudad.value === "Limón"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Limón'>Limón</option>
				<option value='Valle La Estrella'>Valle La Estrella</option>
				<option value='Río Blanco'>Río Blanco</option>
				<option value='Matama'>Matama</option>`;
			
		}else if(ciudad.value === "Pococí"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Guapiles'>Guapiles</option>
				<option value='Jiménez'>Jiménez</option>
				<option value='Rita'>Rita</option>
				<option value='Roxana'>Roxana</option>
				<option value='Cariari'>Cariari</option>
				<option value='Colorado'>Colorado</option>`;
			
		}else if(ciudad.value === "Siquirres"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Siquirres'>Siquirres</option>
				<option value='Pacuarito'>Pacuarito</option>
				<option value='Florida'>Florida</option>
				<option value='Germania'>Germania</option>
				<option value='Cairo'>Cairo</option>
				<option value='Alegria'>Alegria</option>`;
			
		}else if(ciudad.value === "Talamanca"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Bratsi'>Bratsi</option>
				<option value='Sixaola'>Sixaola</option>
				<option value='Cahuita'>Cahuita</option>
				<option value='Telire'>Telire</option>`;
			
		}else if(ciudad.value === "Matina"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Matina'>Matina</option>
				<option value='Battan'>Battan</option>
				<option value='Carrandi'>Carrandi</option>`;
			
		}else if(ciudad.value === "Guácimo"){
			
			document.getElementById("municipio_tab5").innerHTML =`<option value='Guácimo'>Guácimo</option>
				<option value='Mercedes'>Mercedes</option>
				<option value='Pocora'>Pocora</option>
				<option value='Río Jiménez'>Río Jiménez</option>
				<option value='Duacari'>Duacari</option>`;
			
		}
		
		document.getElementById("ciudad_tab5").style.border = "1px solid black";
	});
	
	municipio_tab5.addEventListener('blur', ()=>{
		console.log("municipio_tab5", municipio_tab5.value);
		document.getElementById("municipio_tab5").style.border = "1px solid black";
	});
	
	sector_urbanizacion.addEventListener('blur', ()=>{
		console.log("sector_urbanizacion", sector_urbanizacion.value);
		soloTexto(sector_urbanizacion);
		document.getElementById("sector_urbanizacion_tab5").style.border = "1px solid black";
	});
	
	avenida_calle.addEventListener('blur', ()=>{
		console.log("avenida_calle", avenida_calle.value);
		document.getElementById("avenida_calle_tab5").style.border = "1px solid black";
	});
	
	codigo_postal.addEventListener('blur', ()=>{
		console.log("codigo_postal", codigo_postal.value);
		soloNumeros(codigo_postal);
		document.getElementById("codigo_postal_tab5").style.border = "1px solid black";
	});
	
	localidad.addEventListener('blur', ()=>{
		console.log("localidad", localidad.value);
		soloLetrasYNum(localidad);
		document.getElementById("localidad_tab5").style.border = "1px solid black";
	});
	
	nombre_inmueble.addEventListener('blur', ()=>{
		console.log("nombre_inmueble", nombre_inmueble.value);
		soloLetrasYNum(nombre_inmueble);
		document.getElementById("nombre_inmueble_tab5").style.border = "1px solid black";
	});
	
	geo_localizacion_tab5.addEventListener('blur', ()=>{
		console.log("geo_localizacion_tab5", geo_localizacion_tab5.value);
		document.getElementById("geo_localizacion_tab5").style.border = "1px solid black";
	});
	
	punto_referencia.addEventListener('blur', ()=>{
		console.log("punto_referencia", punto_referencia.value);
		soloLetrasYNum(punto_referencia);
		document.getElementById("punto_referencia_tab5").style.border = "1px solid black";
	});

});

////////////////////////////////////////////////////

function soloTexto(texto){
	var patron = /^[A-Za-z \u00C0-\u017F]*$/;
	if(texto.value.search(patron)){
		swal("Solo Texto");
		texto.value = "";
	}else{
		return true;
	}
}

function soloNumeros(numero){
	var patron = /^([0-9])*$/;
	if(numero.value.search(patron)){
		swal("Solo Numeros");
		numero.value = "";
	}else{
		return true;
	}
}

function soloLetrasYNum(campo) {
	 var validos = " abcdefghijklmnopqrstuvwxyz0123456789";
	 var letra;
	 var bien = true;
	 for (var i=0; i<campo.value.length; i++) {
		  letra=campo.value.charAt(i).toLowerCase()
		  if (validos.indexOf(letra) == -1){bien=false;};
		  }
		  if (!bien) {
			  campo.value = "";
			  swal("Campo Alfanumerico");
			  //campo.focus();
		  }
}