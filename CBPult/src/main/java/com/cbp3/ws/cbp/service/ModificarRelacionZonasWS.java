
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para modificarRelacionZonasWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="modificarRelacionZonasWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zonaActualId" type="{http://service.cbp.ws.cbp3.com/}zona" minOccurs="0"/>
 *         &lt;element name="zonaDestinoId" type="{http://service.cbp.ws.cbp3.com/}zona" minOccurs="0"/>
 *         &lt;element name="comentarios" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoUsuarioModifica" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fechaHoraModifica" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modificarRelacionZonasWS", propOrder = {
    "zonaActualId",
    "zonaDestinoId",
    "comentarios",
    "codigoUsuarioModifica",
    "fechaHoraModifica"
})
public class ModificarRelacionZonasWS {

    protected Zona zonaActualId;
    protected Zona zonaDestinoId;
    protected String comentarios; // No se va a usar por ahora
    protected long codigoUsuarioModifica; // vacio
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraModifica; // vacio

    /**
     * Obtiene el valor de la propiedad zonaActualId.
     * 
     * @return
     *     possible object is
     *     {@link Zona }
     *     
     */
    public Zona getZonaActualId() {
        return zonaActualId;
    }

    /**
     * Define el valor de la propiedad zonaActualId.
     * 
     * @param value
     *     allowed object is
     *     {@link Zona }
     *     
     */
    public void setZonaActualId(Zona value) {
        this.zonaActualId = value;
    }

    /**
     * Obtiene el valor de la propiedad zonaDestinoId.
     * 
     * @return
     *     possible object is
     *     {@link Zona }
     *     
     */
    public Zona getZonaDestinoId() {
        return zonaDestinoId;
    }

    /**
     * Define el valor de la propiedad zonaDestinoId.
     * 
     * @param value
     *     allowed object is
     *     {@link Zona }
     *     
     */
    public void setZonaDestinoId(Zona value) {
        this.zonaDestinoId = value;
    }

    /**
     * Obtiene el valor de la propiedad comentarios.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComentarios() {
        return comentarios;
    }

    /**
     * Define el valor de la propiedad comentarios.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComentarios(String value) {
        this.comentarios = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoUsuarioModifica.
     * 
     */
    public long getCodigoUsuarioModifica() {
        return codigoUsuarioModifica;
    }

    /**
     * Define el valor de la propiedad codigoUsuarioModifica.
     * 
     */
    public void setCodigoUsuarioModifica(long value) {
        this.codigoUsuarioModifica = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHoraModifica.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraModifica() {
        return fechaHoraModifica;
    }

    /**
     * Define el valor de la propiedad fechaHoraModifica.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraModifica(XMLGregorianCalendar value) {
        this.fechaHoraModifica = value;
    }

}
