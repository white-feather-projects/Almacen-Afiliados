
package com.cbp2.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listCatalogueWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listCatalogueWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="typeCatalogue" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listCatalogueWS", propOrder = {
    "typeCatalogue"
})
public class ListCatalogueWS {

    protected long typeCatalogue;

    /**
     * Obtiene el valor de la propiedad typeCatalogue.
     * 
     */
    public long getTypeCatalogue() {
        return typeCatalogue;
    }

    /**
     * Define el valor de la propiedad typeCatalogue.
     * 
     */
    public void setTypeCatalogue(long value) {
        this.typeCatalogue = value;
    }

}
