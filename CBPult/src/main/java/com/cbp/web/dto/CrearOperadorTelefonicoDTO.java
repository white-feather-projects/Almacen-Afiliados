package com.cbp.web.dto;

public class CrearOperadorTelefonicoDTO {
	private String nombreOperador;
    private String codOperador;
    private Integer active;
    
	public CrearOperadorTelefonicoDTO() {
		super();
	}

	public String getNombreOperador() {
		return nombreOperador;
	}

	public void setNombreOperador(String nombreOperador) {
		this.nombreOperador = nombreOperador;
	}

	public String getCodOperador() {
		return codOperador;
	}

	public void setCodOperador(String codOperador) {
		this.codOperador = codOperador;
	}

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "CrearOperadorTelefonicoDTO [nombreOperador=" + nombreOperador + ", codOperador=" + codOperador
				+ ", active=" + active + "]";
	}
	
}
