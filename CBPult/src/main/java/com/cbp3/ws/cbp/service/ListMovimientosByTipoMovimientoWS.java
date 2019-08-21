
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listMovimientosByTipoMovimientoWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listMovimientosByTipoMovimientoWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idTipoMovimiento" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listMovimientosByTipoMovimientoWS", propOrder = {
    "idTipoMovimiento"
})
public class ListMovimientosByTipoMovimientoWS {

    protected long idTipoMovimiento;

    /**
     * Obtiene el valor de la propiedad idTipoMovimiento.
     * 
     */
    public long getIdTipoMovimiento() {
        return idTipoMovimiento;
    }

    /**
     * Define el valor de la propiedad idTipoMovimiento.
     * 
     */
    public void setIdTipoMovimiento(long value) {
        this.idTipoMovimiento = value;
    }

}
