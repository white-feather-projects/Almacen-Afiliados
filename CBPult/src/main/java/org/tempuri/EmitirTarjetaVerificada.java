
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parsImpresoraIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parsClienteNom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parsTarjeta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "parsImpresoraIP",
    "parsClienteNom",
    "parsTarjeta"
})
@XmlRootElement(name = "Emitir_Tarjeta_Verificada")
public class EmitirTarjetaVerificada {

    protected String parsImpresoraIP;
    protected String parsClienteNom;
    protected String parsTarjeta;

    /**
     * Obtiene el valor de la propiedad parsImpresoraIP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParsImpresoraIP() {
        return parsImpresoraIP;
    }

    /**
     * Define el valor de la propiedad parsImpresoraIP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParsImpresoraIP(String value) {
        this.parsImpresoraIP = value;
    }

    /**
     * Obtiene el valor de la propiedad parsClienteNom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParsClienteNom() {
        return parsClienteNom;
    }

    /**
     * Define el valor de la propiedad parsClienteNom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParsClienteNom(String value) {
        this.parsClienteNom = value;
    }

    /**
     * Obtiene el valor de la propiedad parsTarjeta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParsTarjeta() {
        return parsTarjeta;
    }

    /**
     * Define el valor de la propiedad parsTarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParsTarjeta(String value) {
        this.parsTarjeta = value;
    }

}
