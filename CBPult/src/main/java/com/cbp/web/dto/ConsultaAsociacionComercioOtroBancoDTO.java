package com.cbp.web.dto;

import com.cbp3.ws.cbp.service.Comercio;

public class ConsultaAsociacionComercioOtroBancoDTO {

	private ComercioDTO comercioId;

	public ConsultaAsociacionComercioOtroBancoDTO() {
		super();
	}

	public ComercioDTO getComercioId() {
		return comercioId;
	}

	public void setComercioId(ComercioDTO comercioId) {
		this.comercioId = comercioId;
	}

	@Override
	public String toString() {
		return "ConsultaAsociacionComercioOtroBancoDTO [comercioId=" + comercioId + "]";
	}


	
}
