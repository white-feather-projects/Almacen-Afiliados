
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaAjusteReciboPorAjusteReciboIdWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaAjusteReciboPorAjusteReciboIdWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ajusteReciboId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaAjusteReciboPorAjusteReciboIdWS", propOrder = {
    "ajusteReciboId"
})
public class ConsultaAjusteReciboPorAjusteReciboIdWS {

    protected long ajusteReciboId;

    /**
     * Obtiene el valor de la propiedad ajusteReciboId.
     * 
     */
    public long getAjusteReciboId() {
        return ajusteReciboId;
    }

    /**
     * Define el valor de la propiedad ajusteReciboId.
     * 
     */
    public void setAjusteReciboId(long value) {
        this.ajusteReciboId = value;
    }

}
