package com.cbp.web.dto;

public class ResponseMgsDTO {
	
	private String mensaje;

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public ResponseMgsDTO(String mensaje) {
		super();
		this.mensaje = mensaje;
	}

	public ResponseMgsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
