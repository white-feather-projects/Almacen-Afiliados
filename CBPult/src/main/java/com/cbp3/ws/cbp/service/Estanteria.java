
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para estanteria complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="estanteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoUsuarioModifica" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estanteriaId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="fechaCargaDatos" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaHoraModificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="modulos" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="niveles" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="zona" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="zonaId" type="{http://service.cbp.ws.cbp3.com/}zona" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "estanteria", propOrder = {
    "codigoUsuarioModifica",
    "descripcion",
    "estanteriaId",
    "fechaCargaDatos",
    "fechaHoraModificacion",
    "modulos",
    "niveles",
    "zona",
    "zonaId"
})
public class Estanteria {

    protected Long codigoUsuarioModifica;
    protected String descripcion;
    protected Long estanteriaId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCargaDatos;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraModificacion;
    protected long modulos;
    protected long niveles;
    protected long zona;
    protected Zona zonaId;

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
     * Obtiene el valor de la propiedad estanteriaId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEstanteriaId() {
        return estanteriaId;
    }

    /**
     * Define el valor de la propiedad estanteriaId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEstanteriaId(Long value) {
        this.estanteriaId = value;
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
     * Obtiene el valor de la propiedad zona.
     * 
     */
    public long getZona() {
        return zona;
    }

    /**
     * Define el valor de la propiedad zona.
     * 
     */
    public void setZona(long value) {
        this.zona = value;
    }

    /**
     * Obtiene el valor de la propiedad zonaId.
     * 
     * @return
     *     possible object is
     *     {@link Zona }
     *     
     */
    public Zona getZonaId() {
        return zonaId;
    }

    /**
     * Define el valor de la propiedad zonaId.
     * 
     * @param value
     *     allowed object is
     *     {@link Zona }
     *     
     */
    public void setZonaId(Zona value) {
        this.zonaId = value;
    }

}
