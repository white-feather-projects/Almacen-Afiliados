
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para solicitud complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="solicitud">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoUsuarioModifica" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="comercioId" type="{http://service.cbp.ws.cbp3.com/}comercio" minOccurs="0"/>
 *         &lt;element name="fechaCargaDatos" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaHoraModificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idChannel" type="{http://service.cbp.ws.cbp3.com/}channel" minOccurs="0"/>
 *         &lt;element name="solicitudId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="statusSolicitud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitud", propOrder = {
    "codigoUsuarioModifica",
    "comercioId",
    "fechaCargaDatos",
    "fechaHoraModificacion",
    "idChannel",
    "solicitudId",
    "statusSolicitud"
})
public class Solicitud {

    protected Long codigoUsuarioModifica;
    protected Comercio comercioId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCargaDatos;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraModificacion;
    protected Channel idChannel;
    protected Long solicitudId;
    protected String statusSolicitud;

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
     * Obtiene el valor de la propiedad comercioId.
     * 
     * @return
     *     possible object is
     *     {@link Comercio }
     *     
     */
    public Comercio getComercioId() {
        return comercioId;
    }

    /**
     * Define el valor de la propiedad comercioId.
     * 
     * @param value
     *     allowed object is
     *     {@link Comercio }
     *     
     */
    public void setComercioId(Comercio value) {
        this.comercioId = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCargaDatos.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCargaDatos() {
        return fechaCargaDatos;
    }

    /**
     * Define el valor de la propiedad fechaCargaDatos.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCargaDatos(XMLGregorianCalendar value) {
        this.fechaCargaDatos = value;
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
     * Obtiene el valor de la propiedad idChannel.
     * 
     * @return
     *     possible object is
     *     {@link Channel }
     *     
     */
    public Channel getIdChannel() {
        return idChannel;
    }

    /**
     * Define el valor de la propiedad idChannel.
     * 
     * @param value
     *     allowed object is
     *     {@link Channel }
     *     
     */
    public void setIdChannel(Channel value) {
        this.idChannel = value;
    }

    /**
     * Obtiene el valor de la propiedad solicitudId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSolicitudId() {
        return solicitudId;
    }

    /**
     * Define el valor de la propiedad solicitudId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSolicitudId(Long value) {
        this.solicitudId = value;
    }

    /**
     * Obtiene el valor de la propiedad statusSolicitud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusSolicitud() {
        return statusSolicitud;
    }

    /**
     * Define el valor de la propiedad statusSolicitud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusSolicitud(String value) {
        this.statusSolicitud = value;
    }

}
