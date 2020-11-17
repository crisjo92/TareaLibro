package com.example.app.service;

import java.util.List;

import com.example.app.model.Libro;

public interface LibroService {

	List<Libro> getAll();
	
	Libro save(Libro libro);
	
	Boolean deleteById(int id);
	
	Libro update(Libro libro);
	
	Libro findById(int id);
}
