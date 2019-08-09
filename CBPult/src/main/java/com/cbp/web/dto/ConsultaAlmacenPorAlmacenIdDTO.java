package com.cbp.web.dto;

public class ConsultaAlmacenPorAlmacenIdDTO {

	private long idAlmacen;

	public ConsultaAlmacenPorAlmacenIdDTO() {
		super();
	}

	public long getIdAlmacen() {
		return idAlmacen;
	}

	public void setIdAlmacen(long idAlmacen) {
		this.idAlmacen = idAlmacen;
	}

	@Override
	public String toString() {
		return "ConsultaAlmacenPorAlmacenIdDTO [idAlmacen=" + idAlmacen + "]";
	}
	
}
