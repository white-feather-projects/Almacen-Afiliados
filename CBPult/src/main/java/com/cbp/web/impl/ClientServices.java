/**
 * 
 */
package com.cbp.web.impl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbp.web.dao.AccountDAO;
import com.cbp.web.dao.ClientDAO;
import com.cbp.web.dto.ClientDTO;
import com.cbp.web.dto.RespuestaDTO;
import com.cbp.web.enumerated.ChannelEnum;
import com.cbp.web.util.Util;
import com.cbp1.ws.cbp.service.Canton;
import com.cbp1.ws.cbp.service.CargaArchivosDTO;
import com.cbp1.ws.cbp.service.CategoriaOcupacional;
import com.cbp1.ws.cbp.service.Client;
import com.cbp1.ws.cbp.service.ClientWS;
import com.cbp1.ws.cbp.service.ClientsWs;
import com.cbp1.ws.cbp.service.CodigoPostal;
import com.cbp1.ws.cbp.service.Distrito;
import com.cbp1.ws.cbp.service.InformacionAdicionalClienteDTO;
import com.cbp1.ws.cbp.service.NewClientDTO;
import com.cbp1.ws.cbp.service.Pais;
import com.cbp1.ws.cbp.service.Provincia;
import com.cbp1.ws.cbp.service.ValidaClientDTO;

/**
 * @author Equipo
 *
 */
@Service
public class ClientServices extends Util implements ClientDAO {

	private static final Logger logger = Logger.getLogger(ClientServices.class.getName());

	/**
	 * Crea un nuevo cliente
	 */
	@Override
	public RespuestaDTO createClient(ClientDTO client) {
		RespuestaDTO respuesta = new RespuestaDTO();
		com.cbp1.ws.cbp.service.RespuestaDTO respuestaWS = new com.cbp1.ws.cbp.service.RespuestaDTO();
		com.cbp1.ws.cbp.service.ClientDTO clientWS = new com.cbp1.ws.cbp.service.ClientDTO();
		List<com.cbp1.ws.cbp.service.ErroresDTO> listRrror = new ArrayList<>();
		try {
			if (client != null) {
				// Llenamos el objeto cliente del ws
				clientWS.setClientBirthday(client.getClientBirthday());
				clientWS.setClientCellPhone(client.getClientCellPhone());
				clientWS.setClientCivilStatus(client.getClientCivilStatus());
				clientWS.setClientDocumentId(client.getClientDocumentId());
			//	clientWS.setClientEconomicActivity(client.getClientEconomicActivity());
				clientWS.setClientEmail(client.getClientEmail());
				clientWS.setClientFirstName(client.getClientFirstName());
				clientWS.setClientGender(client.getClientGender());
				clientWS.setClientHomePhone(client.getClientHomePhone());
			//	clientWS.setClientLaborRelationship(client.getClientLaborRelationship());
				clientWS.setClientLastName(client.getClientLastName());
			//	clientWS.setClientOcupation(client.getClientOcupation());
				clientWS.setClientPreaprovedAmount(client.getClientPreaprovedAmount());
				clientWS.setClientProfession(client.getClientProfession());
			//	clientWS.setClientSalary(client.getClientSalary());
				clientWS.setClientSurname(client.getClientSurname());
				clientWS.setClientTypeId(client.getClientTypeId());
				clientWS.setNombreCanal(ChannelEnum.PERSONA_NATURAL.getDescripcion());

				// invocacion del WS y salida del WS
				ClientsWs ws = new ClientsWs(new URL(readProperties("IP.AMBIENTE")+"/CBP-1/ClientsWs?WSDL"));
				ClientWS wl = ws.getClientWSPort();
				//respuestaWS = wl.createClientsWS(clientWS, ChannelEnum.PERSONA_NATURAL.getId(),
				//		ChannelEnum.PERSONA_NATURAL.getDescripcion());
				
				if (!respuestaWS.getListErroresDTO().isEmpty()) {
					for(com.cbp1.ws.cbp.service.ErroresDTO error: respuestaWS.getListErroresDTO()) {
						System.out.println("Errores: "+error.getMessage()+ " Campo: "+error.getCampoNombre());
					}
				}
				
				System.out.println("Entro createCient2: " + respuestaWS.getDescripcion());

				if (respuestaWS.getDescripcion().equalsIgnoreCase(DESCRIPCION_RESPUESTA_FALLIDA)) {
					respuesta.setDescripcion(DESCRIPCION_RESPUESTA_FALLIDA);
					respuesta.setCodigo(CODIGO_RESPUESTA_FALLIDO);
					System.out.println("Entro 1: " );
				} else {
					respuesta.setDescripcion(DESCRIPCION_RESPUESTA_EXITOSO);
					respuesta.setCodigo(CODIGO_RESPUESTA_EXITOSO);
					System.out.println("Entro 2: " );
				}
			} else {
				respuesta.setDescripcion(DESCRIPCION_RESPUESTA_FALLIDA);
				respuesta.setCodigo(CODIGO_RESPUESTA_FALLIDO);
				System.out.println("Entro 3: " );
			}
			System.out.println("Entro createCient3: " + respuesta.getDescripcion());
		} catch (Exception e) {
			logger.severe(new StringBuilder("ERROR DAO al consumir el servicio createClientsWS: ").append("-CH-")
					.append(ChannelEnum.PERSONA_NATURAL.getDescripcion()).append("-DT-").append(new Date())
					.append("-STS-").append(DESCRIPCION_RESPUESTA_FALLIDA).append("-EXCP-").append(e.toString())
					.toString() + e);
		}
		return respuesta;
	}

