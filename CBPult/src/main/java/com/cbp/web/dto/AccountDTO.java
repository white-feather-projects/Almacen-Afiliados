package com.cbp.web.dto;

public class AccountDTO {
	private String officeId;
	private String accountType;
	private String clientDocumentId;
    private String accountIban;
    private String accountNumber;
    private String accountStatus;
    private ClientDTO clientDTO;
	
	
	public String getOfficeId() {
		return officeId;
	}
	public void setOfficeId(String officeId) {
		this.officeId = officeId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getClientDocumentId() {
		return clientDocumentId;
	}
	public void setClientDocumentId(String clientDocumentId) {
		this.clientDocumentId = clientDocumentId;
	}
	public String getAccountIban() {
		return accountIban;
	}
	public void setAccountIban(String accountIban) {
		this.accountIban = accountIban;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public ClientDTO getClientDTO() {
		return clientDTO;
	}
	public void setClientDTO(ClientDTO clientDTO) {
		this.clientDTO = clientDTO;
	}
}
