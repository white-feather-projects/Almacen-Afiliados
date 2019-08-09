package com.cbp.web.dto;

public class EmitirTarjetaVerificadaDTO {

	private String parsImpresoraIP;
	private String parsClienteNom;
	private String parsTarjeta;
	
	public EmitirTarjetaVerificadaDTO() {
		super();
	}

	public String getParsImpresoraIP() {
		return parsImpresoraIP;
	}

	public void setParsImpresoraIP(String parsImpresoraIP) {
		this.parsImpresoraIP = parsImpresoraIP;
	}

	public String getParsClienteNom() {
		return parsClienteNom;
	}

	public void setParsClienteNom(String parsClienteNom) {
		this.parsClienteNom = parsClienteNom;
	}

	public String getParsTarjeta() {
		return parsTarjeta;
	}

	public void setParsTarjeta(String parsTarjeta) {
		this.parsTarjeta = parsTarjeta;
	}

	@Override
	public String toString() {
		return "EmitirTarjetaVerificadaDTO [parsImpresoraIP=" + parsImpresoraIP + ", parsClienteNom=" + parsClienteNom
				+ ", parsTarjeta=" + parsTarjeta + "]";
	}
	
}