	/**
	 * Consulta un cliente dado el documentId
	 */
	@Override
	public ClientDTO consultClient(String clientId) {
		ClientDTO client = new ClientDTO();
		com.cbp1.ws.cbp.service.Documents doc = new com.cbp1.ws.cbp.service.Documents();
		try {
			// invocacion del WS y salida del WS
			ClientsWs ws = new ClientsWs(new URL(readProperties("IP.AMBIENTE")+"/CBP-1/ClientsWs?WSDL"));
			ClientWS wl = ws.getClientWSPort();
			doc = wl.consultClientWS(clientId);
			/*
			 * ClientWS ws = new ClientsWs().getClientWSPort(); listClientDTOSWS =
			 * ws.consultClientWS(clientId);
			 */
			System.out.println("Retorna: " + doc.getClientId().getClientDocumentId());
			client.setClientBirthday(xmlGregorianCalendarToString(doc.getClientId().getClientBirthday()));
			client.setClientCellPhone(doc.getClientId().getClientCellPhone());
			client.setClientCivilStatus(doc.getClientId().getClientCivilStatus());
			client.setClientDocumentId(doc.getClientId().getClientDocumentId());
			//client.setClientEconomicActivity(doc.getClientId().getClientE);
			client.setClientEmail(doc.getClientId().getClientEmail());
			client.setClientFirstName(doc.getClientId().getClientFirstName());
			client.setClientGender(doc.getClientId().getClientGender());
			client.setClientHomePhone(doc.getClientId().getClientHomePhone());
			//client.setClientLaborRelationship(doc.getClientId().getClientLaborRelationship());
			client.setClientLastName(doc.getClientId().getClientLastName());
			//client.setClientOcupation(doc.getClientId().getClientOcupation());
			client.setClientPreaprovedAmount(doc.getClientId().getClientPreaprovedAmount());
			client.setClientProfession(doc.getClientId().getClientProfession());
			//client.setClientSalary(doc.getClientId().getClientSalary());
			client.setClientSurname(doc.getClientId().getClientSurname());
			client.setClientTypeId(doc.getClientId().getClientTypeId());
			client.setFileFinantial(doc.getDocumentsFinantialSupport());
			client.setFilePersonal(doc.getDocumentsPersonalSupport());
			client.setIdClient(doc.getClientId().getIdClient());
			client.setFileCredit(doc.getDocumentsCreditSupport());
			client.setFileBurot(doc.getDocumentsBurotSupport());
			client.setChannelRequest(doc.getClientId().getChannelRequest());

		} catch (Exception e) {
			logger.severe(new StringBuilder("ERROR DAO al consumir el servicio consultClient: ").append("-CH-")
					.append(ChannelEnum.PERSONA_NATURAL.getDescripcion()).append("-DT-").append(new Date())
					.append("-STS-").append(DESCRIPCION_RESPUESTA_FALLIDA).append("-EXCP-").append(e.toString())
					.toString() + e);
		}
		return client;
	}

