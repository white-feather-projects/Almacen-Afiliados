
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaEstablecimientosByIdEstablecimientoWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaEstablecimientosByIdEstablecimientoWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idEstablecimiento" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaEstablecimientosByIdEstablecimientoWS", propOrder = {
    "idEstablecimiento"
})
public class ConsultaEstablecimientosByIdEstablecimientoWS {

    protected long idEstablecimiento;

    /**
     * Obtiene el valor de la propiedad idEstablecimiento.
     * 
     */
    public long getIdEstablecimiento() {
        return idEstablecimiento;
    }

    /**
     * Define el valor de la propiedad idEstablecimiento.
     * 
     */
    public void setIdEstablecimiento(long value) {
        this.idEstablecimiento = value;
    }

}
