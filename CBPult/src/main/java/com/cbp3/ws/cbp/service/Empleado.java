
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para empleado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="empleado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cargoId" type="{http://service.cbp.ws.cbp3.com/}cargo" minOccurs="0"/>
 *         &lt;element name="dptoId" type="{http://service.cbp.ws.cbp3.com/}departamento" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empleadoId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="identificacionEmpleado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreEmpleado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefonoOficina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoIdentificacionId" type="{http://service.cbp.ws.cbp3.com/}tipoidentificacion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "empleado", propOrder = {
    "cargoId",
    "dptoId",
    "email",
    "empleadoId",
    "identificacionEmpleado",
    "nombreEmpleado",
    "telefonoOficina",
    "tipoIdentificacionId"
})
public class Empleado {

    protected Cargo cargoId;
    protected Departamento dptoId;
    protected String email;
    protected Long empleadoId;
    protected String identificacionEmpleado;
    protected String nombreEmpleado;
    protected String telefonoOficina;
    protected Tipoidentificacion tipoIdentificacionId;

    /**
     * Obtiene el valor de la propiedad cargoId.
     * 
     * @return
     *     possible object is
     *     {@link Cargo }
     *     
     */
    public Cargo getCargoId() {
        return cargoId;
    }

    /**
     * Define el valor de la propiedad cargoId.
     * 
     * @param value
     *     allowed object is
     *     {@link Cargo }
     *     
     */
    public void setCargoId(Cargo value) {
        this.cargoId = value;
    }

    /**
     * Obtiene el valor de la propiedad dptoId.
     * 
     * @return
     *     possible object is
     *     {@link Departamento }
     *     
     */
    public Departamento getDptoId() {
        return dptoId;
    }

    /**
     * Define el valor de la propiedad dptoId.
     * 
     * @param value
     *     allowed object is
     *     {@link Departamento }
     *     
     */
    public void setDptoId(Departamento value) {
        this.dptoId = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad empleadoId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEmpleadoId() {
        return empleadoId;
    }

    /**
     * Define el valor de la propiedad empleadoId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEmpleadoId(Long value) {
        this.empleadoId = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionEmpleado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacionEmpleado() {
        return identificacionEmpleado;
    }

    /**
     * Define el valor de la propiedad identificacionEmpleado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacionEmpleado(String value) {
        this.identificacionEmpleado = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreEmpleado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    /**
     * Define el valor de la propiedad nombreEmpleado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEmpleado(String value) {
        this.nombreEmpleado = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoOficina.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoOficina() {
        return telefonoOficina;
    }

    /**
     * Define el valor de la propiedad telefonoOficina.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoOficina(String value) {
        this.telefonoOficina = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoIdentificacionId.
     * 
     * @return
     *     possible object is
     *     {@link Tipoidentificacion }
     *     
     */
    public Tipoidentificacion getTipoIdentificacionId() {
        return tipoIdentificacionId;
    }

    /**
     * Define el valor de la propiedad tipoIdentificacionId.
     * 
     * @param value
     *     allowed object is
     *     {@link Tipoidentificacion }
     *     
     */
    public void setTipoIdentificacionId(Tipoidentificacion value) {
        this.tipoIdentificacionId = value;
    }

}