	/**
	 * Actualizacion de un cliente
	 */
	@Override
	public RespuestaDTO updateClient(ClientDTO clientDTO) {

		RespuestaDTO respuesta = new RespuestaDTO();
		com.cbp1.ws.cbp.service.Client clientWS = new com.cbp1.ws.cbp.service.Client();
		com.cbp1.ws.cbp.service.RespuestaDTO respuestaWS = new com.cbp1.ws.cbp.service.RespuestaDTO();
		System.out.println("llego al servicio1: " );
		try {
			System.out.println("llego al servicio: " );
			if (clientDTO != null) {
				System.out.println("llego al servicio2: " );
				// Llenamos el objeto cliente del ws
				clientWS.setClientBirthday(formatStringToXmlGregorianCalendar(clientDTO.getClientBirthday()));
				clientWS.setClientCellPhone(clientDTO.getClientCellPhone());
				clientWS.setClientCivilStatus(clientDTO.getClientCivilStatus());
				clientWS.setClientDocumentId(clientDTO.getClientDocumentId());
				//clientWS.setClientEconomicActivity(clientDTO.getClientEconomicActivity());
				clientWS.setClientEmail(clientDTO.getClientEmail());
				clientWS.setClientFirstName(clientDTO.getClientFirstName());
				clientWS.setClientGender(clientDTO.getClientGender());
				clientWS.setClientHomePhone(clientDTO.getClientHomePhone());
			//	clientWS.setClientLaborRelationship(clientDTO.getClientLaborRelationship());
				clientWS.setClientLastName(clientDTO.getClientLastName());
				//clientWS.setClientOcupation(clientDTO.getClientOcupation());
				clientWS.setClientPreaprovedAmount(Long.valueOf(clientDTO.getClientPreaprovedAmount()));
				clientWS.setClientProfession(clientDTO.getClientProfession());
			//	clientWS.setClientSalary(clientDTO.getClientSalary());
				clientWS.setClientSurname(clientDTO.getClientSurname());
				clientWS.setClientTypeId(clientDTO.getClientTypeId());
				clientWS.setIdClient(clientDTO.getIdClient());
				clientWS.setChannelRequest(ChannelEnum.PERSONA_NATURAL.getDescripcion());
				System.out.println("llego al servicio: " );
				// invocacion del WS y salida del WS
				ClientsWs ws = new ClientsWs(new URL(readProperties("IP.AMBIENTE")+"/CBP-1/ClientsWs?WSDL"));
				ClientWS wl = ws.getClientWSPort();
				//respuestaWS = wl.updateClientWS(clientWS, ChannelEnum.PERSONA_NATURAL.getId(),
						//ChannelEnum.PERSONA_NATURAL.getDescripcion());
				System.out.println("Entro createCient2: " + respuestaWS.getDescripcion());
				System.out.println("idClient: "+clientDTO.getIdClient());
				if (respuestaWS.getCodigo().equals(DESCRIPCION_RESPUESTA_FALLIDA)) {
					respuesta.setDescripcion(DESCRIPCION_RESPUESTA_FALLIDA);
					respuesta.setCodigo(CODIGO_RESPUESTA_FALLIDO);
				} else {
					respuesta.setDescripcion(DESCRIPCION_RESPUESTA_EXITOSO);
					respuesta.setCodigo(CODIGO_RESPUESTA_EXITOSO);
				}
			} else {
				respuesta.setDescripcion(DESCRIPCION_RESPUESTA_FALLIDA);
				respuesta.setCodigo(CODIGO_RESPUESTA_FALLIDO);
			}
			
		} catch (Exception e) {
			logger.severe(new StringBuilder("ERROR DAO al consumir el servicio createClientsWS: ").append("-CH-")
					.append(ChannelEnum.PERSONA_NATURAL.getDescripcion()).append("-DT-").append(new Date())
					.append("-STS-").append(DESCRIPCION_RESPUESTA_FALLIDA).append("-EXCP-").append(e.toString())
					.toString() + e);
		}
		return respuesta;
	}

