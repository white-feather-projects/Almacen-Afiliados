package com.cbp.web.dto;

public class AccessUserDTO {

	private String user;
	private String name;
	private String surname;
	private String access;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getAccess() {
		return access;
	}
	public void setAccess(String access) {
		this.access = access;
	}
	public AccessUserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AccessUserDTO [user=" + user + ", name=" + name + ", surname=" + surname + ", access=" + access + "]";
	}
	public AccessUserDTO(String user, String name, String surname, String access) {
		super();
		this.user = user;
		this.name = name;
		this.surname = surname;
		this.access = access;
	}
	
	

}
