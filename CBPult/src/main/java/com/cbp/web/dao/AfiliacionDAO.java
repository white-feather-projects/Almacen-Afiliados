package com.cbp.web.dao;

import com.cbp.web.dto.actualizaStatusComercioDTO;
import com.cbp.web.dto.consultaComercioDTO;
import com.cbp.web.dto.crearComercioDTO;
import com.cbp.web.dto.modificarComercioDTO;
import com.cbp1.ws.cbp.service.ActualizaClienteConInformacionAdicionalWSResponse;
import com.cbp3.ws.cbp.service.ActualizaStatusComercioWSResponse;
import com.cbp3.ws.cbp.service.ConsultaComercioPorIdentificacionComercioWSResponse;
import com.cbp3.ws.cbp.service.CrearComercioWSResponse;
import com.cbp3.ws.cbp.service.ModificarComercioWSResponse;

public interface AfiliacionDAO {

	public CrearComercioWSResponse crearClienteComercio(crearComercioDTO crearComercio);
	
	public ConsultaComercioPorIdentificacionComercioWSResponse consultaComercio(consultaComercioDTO consultaComercio);
	
	public ActualizaStatusComercioWSResponse actualizarStatusComercio(actualizaStatusComercioDTO actualizaStatusComercioDTO);
	
	public ModificarComercioWSResponse modificarComercio(modificarComercioDTO modificarComercioDTO);
	
}
