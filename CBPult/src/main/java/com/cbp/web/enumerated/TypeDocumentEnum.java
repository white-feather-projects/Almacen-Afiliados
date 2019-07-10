/**
 * 
 */
package com.cbp.web.enumerated;

/**
 * @author Equipo
 *
 */
public enum TypeDocumentEnum {

	NITE("1", "NITE"),
    NPASAPORTE("2", "NPASAPORTE");

    private String id;
    private String descripcion;

    private TypeDocumentEnum(String id, String descripcion) {
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
