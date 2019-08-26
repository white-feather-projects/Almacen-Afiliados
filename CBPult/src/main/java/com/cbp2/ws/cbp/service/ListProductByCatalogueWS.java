
package com.cbp2.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listProductByCatalogueWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listProductByCatalogueWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idCatalogue" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listProductByCatalogueWS", propOrder = {
    "idCatalogue"
})
public class ListProductByCatalogueWS {

    protected long idCatalogue;

    /**
     * Obtiene el valor de la propiedad idCatalogue.
     * 
     */
    public long getIdCatalogue() {
        return idCatalogue;
    }

    /**
     * Define el valor de la propiedad idCatalogue.
     * 
     */
    public void setIdCatalogue(long value) {
        this.idCatalogue = value;
    }

}
