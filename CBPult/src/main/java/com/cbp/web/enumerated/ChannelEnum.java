package com.cbp.web.enumerated;

public enum ChannelEnum {

	PERSONA_NATURAL		("1", "PERSONA_NATURAL"),
    PERSONA_JURIDICA	("2", "PERSONA_JURIDICA"),
    PRESOLICITUD		("3", "PRESOLICITUD");

    private String id;
    private String descripcion;

    private ChannelEnum(String id, String descripcion) {
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
