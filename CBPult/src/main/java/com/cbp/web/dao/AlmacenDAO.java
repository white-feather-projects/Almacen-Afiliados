package com.cbp.web.dao;

import com.cbp.web.dto.ConsultaAlmacenPorAlmacenIdDTO;
import com.cbp.web.dto.ConsultaAlmacenPorNumeroAlmacenDTO;
import com.cbp.web.dto.SaveAditionalInformationAlmacenDTO;
import com.cbp3.ws.cbp.service.ConsultaAlmacenPorAlmacenIdWSResponse;
import com.cbp3.ws.cbp.service.ConsultaAlmacenPorNumeroAlmacenWSResponse;
import com.cbp3.ws.cbp.service.CrearAlmacenWS;
import com.cbp3.ws.cbp.service.CrearAlmacenWSResponse;
import com.cbp3.ws.cbp.service.CrearEstanteriaWS;
import com.cbp3.ws.cbp.service.CrearEstanteriaWSResponse;
import com.cbp3.ws.cbp.service.CrearListaZonaWizzardWS;
import com.cbp3.ws.cbp.service.CrearListaZonaWizzardWSResponse;
import com.cbp3.ws.cbp.service.ModificarAlmacenWS;
import com.cbp3.ws.cbp.service.ModificarAlmacenWSResponse;
import com.cbp3.ws.cbp.service.SaveAditionaInformationAlmacenWSResponse;
import com.cbp3.ws.cbp.service.Warehouse;

public interface AlmacenDAO {

	public ConsultaAlmacenPorAlmacenIdWSResponse consultaAlmacenPorAlmacenId(ConsultaAlmacenPorAlmacenIdDTO ConsultaAlmacenPorAlmacenIdDTO);
	
	public ConsultaAlmacenPorNumeroAlmacenWSResponse consultaAlmacenPorNumeroAlmacen(ConsultaAlmacenPorNumeroAlmacenDTO ConsultaAlmacenPorNumeroAlmacenDTO);
	
	public SaveAditionaInformationAlmacenWSResponse saveAditionalInformationAlmacen(SaveAditionalInformationAlmacenDTO SaveAditionalInformationAlmacenDTO);

	public ModificarAlmacenWSResponse modificarAlmacen(ModificarAlmacenWS ModificarAlmacenDTO);
	
	public CrearAlmacenWSResponse crearAlmacen(CrearAlmacenWS CrearAlmacenWS);
	
	public CrearEstanteriaWSResponse crearEstanteria(CrearEstanteriaWS CrearEstanteriaWS);
	
	public CrearListaZonaWizzardWSResponse crearListaZonaWizzard(CrearListaZonaWizzardWS CrearListaZonaWizzardWS);
	
	public java.util.List<Warehouse> listaAlmacenes();
}
