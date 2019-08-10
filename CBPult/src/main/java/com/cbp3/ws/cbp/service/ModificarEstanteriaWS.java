
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para modificarEstanteriaWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="modificarEstanteriaWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="estanteriaId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zonaId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="modulos" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="niveles" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="codigoUsuarioModifica" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
@XmlType(name = "modificarEstanteriaWS", propOrder = {
    "estanteriaId",
    "descripcion",
    "zonaId",
    "modulos",
    "niveles",
    "codigoUsuarioModifica",
    "fechaHoraModificacion"
})
public class ModificarEstanteriaWS {

    protected long estanteriaId;
    protected String descripcion;
    protected long zonaId;
    protected long modulos;
    protected long niveles;
    protected long codigoUsuarioModifica;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraModificacion;

    /**
     * Obtiene el valor de la propiedad estanteriaId.
     * 
     */
    public long getEstanteriaId() {
        return estanteriaId;
    }

    /**
     * Define el valor de la propiedad estanteriaId.
     * 
     */
    public void setEstanteriaId(long value) {
        this.estanteriaId = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad zonaId.
     * 
     */
    public long getZonaId() {
        return zonaId;
    }

    /**
     * Define el valor de la propiedad zonaId.
     * 
     */
    public void setZonaId(long value) {
        this.zonaId = value;
    }

    /**
     * Obtiene el valor de la propiedad modulos.
     * 
     */
    public long getModulos() {
        return modulos;
    }

    /**
     * Define el valor de la propiedad modulos.
     * 
     */
    public void setModulos(long value) {
        this.modulos = value;
    }

    /**
     * Obtiene el valor de la propiedad niveles.
     * 
     */
    public long getNiveles() {
        return niveles;
    }

    /**
     * Define el valor de la propiedad niveles.
     * 
     */
    public void setNiveles(long value) {
        this.niveles = value;
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
