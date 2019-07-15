
package com.cbp1.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para informacionTrabajoDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="informacionTrabajoDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actividadEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="antiguedad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="canton" type="{http://service.cbp.ws.cbp1.com/}canton" minOccurs="0"/>
 *         &lt;element name="cargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cargoOtraEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="client" type="{http://service.cbp.ws.cbp1.com/}client" minOccurs="0"/>
 *         &lt;element name="distrito" type="{http://service.cbp.ws.cbp1.com/}distrito" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provincia" type="{http://service.cbp.ws.cbp1.com/}provincia" minOccurs="0"/>
 *         &lt;element name="sueldoMensual" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="telefonoEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ultimoSueldo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "informacionTrabajoDTO", propOrder = {
    "actividadEmpresa",
    "antiguedad",
    "canton",
    "cargo",
    "cargoOtraEmpresa",
    "client",
    "distrito",
    "email",
    "nombreEmpresa",
    "provincia",
    "sueldoMensual",
    "telefonoEmpresa",
    "ultimoSueldo"
})
public class InformacionTrabajoDTO {

    protected String actividadEmpresa;
    protected String antiguedad;
    protected Canton canton;
    protected String cargo;
    protected String cargoOtraEmpresa;
    protected Client client;
    protected Distrito distrito;
    protected String email;
    protected String nombreEmpresa;
    protected Provincia provincia;
    protected long sueldoMensual;
    protected String telefonoEmpresa;
    protected long ultimoSueldo;

    /**
     * Obtiene el valor de la propiedad actividadEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActividadEmpresa() {
        return actividadEmpresa;
    }

    /**
     * Define el valor de la propiedad actividadEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActividadEmpresa(String value) {
        this.actividadEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad antiguedad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntiguedad() {
        return antiguedad;
    }

    /**
     * Define el valor de la propiedad antiguedad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntiguedad(String value) {
        this.antiguedad = value;
    }

    /**
     * Obtiene el valor de la propiedad canton.
     * 
     * @return
     *     possible object is
     *     {@link Canton }
     *     
     */
    public Canton getCanton() {
        return canton;
    }

    /**
     * Define el valor de la propiedad canton.
     * 
     * @param value
     *     allowed object is
     *     {@link Canton }
     *     
     */
    public void setCanton(Canton value) {
        this.canton = value;
    }

    /**
     * Obtiene el valor de la propiedad cargo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Define el valor de la propiedad cargo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargo(String value) {
        this.cargo = value;
    }

    /**
     * Obtiene el valor de la propiedad cargoOtraEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoOtraEmpresa() {
        return cargoOtraEmpresa;
    }

    /**
     * Define el valor de la propiedad cargoOtraEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoOtraEmpresa(String value) {
        this.cargoOtraEmpresa = value;
    }

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
     * Obtiene el valor de la propiedad distrito.
     * 
     * @return
     *     possible object is
     *     {@link Distrito }
     *     
     */
    public Distrito getDistrito() {
        return distrito;
    }

    /**
     * Define el valor de la propiedad distrito.
     * 
     * @param value
     *     allowed object is
     *     {@link Distrito }
     *     
     */
    public void setDistrito(Distrito value) {
        this.distrito = value;
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
     * Obtiene el valor de la propiedad nombreEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    /**
     * Define el valor de la propiedad nombreEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEmpresa(String value) {
        this.nombreEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad provincia.
     * 
     * @return
     *     possible object is
     *     {@link Provincia }
     *     
     */
    public Provincia getProvincia() {
        return provincia;
    }

    /**
     * Define el valor de la propiedad provincia.
     * 
     * @param value
     *     allowed object is
     *     {@link Provincia }
     *     
     */
    public void setProvincia(Provincia value) {
        this.provincia = value;
    }

    /**
     * Obtiene el valor de la propiedad sueldoMensual.
     * 
     */
    public long getSueldoMensual() {
        return sueldoMensual;
    }

    /**
     * Define el valor de la propiedad sueldoMensual.
     * 
     */
    public void setSueldoMensual(long value) {
        this.sueldoMensual = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    /**
     * Define el valor de la propiedad telefonoEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoEmpresa(String value) {
        this.telefonoEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad ultimoSueldo.
     * 
     */
    public long getUltimoSueldo() {
        return ultimoSueldo;
    }

    /**
     * Define el valor de la propiedad ultimoSueldo.
     * 
     */
    public void setUltimoSueldo(long value) {
        this.ultimoSueldo = value;
    }

}
