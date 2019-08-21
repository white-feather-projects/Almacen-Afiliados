
package com.cbp3.ws.cbp.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para respuestaDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="respuestaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.cbp.ws.cbp3.com/}bdsUtil">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idObjetoCreadoCreado" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="listErroresDTO" type="{http://service.cbp.ws.cbp3.com/}erroresDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listZonas" type="{http://service.cbp.ws.cbp3.com/}zona" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nombreObjetoCreadoCreado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuestaDTO", propOrder = {
    "codigo",
    "descripcion",
    "idObjetoCreadoCreado",
    "listErroresDTO",
    "listZonas",
    "nombreObjetoCreadoCreado"
})
public class RespuestaDTO
    extends BdsUtil
{

    protected String codigo;
    protected String descripcion;
    protected long idObjetoCreadoCreado;
    @XmlElement(nillable = true)
    protected List<ErroresDTO> listErroresDTO;
    @XmlElement(nillable = true)
    protected List<Zona> listZonas;
    protected String nombreObjetoCreadoCreado;

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad idObjetoCreadoCreado.
     * 
     */
    public long getIdObjetoCreadoCreado() {
        return idObjetoCreadoCreado;
    }

    /**
     * Define el valor de la propiedad idObjetoCreadoCreado.
     * 
     */
    public void setIdObjetoCreadoCreado(long value) {
        this.idObjetoCreadoCreado = value;
    }

    /**
     * Gets the value of the listErroresDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listErroresDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListErroresDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErroresDTO }
     * 
     * 
     */
    public List<ErroresDTO> getListErroresDTO() {
        if (listErroresDTO == null) {
            listErroresDTO = new ArrayList<ErroresDTO>();
        }
        return this.listErroresDTO;
    }

    /**
     * Gets the value of the listZonas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listZonas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListZonas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Zona }
     * 
     * 
     */
    public List<Zona> getListZonas() {
        if (listZonas == null) {
            listZonas = new ArrayList<Zona>();
        }
        return this.listZonas;
    }

    /**
     * Obtiene el valor de la propiedad nombreObjetoCreadoCreado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreObjetoCreadoCreado() {
        return nombreObjetoCreadoCreado;
    }

    /**
     * Define el valor de la propiedad nombreObjetoCreadoCreado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreObjetoCreadoCreado(String value) {
        this.nombreObjetoCreadoCreado = value;
    }

}
