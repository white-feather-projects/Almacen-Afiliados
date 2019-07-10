package com.cbp.web.dao;

import java.util.List;

import com.cbp.web.dto.ProductDTO;
import com.cbp.web.dto.PurchaseOrderDTO;
import com.cbp.web.dto.PurchaseOrderRequestDTO;
import com.cbp.web.dto.RespuestaFDTO;
import com.cbp2.ws.cbp.service.PlasticDTO;
import com.cbp2.ws.cbp.service.Product;
import com.cbp2.ws.cbp.service.PurchaseOrderRequest;
import com.cbp2.ws.cbp.service.RespuestaDTO;

public interface PurchaseOrder {
	
	/***
	 * 
	 * @param descriptionOrder
	 * @param quantity
	 * @param codeUserLouder
	 * @param codeUserAproved
	 * @param fechaCarga
	 * @param productDTO
	 * @return
	 */
	//public RespuestaFDTO createPurchaseOrderRequestWS(String descriptionOrder, long quantity, String codeUserLouder, String codeUserAproved,String statusOrder, String fechaCarga, ProductDTO productDTO);
	
	 public RespuestaDTO createPurchaseOrderRequestWS(PurchaseOrderRequestDTO ge, Product pro);
	//public RespuestaDTO generatePurchaseOrderWS(String orderDescription,String orderCommetns,String idProvider,String codeUserLoader,String codeUserAproved,String orderType,String orderStatus,String purchaseOrderDate,String purchaseOrderAprovedDate,ProductDTO productDTO,IdOrderRequestDTO idOrderRequestDTO,String quantity);
	
/***
 * 
 * @return
 */
	public List<PurchaseOrderRequestDTO> listPurchaseOrderRequestDTO();
	
	
	
	public List<PurchaseOrderRequestDTO> listPurchaseOrder();
	/***
	 * 
	 * @return
	 */
	 public PurchaseOrderRequestDTO listLastOrderWS();
	 
	 /***
	  * 
	  * @return
	  */
	 public PurchaseOrderRequestDTO consultPurchaseOrderRequestByIdOrderWS(String id);
	                              
	 public PurchaseOrderDTO consultPurchaseOrderWS(long id);
	 
	 public List<com.cbp.web.dto.PlasticDTO> listPlasticByPurchaseorderNumberWS(String purchaseOrderNumber);
	 
	 public com.cbp2.ws.cbp.service.PurchaseOrderDTO generatePurchaseOrder(PurchaseOrderDTO generate, Product pro, PurchaseOrderRequest pur);
	 
	 public RespuestaDTO changeOnlyStatus(PurchaseOrderRequestDTO generate);
	 
	 public RespuestaDTO chageQuantityPurchaseOrderRequest(PurchaseOrderRequestDTO generate);
	 

	 
}
