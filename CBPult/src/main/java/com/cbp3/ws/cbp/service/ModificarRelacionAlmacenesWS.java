
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para modificarRelacionAlmacenesWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="modificarRelacionAlmacenesWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="almacenActualId" type="{http://service.cbp.ws.cbp3.com/}warehouse" minOccurs="0"/>
 *         &lt;element name="almacenDestinoId" type="{http://service.cbp.ws.cbp3.com/}warehouse" minOccurs="0"/>
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
@XmlType(name = "modificarRelacionAlmacenesWS", propOrder = {
    "almacenActualId",
    "almacenDestinoId",
    "comentarios",
    "codigoUsuarioModifica",
    "fechaHoraModifica"
})
public class ModificarRelacionAlmacenesWS {

    protected Warehouse almacenActualId;
    protected Warehouse almacenDestinoId;
    protected String comentarios;
    protected long codigoUsuarioModifica;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraModifica;

    /**
     * Obtiene el valor de la propiedad almacenActualId.
     * 
     * @return
     *     possible object is
     *     {@link Warehouse }
     *     
     */
    public Warehouse getAlmacenActualId() {
        return almacenActualId;
    }

    /**
     * Define el valor de la propiedad almacenActualId.
     * 
     * @param value
     *     allowed object is
     *     {@link Warehouse }
     *     
     */
    public void setAlmacenActualId(Warehouse value) {
        this.almacenActualId = value;
    }

    /**
     * Obtiene el valor de la propiedad almacenDestinoId.
     * 
     * @return
     *     possible object is
     *     {@link Warehouse }
     *     
     */
    public Warehouse getAlmacenDestinoId() {
        return almacenDestinoId;
    }

    /**
     * Define el valor de la propiedad almacenDestinoId.
     * 
     * @param value
     *     allowed object is
     *     {@link Warehouse }
     *     
     */
    public void setAlmacenDestinoId(Warehouse value) {
        this.almacenDestinoId = value;
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
