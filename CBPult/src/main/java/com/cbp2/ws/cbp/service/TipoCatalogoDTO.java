
package com.cbp2.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoCatalogoDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoCatalogoDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idTypeCatalogue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="typeCatalogueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoCatalogoDTO", propOrder = {
    "idTypeCatalogue",
    "typeCatalogueName"
})
public class TipoCatalogoDTO {

    protected Long idTypeCatalogue;
    protected String typeCatalogueName;

    /**
     * Obtiene el valor de la propiedad idTypeCatalogue.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdTypeCatalogue() {
        return idTypeCatalogue;
    }

    /**
     * Define el valor de la propiedad idTypeCatalogue.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdTypeCatalogue(Long value) {
        this.idTypeCatalogue = value;
    }

    /**
     * Obtiene el valor de la propiedad typeCatalogueName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCatalogueName() {
        return typeCatalogueName;
    }

    /**
     * Define el valor de la propiedad typeCatalogueName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCatalogueName(String value) {
        this.typeCatalogueName = value;
    }

}
