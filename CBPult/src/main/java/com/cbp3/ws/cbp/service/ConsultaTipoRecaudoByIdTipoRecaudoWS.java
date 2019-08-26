
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaTipoRecaudoByIdTipoRecaudoWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaTipoRecaudoByIdTipoRecaudoWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoRecaudoId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaTipoRecaudoByIdTipoRecaudoWS", propOrder = {
    "tipoRecaudoId"
})
public class ConsultaTipoRecaudoByIdTipoRecaudoWS {

    protected long tipoRecaudoId;

    /**
     * Obtiene el valor de la propiedad tipoRecaudoId.
     * 
     */
    public long getTipoRecaudoId() {
        return tipoRecaudoId;
    }

    /**
     * Define el valor de la propiedad tipoRecaudoId.
     * 
     */
    public void setTipoRecaudoId(long value) {
        this.tipoRecaudoId = value;
    }

}
