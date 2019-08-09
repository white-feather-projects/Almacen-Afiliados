package com.cbp.web.dto;

public class ConsultaAlmacenPorNumeroAlmacenDTO {

	private String numeroAlmacen;

	public ConsultaAlmacenPorNumeroAlmacenDTO() {
		super();
	}

	public String getNumeroAlmacen() {
		return numeroAlmacen;
	}

	public void setNumeroAlmacen(String numeroAlmacen) {
		this.numeroAlmacen = numeroAlmacen;
	}

	@Override
	public String toString() {
		return "ConsultaAlmacenPorNumeroAlmacenDTO [numeroAlmacen=" + numeroAlmacen + "]";
	}
	
}
