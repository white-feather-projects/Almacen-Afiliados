
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaEntityBankByIdEntityBankWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaEntityBankByIdEntityBankWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entityBankId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaEntityBankByIdEntityBankWS", propOrder = {
    "entityBankId"
})
public class ConsultaEntityBankByIdEntityBankWS {

    protected long entityBankId;

    /**
     * Obtiene el valor de la propiedad entityBankId.
     * 
     */
    public long getEntityBankId() {
        return entityBankId;
    }

    /**
     * Define el valor de la propiedad entityBankId.
     * 
     */
    public void setEntityBankId(long value) {
        this.entityBankId = value;
    }

}
