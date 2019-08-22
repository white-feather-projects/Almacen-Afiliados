
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaAjusteInventarioPorAjusteInventarioIdWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaAjusteInventarioPorAjusteInventarioIdWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ajusteInventarioId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaAjusteInventarioPorAjusteInventarioIdWS", propOrder = {
    "ajusteInventarioId"
})
public class ConsultaAjusteInventarioPorAjusteInventarioIdWS {

    protected long ajusteInventarioId;

    /**
     * Obtiene el valor de la propiedad ajusteInventarioId.
     * 
     */
    public long getAjusteInventarioId() {
        return ajusteInventarioId;
    }

    /**
     * Define el valor de la propiedad ajusteInventarioId.
     * 
     */
    public void setAjusteInventarioId(long value) {
        this.ajusteInventarioId = value;
    }

}
