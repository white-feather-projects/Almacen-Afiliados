package com.cbp.web.dto;

public class ActiveOrInactiveOperadoraTelefonicaDTO {

	private long operadortelfId;
	private Integer active;
	
	public ActiveOrInactiveOperadoraTelefonicaDTO() {
		super();
	}

	public long getOperadortelfId() {
		return operadortelfId;
	}

	public void setOperadortelfId(long operadortelfId) {
		this.operadortelfId = operadortelfId;
	}

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "ActiveOrInactiveOperadoraTelefonicaDTO [operadortelfId=" + operadortelfId + ", active=" + active + "]";
	}
	
}
