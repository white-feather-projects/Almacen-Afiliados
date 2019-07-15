/**
 * 
 */
package com.cbp.web.enumerated;

/**
 * @author Equipo
 *
 */
public enum StatusRequest {

	SOLICITUD_INGRESADA			("0", "SOLICITUD_INGRESADA"),
    SOLICITUD_POR_FORMALIZAR	("1", "SOLICITUD_POR_FORMALIZAR"),
    SOLICITUD_EN_ANALISIS		("2", "SOLICITUD_EN_ANALISIS"),
    SOLICITUD_APROBADA			("3", "SOLICITUD_APROBADA"),
    TARJETA_POR_IMPRIMIR		("4", "TARJETA_POR_IMPRIMIR"),
    TARJETA_ENTREGADA_ACTIVA	("5", "TARJETA_ENTREGADA_ACTIVA"),
    SOLICITUD_RECHAZADA			("6", "SOLICITUD_RECHAZADA"),
    SOLICITUD_CANCELADA			("7", "SOLICITUD_CANCELADA");
    
    private String id;
    private String descripcion;

    private StatusRequest(String id, String descripcion) {
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
