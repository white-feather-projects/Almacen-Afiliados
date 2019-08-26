
package com.cbp2.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaTipoCatalogoWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaTipoCatalogoWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catalogue" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaTipoCatalogoWS", propOrder = {
    "catalogue"
})
public class ConsultaTipoCatalogoWS {

    protected long catalogue;

    /**
     * Obtiene el valor de la propiedad catalogue.
     * 
     */
    public long getCatalogue() {
        return catalogue;
    }

    /**
     * Define el valor de la propiedad catalogue.
     * 
     */
    public void setCatalogue(long value) {
        this.catalogue = value;
    }

}
