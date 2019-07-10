package com.cbp.web.impl;

import java.net.URL;
import java.util.Date;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.cbp.web.dao.CardDAO;
import com.cbp.web.dto.ClientDTO;
import com.cbp.web.dto.PlasticDTO;
import com.cbp.web.dto.RespuestaDTO;
import com.cbp.web.enumerated.ChannelEnum;
import com.cbp.web.util.Util;
import com.cbp1.ws.cbp.service.CardWS;
import com.cbp1.ws.cbp.service.CardWS_Service;

@Service
public class CardService extends Util implements CardDAO {

	private static final Logger logger = Logger.getLogger(CardService.class.getName());

	/**
	 * Consulta de plasticos dado el numero
	 * 
	 * @param plasticNumber
	 * @return
	 */
	public PlasticDTO consultPlastic(String plasticNumber) {
		PlasticDTO dto = new PlasticDTO();
		com.cbp1.ws.cbp.service.Plastic plastictWS = new com.cbp1.ws.cbp.service.Plastic();
		try {
			// invocacion del WS y salida del WS
			CardWS_Service service = new CardWS_Service(
					new URL(readProperties("IP.AMBIENTE")+"/CBP-1/CardWS?wsdl"));
			CardWS port = service.getCardWSPort();
			plastictWS = port.consultPlasticByNumberWS(plasticNumber);

			dto.setIdPlastic(plastictWS.getIdPlastic());
			dto.setPlasticAsigned(plastictWS.getPlasticAsigned());
			dto.setPlasticNumber(plastictWS.getPlasticNumber());
			dto.setPlasticCvv(plastictWS.getPlasticCvv());
			dto.setPlasticDateIssue(plastictWS.getPlasticDateIssue());
			dto.setPlasticExpDate(plastictWS.getPlasticExpDate());
			dto.setPlasticStatus(plastictWS.getPlasticStatus());

		} catch (Exception e) {
			logger.severe(new StringBuilder("ERROR DAO al consumir el servicio consultPlastic: ").append("-CH-")
					.append(ChannelEnum.PERSONA_NATURAL.getDescripcion()).append("-DT-").append(new Date())
					.append("-STS-").append(DESCRIPCION_RESPUESTA_FALLIDA).append("-EXCP-").append(e.toString())
					.toString() + e);
		}
		return dto;
	}
	
	/**
	 * Servicio que almacena la asignacion de una tarjeta a un cliente
	 * 
	 * @param clientDTO
	 * @param plasticDTO
	 * @param fechaCorte
	 * @param fechaAsignacion
	 * @return
	 */
	public RespuestaDTO assignCardToClient(ClientDTO clientDTO, PlasticDTO plasticDTO, String fechaCorte, String fechaAsignacion) {
		com.cbp1.ws.cbp.service.Client clientWS = new com.cbp1.ws.cbp.service.Client();
		com.cbp1.ws.cbp.service.Plastic plasticWS = new com.cbp1.ws.cbp.service.Plastic();
		com.cbp1.ws.cbp.service.RespuestaDTO respuestaWS = new com.cbp1.ws.cbp.service.RespuestaDTO();
		RespuestaDTO respuesta = new RespuestaDTO();
		try {
			if (clientDTO.getIdClient() != 0 || plasticDTO.getIdPlastic() != 0) {
				//Llenamos el client WS
				clientWS.setIdClient(clientDTO.getIdClient());
				clientWS.setClientFirstName(clientDTO.getClientFirstName());
				clientWS.setClientLastName(clientDTO.getClientLastName());
				clientWS.setClientDocumentId(clientDTO.getClientDocumentId());
				clientWS.setClientTypeId(clientDTO.getClientTypeId());
				clientWS.setClientEmail(clientDTO.getClientEmail());
				
				//Llenamos el Plastic WS
				plasticWS.setIdPlastic(plasticDTO.getIdPlastic());
				plasticWS.setPlasticCvv(plasticDTO.getPlasticCvv());
				plasticWS.setPlasticNumber(plasticDTO.getPlasticNumber());
				plasticWS.setPlasticAsigned(plasticDTO.getPlasticAsigned());
				plasticWS.setPlasticDateIssue(plasticDTO.getPlasticDateIssue());
				plasticWS.setPlasticExpDate(plasticDTO.getPlasticExpDate());
				
				// invocacion del WS y salida del WS
				CardWS_Service service = new CardWS_Service(
						new URL(readProperties("IP.AMBIENTE")+"/CBP-1/CardWS?wsdl"));
				CardWS port = service.getCardWSPort();
				respuestaWS = port.assignCardToClientWS(clientWS, plasticWS, fechaCorte, fechaAsignacion, ChannelEnum.PERSONA_NATURAL.getDescripcion());

				if (respuestaWS.getDescripcion().equals(DESCRIPCION_RESPUESTA_EXITOSO)) {
					respuesta.setCodigo(CODIGO_RESPUESTA_EXITOSO);
					respuesta.setDescripcion(DESCRIPCION_RESPUESTA_EXITOSO);
				} else {
					respuesta.setCodigo(CODIGO_RESPUESTA_FALLIDO);
					respuesta.setDescripcion(DESCRIPCION_RESPUESTA_FALLIDA);
				}
			} else {
				respuesta.setCodigo(CODIGO_SIN_RESULTADOS_CONSULTA);
				respuesta.setDescripcion(DESCRIPCION_RESPUESTA_SIN_CONSULTA);
			}
			

		} catch (Exception e) {
			logger.severe(new StringBuilder("ERROR DAO al consumir el servicio assignCardToClient: ").append("-CH-")
					.append(ChannelEnum.PERSONA_NATURAL.getDescripcion()).append("-DT-").append(new Date())
					.append("-STS-").append(DESCRIPCION_RESPUESTA_FALLIDA).append("-EXCP-").append(e.toString())
					.toString() + e);
		}
		return respuesta;
	}

}
