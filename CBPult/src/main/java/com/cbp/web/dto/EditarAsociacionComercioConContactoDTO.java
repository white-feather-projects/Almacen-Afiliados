package com.cbp.web.dto;

public class EditarAsociacionComercioConContactoDTO {

	private long comercioId;
    private long contactoId;
    
	public EditarAsociacionComercioConContactoDTO() {
		super();
	}

	public long getComercioId() {
		return comercioId;
	}

	public void setComercioId(long comercioId) {
		this.comercioId = comercioId;
	}

	public long getContactoId() {
		return contactoId;
	}

	public void setContactoId(long contactoId) {
		this.contactoId = contactoId;
	}

	@Override
	public String toString() {
		return "EditarAsociacionComercioConContactoDTO [comercioId=" + comercioId + ", contactoId=" + contactoId + "]";
	}
    
}
