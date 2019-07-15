package com.cbp.web.dao;

import com.cbp.web.dto.consultaComercioDTO;
import com.cbp.web.dto.crearComercioDTO;
import com.cbp3.ws.cbp.service.ConsultaComercioPorIdentificacionComercioWSResponse;
import com.cbp3.ws.cbp.service.CrearComercioWSResponse;

public interface AfiliacionDAO {

	public CrearComercioWSResponse crearClienteComercio(crearComercioDTO crearComercio);
	
	public ConsultaComercioPorIdentificacionComercioWSResponse consultaComercio(consultaComercioDTO consultaComercio);
	
}