	public List<ClientDTO> listClent() {
		List<ClientDTO> listClients = new ArrayList<>();
		ClientDTO dto = null;
		List<com.cbp1.ws.cbp.service.Client> listClientsWS = new ArrayList<>();
		try {
			// Invocamos el ws
			ClientsWs ws = new ClientsWs(new URL(readProperties("IP.AMBIENTE")+"/CBP-1/ClientsWs?WSDL"));
			ClientWS wl = ws.getClientWSPort();
			listClientsWS = wl.listClientsWS();

			for (com.cbp1.ws.cbp.service.Client ClientWS : listClientsWS) {
				// Llenamos el objeto cliente del ws
				dto = new ClientDTO();
				dto.setClientBirthday(xmlGregorianCalendarToString(ClientWS.getClientBirthday()));
				dto.setClientCellPhone(ClientWS.getClientCellPhone());
				dto.setClientCivilStatus(ClientWS.getClientCivilStatus());
				dto.setClientDocumentId(ClientWS.getClientDocumentId());
			//	dto.setClientEconomicActivity(ClientWS.getClientEconomicActivity());
				dto.setClientEmail(ClientWS.getClientEmail());
				dto.setClientFirstName(ClientWS.getClientFirstName());
				dto.setClientGender(ClientWS.getClientGender());
				dto.setClientHomePhone(ClientWS.getClientHomePhone());
			//	dto.setClientLaborRelationship(ClientWS.getClientLaborRelationship());
				dto.setClientLastName(ClientWS.getClientLastName());
			//	dto.setClientOcupation(ClientWS.getClientOcupation());
				dto.setClientPreaprovedAmount(ClientWS.getClientPreaprovedAmount());
				dto.setClientProfession(ClientWS.getClientProfession());
			//	dto.setClientSalary(ClientWS.getClientSalary());
				dto.setClientSurname(ClientWS.getClientSurname());
				dto.setClientTypeId(ClientWS.getClientTypeId());
				dto.setIdClient(ClientWS.getIdClient());
				listClients.add(dto);
			}

		} catch (Exception e) {
			logger.severe(new StringBuilder("ERROR DAO al consumir el servicio listClent: ").append("-CH-")
					.append(ChannelEnum.PERSONA_NATURAL.getDescripcion()).append("-DT-").append(new Date())
					.append("-STS-").append(DESCRIPCION_RESPUESTA_FALLIDA).append("-EXCP-").append(e.toString())
					.toString() + e);
		}
		return listClients;
	}

	@Override
	public RespuestaDTO procesarArchivosCliente(com.cbp.web.dto.CargaArchivosDTO cargaArchivosDTO) {
		com.cbp1.ws.cbp.service.CargaArchivosDTO cargaArchivosWS = new com.cbp1.ws.cbp.service.CargaArchivosDTO();
		RespuestaDTO respuesta = new RespuestaDTO();
		com.cbp.web.dto.CargaArchivosDTO dto = new com.cbp.web.dto.CargaArchivosDTO();
		
		
		logger.info("CargaServices"+ cargaArchivosDTO.toString());
		
		try {

			cargaArchivosWS.setFileFinantialInformationName(cargaArchivosDTO.getFileFinantialInformationName());
			cargaArchivosWS.setFilePersonalInformationName(cargaArchivosDTO.getFilePersonalInformationName());

			// Invocamos el ws
			ClientsWs ws = new ClientsWs(new URL(readProperties("IP.AMBIENTE")+"/CBP-1/ClientsWs?WSDL"));
			ClientWS wl = ws.getClientWSPort();
			cargaArchivosWS = wl.procesarArchivosClienteWS(cargaArchivosWS, cargaArchivosDTO.getClientDocumentId(),
					ChannelEnum.PERSONA_NATURAL.getId(), ChannelEnum.PERSONA_NATURAL.getDescripcion());
			if (cargaArchivosWS.getRespuesta().getDescripcion().equals(DESCRIPCION_RESPUESTA_FALLIDA)) {
				respuesta.setDescripcion(DESCRIPCION_RESPUESTA_FALLIDA);
				respuesta.setCodigo(CODIGO_RESPUESTA_FALLIDO);
			} else {
				dto.setFileFinantialInformationName(cargaArchivosWS.getFileFinantialInformationName());
				dto.setFilePersonalInformationName(cargaArchivosWS.getFilePersonalInformationName());
				respuesta.setDescripcion(cargaArchivosWS.getRespuesta().getDescripcion());
				respuesta.setCodigo(cargaArchivosWS.getRespuesta().getCodigo());
				dto.setRespuesta(respuesta);
			}
		} catch (Exception e) {
			logger.severe(new StringBuilder("ERROR DAO al consumir el servicio procesarArchivosCliente: ")
					.append("-CH-").append(ChannelEnum.PERSONA_NATURAL.getDescripcion()).append("-DT-")
					.append(new Date()).append("-STS-").append(DESCRIPCION_RESPUESTA_FALLIDA).append("-EXCP-")
					.append(e.toString()).toString() + e);
		}
		return respuesta;
	}
	
