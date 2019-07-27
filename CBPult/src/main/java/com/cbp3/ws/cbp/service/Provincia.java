
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para provincia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="provincia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idProvincia" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nombreProvincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisId" type="{http://service.cbp.ws.cbp3.com/}pais" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "provincia", propOrder = {
    "idProvincia",
    "nombreProvincia",
    "paisId"
})
public class Provincia {

    protected Long idProvincia;
    protected String nombreProvincia;
    protected Pais paisId;

    /**
     * Obtiene el valor de la propiedad idProvincia.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdProvincia() {
        return idProvincia;
    }

    /**
     * Define el valor de la propiedad idProvincia.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdProvincia(Long value) {
        this.idProvincia = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreProvincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreProvincia() {
        return nombreProvincia;
    }

    /**
     * Define el valor de la propiedad nombreProvincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreProvincia(String value) {
        this.nombreProvincia = value;
    }

    /**
     * Obtiene el valor de la propiedad paisId.
     * 
     * @return
     *     possible object is
     *     {@link Pais }
     *     
     */
    public Pais getPaisId() {
        return paisId;
    }

    /**
     * Define el valor de la propiedad paisId.
     * 
     * @param value
     *     allowed object is
     *     {@link Pais }
     *     
     */
    public void setPaisId(Pais value) {
        this.paisId = value;
    }

}
