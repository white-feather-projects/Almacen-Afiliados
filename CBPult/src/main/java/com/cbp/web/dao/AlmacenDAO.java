package com.cbp.web.dao;

import com.cbp.web.dto.ConsultaAlmacenPorAlmacenIdDTO;
import com.cbp.web.dto.ConsultaAlmacenPorNumeroAlmacenDTO;
import com.cbp.web.dto.SaveAditionalInformationAlmacenDTO;
import com.cbp3.ws.cbp.service.ConsultaAlmacenPorAlmacenIdWSResponse;
import com.cbp3.ws.cbp.service.ConsultaAlmacenPorNumeroAlmacenWSResponse;
import com.cbp3.ws.cbp.service.ConsultaEstanteriaPorEstanteriaIdWS;
import com.cbp3.ws.cbp.service.ConsultaEstanteriaPorEstanteriaIdWSResponse;
import com.cbp3.ws.cbp.service.ConsultaZonaPorZonaIdWS;
import com.cbp3.ws.cbp.service.ConsultaZonaPorZonaIdWSResponse;
import com.cbp3.ws.cbp.service.CrearAlmacenWS;
import com.cbp3.ws.cbp.service.CrearAlmacenWSResponse;
import com.cbp3.ws.cbp.service.CrearEstanteriaWS;
import com.cbp3.ws.cbp.service.CrearEstanteriaWSResponse;
import com.cbp3.ws.cbp.service.CrearListaZonaWizzardWS;
import com.cbp3.ws.cbp.service.CrearListaZonaWizzardWSResponse;
import com.cbp3.ws.cbp.service.CrearRelacionAlmacenesWS;
import com.cbp3.ws.cbp.service.CrearRelacionAlmacenesWSResponse;
import com.cbp3.ws.cbp.service.CrearRelacionZonasWS;
import com.cbp3.ws.cbp.service.CrearRelacionZonasWSResponse;
import com.cbp3.ws.cbp.service.Estanteria;
import com.cbp3.ws.cbp.service.ModificarAlmacenWS;
import com.cbp3.ws.cbp.service.ModificarAlmacenWSResponse;
import com.cbp3.ws.cbp.service.ModificarEstanteriaWS;
import com.cbp3.ws.cbp.service.ModificarEstanteriaWSResponse;
import com.cbp3.ws.cbp.service.ModificarRelacionZonasWS;
import com.cbp3.ws.cbp.service.ModificarRelacionZonasWSResponse;
import com.cbp3.ws.cbp.service.ModificarZonaWS;
import com.cbp3.ws.cbp.service.ModificarZonaWSResponse;
import com.cbp3.ws.cbp.service.RelacionAlmacenes;
import com.cbp3.ws.cbp.service.RelacionZonas;
import com.cbp3.ws.cbp.service.SaveAditionaInformationAlmacenWSResponse;
import com.cbp3.ws.cbp.service.TipoZona;
import com.cbp3.ws.cbp.service.Warehouse;
import com.cbp3.ws.cbp.service.Zona;

public interface AlmacenDAO {

	public ConsultaAlmacenPorAlmacenIdWSResponse consultaAlmacenPorAlmacenId(ConsultaAlmacenPorAlmacenIdDTO ConsultaAlmacenPorAlmacenIdDTO);
	
	public ConsultaAlmacenPorNumeroAlmacenWSResponse consultaAlmacenPorNumeroAlmacen(ConsultaAlmacenPorNumeroAlmacenDTO ConsultaAlmacenPorNumeroAlmacenDTO);
	
	public SaveAditionaInformationAlmacenWSResponse saveAditionalInformationAlmacen(SaveAditionalInformationAlmacenDTO SaveAditionalInformationAlmacenDTO);

	public ModificarAlmacenWSResponse modificarAlmacen(ModificarAlmacenWS ModificarAlmacenDTO);
	
	public CrearAlmacenWSResponse crearAlmacen(CrearAlmacenWS CrearAlmacenWS);
	
	public CrearEstanteriaWSResponse crearEstanteria(CrearEstanteriaWS CrearEstanteriaWS);
	
	public CrearListaZonaWizzardWSResponse crearListaZonaWizzard(CrearListaZonaWizzardWS CrearListaZonaWizzardWS);
	
	public ConsultaEstanteriaPorEstanteriaIdWSResponse consultaEstanteriaPorEstanteriaId(ConsultaEstanteriaPorEstanteriaIdWS ConsultaEstanteriaPorEstanteriaIdWS);
	
	public ConsultaZonaPorZonaIdWSResponse consultaZonaPorZonaId(ConsultaZonaPorZonaIdWS ConsultaZonaPorZonaIdWS);
	
	public CrearRelacionAlmacenesWSResponse crearRelacionAlmacenes(CrearRelacionAlmacenesWS CrearRelacionAlmacenesWS);
	
	public CrearRelacionZonasWSResponse crearRelacionZonas(CrearRelacionZonasWS CrearRelacionZonasWS);
	
	public ModificarEstanteriaWSResponse modificarEstanteria(ModificarEstanteriaWS ModificarEstanteriaWS);
	
	public ModificarZonaWSResponse modificarZona(ModificarZonaWS ModificarZonaWS);
	
	public ModificarRelacionZonasWSResponse modificarRelacionZonas(ModificarRelacionZonasWS ModificarRelacionZonasWS);
	
	public java.util.List<Warehouse> listaAlmacenes();
	
	public java.util.List<Estanteria> listaEstanterias();
	
	public java.util.List<RelacionZonas> listaRelacionZonas();
	
	public java.util.List<Zona> listaZonas();
	
	public java.util.List<TipoZona> listaTipoZonas();
	
	public java.util.List<RelacionAlmacenes> listaAlmacenesRelacionados(long arg0);
	
	public java.util.List<Zona> listaZonasByIdAlmacen(long idAlmacen);
	
	public java.util.List<Estanteria> listaEstanteriasByIdZona(long idZona);
	
	public java.util.List<RelacionZonas> listaZonasRelacionadasPorZonaIdActual(long zonaActualId);
}
