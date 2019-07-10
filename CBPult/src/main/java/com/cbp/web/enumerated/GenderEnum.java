/**
 * 
 */
package com.cbp.web.enumerated;

/**
 * @author Equipo
 *
 */
public enum GenderEnum {

	MASCULINO	("1", "MASCULINO"),
    FEMENINO	("2", "FEMENINO");

    private String id;
    private String descripcion;

    private GenderEnum(String id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
