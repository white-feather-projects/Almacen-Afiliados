package com.cbp.web.dto;

import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.datatype.XMLGregorianCalendar;

public class ModificarAlmacenDTO {

    private String numeroAlmacen;
    private String nombreAlmacen;
    private long identificacionOficina;
    private long identificacionProducto;
    private long codigoUsuarioModifica;
    private XMLGregorianCalendar fechaHoraModifica;
    private long tipoAlmacen;
    private String direccion;
    private long gerenteSucursal;
    
	public ModificarAlmacenDTO() {
		super();
	}

	public String getNumeroAlmacen() {
		return numeroAlmacen;
	}

	public void setNumeroAlmacen(String numeroAlmacen) {
		this.numeroAlmacen = numeroAlmacen;
	}

	public String getNombreAlmacen() {
		return nombreAlmacen;
	}

	public void setNombreAlmacen(String nombreAlmacen) {
		this.nombreAlmacen = nombreAlmacen;
	}

	public long getIdentificacionOficina() {
		return identificacionOficina;
	}

	public void setIdentificacionOficina(long identificacionOficina) {
		this.identificacionOficina = identificacionOficina;
	}

	public long getIdentificacionProducto() {
		return identificacionProducto;
	}

	public void setIdentificacionProducto(long identificacionProducto) {
		this.identificacionProducto = identificacionProducto;
	}

	public long getCodigoUsuarioModifica() {
		return codigoUsuarioModifica;
	}

	public void setCodigoUsuarioModifica(long codigoUsuarioModifica) {
		this.codigoUsuarioModifica = codigoUsuarioModifica;
	}

	public XMLGregorianCalendar getFechaHoraModifica() {
		return fechaHoraModifica;
	}

	public void setFechaHoraModifica(XMLGregorianCalendar fechaHoraModifica) {
		this.fechaHoraModifica = fechaHoraModifica;
	}

	public long getTipoAlmacen() {
		return tipoAlmacen;
	}

	public void setTipoAlmacen(long tipoAlmacen) {
		this.tipoAlmacen = tipoAlmacen;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public long getGerenteSucursal() {
		return gerenteSucursal;
	}

	public void setGerenteSucursal(long gerenteSucursal) {
		this.gerenteSucursal = gerenteSucursal;
	}

	@Override
	public String toString() {
		return "ModificarAlmacenDTO [numeroAlmacen=" + numeroAlmacen + ", nombreAlmacen=" + nombreAlmacen
				+ ", identificacionOficina=" + identificacionOficina + ", identificacionProducto="
				+ identificacionProducto + ", codigoUsuarioModifica=" + codigoUsuarioModifica + ", fechaHoraModifica="
				+ fechaHoraModifica + ", tipoAlmacen=" + tipoAlmacen + ", direccion=" + direccion + ", gerenteSucursal="
				+ gerenteSucursal + "]";
	}
    
}
