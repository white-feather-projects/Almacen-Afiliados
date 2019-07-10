
package com.cbp1.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para documents complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="documents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientId" type="{http://service.cbp.ws.cbp1.com/}client" minOccurs="0"/>
 *         &lt;element name="codigoUsuarioModifica" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="documentsBurotSupport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentsCreditSupport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentsFinantialSupport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentsPersonalSupport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaHoraCarga" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaHoraModificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idDcmt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documents", propOrder = {
    "clientId",
    "codigoUsuarioModifica",
    "documentsBurotSupport",
    "documentsCreditSupport",
    "documentsFinantialSupport",
    "documentsPersonalSupport",
    "fechaHoraCarga",
    "fechaHoraModificacion",
    "idDcmt"
})
public class Documents {

    protected Client clientId;
    protected Long codigoUsuarioModifica;
    protected String documentsBurotSupport;
    protected String documentsCreditSupport;
    protected String documentsFinantialSupport;
    protected String documentsPersonalSupport;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraCarga;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraModificacion;
    protected Long idDcmt;

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
     * Obtiene el valor de la propiedad documentsBurotSupport.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentsBurotSupport() {
        return documentsBurotSupport;
    }

    /**
     * Define el valor de la propiedad documentsBurotSupport.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentsBurotSupport(String value) {
        this.documentsBurotSupport = value;
    }

    /**
     * Obtiene el valor de la propiedad documentsCreditSupport.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentsCreditSupport() {
        return documentsCreditSupport;
    }

    /**
     * Define el valor de la propiedad documentsCreditSupport.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentsCreditSupport(String value) {
        this.documentsCreditSupport = value;
    }

    /**
     * Obtiene el valor de la propiedad documentsFinantialSupport.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentsFinantialSupport() {
        return documentsFinantialSupport;
    }

    /**
     * Define el valor de la propiedad documentsFinantialSupport.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentsFinantialSupport(String value) {
        this.documentsFinantialSupport = value;
    }

    /**
     * Obtiene el valor de la propiedad documentsPersonalSupport.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentsPersonalSupport() {
        return documentsPersonalSupport;
    }

    /**
     * Define el valor de la propiedad documentsPersonalSupport.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentsPersonalSupport(String value) {
        this.documentsPersonalSupport = value;
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
     * Obtiene el valor de la propiedad idDcmt.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdDcmt() {
        return idDcmt;
    }

    /**
     * Define el valor de la propiedad idDcmt.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdDcmt(Long value) {
        this.idDcmt = value;
    }

}
