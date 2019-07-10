
package com.cbp2.ws.cbp.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PurchaseOrderWS", targetNamespace = "http://service.cbp.ws.cbp2.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PurchaseOrderWS {


    /**
     * 
     * @param fechaHoraCarga
     * @param idCanal
     * @param statusOrder
     * @param product
     * @param quantity
     * @param codeUserLouder
     * @param nombreCanal
     * @param descriptionOrder
     * @param codeUserAproved
     * @return
     *     returns com.cbp2.ws.cbp.service.RespuestaDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createPurchaseOrderRequestWS", targetNamespace = "http://service.cbp.ws.cbp2.com/", className = "com.cbp2.ws.cbp.service.CreatePurchaseOrderRequestWS")
    @ResponseWrapper(localName = "createPurchaseOrderRequestWSResponse", targetNamespace = "http://service.cbp.ws.cbp2.com/", className = "com.cbp2.ws.cbp.service.CreatePurchaseOrderRequestWSResponse")
    @Action(input = "http://service.cbp.ws.cbp2.com/PurchaseOrderWS/createPurchaseOrderRequestWSRequest", output = "http://service.cbp.ws.cbp2.com/PurchaseOrderWS/createPurchaseOrderRequestWSResponse")
    public RespuestaDTO createPurchaseOrderRequestWS(
        @WebParam(name = "descriptionOrder", targetNamespace = "")
        String descriptionOrder,
        @WebParam(name = "quantity", targetNamespace = "")
        long quantity,
        @WebParam(name = "codeUserLouder", targetNamespace = "")
        String codeUserLouder,
        @WebParam(name = "codeUserAproved", targetNamespace = "")
        String codeUserAproved,
        @WebParam(name = "statusOrder", targetNamespace = "")
        String statusOrder,
        @WebParam(name = "fechaHoraCarga", targetNamespace = "")
        String fechaHoraCarga,
        @WebParam(name = "product", targetNamespace = "")
        Product product,
        @WebParam(name = "idCanal", targetNamespace = "")
        String idCanal,
        @WebParam(name = "nombreCanal", targetNamespace = "")
        String nombreCanal);

    /**
     * 
     * @param codeUserLoader
     * @param orderType
     * @param quantity
     * @param nombreCanal
     * @param productId
     * @param orderCommetns
     * @param orderStatus
     * @param orderDescription
     * @param purchaseOrderAprovedDate
     * @param purchaseOrderDate
     * @param idProvider
     * @param orderRequestId
     * @param codeUserAproved
     * @return
     *     returns com.cbp2.ws.cbp.service.PurchaseOrderDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "generatePurchaseOrderWS", targetNamespace = "http://service.cbp.ws.cbp2.com/", className = "com.cbp2.ws.cbp.service.GeneratePurchaseOrderWS")
    @ResponseWrapper(localName = "generatePurchaseOrderWSResponse", targetNamespace = "http://service.cbp.ws.cbp2.com/", className = "com.cbp2.ws.cbp.service.GeneratePurchaseOrderWSResponse")
    @Action(input = "http://service.cbp.ws.cbp2.com/PurchaseOrderWS/generatePurchaseOrderWSRequest", output = "http://service.cbp.ws.cbp2.com/PurchaseOrderWS/generatePurchaseOrderWSResponse")
    public PurchaseOrderDTO generatePurchaseOrderWS(
        @WebParam(name = "orderDescription", targetNamespace = "")
        String orderDescription,
        @WebParam(name = "orderCommetns", targetNamespace = "")
        String orderCommetns,
        @WebParam(name = "idProvider", targetNamespace = "")
        String idProvider,
        @WebParam(name = "codeUserLoader", targetNamespace = "")
        String codeUserLoader,
        @WebParam(name = "codeUserAproved", targetNamespace = "")
        String codeUserAproved,
        @WebParam(name = "orderType", targetNamespace = "")
        String orderType,
        @WebParam(name = "orderStatus", targetNamespace = "")
        String orderStatus,
        @WebParam(name = "purchaseOrderDate", targetNamespace = "")
        String purchaseOrderDate,
        @WebParam(name = "purchaseOrderAprovedDate", targetNamespace = "")
        String purchaseOrderAprovedDate,
        @WebParam(name = "productId", targetNamespace = "")
        Product productId,
        @WebParam(name = "orderRequestId", targetNamespace = "")
        PurchaseOrderRequest orderRequestId,
        @WebParam(name = "quantity", targetNamespace = "")
        String quantity,
        @WebParam(name = "nombreCanal", targetNamespace = "")
        String nombreCanal);

    /**
     * 
     * @return
     *     returns java.util.List<com.cbp2.ws.cbp.service.PurchaseOrderRequest>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listPurchaseOrderRequestWS", targetNamespace = "http://service.cbp.ws.cbp2.com/", className = "com.cbp2.ws.cbp.service.ListPurchaseOrderRequestWS")
    @ResponseWrapper(localName = "listPurchaseOrderRequestWSResponse", targetNamespace = "http://service.cbp.ws.cbp2.com/", className = "com.cbp2.ws.cbp.service.ListPurchaseOrderRequestWSResponse")
    @Action(input = "http://service.cbp.ws.cbp2.com/PurchaseOrderWS/listPurchaseOrderRequestWSRequest", output = "http://service.cbp.ws.cbp2.com/PurchaseOrderWS/listPurchaseOrderRequestWSResponse")
    public List<PurchaseOrderRequest> listPurchaseOrderRequestWS();

    /**
     * 
     * @param statusOrder
     * @param purchaseOrderNumber
     * @param canal
     * @return
     *     returns com.cbp2.ws.cbp.service.RespuestaDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "chageStatusPurchaseOrderWS", targetNamespace = "http://service.cbp.ws.cbp2.com/", className = "com.cbp2.ws.cbp.service.ChageStatusPurchaseOrderWS")
    @ResponseWrapper(localName = "chageStatusPurchaseOrderWSResponse", targetNamespace = "http://service.cbp.ws.cbp2.com/", className = "com.cbp2.ws.cbp.service.ChageStatusPurchaseOrderWSResponse")
    @Action(input = "http://service.cbp.ws.cbp2.com/PurchaseOrderWS/chageStatusPurchaseOrderWSRequest", output = "http://service.cbp.ws.cbp2.com/PurchaseOrderWS/chageStatusPurchaseOrderWSResponse")
    public RespuestaDTO chageStatusPurchaseOrderWS(
        @WebParam(name = "purchaseOrderNumber", targetNamespace = "")
        String purchaseOrderNumber,
        @WebParam(name = "statusOrder", targetNamespace = "")
        String statusOrder,
        @WebParam(name = "canal", targetNamespace = "")
        String canal);

    /**
     * 
     * @param idRquests
     * @param canal
     * @return
     *     returns com.cbp2.ws.cbp.service.PurchaseOrder
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultPurchaseOrderWS", targetNamespace = "http://service.cbp.ws.cbp2.com/", className = "com.cbp2.ws.cbp.service.ConsultPurchaseOrderWS")
    @ResponseWrapper(localName = "consultPurchaseOrderWSResponse", targetNamespace = "http://service.cbp.ws.cbp2.com/", className = "com.cbp2.ws.cbp.service.ConsultPurchaseOrderWSResponse")
    @Action(input = "http://service.cbp.ws.cbp2.com/PurchaseOrderWS/consultPurchaseOrderWSRequest", output = "http://service.cbp.ws.cbp2.com/PurchaseOrderWS/consultPurchaseOrderWSResponse")
    public PurchaseOrder consultPurchaseOrderWS(
        @WebParam(name = "idRquests", targetNamespace = "")
        long idRquests,
        @WebParam(name = "canal", targetNamespace = "")
        String canal);

    /**
     * 
     * @param codeUserModify
     * @param quantity
     * @param nombreCanal
     * @param purchaseOrderNumber
     * @param orderCommetns
     * @return
     *     returns com.cbp2.ws.cbp.service.RespuestaDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modifyPurchaseOrderWS", targetNamespace = "http://service.cbp.ws.cbp2.com/", className = "com.cbp2.ws.cbp.service.ModifyPurchaseOrderWS")
    @ResponseWrapper(localName = "modifyPurchaseOrderWSResponse", targetNamespace = "http://service.cbp.ws.cbp2.com/", className = "com.cbp2.ws.cbp.service.ModifyPurchaseOrderWSResponse")
    @Action(input = "http://service.cbp.ws.cbp2.com/PurchaseOrderWS/modifyPurchaseOrderWSRequest", output = "http://service.cbp.ws.cbp2.com/PurchaseOrderWS/modifyPurchaseOrderWSResponse")
    public RespuestaDTO modifyPurchaseOrderWS(
        @WebParam(name = "purchaseOrderNumber", targetNamespace = "")
        String purchaseOrderNumber,
        @WebParam(name = "orderCommetns", targetNamespace = "")
        String orderCommetns,
        @WebParam(name = "codeUserModify", targetNamespace = "")
        String codeUserModify,
        @WebParam(name = "quantity", targetNamespace = "")
        String quantity,
        @WebParam(name = "nombreCanal", targetNamespace = "")
        String nombreCanal);

    /**
     * 
     * @return
     *     returns com.cbp2.ws.cbp.service.PurchaseOrder
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "lastPurchaseOrderWS", targetNamespace = "http://service.cbp.ws.cbp2.com/", className = "com.cbp2.ws.cbp.service.LastPurchaseOrderWS")
    @ResponseWrapper(localName = "lastPurchaseOrderWSResponse", targetNamespace = "http://service.cbp.ws.cbp2.com/", className = "com.cbp2.ws.cbp.service.LastPurchaseOrderWSResponse")
    @Action(input = "http://service.cbp.ws.cbp2.com/PurchaseOrderWS/lastPurchaseOrderWSRequest", output = "http://service.cbp.ws.cbp2.com/PurchaseOrderWS/lastPurchaseOrderWSResponse")
    public PurchaseOrder lastPurchaseOrderWS();

    /**
     * 
     * @return
     *     returns java.util.List<com.cbp2.ws.cbp.service.Product>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listProductsWS", targetNamespace = "http://service.cbp.ws.cbp2.com/", className = "com.cbp2.ws.cbp.service.ListProductsWS")
    @ResponseWrapper(localName = "listProductsWSResponse", targetNamespace = "http://service.cbp.ws.cbp2.com/", className = "com.cbp2.ws.cbp.service.ListProductsWSResponse")
    @Action(input = "http://service.cbp.ws.cbp2.com/PurchaseOrderWS/listProductsWSRequest", output = "http://service.cbp.ws.cbp2.com/PurchaseOrderWS/listProductsWSResponse")
    public List<Product> listProductsWS();

    /**
     * 
     * @param id
     * @param canal
     * @return
     *     returns com.cbp2.ws.cbp.service.PurchaseOrderRequest
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultPurchaseOrderRequestByIdOrderWS", targetNamespace = "http://service.cbp.ws.cbp2.com/", className = "com.cbp2.ws.cbp.service.ConsultPurchaseOrderRequestByIdOrderWS")
    @ResponseWrapper(localName = "consultPurchaseOrderRequestByIdOrderWSResponse", targetNamespace = "http://service.cbp.ws.cbp2.com/", className = "com.cbp2.ws.cbp.service.ConsultPurchaseOrderRequestByIdOrderWSResponse")
    @Action(input = "http://service.cbp.ws.cbp2.com/PurchaseOrderWS/consultPurchaseOrderRequestByIdOrderWSRequest", output = "http://service.cbp.ws.cbp2.com/PurchaseOrderWS/consultPurchaseOrderRequestByIdOrderWSResponse")
    public PurchaseOrderRequest consultPurchaseOrderRequestByIdOrderWS(
        @WebParam(name = "id", targetNamespace = "")
        String id,
        @WebParam(name = "canal", targetNamespace = "")
        String canal);

    /**
     * 
     * @param fechaModificacion
     * @param quantity
     * @param idRequest
     * @param canal
     * @return
     *     returns com.cbp2.ws.cbp.service.RespuestaDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "chageQuantityPurchaseOrderRequestWS", targetNamespace = "http://service.cbp.ws.cbp2.com/", className = "com.cbp2.ws.cbp.service.ChageQuantityPurchaseOrderRequestWS")
    @ResponseWrapper(localName = "chageQuantityPurchaseOrderRequestWSResponse", targetNamespace = "http://service.cbp.ws.cbp2.com/", className = "com.cbp2.ws.cbp.service.ChageQuantityPurchaseOrderRequestWSResponse")
    @Action(input = "http://service.cbp.ws.cbp2.com/PurchaseOrderWS/chageQuantityPurchaseOrderRequestWSRequest", output = "http://service.cbp.ws.cbp2.com/PurchaseOrderWS/chageQuantityPurchaseOrderRequestWSResponse")
    public RespuestaDTO chageQuantityPurchaseOrderRequestWS(
        @WebParam(name = "idRequest", targetNamespace = "")
        long idRequest,
        @WebParam(name = "fechaModificacion", targetNamespace = "")
        String fechaModificacion,
        @WebParam(name = "Quantity", targetNamespace = "")
        String quantity,
        @WebParam(name = "canal", targetNamespace = "")
        String canal);

    /**
     * 
     * @param statusOrder
     * @param fechaModificacion
     * @param idRequest
     * @param canal
     * @return
     *     returns com.cbp2.ws.cbp.service.RespuestaDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "changeOnlyStatusRequestWS", targetNamespace = "http://service.cbp.ws.cbp2.com/", className = "com.cbp2.ws.cbp.service.ChangeOnlyStatusRequestWS")
    @ResponseWrapper(localName = "changeOnlyStatusRequestWSResponse", targetNamespace = "http://service.cbp.ws.cbp2.com/", className = "com.cbp2.ws.cbp.service.ChangeOnlyStatusRequestWSResponse")
    @Action(input = "http://service.cbp.ws.cbp2.com/PurchaseOrderWS/changeOnlyStatusRequestWSRequest", output = "http://service.cbp.ws.cbp2.com/PurchaseOrderWS/changeOnlyStatusRequestWSResponse")
    public RespuestaDTO changeOnlyStatusRequestWS(
        @WebParam(name = "idRequest", targetNamespace = "")
        long idRequest,
        @WebParam(name = "fechaModificacion", targetNamespace = "")
        String fechaModificacion,
        @WebParam(name = "statusOrder", targetNamespace = "")
        String statusOrder,
        @WebParam(name = "canal", targetNamespace = "")
        String canal);

    /**
     * 
     * @return
     *     returns java.util.List<com.cbp2.ws.cbp.service.OrdersDTO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listPurchaseOrderWS", targetNamespace = "http://service.cbp.ws.cbp2.com/", className = "com.cbp2.ws.cbp.service.ListPurchaseOrderWS")
    @ResponseWrapper(localName = "listPurchaseOrderWSResponse", targetNamespace = "http://service.cbp.ws.cbp2.com/", className = "com.cbp2.ws.cbp.service.ListPurchaseOrderWSResponse")
    @Action(input = "http://service.cbp.ws.cbp2.com/PurchaseOrderWS/listPurchaseOrderWSRequest", output = "http://service.cbp.ws.cbp2.com/PurchaseOrderWS/listPurchaseOrderWSResponse")
    public List<OrdersDTO> listPurchaseOrderWS();

    /**
     * 
     * @param plasticNumber
     * @return
     *     returns long
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validaTarjetaWS", targetNamespace = "http://service.cbp.ws.cbp2.com/", className = "com.cbp2.ws.cbp.service.ValidaTarjetaWS")
    @ResponseWrapper(localName = "validaTarjetaWSResponse", targetNamespace = "http://service.cbp.ws.cbp2.com/", className = "com.cbp2.ws.cbp.service.ValidaTarjetaWSResponse")
    @Action(input = "http://service.cbp.ws.cbp2.com/PurchaseOrderWS/validaTarjetaWSRequest", output = "http://service.cbp.ws.cbp2.com/PurchaseOrderWS/validaTarjetaWSResponse")
    public long validaTarjetaWS(
        @WebParam(name = "plasticNumber", targetNamespace = "")
        String plasticNumber);

    /**
     * 
     * @param purchaseOrderNumber
     * @return
     *     returns java.util.List<com.cbp2.ws.cbp.service.PlasticDTO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listPlasticByPurchaseorderNumberWS", targetNamespace = "http://service.cbp.ws.cbp2.com/", className = "com.cbp2.ws.cbp.service.ListPlasticByPurchaseorderNumberWS")
    @ResponseWrapper(localName = "listPlasticByPurchaseorderNumberWSResponse", targetNamespace = "http://service.cbp.ws.cbp2.com/", className = "com.cbp2.ws.cbp.service.ListPlasticByPurchaseorderNumberWSResponse")
    @Action(input = "http://service.cbp.ws.cbp2.com/PurchaseOrderWS/listPlasticByPurchaseorderNumberWSRequest", output = "http://service.cbp.ws.cbp2.com/PurchaseOrderWS/listPlasticByPurchaseorderNumberWSResponse")
    public List<PlasticDTO> listPlasticByPurchaseorderNumberWS(
        @WebParam(name = "purchaseOrderNumber", targetNamespace = "")
        String purchaseOrderNumber);

}
