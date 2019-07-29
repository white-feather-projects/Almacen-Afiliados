package com.cbp.web.dto;

public class ConsultaAsociacionComercioRepresentanteDTO {

	private long comercioId;

	public ConsultaAsociacionComercioRepresentanteDTO() {
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
		return "ConsultaAsociacionComercioRepresentanteDTO [comercioId=" + comercioId + "]";
	}
	
}
