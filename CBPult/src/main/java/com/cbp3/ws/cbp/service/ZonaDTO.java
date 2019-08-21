
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para zonaDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="zonaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoUsuarioModifica" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="encargadoZona" type="{http://service.cbp.ws.cbp3.com/}empleado" minOccurs="0"/>
 *         &lt;element name="fechaCargaDatos" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaHoraModificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idWarehouse" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tipoZonaId" type="{http://service.cbp.ws.cbp3.com/}tipoZona" minOccurs="0"/>
 *         &lt;element name="zonaId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="zonaNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zonaDTO", propOrder = {
    "codigoUsuarioModifica",
    "descripcion",
    "encargadoZona",
    "fechaCargaDatos",
    "fechaHoraModificacion",
    "idWarehouse",
    "tipoZonaId",
    "zonaId",
    "zonaNombre"
})
public class ZonaDTO {

    protected Long codigoUsuarioModifica; // vacio
    protected String descripcion;
    protected Empleado encargadoZona; // quemar el objeto que me dió Jose
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCargaDatos; // vacio
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraModificacion; //vacio
    protected long idWarehouse; // lo traigo de la creación del Almacén que retornará un OK + el ID en la Tabla
    protected TipoZona tipoZonaId; 
    protected long zonaId; // este ID debería ser Automático
    protected String zonaNombre; // Descripción de la Zona

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
     * Obtiene el valor de la propiedad encargadoZona.
     * 
     * @return
     *     possible object is
     *     {@link Empleado }
     *     
     */
    public Empleado getEncargadoZona() {
        return encargadoZona;
    }

    /**
     * Define el valor de la propiedad encargadoZona.
     * 
     * @param value
     *     allowed object is
     *     {@link Empleado }
     *     
     */
    public void setEncargadoZona(Empleado value) {
        this.encargadoZona = value;
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
     * Obtiene el valor de la propiedad idWarehouse.
     * 
     */
    public long getIdWarehouse() {
        return idWarehouse;
    }

    /**
     * Define el valor de la propiedad idWarehouse.
     * 
     */
    public void setIdWarehouse(long value) {
        this.idWarehouse = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoZonaId.
     * 
     * @return
     *     possible object is
     *     {@link TipoZona }
     *     
     */
    public TipoZona getTipoZonaId() {
        return tipoZonaId;
    }

    /**
     * Define el valor de la propiedad tipoZonaId.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoZona }
     *     
     */
    public void setTipoZonaId(TipoZona value) {
        this.tipoZonaId = value;
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
     * Obtiene el valor de la propiedad zonaNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZonaNombre() {
        return zonaNombre;
    }

    /**
     * Define el valor de la propiedad zonaNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZonaNombre(String value) {
        this.zonaNombre = value;
    }

}
