
package com.cbp2.ws.cbp.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para purchaseOrderDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="purchaseOrderDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="detailPurchaseOrder" type="{http://service.cbp.ws.cbp2.com/}detailPurchaseOrder" minOccurs="0"/>
 *         &lt;element name="file" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listPlastic" type="{http://service.cbp.ws.cbp2.com/}plastic" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listPurchaseOrder" type="{http://service.cbp.ws.cbp2.com/}purchaseOrder" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="purchaseOrder" type="{http://service.cbp.ws.cbp2.com/}purchaseOrder" minOccurs="0"/>
 *         &lt;element name="respuesta" type="{http://service.cbp.ws.cbp2.com/}respuestaDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseOrderDTO", propOrder = {
    "detailPurchaseOrder",
    "file",
    "listPlastic",
    "listPurchaseOrder",
    "purchaseOrder",
    "respuesta"
})
public class PurchaseOrderDTO {

    protected DetailPurchaseOrder detailPurchaseOrder;
    @XmlElement(nillable = true)
    protected List<String> file;
    @XmlElement(nillable = true)
    protected List<Plastic> listPlastic;
    @XmlElement(nillable = true)
    protected List<PurchaseOrder> listPurchaseOrder;
    protected PurchaseOrder purchaseOrder;
    protected RespuestaDTO respuesta;

    /**
     * Obtiene el valor de la propiedad detailPurchaseOrder.
     * 
     * @return
     *     possible object is
     *     {@link DetailPurchaseOrder }
     *     
     */
    public DetailPurchaseOrder getDetailPurchaseOrder() {
        return detailPurchaseOrder;
    }

    /**
     * Define el valor de la propiedad detailPurchaseOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailPurchaseOrder }
     *     
     */
    public void setDetailPurchaseOrder(DetailPurchaseOrder value) {
        this.detailPurchaseOrder = value;
    }

    /**
     * Gets the value of the file property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the file property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFile() {
        if (file == null) {
            file = new ArrayList<String>();
        }
        return this.file;
    }

    /**
     * Gets the value of the listPlastic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listPlastic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListPlastic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Plastic }
     * 
     * 
     */
    public List<Plastic> getListPlastic() {
        if (listPlastic == null) {
            listPlastic = new ArrayList<Plastic>();
        }
        return this.listPlastic;
    }

    /**
     * Gets the value of the listPurchaseOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listPurchaseOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListPurchaseOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PurchaseOrder }
     * 
     * 
     */
    public List<PurchaseOrder> getListPurchaseOrder() {
        if (listPurchaseOrder == null) {
            listPurchaseOrder = new ArrayList<PurchaseOrder>();
        }
        return this.listPurchaseOrder;
    }

    /**
     * Obtiene el valor de la propiedad purchaseOrder.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrder }
     *     
     */
    public PurchaseOrder getPurchaseOrder() {
        return purchaseOrder;
    }

    /**
     * Define el valor de la propiedad purchaseOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrder }
     *     
     */
    public void setPurchaseOrder(PurchaseOrder value) {
        this.purchaseOrder = value;
    }

    /**
     * Obtiene el valor de la propiedad respuesta.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaDTO }
     *     
     */
    public RespuestaDTO getRespuesta() {
        return respuesta;
    }

    /**
     * Define el valor de la propiedad respuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaDTO }
     *     
     */
    public void setRespuesta(RespuestaDTO value) {
        this.respuesta = value;
    }

}
