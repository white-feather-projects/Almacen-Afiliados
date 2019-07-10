package com.cbp.web.impl;

import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cbp.web.dao.AccountDAO;
import com.cbp.web.dto.AccountDTO;
import com.cbp.web.dto.AccountQueryAssignetTdcDTO;
import com.cbp.web.dto.ClientDTO;
import com.cbp.web.dto.RespuestaDTO;
import com.cbp.web.enumerated.ChannelEnum;
import com.cbp.web.util.Util;
import com.cbp1.ws.cbp.service.Account;
import com.cbp1.ws.cbp.service.AccountWS;
import com.cbp1.ws.cbp.service.AccountWS_Service;

@Service
public class AccountService extends Util implements AccountDAO {

	//private static final Logger logger = Logger.getLogger(AccountService.class.getName());
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	public RespuestaDTO createAccountClient(String OfficeId, String accountType, String clientDocumentId) {
		RespuestaDTO respuesta = new RespuestaDTO();
		com.cbp1.ws.cbp.service.RespuestaDTO respuestaWS = new com.cbp1.ws.cbp.service.RespuestaDTO();
		try {

			System.out.println("Office: " + OfficeId + " tipo: " + accountType + " documentid: " + clientDocumentId);
			// invocacion del WS y salida del WS
			AccountWS_Service service = new AccountWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-1/AccountWS?wsdl"));
			AccountWS port = service.getAccountWSPort();

			respuestaWS = port.createAccountWS("522", "03", clientDocumentId);
			System.out.println("RespuestaAccount: " + respuestaWS.getDescripcion());
			if (respuestaWS.getCodigo().equals(DESCRIPCION_RESPUESTA_FALLIDA)) {
				respuesta.setDescripcion(DESCRIPCION_RESPUESTA_FALLIDA);
				respuesta.setCodigo(CODIGO_RESPUESTA_FALLIDO);
			} else {
				respuesta.setDescripcion(DESCRIPCION_RESPUESTA_EXITOSO);
				respuesta.setCodigo(CODIGO_RESPUESTA_EXITOSO);
			}
		} catch (Exception e) {
			log.info(new StringBuilder("ERROR DAO al consumir el servicio AccountWS: ").append("-CH-")
					.append(ChannelEnum.PERSONA_NATURAL.getDescripcion()).append("-DT-").append(new Date())
					.append("-STS-").append(DESCRIPCION_RESPUESTA_FALLIDA).append("-EXCP-").append(e.toString())
					.toString() + e);
		}
		return respuesta;
	}

	public AccountQueryAssignetTdcDTO consultAccountClient(String clientDocumentId) {
		AccountQueryAssignetTdcDTO res = new AccountQueryAssignetTdcDTO();
		AccountDTO dto = new AccountDTO();
	
		Account dt = new Account();
		com.cbp1.ws.cbp.service.Account acc= new com.cbp1.ws.cbp.service.Account();
		try {
			// invocacion del WS y salida del WS
			AccountWS_Service service = new AccountWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-1/AccountWS?wsdl"));
			AccountWS port = service.getAccountWSPort();

			dt = port.consultAcoountByClientWS(clientDocumentId);
			log.info("listAccountWS: {}",clientDocumentId);
			
			res.setAccount(dt.getAccountNumber());
			res.setIban(dt.getAccountIban());
			res.setIdDocument(dt.getClientId().getClientDocumentId());
			res.setFirtName(dt.getClientId().getClientFirstName());
			res.setFirtSurname(dt.getClientId().getClientSurname());
			res.setBin(dt.getBin());
			
			String lastN=dt.getClientId().getClientSurname();
			res.setLastName(dt.getClientId().getClientLastName());
			res.setLastSurname(lastN);
			res.setIdClient(dt.getClientId().getIdClient());
			
			log.info("Nombre: {}",res.toString());
			
			/*
			for (com.cbp1.ws.cbp.service.Account accountWS : listAccountWS) {
				dto.setAccountIban(accountWS.getAccountIban());
				dto.setAccountNumber(accountWS.getAccountNumber());
				dto.setAccountStatus(accountWS.getAccountStatus());
				client.setIdClient(accountWS.getClientId().getIdClient());
				client.setClientFirstName(accountWS.getClientId().getClientFirstName());
				client.setClientLastName(accountWS.getClientId().getClientLastName());
				client.setClientSurname(accountWS.getClientId().getClientSurname());
				dto.setClientDTO(client);
			}
			*/
		} catch (Exception e) {
			log.info(new StringBuilder("ERROR DAO al consumir el servicio AccountWS: consultAcoountByClientWS ")
					.append("-CH-").append(ChannelEnum.PERSONA_NATURAL.getDescripcion()).append("-DT-")
					.append(new Date()).append("-STS-").append(DESCRIPCION_RESPUESTA_FALLIDA).append("-EXCP-")
					.append(e.toString()).toString() + e);
			res.setErrorMsg("Se genero un error al servicio AccountWS");
		}
		return res;
	}

