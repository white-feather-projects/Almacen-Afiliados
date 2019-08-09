
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para comercioContacto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="comercioContacto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoUsuarioModifica" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="comercioContactoId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="comercioId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="contacto" type="{http://service.cbp.ws.cbp3.com/}contacto" minOccurs="0"/>
 *         &lt;element name="contactoId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fechaCargaDatos" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaHoraModificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comercioContacto", propOrder = {
    "codigoUsuarioModifica",
    "comercioContactoId",
    "comercioId",
    "contacto",
    "contactoId",
    "fechaCargaDatos",
    "fechaHoraModificacion"
})
public class ComercioContacto {

    protected Long codigoUsuarioModifica;
    protected Long comercioContactoId;
    protected long comercioId;
    protected Contacto contacto;
    protected long contactoId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCargaDatos;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraModificacion;

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
     * Obtiene el valor de la propiedad comercioContactoId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getComercioContactoId() {
        return comercioContactoId;
    }

    /**
     * Define el valor de la propiedad comercioContactoId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setComercioContactoId(Long value) {
        this.comercioContactoId = value;
    }

    /**
     * Obtiene el valor de la propiedad comercioId.
     * 
     */
    public long getComercioId() {
        return comercioId;
    }

    /**
     * Define el valor de la propiedad comercioId.
     * 
     */
    public void setComercioId(long value) {
        this.comercioId = value;
    }

    /**
     * Obtiene el valor de la propiedad contacto.
     * 
     * @return
     *     possible object is
     *     {@link Contacto }
     *     
     */
    public Contacto getContacto() {
        return contacto;
    }

    /**
     * Define el valor de la propiedad contacto.
     * 
     * @param value
     *     allowed object is
     *     {@link Contacto }
     *     
     */
    public void setContacto(Contacto value) {
        this.contacto = value;
    }

    /**
     * Obtiene el valor de la propiedad contactoId.
     * 
     */
    public long getContactoId() {
        return contactoId;
    }

    /**
     * Define el valor de la propiedad contactoId.
     * 
     */
    public void setContactoId(long value) {
        this.contactoId = value;
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

}
