package com.example.app.service;

import java.util.List;

import com.example.app.model.Autor;
import com.example.app.model.Libro;

public interface AutorService {

	List<Autor> getAll();
	
	Autor save(Autor autor);
	
	Boolean deleteById(int id);
	
	Autor update(Autor autor);
	
	Autor findById(int id);
}
