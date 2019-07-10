
package com.cbp1.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para tdcRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tdcRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientId" type="{http://service.cbp.ws.cbp1.com/}client" minOccurs="0"/>
 *         &lt;element name="codigoUsuarioModifica" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dateRequest" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaHoraCarga" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaHoraModificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idTdcRequest" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="statusRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tdcRequest", propOrder = {
    "clientId",
    "codigoUsuarioModifica",
    "dateRequest",
    "fechaHoraCarga",
    "fechaHoraModificacion",
    "idTdcRequest",
    "statusRequest"
})
public class TdcRequest {

    protected Client clientId;
    protected Long codigoUsuarioModifica;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateRequest;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraCarga;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraModificacion;
    protected Long idTdcRequest;
    protected String statusRequest;

    /**
     * Obtiene el valor de la propiedad clientId.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getClientId() {
        return clientId;
    }

    /**
     * Define el valor de la propiedad clientId.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setClientId(Client value) {
        this.clientId = value;
    }

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
     * Obtiene el valor de la propiedad dateRequest.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateRequest() {
        return dateRequest;
    }

    /**
     * Define el valor de la propiedad dateRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateRequest(XMLGregorianCalendar value) {
        this.dateRequest = value;
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
     * Obtiene el valor de la propiedad idTdcRequest.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdTdcRequest() {
        return idTdcRequest;
    }

    /**
     * Define el valor de la propiedad idTdcRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdTdcRequest(Long value) {
        this.idTdcRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad statusRequest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusRequest() {
        return statusRequest;
    }

    /**
     * Define el valor de la propiedad statusRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusRequest(String value) {
        this.statusRequest = value;
    }

}
