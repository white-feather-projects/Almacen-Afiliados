package com.cbp.web.dto;

public class TipoZonaDTO {

    private String nombre;
    private Long tipoZonaId;
    
	public TipoZonaDTO() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getTipoZonaId() {
		return tipoZonaId;
	}

	public void setTipoZonaId(Long tipoZonaId) {
		this.tipoZonaId = tipoZonaId;
	}

	@Override
	public String toString() {
		return "TipoZonaDTO [nombre=" + nombre + ", tipoZonaId=" + tipoZonaId + "]";
	}
	
}
