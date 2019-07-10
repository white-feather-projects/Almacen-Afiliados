
package com.cbp1.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para assignCardToClientWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="assignCardToClientWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="client" type="{http://service.cbp.ws.cbp1.com/}client" minOccurs="0"/>
 *         &lt;element name="plastic" type="{http://service.cbp.ws.cbp1.com/}plastic" minOccurs="0"/>
 *         &lt;element name="fechaCorte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaAsignacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "assignCardToClientWS", propOrder = {
    "client",
    "plastic",
    "fechaCorte",
    "fechaAsignacion",
    "canal"
})
public class AssignCardToClientWS {

    protected Client client;
    protected Plastic plastic;
    protected String fechaCorte;
    protected String fechaAsignacion;
    protected String canal;

    /**
     * Obtiene el valor de la propiedad client.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getClient() {
        return client;
    }

    /**
     * Define el valor de la propiedad client.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setClient(Client value) {
        this.client = value;
    }

    /**
     * Obtiene el valor de la propiedad plastic.
     * 
     * @return
     *     possible object is
     *     {@link Plastic }
     *     
     */
    public Plastic getPlastic() {
        return plastic;
    }

    /**
     * Define el valor de la propiedad plastic.
     * 
     * @param value
     *     allowed object is
     *     {@link Plastic }
     *     
     */
    public void setPlastic(Plastic value) {
        this.plastic = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCorte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaCorte() {
        return fechaCorte;
    }

    /**
     * Define el valor de la propiedad fechaCorte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaCorte(String value) {
        this.fechaCorte = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaAsignacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaAsignacion() {
        return fechaAsignacion;
    }

    /**
     * Define el valor de la propiedad fechaAsignacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaAsignacion(String value) {
        this.fechaAsignacion = value;
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
