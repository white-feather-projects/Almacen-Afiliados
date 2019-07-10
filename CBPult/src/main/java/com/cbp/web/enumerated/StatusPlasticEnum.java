/**
 * 
 */
package com.cbp.web.enumerated;

/**
 * @author Equipo
 *
 */
public enum StatusPlasticEnum {

	ACTIVO		("0", "ACTIVO"),
    INACTIVO	("1", "INACTIVO"),
    CANCEL		("2", "CANCEL");

    private String id;
    private String descripcion;

    private StatusPlasticEnum(String id, String descripcion) {
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
