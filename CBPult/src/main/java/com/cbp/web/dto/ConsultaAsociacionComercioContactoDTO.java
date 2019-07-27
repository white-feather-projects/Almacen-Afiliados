package com.cbp.web.dto;

public class ConsultaAsociacionComercioContactoDTO {

	private long comercioId;

	public ConsultaAsociacionComercioContactoDTO() {
		super();
	}

	public long getComercioId() {
		return comercioId;
	}

	public void setComercioId(long comercioId) {
		this.comercioId = comercioId;
	}

	@Override
	public String toString() {
		return "ConsultaAsociacionComercioContactoDTO [comercioId=" + comercioId + "]";
	}
	
}
