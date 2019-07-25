package com.cbp.web.dto;

public class ConsultaContactoByIdentificacionContactoDTO {

	private String identificacionContacto;

	public ConsultaContactoByIdentificacionContactoDTO() {
		super();
	}

	public String getIdentificacionContacto() {
		return identificacionContacto;
	}

	public void setIdentificacionContacto(String identificacionContacto) {
		this.identificacionContacto = identificacionContacto;
	}

	@Override
	public String toString() {
		return "ConsultaContactoByIdentificacionContactoDTO [identificacionContacto=" + identificacionContacto + "]";
	}
	
}
