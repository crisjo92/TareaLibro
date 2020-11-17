package com.example.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "libro")
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idLibro;
	
	@Column(name ="titulo", nullable = false, length = 70)
	private String titulo;
	
	@Column(name = "editorial", nullable = false, length = 70)
	private String editorial;
		
	@ManyToOne
	@JoinColumn(name ="id_autor", nullable = false, foreignKey = @ForeignKey(name = "FK_libro_autor"))
	private Autor autor;

	@Override
	public String toString() {
		return "Libro [idLibro=" + idLibro + ", titulo=" + titulo + ", editorial=" + editorial + ", autor=" + autor
				+ "]";
	}

	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Libro(Integer idLibro, String titulo, String editorial, Autor autor) {
		super();
		this.idLibro = idLibro;
		this.titulo = titulo;
		this.editorial = editorial;
		this.autor = autor;
	}

	public Integer getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(Integer idLibro) {
		this.idLibro = idLibro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
}
