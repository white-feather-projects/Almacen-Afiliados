
package com.cbp2.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para plastic complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="plastic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoUsuarioModifica" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="fechaHoraCarga" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaHoraModificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idPlastic" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="plasticAsigned" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="plasticCvv" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="plasticDateIssue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plasticExpDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plasticNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plasticStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productId" type="{http://service.cbp.ws.cbp2.com/}product" minOccurs="0"/>
 *         &lt;element name="providerId" type="{http://service.cbp.ws.cbp2.com/}provider" minOccurs="0"/>
 *         &lt;element name="puchaseOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plastic", propOrder = {
    "codigoUsuarioModifica",
    "fechaHoraCarga",
    "fechaHoraModificacion",
    "idPlastic",
    "plasticAsigned",
    "plasticCvv",
    "plasticDateIssue",
    "plasticExpDate",
    "plasticNumber",
    "plasticStatus",
    "productId",
    "providerId",
    "puchaseOrderNumber"
})
public class Plastic {

    protected Long codigoUsuarioModifica;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraCarga;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraModificacion;
    protected Long idPlastic;
    protected Long plasticAsigned;
    protected long plasticCvv;
    protected String plasticDateIssue;
    protected String plasticExpDate;
    protected String plasticNumber;
    protected String plasticStatus;
    protected Product productId;
    protected Provider providerId;
    protected String puchaseOrderNumber;

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
     * Obtiene el valor de la propiedad idPlastic.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdPlastic() {
        return idPlastic;
    }

    /**
     * Define el valor de la propiedad idPlastic.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdPlastic(Long value) {
        this.idPlastic = value;
    }

    /**
     * Obtiene el valor de la propiedad plasticAsigned.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPlasticAsigned() {
        return plasticAsigned;
    }

    /**
     * Define el valor de la propiedad plasticAsigned.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPlasticAsigned(Long value) {
        this.plasticAsigned = value;
    }

    /**
     * Obtiene el valor de la propiedad plasticCvv.
     * 
     */
    public long getPlasticCvv() {
        return plasticCvv;
    }

    /**
     * Define el valor de la propiedad plasticCvv.
     * 
     */
    public void setPlasticCvv(long value) {
        this.plasticCvv = value;
    }

    /**
     * Obtiene el valor de la propiedad plasticDateIssue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlasticDateIssue() {
        return plasticDateIssue;
    }

    /**
     * Define el valor de la propiedad plasticDateIssue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlasticDateIssue(String value) {
        this.plasticDateIssue = value;
    }

    /**
     * Obtiene el valor de la propiedad plasticExpDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlasticExpDate() {
        return plasticExpDate;
    }

    /**
     * Define el valor de la propiedad plasticExpDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlasticExpDate(String value) {
        this.plasticExpDate = value;
    }

    /**
     * Obtiene el valor de la propiedad plasticNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlasticNumber() {
        return plasticNumber;
    }

    /**
     * Define el valor de la propiedad plasticNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlasticNumber(String value) {
        this.plasticNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad plasticStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlasticStatus() {
        return plasticStatus;
    }

    /**
     * Define el valor de la propiedad plasticStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlasticStatus(String value) {
        this.plasticStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad productId.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProductId() {
        return productId;
    }

    /**
     * Define el valor de la propiedad productId.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProductId(Product value) {
        this.productId = value;
    }

    /**
     * Obtiene el valor de la propiedad providerId.
     * 
     * @return
     *     possible object is
     *     {@link Provider }
     *     
     */
    public Provider getProviderId() {
        return providerId;
    }

    /**
     * Define el valor de la propiedad providerId.
     * 
     * @param value
     *     allowed object is
     *     {@link Provider }
     *     
     */
    public void setProviderId(Provider value) {
        this.providerId = value;
    }

    /**
     * Obtiene el valor de la propiedad puchaseOrderNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPuchaseOrderNumber() {
        return puchaseOrderNumber;
    }

    /**
     * Define el valor de la propiedad puchaseOrderNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPuchaseOrderNumber(String value) {
        this.puchaseOrderNumber = value;
    }

}
