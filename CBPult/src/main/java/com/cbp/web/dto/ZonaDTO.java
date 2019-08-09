package com.cbp.web.dto;

import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.cbp3.ws.cbp.service.Empleado;
import com.cbp3.ws.cbp.service.TipoZona;
import com.cbp3.ws.cbp.service.Warehouse;

public class ZonaDTO {

    private Long codigoUsuarioModifica;
    private String descripcion;
    private EmpleadoDTO encargadoZona;
    private XMLGregorianCalendar fechaCargaDatos;
    private XMLGregorianCalendar fechaHoraModificacion;
    private WarehouseDTO idWarehouse;
    private TipoZonaDTO tipoZonaId;
    private long zonaId;
    private String zonaNombre;
    
	public ZonaDTO() {
		super();
	}

	public long getCodigoUsuarioModifica() {
		return codigoUsuarioModifica;
	}

	public void setCodigoUsuarioModifica(long codigoUsuarioModifica) {
		this.codigoUsuarioModifica = codigoUsuarioModifica;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public EmpleadoDTO getEncargadoZona() {
		return encargadoZona;
	}

	public void setEncargadoZona(EmpleadoDTO encargadoZona) {
		this.encargadoZona = encargadoZona;
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

	public WarehouseDTO getIdWarehouse() {
		return idWarehouse;
	}

	public void setIdWarehouse(WarehouseDTO idWarehouse) {
		this.idWarehouse = idWarehouse;
	}

	public TipoZonaDTO getTipoZonaId() {
		return tipoZonaId;
	}

	public void setTipoZonaId(TipoZonaDTO tipoZonaId) {
		this.tipoZonaId = tipoZonaId;
	}

	public long getZonaId() {
		return zonaId;
	}

	public void setZonaId(long zonaId) {
		this.zonaId = zonaId;
	}

	public String getZonaNombre() {
		return zonaNombre;
	}

	public void setZonaNombre(String zonaNombre) {
		this.zonaNombre = zonaNombre;
	}

	@Override
	public String toString() {
		return "ZonaDTO [codigoUsuarioModifica=" + codigoUsuarioModifica + ", descripcion=" + descripcion
				+ ", encargadoZona=" + encargadoZona + ", fechaCargaDatos=" + fechaCargaDatos
				+ ", fechaHoraModificacion=" + fechaHoraModificacion + ", idWarehouse=" + idWarehouse + ", tipoZonaId="
				+ tipoZonaId + ", zonaId=" + zonaId + ", zonaNombre=" + zonaNombre + "]";
	}
	
}
