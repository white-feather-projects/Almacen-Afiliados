
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaZonaPorZonaIdWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaZonaPorZonaIdWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zonaId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaZonaPorZonaIdWS", propOrder = {
    "zonaId"
})
public class ConsultaZonaPorZonaIdWS {

    protected long zonaId;

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

}