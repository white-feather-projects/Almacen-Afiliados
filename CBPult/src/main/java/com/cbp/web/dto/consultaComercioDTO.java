package com.cbp.web.dto;

public class consultaComercioDTO {

	private String identificacionComercio;

	public consultaComercioDTO() {
		super();
	}

	public String getIdentificacionComercio() {
		return identificacionComercio;
	}

	public void setIdentificacionComercio(String identificacionComercio) {
		this.identificacionComercio = identificacionComercio;
	}

	@Override
	public String toString() {
		return "consultaComercioDTO [identificacionComercio=" + identificacionComercio + "]";
	}
	
	
}
