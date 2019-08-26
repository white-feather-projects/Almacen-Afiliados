
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para modificarAsociarComercioRecaudoWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="modificarAsociarComercioRecaudoWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idRecaudo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="recaudoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ubicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recaudoVerificado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaVigencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoRecaudoId" type="{http://service.cbp.ws.cbp3.com/}tipoRecaudo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modificarAsociarComercioRecaudoWS", propOrder = {
    "idRecaudo",
    "recaudoNombre",
    "ubicacion",
    "recaudoVerificado",
    "fechaVigencia",
    "tipoRecaudoId"
})
public class ModificarAsociarComercioRecaudoWS {

    protected long idRecaudo;
    protected String recaudoNombre;
    protected String ubicacion;
    protected String recaudoVerificado;
    protected String fechaVigencia;
    protected TipoRecaudo tipoRecaudoId;

    /**
     * Obtiene el valor de la propiedad idRecaudo.
     * 
     */
    public long getIdRecaudo() {
        return idRecaudo;
    }

    /**
     * Define el valor de la propiedad idRecaudo.
     * 
     */
    public void setIdRecaudo(long value) {
        this.idRecaudo = value;
    }

    /**
     * Obtiene el valor de la propiedad recaudoNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecaudoNombre() {
        return recaudoNombre;
    }

    /**
     * Define el valor de la propiedad recaudoNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecaudoNombre(String value) {
        this.recaudoNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad ubicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * Define el valor de la propiedad ubicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUbicacion(String value) {
        this.ubicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad recaudoVerificado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecaudoVerificado() {
        return recaudoVerificado;
    }

    /**
     * Define el valor de la propiedad recaudoVerificado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecaudoVerificado(String value) {
        this.recaudoVerificado = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVigencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaVigencia() {
        return fechaVigencia;
    }

    /**
     * Define el valor de la propiedad fechaVigencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaVigencia(String value) {
        this.fechaVigencia = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoRecaudoId.
     * 
     * @return
     *     possible object is
     *     {@link TipoRecaudo }
     *     
     */
    public TipoRecaudo getTipoRecaudoId() {
        return tipoRecaudoId;
    }

    /**
     * Define el valor de la propiedad tipoRecaudoId.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoRecaudo }
     *     
     */
    public void setTipoRecaudoId(TipoRecaudo value) {
        this.tipoRecaudoId = value;
    }

}
