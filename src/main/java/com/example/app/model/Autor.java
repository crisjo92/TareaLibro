package com.example.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "autor")
public class Autor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAutor;
	
	@Column(name ="nombres", nullable = false, length = 100)
	private String nombres;
	
	@Column(name = "apellidos", nullable = false, length = 100)
	private String apellidos;
	
	@Column(name = "email", nullable = false, length = 60)
	private String email;

	public Autor(Integer idAutor, String nombres, String apellidos, String email) {
		super();
		this.idAutor = idAutor;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Autor [idAutor=" + idAutor + ", nombres=" + nombres + ", apellidos=" + apellidos + ", email=" + email
				+ "]";
	}

	public Autor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(Integer idAutor) {
		this.idAutor = idAutor;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
