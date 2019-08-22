
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaOrdenRelacionadaPorOrdenRelacionadaIdWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaOrdenRelacionadaPorOrdenRelacionadaIdWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ordenRelacionadaId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaOrdenRelacionadaPorOrdenRelacionadaIdWS", propOrder = {
    "ordenRelacionadaId"
})
public class ConsultaOrdenRelacionadaPorOrdenRelacionadaIdWS {

    protected long ordenRelacionadaId;

    /**
     * Obtiene el valor de la propiedad ordenRelacionadaId.
     * 
     */
    public long getOrdenRelacionadaId() {
        return ordenRelacionadaId;
    }

    /**
     * Define el valor de la propiedad ordenRelacionadaId.
     * 
     */
    public void setOrdenRelacionadaId(long value) {
        this.ordenRelacionadaId = value;
    }

}
