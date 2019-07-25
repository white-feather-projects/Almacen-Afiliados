package com.cbp.web.dto;

public class AsociarComercioConRepresentanteLegalDTO {

	private long comercioId;
    private long representanteId;
    
	public AsociarComercioConRepresentanteLegalDTO() {
		super();
	}

	public long getComercioId() {
		return comercioId;
	}

	public void setComercioId(long comercioId) {
		this.comercioId = comercioId;
	}

	public long getRepresentanteId() {
		return representanteId;
	}

	public void setRepresentanteId(long representanteId) {
		this.representanteId = representanteId;
	}

	@Override
	public String toString() {
		return "AsociarComercioConRepresentanteLegalDTO [comercioId=" + comercioId + ", representanteId="
				+ representanteId + "]";
	}
    
}
