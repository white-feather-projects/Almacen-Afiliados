
package com.cbp1.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para informacionViviendaDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="informacionViviendaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="canton" type="{http://service.cbp.ws.cbp1.com/}canton" minOccurs="0"/>
 *         &lt;element name="ciudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="client" type="{http://service.cbp.ws.cbp1.com/}client" minOccurs="0"/>
 *         &lt;element name="codPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cuotaMensual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distrito" type="{http://service.cbp.ws.cbp1.com/}distrito" minOccurs="0"/>
 *         &lt;element name="provincia" type="{http://service.cbp.ws.cbp1.com/}provincia" minOccurs="0"/>
 *         &lt;element name="ptoReferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tenenciaVivienda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "informacionViviendaDTO", propOrder = {
    "canton",
    "ciudad",
    "client",
    "codPostal",
    "cuotaMensual",
    "distrito",
    "provincia",
    "ptoReferencia",
    "sector",
    "tenenciaVivienda"
})
public class InformacionViviendaDTO {

    protected Canton canton;
    protected String ciudad;
    protected Client client;
    protected String codPostal;
    protected String cuotaMensual;
    protected Distrito distrito;
    protected Provincia provincia;
    protected String ptoReferencia;
    protected String sector;
    protected String tenenciaVivienda;

    /**
     * Obtiene el valor de la propiedad canton.
     * 
     * @return
     *     possible object is
     *     {@link Canton }
     *     
     */
    public Canton getCanton() {
        return canton;
    }

    /**
     * Define el valor de la propiedad canton.
     * 
     * @param value
     *     allowed object is
     *     {@link Canton }
     *     
     */
    public void setCanton(Canton value) {
        this.canton = value;
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
     * Obtiene el valor de la propiedad client.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getClient() {
        return client;
    }

    /**
     * Define el valor de la propiedad client.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setClient(Client value) {
        this.client = value;
    }

    /**
     * Obtiene el valor de la propiedad codPostal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodPostal() {
        return codPostal;
    }

    /**
     * Define el valor de la propiedad codPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodPostal(String value) {
        this.codPostal = value;
    }

    /**
     * Obtiene el valor de la propiedad cuotaMensual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuotaMensual() {
        return cuotaMensual;
    }

    /**
     * Define el valor de la propiedad cuotaMensual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuotaMensual(String value) {
        this.cuotaMensual = value;
    }

    /**
     * Obtiene el valor de la propiedad distrito.
     * 
     * @return
     *     possible object is
     *     {@link Distrito }
     *     
     */
    public Distrito getDistrito() {
        return distrito;
    }

    /**
     * Define el valor de la propiedad distrito.
     * 
     * @param value
     *     allowed object is
     *     {@link Distrito }
     *     
     */
    public void setDistrito(Distrito value) {
        this.distrito = value;
    }

    /**
     * Obtiene el valor de la propiedad provincia.
     * 
     * @return
     *     possible object is
     *     {@link Provincia }
     *     
     */
    public Provincia getProvincia() {
        return provincia;
    }

    /**
     * Define el valor de la propiedad provincia.
     * 
     * @param value
     *     allowed object is
     *     {@link Provincia }
     *     
     */
    public void setProvincia(Provincia value) {
        this.provincia = value;
    }

    /**
     * Obtiene el valor de la propiedad ptoReferencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtoReferencia() {
        return ptoReferencia;
    }

    /**
     * Define el valor de la propiedad ptoReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtoReferencia(String value) {
        this.ptoReferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad sector.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSector() {
        return sector;
    }

    /**
     * Define el valor de la propiedad sector.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSector(String value) {
        this.sector = value;
    }

    /**
     * Obtiene el valor de la propiedad tenenciaVivienda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenenciaVivienda() {
        return tenenciaVivienda;
    }

    /**
     * Define el valor de la propiedad tenenciaVivienda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenenciaVivienda(String value) {
        this.tenenciaVivienda = value;
    }

}
