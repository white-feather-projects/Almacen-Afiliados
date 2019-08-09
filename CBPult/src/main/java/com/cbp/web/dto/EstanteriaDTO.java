package com.cbp.web.dto;

import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.datatype.XMLGregorianCalendar;

public class EstanteriaDTO {

	private Long codigoUsuarioModifica;
    private String descripcion;
    private Long estanteriaId;
    private XMLGregorianCalendar fechaCargaDatos;
    private XMLGregorianCalendar fechaHoraModificacion;
    private long modulos;
    private long niveles;
    private long zonaId;
    
	public EstanteriaDTO() {
		super();
	}

	public Long getCodigoUsuarioModifica() {
		return codigoUsuarioModifica;
	}

	public void setCodigoUsuarioModifica(Long codigoUsuarioModifica) {
		this.codigoUsuarioModifica = codigoUsuarioModifica;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Long getEstanteriaId() {
		return estanteriaId;
	}

	public void setEstanteriaId(Long estanteriaId) {
		this.estanteriaId = estanteriaId;
	}

	public XMLGregorianCalendar getFechaCargaDatos() {
		return fechaCargaDatos;
	}

	public void setFechaCargaDatos(XMLGregorianCalendar fechaCargaDatos) {
		this.fechaCargaDatos = fechaCargaDatos;
	}

	public XMLGregorianCalendar getFechaHoraModificacion() {
		return fechaHoraModificacion;
	}

	public void setFechaHoraModificacion(XMLGregorianCalendar fechaHoraModificacion) {
		this.fechaHoraModificacion = fechaHoraModificacion;
	}

	public long getModulos() {
		return modulos;
	}

	public void setModulos(long modulos) {
		this.modulos = modulos;
	}

	public long getNiveles() {
		return niveles;
	}

	public void setNiveles(long niveles) {
		this.niveles = niveles;
	}

	public long getZonaId() {
		return zonaId;
	}

	public void setZonaId(long zonaId) {
		this.zonaId = zonaId;
	}

	@Override
	public String toString() {
		return "EstanteriaDTO [codigoUsuarioModifica=" + codigoUsuarioModifica + ", descripcion=" + descripcion
				+ ", estanteriaId=" + estanteriaId + ", fechaCargaDatos=" + fechaCargaDatos + ", fechaHoraModificacion="
				+ fechaHoraModificacion + ", modulos=" + modulos + ", niveles=" + niveles + ", zonaId=" + zonaId + "]";
	}
    
}