	@Override
	public RespuestaDTO procesarArchivosAnalisis(com.cbp.web.dto.CargaArchivosDTO cargaArchivosDTO) {
		com.cbp1.ws.cbp.service.CargaArchivosDTO cargaArchivosWS = new com.cbp1.ws.cbp.service.CargaArchivosDTO();
		RespuestaDTO respuesta = new RespuestaDTO();
		com.cbp.web.dto.CargaArchivosDTO dto = new com.cbp.web.dto.CargaArchivosDTO();
		
		
		logger.info("CargaServices"+ cargaArchivosDTO.toString());
		
		try {
			cargaArchivosWS.setFileBurotSuppor(cargaArchivosDTO.getFileBurotSuppor());

			// Invocamos el ws
			ClientsWs ws = new ClientsWs(new URL(readProperties("IP.AMBIENTE")+"/CBP-1/ClientsWs?WSDL"));
			ClientWS wl = ws.getClientWSPort();
			cargaArchivosWS = wl.updateDocumentsClientWS(cargaArchivosWS, cargaArchivosDTO.getClientDocumentId(),
					ChannelEnum.PERSONA_NATURAL.getId(), ChannelEnum.PERSONA_NATURAL.getDescripcion());
			if (cargaArchivosWS.getRespuesta().getDescripcion().equals(DESCRIPCION_RESPUESTA_FALLIDA)) {
				respuesta.setDescripcion(DESCRIPCION_RESPUESTA_FALLIDA);
				respuesta.setCodigo(CODIGO_RESPUESTA_FALLIDO);
				
				
			} else {
				dto.setFileFinantialInformationName(cargaArchivosWS.getFileFinantialInformationName());
				dto.setFilePersonalInformationName(cargaArchivosWS.getFilePersonalInformationName());
				dto.setFileBurotSuppor(cargaArchivosDTO.getFileBurotSuppor());
				respuesta.setDescripcion(cargaArchivosWS.getRespuesta().getDescripcion());
				respuesta.setCodigo(cargaArchivosWS.getRespuesta().getCodigo());
				dto.setRespuesta(respuesta);
			}
		} catch (Exception e) {
			logger.severe(new StringBuilder("ERROR DAO al consumir el servicio procesarArchivosCliente: ")
					.append("-CH-").append(ChannelEnum.PERSONA_NATURAL.getDescripcion()).append("-DT-")
					.append(new Date()).append("-STS-").append(DESCRIPCION_RESPUESTA_FALLIDA).append("-EXCP-")
					.append(e.toString()).toString() + e);
		}
		return respuesta;
	}

