package com.cbp.web.dao;

import com.cbp.web.dto.ClientDTO;
import com.cbp.web.dto.PlasticDTO;
import com.cbp.web.dto.RespuestaDTO;

public interface CardDAO {

	/**
	 * Consulta de plasticos dado el numero
	 * 
	 * @param plasticNumber
	 * @return
	 */
	public PlasticDTO consultPlastic(String plasticNumber);

	/**
	 * Servicio que almacena la asignacion de una tarjeta a un cliente
	 * 
	 * @param clientDTO
	 * @param plasticDTO
	 * @param fechaCorte
	 * @param fechaAsignacion
	 * @return
	 */
	public RespuestaDTO assignCardToClient(ClientDTO clientDTO, PlasticDTO plasticDTO, String fechaCorte,
			String fechaAsignacion);
}
