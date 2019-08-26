
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaProductoUbicacionsByIdProductoUbicacionWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaProductoUbicacionsByIdProductoUbicacionWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productoUbicacionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaProductoUbicacionsByIdProductoUbicacionWS", propOrder = {
    "productoUbicacionId"
})
public class ConsultaProductoUbicacionsByIdProductoUbicacionWS {

    protected long productoUbicacionId;

    /**
     * Obtiene el valor de la propiedad productoUbicacionId.
     * 
     */
    public long getProductoUbicacionId() {
        return productoUbicacionId;
    }

    /**
     * Define el valor de la propiedad productoUbicacionId.
     * 
     */
    public void setProductoUbicacionId(long value) {
        this.productoUbicacionId = value;
    }

}
