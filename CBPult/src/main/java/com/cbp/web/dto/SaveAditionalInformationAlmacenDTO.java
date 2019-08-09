package com.cbp.web.dto;

public class SaveAditionalInformationAlmacenDTO {

	private com.cbp3.ws.cbp.service.AlmacenDTO dto;

	public SaveAditionalInformationAlmacenDTO() {
		super();
	}

	public com.cbp3.ws.cbp.service.AlmacenDTO getDto() {
		return dto;
	}



	public void setDto(com.cbp3.ws.cbp.service.AlmacenDTO dto) {
		this.dto = dto;
	}



	@Override
	public String toString() {
		return "SaveAditionalInformationAlmacenDTO [dto=" + dto + "]";
	}
	
}
