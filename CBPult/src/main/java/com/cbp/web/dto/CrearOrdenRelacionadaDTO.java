package com.cbp.web.dto;

import com.cbp3.ws.cbp.service.Product;
import com.cbp3.ws.cbp.service.TipoOrden;

public class CrearOrdenRelacionadaDTO {

    private String ordenRelacionadaNumber;
    private TipoOrden tipoOrdenId;
    private String descripcion;
    private Product idProduct;
    private long cantidad;
    private String fechaCargaDatos;
    
	public CrearOrdenRelacionadaDTO() {
		super();
	}

	public String getOrdenRelacionadaNumber() {
		return ordenRelacionadaNumber;
	}

	public void setOrdenRelacionadaNumber(String ordenRelacionadaNumber) {
		this.ordenRelacionadaNumber = ordenRelacionadaNumber;
	}

	public TipoOrden getTipoOrdenId() {
		return tipoOrdenId;
	}

	public void setTipoOrdenId(TipoOrden tipoOrdenId) {
		this.tipoOrdenId = tipoOrdenId;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Product getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Product idProduct) {
		this.idProduct = idProduct;
	}

	public long getCantidad() {
		return cantidad;
	}

	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}

	public String getFechaCargaDatos() {
		return fechaCargaDatos;
	}

	public void setFechaCargaDatos(String fechaCargaDatos) {
		this.fechaCargaDatos = fechaCargaDatos;
	}

	@Override
	public String toString() {
		return "CrearOrdenRelacionadaDTO [ordenRelacionadaNumber=" + ordenRelacionadaNumber + ", tipoOrdenId="
				+ tipoOrdenId + ", descripcion=" + descripcion + ", idProduct=" + idProduct + ", cantidad=" + cantidad
				+ ", fechaCargaDatos=" + fechaCargaDatos + "]";
	}
    
    
}
