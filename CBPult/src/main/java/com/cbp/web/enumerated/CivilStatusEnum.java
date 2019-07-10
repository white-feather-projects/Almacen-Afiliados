/**
 * 
 */
package com.cbp.web.enumerated;

/**
 * @author Equipo
 *
 */
public enum CivilStatusEnum {

	CASADO		("1", "CASADO"),
    SOLTERO		("2", "SOLTERO"),
    DIVORCIADO	("3", "DIVORCIADO"),
    CONCUBINATO	("4", "CONCUBINATO");

    private String id;
    private String descripcion;

    private CivilStatusEnum(String id, String descripcion) {
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
