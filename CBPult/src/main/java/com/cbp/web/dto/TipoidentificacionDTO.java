package com.cbp.web.dto;

public class TipoidentificacionDTO {

    private String nombre;
    private long tipoIdentificacionId;
    
	public TipoidentificacionDTO() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getTipoIdentificacionId() {
		return tipoIdentificacionId;
	}

	public void setTipoIdentificacionId(long tipoIdentificacionId) {
		this.tipoIdentificacionId = tipoIdentificacionId;
	}

	@Override
	public String toString() {
		return "TipoidentificacionDTO [nombre=" + nombre + ", tipoIdentificacionId=" + tipoIdentificacionId + "]";
	}
	
}
