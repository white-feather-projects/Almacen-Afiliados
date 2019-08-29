
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listaZonasRelacionadasByZonaActualIdWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listaZonasRelacionadasByZonaActualIdWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zonaActualId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaZonasRelacionadasByZonaActualIdWS", propOrder = {
    "zonaActualId"
})
public class ListaZonasRelacionadasByZonaActualIdWS {

    protected long zonaActualId;

    /**
     * Obtiene el valor de la propiedad zonaActualId.
     * 
     */
    public long getZonaActualId() {
        return zonaActualId;
    }

    /**
     * Define el valor de la propiedad zonaActualId.
     * 
     */
    public void setZonaActualId(long value) {
        this.zonaActualId = value;
    }

}
