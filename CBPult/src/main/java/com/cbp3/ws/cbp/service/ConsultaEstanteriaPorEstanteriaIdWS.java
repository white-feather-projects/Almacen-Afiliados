
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaEstanteriaPorEstanteriaIdWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaEstanteriaPorEstanteriaIdWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="estanteriaId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaEstanteriaPorEstanteriaIdWS", propOrder = {
    "estanteriaId"
})
public class ConsultaEstanteriaPorEstanteriaIdWS {

    protected long estanteriaId;

    /**
     * Obtiene el valor de la propiedad estanteriaId.
     * 
     */
    public long getEstanteriaId() {
        return estanteriaId;
    }

    /**
     * Define el valor de la propiedad estanteriaId.
     * 
     */
    public void setEstanteriaId(long value) {
        this.estanteriaId = value;
    }

}
