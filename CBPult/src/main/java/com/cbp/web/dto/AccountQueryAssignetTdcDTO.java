package com.cbp.web.dto;

public class AccountQueryAssignetTdcDTO {
	
	private Long idClient;
	public Long getIdClient() {
		return idClient;
	}
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	private String idDocument;
	private String firtName;
	private String lastName;
	private String firtSurname;
	private String lastSurname;
	private String iban;
	private String account;
	private String errorMsg;
	private String bin;
	public String getBin() {
		return bin;
	}
	public void setBin(String bin) {
		this.bin = bin;
	}
	public String getIdDocument() {
		return idDocument;
	}
	public void setIdDocument(String idDocument) {
		this.idDocument = idDocument;
	}
	public String getFirtName() {
		return firtName;
	}
	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirtSurname() {
		return firtSurname;
	}
	public void setFirtSurname(String firtSurname) {
		this.firtSurname = firtSurname;
	}
	public String getLastSurname() {
		return lastSurname;
	}
	public void setLastSurname(String lastSurname) {
		this.lastSurname = lastSurname;
	}
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	@Override
	public String toString() {
		return "AccountQueryAssignetTdcDTO [idClient=" + idClient + ", idDocument=" + idDocument + ", firtName="
				+ firtName + ", lastName=" + lastName + ", firtSurname=" + firtSurname + ", lastSurname=" + lastSurname
				+ ", iban=" + iban + ", account=" + account + ", errorMsg=" + errorMsg + ", bin=" + bin + "]";
	}

	
	
	
	
	
	

}
