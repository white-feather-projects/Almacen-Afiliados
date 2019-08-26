
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listEstanteriasByIdZonaWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listEstanteriasByIdZonaWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idZona" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listEstanteriasByIdZonaWS", propOrder = {
    "idZona"
})
public class ListEstanteriasByIdZonaWS {

    protected long idZona;

    /**
     * Obtiene el valor de la propiedad idZona.
     * 
     */
    public long getIdZona() {
        return idZona;
    }

    /**
     * Define el valor de la propiedad idZona.
     * 
     */
    public void setIdZona(long value) {
        this.idZona = value;
    }

}
