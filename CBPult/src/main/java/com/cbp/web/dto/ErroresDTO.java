/**
 * 
 */
package com.cbp.web.dto;

import java.util.List;

/**
 * @author Equipo
 *
 */
public class ErroresDTO {

	private String detalleError;
    private String message;
    private String longitudCampo;
    private String campoNombre;
    private List<String> error;
    private List<ErroresDTO> listErroresDTO;
	public String getDetalleError() {
		return detalleError;
	}
	public void setDetalleError(String detalleError) {
		this.detalleError = detalleError;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getLongitudCampo() {
		return longitudCampo;
	}
	public void setLongitudCampo(String longitudCampo) {
		this.longitudCampo = longitudCampo;
	}
	public String getCampoNombre() {
		return campoNombre;
	}
	public void setCampoNombre(String campoNombre) {
		this.campoNombre = campoNombre;
	}
	public List<String> getError() {
		return error;
	}
	public void setError(List<String> error) {
		this.error = error;
	}
	public List<ErroresDTO> getListErroresDTO() {
		return listErroresDTO;
	}
	public void setListErroresDTO(List<ErroresDTO> listErroresDTO) {
		this.listErroresDTO = listErroresDTO;
	}
}
