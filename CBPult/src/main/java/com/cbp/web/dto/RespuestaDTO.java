/**
 * 
 */
package com.cbp.web.dto;

import java.util.List;

/**
 * @author Equipo
 *
 */

public class RespuestaDTO {

	private String codigo;
    private List<ErroresDTO> listErroresDTO;
    private String descripcion;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public List<ErroresDTO> getListErroresDTO() {
		return listErroresDTO;
	}
	public void setListErroresDTO(List<ErroresDTO> listErroresDTO) {
		this.listErroresDTO = listErroresDTO;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
