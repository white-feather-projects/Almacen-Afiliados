
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para establecimiento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="establecimiento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="avenidaCalle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ciudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="establecimientoId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="geoLocalizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idCanton" type="{http://service.cbp.ws.cbp3.com/}canton" minOccurs="0"/>
 *         &lt;element name="idDistrito" type="{http://service.cbp.ws.cbp3.com/}distrito" minOccurs="0"/>
 *         &lt;element name="idPais" type="{http://service.cbp.ws.cbp3.com/}pais" minOccurs="0"/>
 *         &lt;element name="idProvincia" type="{http://service.cbp.ws.cbp3.com/}provincia" minOccurs="0"/>
 *         &lt;element name="localidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreInmueble" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="puntoReferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sectorUrbanizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "establecimiento", propOrder = {
    "avenidaCalle",
    "ciudad",
    "codigoPostal",
    "establecimientoId",
    "geoLocalizacion",
    "idCanton",
    "idDistrito",
    "idPais",
    "idProvincia",
    "localidad",
    "nombreInmueble",
    "puntoReferencia",
    "sectorUrbanizacion"
})
public class Establecimiento {

    protected String avenidaCalle;
    protected String ciudad;
    protected String codigoPostal;
    protected Long establecimientoId;
    protected String geoLocalizacion;
    protected Canton idCanton;
    protected Distrito idDistrito;
    protected Pais idPais;
    protected Provincia idProvincia;
    protected String localidad;
    protected String nombreInmueble;
    protected String puntoReferencia;
    protected String sectorUrbanizacion;

    /**
     * Obtiene el valor de la propiedad avenidaCalle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvenidaCalle() {
        return avenidaCalle;
    }

    /**
     * Define el valor de la propiedad avenidaCalle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvenidaCalle(String value) {
        this.avenidaCalle = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Define el valor de la propiedad ciudad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudad(String value) {
        this.ciudad = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPostal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Define el valor de la propiedad codigoPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPostal(String value) {
        this.codigoPostal = value;
    }

    /**
     * Obtiene el valor de la propiedad establecimientoId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEstablecimientoId() {
        return establecimientoId;
    }

    /**
     * Define el valor de la propiedad establecimientoId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEstablecimientoId(Long value) {
        this.establecimientoId = value;
    }

    /**
     * Obtiene el valor de la propiedad geoLocalizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoLocalizacion() {
        return geoLocalizacion;
    }

    /**
     * Define el valor de la propiedad geoLocalizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoLocalizacion(String value) {
        this.geoLocalizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idCanton.
     * 
     * @return
     *     possible object is
     *     {@link Canton }
     *     
     */
    public Canton getIdCanton() {
        return idCanton;
    }

    /**
     * Define el valor de la propiedad idCanton.
     * 
     * @param value
     *     allowed object is
     *     {@link Canton }
     *     
     */
    public void setIdCanton(Canton value) {
        this.idCanton = value;
    }

    /**
     * Obtiene el valor de la propiedad idDistrito.
     * 
     * @return
     *     possible object is
     *     {@link Distrito }
     *     
     */
    public Distrito getIdDistrito() {
        return idDistrito;
    }

    /**
     * Define el valor de la propiedad idDistrito.
     * 
     * @param value
     *     allowed object is
     *     {@link Distrito }
     *     
     */
    public void setIdDistrito(Distrito value) {
        this.idDistrito = value;
    }

    /**
     * Obtiene el valor de la propiedad idPais.
     * 
     * @return
     *     possible object is
     *     {@link Pais }
     *     
     */
    public Pais getIdPais() {
        return idPais;
    }

    /**
     * Define el valor de la propiedad idPais.
     * 
     * @param value
     *     allowed object is
     *     {@link Pais }
     *     
     */
    public void setIdPais(Pais value) {
        this.idPais = value;
    }

    /**
     * Obtiene el valor de la propiedad idProvincia.
     * 
     * @return
     *     possible object is
     *     {@link Provincia }
     *     
     */
    public Provincia getIdProvincia() {
        return idProvincia;
    }

    /**
     * Define el valor de la propiedad idProvincia.
     * 
     * @param value
     *     allowed object is
     *     {@link Provincia }
     *     
     */
    public void setIdProvincia(Provincia value) {
        this.idProvincia = value;
    }

    /**
     * Obtiene el valor de la propiedad localidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * Define el valor de la propiedad localidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalidad(String value) {
        this.localidad = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreInmueble.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreInmueble() {
        return nombreInmueble;
    }

    /**
     * Define el valor de la propiedad nombreInmueble.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreInmueble(String value) {
        this.nombreInmueble = value;
    }

    /**
     * Obtiene el valor de la propiedad puntoReferencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPuntoReferencia() {
        return puntoReferencia;
    }

    /**
     * Define el valor de la propiedad puntoReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPuntoReferencia(String value) {
        this.puntoReferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad sectorUrbanizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectorUrbanizacion() {
        return sectorUrbanizacion;
    }

    /**
     * Define el valor de la propiedad sectorUrbanizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectorUrbanizacion(String value) {
        this.sectorUrbanizacion = value;
    }

}
