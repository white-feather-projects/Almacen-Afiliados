
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaBancoAfiliacionByIdWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaBancoAfiliacionByIdWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idAsociacion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaBancoAfiliacionByIdWS", propOrder = {
    "idAsociacion"
})
public class ConsultaBancoAfiliacionByIdWS {

    protected long idAsociacion;

    /**
     * Obtiene el valor de la propiedad idAsociacion.
     * 
     */
    public long getIdAsociacion() {
        return idAsociacion;
    }

    /**
     * Define el valor de la propiedad idAsociacion.
     * 
     */
    public void setIdAsociacion(long value) {
        this.idAsociacion = value;
    }

}
