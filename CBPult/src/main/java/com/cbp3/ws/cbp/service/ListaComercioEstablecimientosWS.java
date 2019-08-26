
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listaComercioEstablecimientosWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listaComercioEstablecimientosWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idComercio" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaComercioEstablecimientosWS", propOrder = {
    "idComercio"
})
public class ListaComercioEstablecimientosWS {

    protected long idComercio;

    /**
     * Obtiene el valor de la propiedad idComercio.
     * 
     */
    public long getIdComercio() {
        return idComercio;
    }

    /**
     * Define el valor de la propiedad idComercio.
     * 
     */
    public void setIdComercio(long value) {
        this.idComercio = value;
    }

}