	@Override
	public RespuestaDTO updateArchivosCliente(com.cbp.web.dto.CargaArchivosDTO cargaArchivosDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	///
	
	@Override
	public List<Pais> queryPais(){
		ClientsWs ws;
		List<Pais> list= new ArrayList<>();
		try {
			ws = new ClientsWs(new URL(readProperties("IP.AMBIENTE")+"/CBP-1/ClientsWs?WSDL"));
			ClientWS wl = ws.getClientWSPort();
			list=wl.listPaisWS();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Provincia> queryProvincia(Pais pais) {
	
		List<Provincia> list= new ArrayList<>();
		ClientsWs ws;
		try {
			ws = new ClientsWs(new URL(readProperties("IP.AMBIENTE")+"/CBP-1/ClientsWs?WSDL"));
			ClientWS wl = ws.getClientWSPort();
			list=wl.listProvinciasWS(pais);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}

	@Override
	public List<Canton> queryCanton(Provincia provincia) {
		
		List<Canton> list= new ArrayList<>();
		ClientsWs ws;
		try {
			ws = new ClientsWs(new URL(readProperties("IP.AMBIENTE")+"/CBP-1/ClientsWs?WSDL"));
			ClientWS wl = ws.getClientWSPort();
			list=wl.listCantonWS(provincia);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}

	@Override
	public List<Distrito> queryDis(Canton canton) {
		List<Distrito> list= new ArrayList<>();
		ClientsWs ws;
		try {
			ws = new ClientsWs(new URL(readProperties("IP.AMBIENTE")+"/CBP-1/ClientsWs?WSDL"));
			ClientWS wl = ws.getClientWSPort();
			list=wl.listDistritoWS(canton);

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}
	
	@Override
	public CodigoPostal codigoPostal(Distrito distrito) {
		CodigoPostal codigoPostal = new CodigoPostal();
		ClientsWs ws;
		try {
			ws = new ClientsWs(new URL(readProperties("IP.AMBIENTE")+"/CBP-1/ClientsWs?WSDL"));
			ClientWS wl = ws.getClientWSPort();
			codigoPostal=wl.codigoPostalWS(distrito);

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return codigoPostal;

	}


	@Override
	public List<CategoriaOcupacional> queryCatOcup() {
		List<CategoriaOcupacional> list= new ArrayList<>();
		ClientsWs ws;
		try {
			ws = new ClientsWs(new URL(readProperties("IP.AMBIENTE")+"/CBP-1/ClientsWs?WSDL"));
			ClientWS wl = ws.getClientWSPort();
			list=wl.listCatOcupacionalWS();

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public com.cbp1.ws.cbp.service.RespuestaDTO createNewClient(NewClientDTO clientDTO, String userLogeeado) {
		
		com.cbp1.ws.cbp.service.RespuestaDTO client= new com.cbp1.ws.cbp.service.RespuestaDTO();
		ClientsWs ws;
		try {
			ws = new ClientsWs(new URL(readProperties("IP.AMBIENTE")+"/CBP-1/ClientsWs?WSDL"));
			ClientWS wl = ws.getClientWSPort();
			
			client=wl.createClientsWS(clientDTO, userLogeeado, ChannelEnum.PERSONA_NATURAL.getId(), ChannelEnum.PERSONA_NATURAL.getDescripcion());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return client;
	}

	@Override
	public ValidaClientDTO queryIdent(String ident) {
		ValidaClientDTO client= new ValidaClientDTO();
		ClientsWs ws;
		try {
			ws = new ClientsWs(new URL(readProperties("IP.AMBIENTE")+"/CBP-1/ClientsWs?WSDL"));
			ClientWS wl = ws.getClientWSPort();
			client=wl.validaClientbyDocumentIdWS(ident);
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return client;
	}

	@Override
	public 	com.cbp1.ws.cbp.service.RespuestaDTO  additionalInformation(InformacionAdicionalClienteDTO info, Long idclient) {
		
		com.cbp1.ws.cbp.service.RespuestaDTO client= new com.cbp1.ws.cbp.service.RespuestaDTO ();
		ClientsWs ws;
		try {
			ws = new ClientsWs(new URL(readProperties("IP.AMBIENTE")+"/CBP-1/ClientsWs?WSDL"));
			ClientWS wl = ws.getClientWSPort();
			client=wl.saveAditionaInformationClient(info,idclient);
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}




		return client;
	}

	@Override
	public ValidaClientDTO queryIndetUser(String user) {
		ValidaClientDTO client= new ValidaClientDTO();
		ClientsWs ws;
		try {
			ws = new ClientsWs(new URL(readProperties("IP.AMBIENTE")+"/CBP-1/ClientsWs?WSDL"));
			ClientWS wl = ws.getClientWSPort();
			client=wl.consultClientByUsersFpWS(user);
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return client;
	}

	@Override
	public com.cbp1.ws.cbp.service.RespuestaDTO updateClient(NewClientDTO cli) {
		com.cbp1.ws.cbp.service.RespuestaDTO client= new com.cbp1.ws.cbp.service.RespuestaDTO();
		ClientsWs ws;
		try {
			ws = new ClientsWs(new URL(readProperties("IP.AMBIENTE")+"/CBP-1/ClientsWs?WSDL"));
			ClientWS wl = ws.getClientWSPort();
			client=wl.updateClientWS(cli);
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return client;
		
	}
	
	@Override
	public InformacionAdicionalClienteDTO queryClientComplet(Long id) {
		InformacionAdicionalClienteDTO client= new InformacionAdicionalClienteDTO();
		ClientsWs ws;
		try {
			ws = new ClientsWs(new URL("http://18.223.203.6:8080/CBP-1/ClientsWs?WSDL"));
			ClientWS wl = ws.getClientWSPort();
			client=wl.consultAllClientByIdClientWS(id);
			
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return client;
		
	}
	
	@Override
	public com.cbp1.ws.cbp.service.RespuestaDTO updateClientaAanaliteComplet(InformacionAdicionalClienteDTO info) {
		com.cbp1.ws.cbp.service.RespuestaDTO client= new com.cbp1.ws.cbp.service.RespuestaDTO();
		ClientsWs ws;
		try {
			ws = new ClientsWs(new URL("http://18.223.203.6:8080/CBP-1/ClientsWs?WSDL"));
			ClientWS wl = ws.getClientWSPort();
			client=wl.actualizaClienteConInformacionAdicionalWS(info);
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return client;
	}
	
	

	

}