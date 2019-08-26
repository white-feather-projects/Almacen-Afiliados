
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para modificarZonaWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="modificarZonaWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zonaId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="zonaNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="encargadoZona" type="{http://service.cbp.ws.cbp3.com/}empleado" minOccurs="0"/>
 *         &lt;element name="tipoZonaId" type="{http://service.cbp.ws.cbp3.com/}tipoZona" minOccurs="0"/>
 *         &lt;element name="idWarehouse" type="{http://service.cbp.ws.cbp3.com/}warehouse" minOccurs="0"/>
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
@XmlType(name = "modificarZonaWS", propOrder = {
    "zonaId",
    "zonaNombre",
    "descripcion",
    "encargadoZona",
    "tipoZonaId",
    "idWarehouse",
    "codigoUsuarioModifica",
    "fechaHoraModifica"
})
public class ModificarZonaWS {

    protected long zonaId;
    protected String zonaNombre;
    protected String descripcion;
    protected Empleado encargadoZona;
    protected TipoZona tipoZonaId;
    protected Warehouse idWarehouse;
    protected long codigoUsuarioModifica;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraModifica;

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
     * Obtiene el valor de la propiedad idWarehouse.
     * 
     * @return
     *     possible object is
     *     {@link Warehouse }
     *     
     */
    public Warehouse getIdWarehouse() {
        return idWarehouse;
    }

    /**
     * Define el valor de la propiedad idWarehouse.
     * 
     * @param value
     *     allowed object is
     *     {@link Warehouse }
     *     
     */
    public void setIdWarehouse(Warehouse value) {
        this.idWarehouse = value;
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
