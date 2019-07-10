package com.cbp.web.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="usersC")
public class LoginUsers {
	
	@Id //llave primaria
	@GeneratedValue(strategy=GenerationType.IDENTITY) // llave auto increment
	private Long id;

	private String users;

	private String password;
	
	private String nombre ;

	private String apellido ;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public LoginUsers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginUsers(Long id, String users, String password, String nombre, String apellido) {
		super();
		this.id = id;
		this.users = users;
		this.password = password;
		this.nombre = nombre;
		this.apellido = apellido;
	}


}
