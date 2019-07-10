
package com.cbp1.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para canton complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="canton">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idCanton" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nombreCanton" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provinciaId" type="{http://service.cbp.ws.cbp1.com/}provincia" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "canton", propOrder = {
    "idCanton",
    "nombreCanton",
    "provinciaId"
})
public class Canton {

    protected Long idCanton;
    protected String nombreCanton;
    protected Provincia provinciaId;

    /**
     * Obtiene el valor de la propiedad idCanton.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdCanton() {
        return idCanton;
    }

    /**
     * Define el valor de la propiedad idCanton.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdCanton(Long value) {
        this.idCanton = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreCanton.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCanton() {
        return nombreCanton;
    }

    /**
     * Define el valor de la propiedad nombreCanton.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCanton(String value) {
        this.nombreCanton = value;
    }

    /**
     * Obtiene el valor de la propiedad provinciaId.
     * 
     * @return
     *     possible object is
     *     {@link Provincia }
     *     
     */
    public Provincia getProvinciaId() {
        return provinciaId;
    }

    /**
     * Define el valor de la propiedad provinciaId.
     * 
     * @param value
     *     allowed object is
     *     {@link Provincia }
     *     
     */
    public void setProvinciaId(Provincia value) {
        this.provinciaId = value;
    }

}
