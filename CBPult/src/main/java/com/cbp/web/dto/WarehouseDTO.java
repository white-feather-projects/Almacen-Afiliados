package com.cbp.web.dto;

import javax.xml.datatype.XMLGregorianCalendar;

public class WarehouseDTO {

    private Long codigoUsuarioModifica;
    private String direccion;
    private XMLGregorianCalendar fechaHoraCarga;
    private XMLGregorianCalendar fechaHoraModificacion;
    private long gerenteSucursal;
    private Long idWarehouse;
    private long officeId;
    private long productId;
    private long tipoAlmacenId;
    private String warehouseName;
    private String warehouseNumber;
    
	public WarehouseDTO() {
		super();
	}

	public Long getCodigoUsuarioModifica() {
		return codigoUsuarioModifica;
	}

	public void setCodigoUsuarioModifica(Long codigoUsuarioModifica) {
		this.codigoUsuarioModifica = codigoUsuarioModifica;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public XMLGregorianCalendar getFechaHoraCarga() {
		return fechaHoraCarga;
	}

	public void setFechaHoraCarga(XMLGregorianCalendar fechaHoraCarga) {
		this.fechaHoraCarga = fechaHoraCarga;
	}

	public XMLGregorianCalendar getFechaHoraModificacion() {
		return fechaHoraModificacion;
	}

	public void setFechaHoraModificacion(XMLGregorianCalendar fechaHoraModificacion) {
		this.fechaHoraModificacion = fechaHoraModificacion;
	}

	public long getGerenteSucursal() {
		return gerenteSucursal;
	}

	public void setGerenteSucursal(long gerenteSucursal) {
		this.gerenteSucursal = gerenteSucursal;
	}

	public Long getIdWarehouse() {
		return idWarehouse;
	}

	public void setIdWarehouse(Long idWarehouse) {
		this.idWarehouse = idWarehouse;
	}

	public long getOfficeId() {
		return officeId;
	}

	public void setOfficeId(long officeId) {
		this.officeId = officeId;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public long getTipoAlmacenId() {
		return tipoAlmacenId;
	}

	public void setTipoAlmacenId(long tipoAlmacenId) {
		this.tipoAlmacenId = tipoAlmacenId;
	}

	public String getWarehouseName() {
		return warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	public String getWarehouseNumber() {
		return warehouseNumber;
	}

	public void setWarehouseNumber(String warehouseNumber) {
		this.warehouseNumber = warehouseNumber;
	}

	@Override
	public String toString() {
		return "WarehouseDTO [codigoUsuarioModifica=" + codigoUsuarioModifica + ", direccion=" + direccion
				+ ", fechaHoraCarga=" + fechaHoraCarga + ", fechaHoraModificacion=" + fechaHoraModificacion
				+ ", gerenteSucursal=" + gerenteSucursal + ", idWarehouse=" + idWarehouse + ", officeId=" + officeId
				+ ", productId=" + productId + ", tipoAlmacenId=" + tipoAlmacenId + ", warehouseName=" + warehouseName
				+ ", warehouseNumber=" + warehouseNumber + "]";
	}
	
}
