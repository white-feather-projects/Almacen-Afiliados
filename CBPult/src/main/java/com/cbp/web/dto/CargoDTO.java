package com.cbp.web.dto;

public class CargoDTO {

	private long cargoId;
    private String cargoNombre;
    private long dptoId;
    
	public CargoDTO() {
		super();
	}

	public Long getCargoId() {
		return cargoId;
	}

	public void setCargoId(Long cargoId) {
		this.cargoId = cargoId;
	}

	public String getCargoNombre() {
		return cargoNombre;
	}

	public void setCargoNombre(String cargoNombre) {
		this.cargoNombre = cargoNombre;
	}

	public long getDptoId() {
		return dptoId;
	}

	public void setDptoId(long dptoId) {
		this.dptoId = dptoId;
	}

	@Override
	public String toString() {
		return "CargoDTO [cargoId=" + cargoId + ", cargoNombre=" + cargoNombre + ", dptoId=" + dptoId + "]";
	}
	
}
