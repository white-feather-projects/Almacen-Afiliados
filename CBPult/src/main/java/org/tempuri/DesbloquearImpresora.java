
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
    "parsImpresoraIP"
})
@XmlRootElement(name = "Desbloquear_Impresora")
public class DesbloquearImpresora {

    protected String parsImpresoraIP;

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

}