	public List<ClientDTO> listClientAndAccount() {
		List<com.cbp1.ws.cbp.service.ClientDTO> listClientWS = new ArrayList<>();
		ClientDTO client = null;
		List<ClientDTO> listDTO = new ArrayList<>();
		try {
			// invocacion del WS y salida del WS
			AccountWS_Service service = new AccountWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-1/AccountWS?wsdl"));
			AccountWS port = service.getAccountWSPort();

			listClientWS = port.findAllAccountAndClientWS();
			if (!listClientWS.isEmpty()) {
				for (com.cbp1.ws.cbp.service.ClientDTO dto : listClientWS) {
					client = new ClientDTO();
					client.setIdClient(dto.getIdClient());
					client.setClientDocumentId(dto.getClientDocumentId());
					client.setClientFirstName(dto.getClientFirstName());
					client.setClientSurname(dto.getClientSurname());
					client.setAccountStatus(dto.getAccountStatus());
					client.setClientBirthday(dto.getClientBirthday());
					client.setFechaCarga(xmlGregorianCalendarToString(dto.getFechaCarga()));
					listDTO.add(client);
				}
			}

		} catch (Exception e) {
			log.info(new StringBuilder("ERROR DAO al consumir el servicio AccountWS: listClientAndAccount ")
					.append("-CH-").append(ChannelEnum.PERSONA_NATURAL.getDescripcion()).append("-DT-")
					.append(new Date()).append("-STS-").append(DESCRIPCION_RESPUESTA_FALLIDA).append("-EXCP-")
					.append(e.toString()).toString() + e);
		}
		return listDTO;
	}

	/**
	 * Actualiza el estado de la cuenta
	 */
	@Override
	public RespuestaDTO updateAccountClient(String documentClientId, String statusAccount) {
		RespuestaDTO respuesta = new RespuestaDTO();
		com.cbp1.ws.cbp.service.RespuestaDTO respuestaWS = new com.cbp1.ws.cbp.service.RespuestaDTO();
		try {
			// invocacion del WS y salida del WS
			AccountWS_Service service = new AccountWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-1/AccountWS?wsdl"));
			AccountWS port = service.getAccountWSPort();
			System.out.println("Cd: "+documentClientId + "sta: "+statusAccount);
			respuestaWS = port.updateStatusAccountWS(documentClientId, statusAccount, "Comentatios");
			System.out.println("respuesta: "+respuestaWS.getDescripcion());
			if (respuestaWS.getCodigo().equals(DESCRIPCION_RESPUESTA_FALLIDA)) {
				respuesta.setDescripcion(DESCRIPCION_RESPUESTA_FALLIDA);
				respuesta.setCodigo(CODIGO_RESPUESTA_FALLIDO);
			} else {
				respuesta.setDescripcion(DESCRIPCION_RESPUESTA_EXITOSO);
				respuesta.setCodigo(CODIGO_RESPUESTA_EXITOSO);
			}
		} catch (Exception e) {
			log.info(new StringBuilder("ERROR DAO al consumir el servicio AccountWS: updateAccountClient")
					.append("-CH-").append(ChannelEnum.PERSONA_NATURAL.getDescripcion()).append("-DT-")
					.append(new Date()).append("-STS-").append(DESCRIPCION_RESPUESTA_FALLIDA).append("-EXCP-")
					.append(e.toString()).toString() + e);
		}
		return respuesta;
	}

}
