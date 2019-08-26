
package com.cbp2.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para detailPurchaseOrder complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="detailPurchaseOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoUsuarioModifica" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="fechaHoraCarga" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaHoraModificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idDetailOrder" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="inputFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxQuantityTdc" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="minQuantityTdc" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="numberLoteRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="quantityRequest" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detailPurchaseOrder", propOrder = {
    "codigoUsuarioModifica",
    "fechaHoraCarga",
    "fechaHoraModificacion",
    "idDetailOrder",
    "inputFile",
    "maxQuantityTdc",
    "minQuantityTdc",
    "numberLoteRequest",
    "orderId",
    "quantityRequest"
})
public class DetailPurchaseOrder {

    protected Long codigoUsuarioModifica;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraCarga;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraModificacion;
    protected Long idDetailOrder;
    protected String inputFile;
    protected long maxQuantityTdc;
    protected long minQuantityTdc;
    protected String numberLoteRequest;
    protected long orderId;
    protected long quantityRequest;

    /**
     * Obtiene el valor de la propiedad codigoUsuarioModifica.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoUsuarioModifica() {
        return codigoUsuarioModifica;
    }

    /**
     * Define el valor de la propiedad codigoUsuarioModifica.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoUsuarioModifica(Long value) {
        this.codigoUsuarioModifica = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHoraCarga.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraCarga() {
        return fechaHoraCarga;
    }

    /**
     * Define el valor de la propiedad fechaHoraCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraCarga(XMLGregorianCalendar value) {
        this.fechaHoraCarga = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHoraModificacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraModificacion() {
        return fechaHoraModificacion;
    }

    /**
     * Define el valor de la propiedad fechaHoraModificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraModificacion(XMLGregorianCalendar value) {
        this.fechaHoraModificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idDetailOrder.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdDetailOrder() {
        return idDetailOrder;
    }

    /**
     * Define el valor de la propiedad idDetailOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdDetailOrder(Long value) {
        this.idDetailOrder = value;
    }

    /**
     * Obtiene el valor de la propiedad inputFile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputFile() {
        return inputFile;
    }

    /**
     * Define el valor de la propiedad inputFile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputFile(String value) {
        this.inputFile = value;
    }

    /**
     * Obtiene el valor de la propiedad maxQuantityTdc.
     * 
     */
    public long getMaxQuantityTdc() {
        return maxQuantityTdc;
    }

    /**
     * Define el valor de la propiedad maxQuantityTdc.
     * 
     */
    public void setMaxQuantityTdc(long value) {
        this.maxQuantityTdc = value;
    }

    /**
     * Obtiene el valor de la propiedad minQuantityTdc.
     * 
     */
    public long getMinQuantityTdc() {
        return minQuantityTdc;
    }

    /**
     * Define el valor de la propiedad minQuantityTdc.
     * 
     */
    public void setMinQuantityTdc(long value) {
        this.minQuantityTdc = value;
    }

    /**
     * Obtiene el valor de la propiedad numberLoteRequest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberLoteRequest() {
        return numberLoteRequest;
    }

    /**
     * Define el valor de la propiedad numberLoteRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberLoteRequest(String value) {
        this.numberLoteRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad orderId.
     * 
     */
    public long getOrderId() {
        return orderId;
    }

    /**
     * Define el valor de la propiedad orderId.
     * 
     */
    public void setOrderId(long value) {
        this.orderId = value;
    }

    /**
     * Obtiene el valor de la propiedad quantityRequest.
     * 
     */
    public long getQuantityRequest() {
        return quantityRequest;
    }

    /**
     * Define el valor de la propiedad quantityRequest.
     * 
     */
    public void setQuantityRequest(long value) {
        this.quantityRequest = value;
    }

}
