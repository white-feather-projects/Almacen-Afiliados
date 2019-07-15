package com.cbp.web.impl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.stereotype.Service;

import com.cbp.web.dao.PurchaseOrder;
import com.cbp.web.dto.ProductDTO;
import com.cbp.web.dto.PurchaseOrderDTO;
import com.cbp.web.dto.PurchaseOrderRequestDTO;
import com.cbp.web.dto.RespuestaFDTO;
import com.cbp.web.enumerated.ChannelEnum;
import com.cbp.web.util.Util;
import com.cbp1.ws.cbp.service.ClientWS;
import com.cbp1.ws.cbp.service.ClientsWs;
import com.cbp1.ws.cbp.service.Pais;
import com.cbp2.ws.cbp.service.PlasticDTO;
import com.cbp2.ws.cbp.service.Product;
import com.cbp2.ws.cbp.service.PurchaseOrderRequest;
import com.cbp2.ws.cbp.service.PurchaseOrderWS;
import com.cbp2.ws.cbp.service.PurchaseOrderWS_Service;
import com.cbp2.ws.cbp.service.RespuestaDTO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


@Service
public class PurchaseOrderServices extends Util implements PurchaseOrder {

private static final Logger logger = Logger.getLogger(PurchaseOrderServices.class.getName());
	
	
/**
 * Metodo para crear solicitud de orden de compra
 */

@Override
public RespuestaDTO createPurchaseOrderRequestWS(PurchaseOrderRequestDTO ge, Product pro) {
	PurchaseOrderWS_Service service;
	com.cbp2.ws.cbp.service.PurchaseOrderRequest dto = new com.cbp2.ws.cbp.service.PurchaseOrderRequest();
	RespuestaDTO res = new RespuestaDTO();
	try {
		service = new PurchaseOrderWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-2/PurchaseOrderWS?WSDL"));
		PurchaseOrderWS port = service.getPurchaseOrderWSPort();
		res = port.createPurchaseOrderRequestWS(ge.getDescriptionOrder(), ge.getQuantity(), ge.getCodeUserLouder(), "002", 
				ge.getStatusOrder(), ge.getFechaCarga(), pro,ChannelEnum.PERSONA_NATURAL.getId(),
				ChannelEnum.PERSONA_NATURAL.getDescripcion());

	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return res;
}





	
	
	/**
	 * Metodo para crear solicitud de orden de compra
	 */
/*
	public RespuestaFDTO createPurchaseOrderRequestWS(String descriptionOrder, long quantity, String codeUserLouder,
	String codeUserAproved, String statusOrder, String fechaCarga, ProductDTO productDTO) {
	RespuestaFDTO respuesta = new RespuestaFDTO();
	com.cbp2.ws.cbp.service.RespuestaDTO response = new com.cbp2.ws.cbp.service.RespuestaDTO();
    com.cbp2.ws.cbp.service.Product productWS = new com.cbp2.ws.cbp.service.Product();
		try {
			
			
			// productDTO.setIdProduct(Long.valueOf(val));
			productWS.setIdProduct(productDTO.getIdProduct());

			/*
			 * productWS.setProductActive(productDTO.getProductActive());
			 * productWS.setProductName(productDTO.getProductName());
			 * productWS.setProductLogo(productDTO.getProductLogo());
			 */
/*
			PurchaseOrderWS_Service serv;

			serv = new PurchaseOrderWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-2/PurchaseOrderWS?WSDL"));

			PurchaseOrderWS port = serv.getPurchaseOrderWSPort();
			response = port.createPurchaseOrderRequestWS(descriptionOrder, quantity, codeUserLouder, codeUserAproved,
					/** StatusRequest.SOLICITUD_INGRESADA.getDescripcion() */
			/*		statusOrder, fechaCarga, productWS, ChannelEnum.PERSONA_NATURAL.getId(),
					ChannelEnum.PERSONA_NATURAL.getDescripcion());

			if (response.getCodigo().equals(DESCRIPCION_RESPUESTA_FALLIDA)) {
				respuesta.setDescripcion(DESCRIPCION_RESPUESTA_FALLIDA);
				respuesta.setCodigo(CODIGO_RESPUESTA_FALLIDO);
			} else {
				respuesta.setDescripcion(DESCRIPCION_RESPUESTA_EXITOSO);
				respuesta.setCodigo(CODIGO_RESPUESTA_EXITOSO);
			}
		} catch (IOException e) {
			logger.severe(new StringBuilder("ERROR DAO al consumir el servicio createClientsWS: ").append("-CH-")
					.append(ChannelEnum.PERSONA_NATURAL.getDescripcion()).append("-DT-").append(new Date())
					.append("-STS-").append(DESCRIPCION_RESPUESTA_FALLIDA).append("-EXCP-").append(e.toString())
					.toString() + e);
		}

		return respuesta;
	}
	
	*/
	
	
	/**
	 * Metodo que devuelve la lista de solicitudes de orden de compras
	 */
	@Override
	public List<PurchaseOrderRequestDTO> listPurchaseOrderRequestDTO() {
	List<PurchaseOrderRequestDTO> listDTO = new ArrayList<>();
	PurchaseOrderRequestDTO purchaseOrderRequestDTO = null;
	List<com.cbp2.ws.cbp.service.PurchaseOrderRequest> purchaseOrderRequestWS = new ArrayList<>();
	ProductDTO dto = new ProductDTO();
	
	try {
	PurchaseOrderWS_Service serv = new PurchaseOrderWS_Service(
	new URL(readProperties("IP.AMBIENTE")+"/CBP-2/PurchaseOrderWS?WSDL"));
		
	PurchaseOrderWS port = serv.getPurchaseOrderWSPort();
    purchaseOrderRequestWS = port.listPurchaseOrderRequestWS();
    
	for (com.cbp2.ws.cbp.service.PurchaseOrderRequest request : purchaseOrderRequestWS) {
	purchaseOrderRequestDTO = new PurchaseOrderRequestDTO();
	purchaseOrderRequestDTO.setIdOrderRequest(request.getIdOrderRequest());
	purchaseOrderRequestDTO.setStatusOrder(request.getStatusOrder());
	purchaseOrderRequestDTO.setCodeUserAproved(request.getCodeUserAproved());
    purchaseOrderRequestDTO.setCodeUserLouder(request.getCodeUserLouder());
	purchaseOrderRequestDTO.setDescriptionOrder(request.getDescriptionOrder());
	purchaseOrderRequestDTO.setFechaCarga(xmlGregorianCalendarToString(request.getFechaHoraCarga()));
	purchaseOrderRequestDTO.setQuantity(request.getQuantity());
	
	dto.setCodigoUsuarioModifica(request.getProductId().getCodigoUsuarioModifica());
	dto.setIdProduct(request.getProductId().getIdProduct());
    dto.setProductActive(request.getProductId().getProductActive());
	dto.setProductLogo(request.getProductId().getProductLogo());
	dto.setProductName(request.getProductId().getProductName());
	
    purchaseOrderRequestDTO.setProductDTO(dto);
    listDTO.add(purchaseOrderRequestDTO);
	}

    } catch (IOException ex) {
	logger.severe(new StringBuilder("ERROR DAO al consumir el servicio createClientsWS: ").append("-CH-")
	.append(ChannelEnum.PERSONA_NATURAL.getDescripcion()).append("-DT-").append(new Date())
	.append("-STS-").append(DESCRIPCION_RESPUESTA_FALLIDA).append("-EXCP-").append(ex.toString())
	.toString() + ex);
	}

	return listDTO;
	}
	
	
	
	/**
	 * Metodo que devuelve la lista de solicitudes de orden de compras con el numero de orden de compra
	 */
	@Override
	public List<PurchaseOrderRequestDTO> listPurchaseOrder() {
		List<PurchaseOrderRequestDTO> listDTO = new ArrayList<>();
		PurchaseOrderRequestDTO purchaseOrderRequestDTO = null;	
		List<com.cbp2.ws.cbp.service.OrdersDTO> ordersDTO = new ArrayList<>();

		
		try {
			PurchaseOrderWS_Service serv = new PurchaseOrderWS_Service(
					new URL(readProperties("IP.AMBIENTE")+"/CBP-2/PurchaseOrderWS?WSDL"));
			PurchaseOrderWS port = serv.getPurchaseOrderWSPort();
			ordersDTO = port.listPurchaseOrderWS();
			for (com.cbp2.ws.cbp.service.OrdersDTO request : ordersDTO) {
				purchaseOrderRequestDTO = new PurchaseOrderRequestDTO();
				
				purchaseOrderRequestDTO.setIdOrderRequest(request.getIdRequest());
				purchaseOrderRequestDTO.setNumberOrder(request.getPurchaseOrderNumber());
				purchaseOrderRequestDTO.setQuantity(request.getQuantityRequest());
				purchaseOrderRequestDTO.setStatusOrder(request.getStatusOrder());
				purchaseOrderRequestDTO.setDescriptionOrder(request.getRequestDescription());
				purchaseOrderRequestDTO.setFechaCarga(xmlGregorianCalendarToString(request.getFechaHoraCarga()));
				
				listDTO.add(purchaseOrderRequestDTO);
				
			}
		

		} catch (IOException ex) {
			logger.severe(new StringBuilder("ERROR DAO al consumir el servicio createClientsWS: ").append("-CH-")
					.append(ChannelEnum.PERSONA_NATURAL.getDescripcion()).append("-DT-").append(new Date())
					.append("-STS-").append(DESCRIPCION_RESPUESTA_FALLIDA).append("-EXCP-").append(ex.toString())
					.toString() + ex);
		}

		return listDTO;
	}
	
	
	@Override
	public List<com.cbp.web.dto.PlasticDTO> listPlasticByPurchaseorderNumberWS(String purchaseOrderNumber) {
		List<com.cbp.web.dto.PlasticDTO> listDTO = new ArrayList<>();
		com.cbp.web.dto.PlasticDTO plastic = null;	
		List<com.cbp2.ws.cbp.service.PlasticDTO> plasticDTO = new ArrayList<>();
	
		
		try {
			PurchaseOrderWS_Service serv = new PurchaseOrderWS_Service(
					new URL(readProperties("IP.AMBIENTE")+"/CBP-2/PurchaseOrderWS?WSDL"));
			PurchaseOrderWS port = serv.getPurchaseOrderWSPort();
			plasticDTO = port.listPlasticByPurchaseorderNumberWS(purchaseOrderNumber);
			for (com.cbp2.ws.cbp.service.PlasticDTO request : plasticDTO) {
				plastic = new com.cbp.web.dto.PlasticDTO();
				
				plastic.setPlasticNumber(request.getNumberPlastic());
				plastic.setPlasticExpDate(request.getFechaExp());
				plastic.setPlasticCvv(request.getCvv());
				
				
				
				listDTO.add(plastic);
				
			}
			

		} catch (IOException ex) {
			logger.severe(new StringBuilder("ERROR DAO al consumir el servicio createClientsWS: ").append("-CH-")
					.append(ChannelEnum.PERSONA_NATURAL.getDescripcion()).append("-DT-").append(new Date())
					.append("-STS-").append(DESCRIPCION_RESPUESTA_FALLIDA).append("-EXCP-").append(ex.toString())
					.toString() + ex);
		}
		return listDTO;
	}
	
	
	
	/***
	 * Metodo para retornar la ultima orden de compra generada
	 */
	@Override
	public PurchaseOrderRequestDTO listLastOrderWS() {
    com.cbp2.ws.cbp.service.PurchaseOrder purchaseOrder = new com.cbp2.ws.cbp.service.PurchaseOrder();
    PurchaseOrderRequestDTO dto = new PurchaseOrderRequestDTO();
	PurchaseOrderWS_Service service;
	ProductDTO pro = new ProductDTO();
	try {
	service = new PurchaseOrderWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-2/PurchaseOrderWS?WSDL"));
	PurchaseOrderWS port = service.getPurchaseOrderWSPort();
	purchaseOrder = port.lastPurchaseOrderWS();
	System.out.println("prueba" + purchaseOrder);
			dto.setQuantity(purchaseOrder.getQuantity());
			dto.setDescriptionOrder(purchaseOrder.getOrderDescription());
			dto.setNumberOrder(purchaseOrder.getPurchaseOrderNumber());
			dto.setStatusOrder(purchaseOrder.getOrderStatus());
			dto.setFechaCarga(xmlGregorianCalendarToString(purchaseOrder.getFechaHoraCarga()));
			
            pro.setIdProduct(purchaseOrder.getProductId().getIdProduct());
            pro.setProductName(purchaseOrder.getProductId().getProductName());
            
            dto.setProductDTO(pro);
            
		} catch (IOException ex) {
			Logger.getLogger(PurchaseOrderServices.class.getName()).log(Level.SEVERE, null, ex);
		}

		return dto;
	}

	
	
	
	/***
	 * Metodo para consultar solicitudes por id
	 */

	@Override
	public PurchaseOrderRequestDTO consultPurchaseOrderRequestByIdOrderWS(String id) {
		com.cbp2.ws.cbp.service.PurchaseOrderRequest purchaseOrderRequest = new com.cbp2.ws.cbp.service.PurchaseOrderRequest();
		PurchaseOrderRequestDTO dto = new PurchaseOrderRequestDTO();
		PurchaseOrderWS_Service service;
		ProductDTO pdto = new ProductDTO();
		try {
			service = new PurchaseOrderWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-2/PurchaseOrderWS?WSDL"));
			PurchaseOrderWS port = service.getPurchaseOrderWSPort();
			purchaseOrderRequest = port.consultPurchaseOrderRequestByIdOrderWS(id,
					ChannelEnum.PERSONA_NATURAL.getDescripcion());

			dto.setQuantity(purchaseOrderRequest.getQuantity());
			System.out.println(purchaseOrderRequest.getQuantity());
			dto.setDescriptionOrder(purchaseOrderRequest.getDescriptionOrder());
			dto.setStatusOrder(purchaseOrderRequest.getStatusOrder());
			dto.setFechaCarga(xmlGregorianCalendarToString(purchaseOrderRequest.getFechaHoraCarga()));
			dto.setNumberOrder(purchaseOrderRequest.getPurchaseOrderNumber());
			dto.setCodeUserLouder(purchaseOrderRequest.getCodeUserLouder());
			//Producto//
			pdto.setCodigoUsuarioModifica(purchaseOrderRequest.getProductId().getCodigoUsuarioModifica());
			// System.out.println("usuario" +
			// request.getProductId().getCodigoUsuarioModifica());
			pdto.setIdProduct(purchaseOrderRequest.getProductId().getIdProduct());
			// System.out.println("idproduct" + request.getProductId().getIdProduct());
			pdto.setProductActive(purchaseOrderRequest.getProductId().getProductActive());
			// System.out.println("active" + request.getProductId().getProductActive());
			pdto.setProductLogo(purchaseOrderRequest.getProductId().getProductLogo());
			// System.out.println("logo" + request.getProductId().getProductLogo());
			pdto.setProductName(purchaseOrderRequest.getProductId().getProductName());
			
			dto.setProductDTO(pdto);
			
			System.out.println(dto);
			System.out.println("prueba" + dto.getDescriptionOrder());

		} catch (IOException ex) {
			Logger.getLogger(PurchaseOrderServices.class.getName()).log(Level.SEVERE, null, ex);
		}

		return dto;
	}
	
	
	
	
	/***
	 * Metodo para consultar solicitudes por numero de orden
	 */

	@Override
	public PurchaseOrderDTO consultPurchaseOrderWS(long id) {
		
		com.cbp2.ws.cbp.service.PurchaseOrder purchaseOrder = new com.cbp2.ws.cbp.service.PurchaseOrder();
		PurchaseOrderDTO purchaseOrderDTO = new PurchaseOrderDTO();
		PurchaseOrderWS_Service service;
		ProductDTO pdto = new ProductDTO();
		try {
			service = new PurchaseOrderWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-2/PurchaseOrderWS?WSDL"));
			PurchaseOrderWS port = service.getPurchaseOrderWSPort();
			purchaseOrder = (com.cbp2.ws.cbp.service.PurchaseOrder) port.consultPurchaseOrderWS(id, ChannelEnum.PERSONA_NATURAL.getDescripcion());
			System.out.println("purchaseOrder"+purchaseOrder);
			purchaseOrderDTO.setPurchaseOrderNumber(purchaseOrder.getPurchaseOrderNumber());
			purchaseOrderDTO.setOrderCommetns(purchaseOrder.getOrderComents());
			purchaseOrderDTO.setOrderStatus(purchaseOrder.getOrderStatus());
			purchaseOrderDTO.setQuantity(String.valueOf(purchaseOrder.getQuantity()));
			purchaseOrderDTO.setPurchaseOrderAprovedDate(xmlGregorianCalendarToString(purchaseOrder.getPurchaseOrderAprovedDate()));
			
			//Producto//
			pdto.setCodigoUsuarioModifica(purchaseOrder.getProductId().getCodigoUsuarioModifica());
			pdto.setIdProduct(purchaseOrder.getProductId().getIdProduct());
			pdto.setProductActive(purchaseOrder.getProductId().getProductActive());
			pdto.setProductLogo(purchaseOrder.getProductId().getProductLogo());
			pdto.setProductName(purchaseOrder.getProductId().getProductName());
			
			purchaseOrderDTO.setProductDTO(pdto);
			
			
			
			
			
		} catch (IOException ex) {
			Logger.getLogger(PurchaseOrderServices.class.getName()).log(Level.SEVERE, null, ex);
		}

		return purchaseOrderDTO;
	}
	
	
	/***
	 * Metodo para generar orden de compra
	 */
	
	@Override
	public com.cbp2.ws.cbp.service.PurchaseOrderDTO generatePurchaseOrder(PurchaseOrderDTO ge, Product pro,
			PurchaseOrderRequest pur) {
		PurchaseOrderWS_Service service;
		com.cbp2.ws.cbp.service.PurchaseOrderDTO dto = new com.cbp2.ws.cbp.service.PurchaseOrderDTO();
		RespuestaDTO res = new RespuestaDTO();
		try {
			service = new PurchaseOrderWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-2/PurchaseOrderWS?WSDL"));
			PurchaseOrderWS port = service.getPurchaseOrderWSPort();
			dto = port.generatePurchaseOrderWS(ge.getOrderDescription(), ge.getOrderCommetns(), "1", ge.getCodUserLoader(), ge.getCodAprovedUser(),
					ge.getOrderType(), ge.getOrderStatus(), ge.getPurchaseOrderDate(), ge.getPurchaseOrderAprovedDate(),
					pro, pur, ge.getQuantity(), "PERSONA_NATURAL");
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dto;
	}
	
	
	
	
	
	
	/***
	 * Metodo para generar orden de compra
	 */
/*
	@Override
	public com.cbp2.ws.cbp.service.PurchaseOrderDTO generatePurchaseOrder(PurchaseOrderDTO ge, Product pro,
			PurchaseOrderRequest pur) {
		com.cbp2.ws.cbp.service.PurchaseOrderDTO dto = new com.cbp2.ws.cbp.service.PurchaseOrderDTO();
		RespuestaDTO res = new RespuestaDTO();
		PurchaseOrderWS gene = new PurchaseOrderWS_Service().getPurchaseOrderWSPort();

		dto = gene.generatePurchaseOrderWS(ge.getOrderDescription(), ge.getOrderCommetns(), "1", "001", "002",
				ge.getOrderType(), ge.getOrderStatus(), ge.getPurchaseOrderDate(), ge.getPurchaseOrderAprovedDate(),
				pro, pur, ge.getQuantity(), "PERSONA_NATURAL");
		return dto;
	}
*/	
	
	
	
	/***
	 * Metodo para cambiar status de solicitud de orden de compra
	 */
/*
	@Override
	public RespuestaDTO changeOnlyStatus(PurchaseOrderRequestDTO ge) {

		RespuestaDTO res = new RespuestaDTO();
		PurchaseOrderWS gene = new PurchaseOrderWS_Service().getPurchaseOrderWSPort();
		res = gene.changeOnlyStatusRequestWS(ge.getIdRequest(), ge.getFechaModificacion(), ge.getStatusOrder(),
				ChannelEnum.PERSONA_NATURAL.getDescripcion());
		return res;
	}
	*/
	
	/***
	 * Metodo para cambiar status de solicitud de orden de compra
	 */
	
	@Override
	public RespuestaDTO changeOnlyStatus(PurchaseOrderRequestDTO ge) {
		PurchaseOrderWS_Service service;
		RespuestaDTO res = new RespuestaDTO();
		try {
			service = new PurchaseOrderWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-2/PurchaseOrderWS?WSDL"));
			PurchaseOrderWS port = service.getPurchaseOrderWSPort();
			res = port.changeOnlyStatusRequestWS(ge.getIdRequest(), ge.getFechaModificacion(), ge.getStatusOrder(),
					ChannelEnum.PERSONA_NATURAL.getDescripcion());
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}
	
	
	
	
	/***
	 * Metodo para cambiar cantidad de tarjetas a solicitar de solicitud de orden de
	 * compra
	 */
/*
	@Override
	public RespuestaDTO chageQuantityPurchaseOrderRequest(PurchaseOrderRequestDTO ge) {

		RespuestaDTO res = new RespuestaDTO();
		PurchaseOrderWS gene = new PurchaseOrderWS_Service().getPurchaseOrderWSPort();
		res = gene.chageQuantityPurchaseOrderRequestWS(ge.getIdRequest(), ge.getFechaModificacion(), ge.getCantidad(),
				ChannelEnum.PERSONA_NATURAL.getDescripcion());
		return res;
	}
	*/
	
	/***
	 * Metodo para cambiar cantidad de tarjetas a solicitar de solicitud de orden de
	 * compra
	 */
	
	@Override
	public RespuestaDTO chageQuantityPurchaseOrderRequest(PurchaseOrderRequestDTO ge) {
		PurchaseOrderWS_Service service;
		RespuestaDTO res = new RespuestaDTO();
		try {
			service = new PurchaseOrderWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-2/PurchaseOrderWS?WSDL"));
			PurchaseOrderWS port = service.getPurchaseOrderWSPort();
			res = port.chageQuantityPurchaseOrderRequestWS(ge.getIdRequest(), ge.getFechaModificacion(), ge.getCantidad(),
					ChannelEnum.PERSONA_NATURAL.getDescripcion());
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}


}
