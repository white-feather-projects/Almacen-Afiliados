package com.cbp.web.dto;

public class DataLoginDTO {
	
	private String users;
	private String password;
	private String nombre;
	private String apellido;
	public String getUsers() {
		return users;
	}
	public void setUsers(String users) {
		this.users = users;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public DataLoginDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DataLoginDTO(String users, String password, String nombre, String apellido) {
		super();
		this.users = users;
		this.password = password;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	@Override
	public String toString() {
		return "DataLoginDTO [users=" + users + ", password=" + password + ", nombre=" + nombre + ", apellido="
				+ apellido + "]";
	}
	
	
	
	

}
