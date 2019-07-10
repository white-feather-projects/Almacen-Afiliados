
package com.cbp2.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para changeOnlyStatusRequestWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="changeOnlyStatusRequestWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idRequest" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fechaModificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="canal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changeOnlyStatusRequestWS", propOrder = {
    "idRequest",
    "fechaModificacion",
    "statusOrder",
    "canal"
})
public class ChangeOnlyStatusRequestWS {

    protected long idRequest;
    protected String fechaModificacion;
    protected String statusOrder;
    protected String canal;

    /**
     * Obtiene el valor de la propiedad idRequest.
     * 
     */
    public long getIdRequest() {
        return idRequest;
    }

    /**
     * Define el valor de la propiedad idRequest.
     * 
     */
    public void setIdRequest(long value) {
        this.idRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaModificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaModificacion() {
        return fechaModificacion;
    }

    /**
     * Define el valor de la propiedad fechaModificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaModificacion(String value) {
        this.fechaModificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad statusOrder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusOrder() {
        return statusOrder;
    }

    /**
     * Define el valor de la propiedad statusOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusOrder(String value) {
        this.statusOrder = value;
    }

    /**
     * Obtiene el valor de la propiedad canal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanal() {
        return canal;
    }

    /**
     * Define el valor de la propiedad canal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanal(String value) {
        this.canal = value;
    }

}
