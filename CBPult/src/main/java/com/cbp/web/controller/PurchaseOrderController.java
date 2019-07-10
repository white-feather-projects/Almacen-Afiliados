package com.cbp.web.controller;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cbp.web.dao.PurchaseOrder;

import com.cbp.web.dto.PurchaseOrderDTO;
import com.cbp.web.dto.PurchaseOrderRequestDTO;

import com.cbp.web.dto.RespuestaFDTO;
import com.cbp2.ws.cbp.service.Product;
import com.cbp2.ws.cbp.service.PurchaseOrderRequest;
import com.cbp2.ws.cbp.service.RespuestaDTO;

@Controller
public class PurchaseOrderController {

	private final Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
	PurchaseOrder purchaseOrderDAO;
	
	
	/***
	 * Metodo para crear solicitud de orden de compra
	 * @param request
	 * @return
	 */

	@RequestMapping(value = "/createPurchaseOrdeRequestr", produces = { "application/json" })
	public @ResponseBody RespuestaDTO createPurchaseOrderRequest(@RequestBody PurchaseOrderRequestDTO request) {
	RespuestaDTO query = new RespuestaDTO();
	Product pro = new Product();
	pro.setIdProduct(request.getIdProduct());
	query = purchaseOrderDAO.createPurchaseOrderRequestWS(request, pro);
	//log.info("informacion : {}", request.toString());
	return query;
	}
	
	
	
	/***
	 * Metodo para generar orden de compra
	 * @param request
	 * @return
	 */
	
	@RequestMapping(value = "/generated", produces = { "application/json" })
	public @ResponseBody PurchaseOrderDTO generatedPurchaseOrdeRequestr(@RequestBody PurchaseOrderDTO request) {
    com.cbp2.ws.cbp.service.PurchaseOrderDTO dto = new com.cbp2.ws.cbp.service.PurchaseOrderDTO();
    Product pro = new Product();
	PurchaseOrderRequest  pur= new PurchaseOrderRequest();
	pro.setIdProduct(request.getIdProduct());
	pur.setIdOrderRequest(request.getIdOrderRequest());
	pur.setPurchaseOrderNumber(request.getPurchaseOrderNumber());
	dto=purchaseOrderDAO.generatePurchaseOrder(request, pro, pur);
	//log.info("informacion de generated : {}", request.toString());
		
	return request; 
	}


	
	/***
	 * Metodo para cambiar status de lista de orden de compra al generar la orden de compra
	 * @param request
	 * @return
	 */
	
     @RequestMapping(value = "/cambio", produces = { "application/json" })
     public @ResponseBody RespuestaDTO changedStatus(@RequestBody PurchaseOrderRequestDTO request) {	
     RespuestaDTO query = new RespuestaDTO();
     query=purchaseOrderDAO.changeOnlyStatus(request);
     return query;  
     }



     /***
      * Metodo para editar solicitud de orden de compra
      * @param request
      * @return
      */
     
     @RequestMapping(value = "/changePurchaceOrder", produces = { "application/json" })
     public @ResponseBody RespuestaDTO changePurchaceOrder(@RequestBody PurchaseOrderRequestDTO request) {	
     RespuestaDTO query = new RespuestaDTO();
     query=purchaseOrderDAO.chageQuantityPurchaseOrderRequest(request);
     return query;  
     }
	
	
     
     /***
      * Metodo para listar las solicitudes de orden de compra
      * @return
      */
	 @RequestMapping(value="/listPurchaseOrderRequest", produces={"application/json"})
	 public @ResponseBody List<PurchaseOrderRequestDTO> listPurchaseOrder() {
	 List<PurchaseOrderRequestDTO> list = new ArrayList<>();	
	 list = purchaseOrderDAO.listPurchaseOrder();
	 return list;
	 }
	
	 
	 
	 /***
	  * Metodo para listar la lista de plastico generada al realizar la generacion de orden de compra
	  * @param purchaseOrderNumber
	  * @return
	  */
	 @RequestMapping(value="/listPlastic/{purchaseOrderNumber}", produces={"application/json"})
	 public @ResponseBody List<com.cbp.web.dto.PlasticDTO> listPlasticByPurchaseorderNumberWS(@PathVariable(value = "purchaseOrderNumber")String purchaseOrderNumber) {
     List<com.cbp.web.dto.PlasticDTO> list = new ArrayList<>();	
     list = purchaseOrderDAO.listPlasticByPurchaseorderNumberWS(purchaseOrderNumber);
	 return list;
	 }
	
	 
	 
	 /***
	  * Metodo para listar la ultima orden de compra generada 
	  * @return
	  */
	 @RequestMapping(value="/listLastPurchaseOrderRequest", produces={"application/json"})
	 public @ResponseBody PurchaseOrderRequestDTO listLastOrder() {
	 PurchaseOrderRequestDTO purchaseOrderRequestDTO = new PurchaseOrderRequestDTO();
	 purchaseOrderRequestDTO =purchaseOrderDAO.listLastOrderWS();
	 return purchaseOrderRequestDTO;
	 }
	 
	 
	 
	/**
	 * Metodo para consultar por id 
	 * @param id
	 * @return
	 */
	 @GetMapping(value="/consultId/{id}", produces={"application/json"})
	 public @ResponseBody PurchaseOrderRequestDTO consultId(@PathVariable(value = "id") String id) {
	 PurchaseOrderRequestDTO purchaseOrderRequestDTO = new PurchaseOrderRequestDTO();
	 purchaseOrderRequestDTO = purchaseOrderDAO.consultPurchaseOrderRequestByIdOrderWS(id);
	 return purchaseOrderRequestDTO;
	 }
	
	 
	 
	/**
	 * Metodo de consulta por id para ver detalle de compra
	 * @param id
	 * @return
	 */
	 @GetMapping(value="/consultNumberOrder/{id}", produces={"application/json"})
	 public @ResponseBody PurchaseOrderDTO consultNumberOrder(@PathVariable(value = "id") long id) {
	 PurchaseOrderDTO purchaseOrderDTO = new PurchaseOrderDTO();
	 purchaseOrderDTO = purchaseOrderDAO.consultPurchaseOrderWS(id);
	 return purchaseOrderDTO;
	 }
	
	 
	 
	/**
	 * Metodo para guardar la cantidad Maxima y Minima de la configuración de compras manual
	 * @param request
	 * @return
	 * @throws IOException
	 */
	
	 @RequestMapping(value = "/guardar", produces = { "application/json" })
	 public @ResponseBody RespuestaDTO guardar(@RequestBody PurchaseOrderRequestDTO request) throws IOException {
	 RespuestaDTO query = new RespuestaDTO();
	 request.getMaximo();
	 request.getMinimo();
     String maximo= request.getMaximo();
	 String minimo=request.getMinimo();
     Properties prop = new Properties();
     InputStream is = null;
	 try {
	 is = new FileInputStream("c:\\Configuracion\\configuracion.properties");
	 //is = new FileInputStream("/home/confPropertiesCBP/configuracion.properties");
	 prop.load(is);
     } catch(IOException e) {
     System.out.println(e.toString());
	 }
     prop.setProperty("VALOR.MAXIMO", maximo);
     prop.setProperty("VALOR.MINIMO", minimo);
	 prop.store(new FileWriter("c:\\Configuracion\\configuracion.properties"),"un comentario");
	 //prop.store(new FileWriter("/home/confPropertiesCBP/configuracion.properties"),"un comentario");
	 return query;
	 }
	


     }
