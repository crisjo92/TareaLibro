package com.example.app.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


import com.example.app.exception.Excepciones;
import com.example.app.model.Libro;
import com.example.app.service.LibroService;

public class LibroController {

	@Autowired
	private LibroService  libroService;
	
	@GetMapping("/libro")
	public @ResponseBody List<Libro> getAll(){
		return libroService.getAll();
	}
	
	@PostMapping("/libro")
	public @ResponseBody Libro save( @RequestBody Libro libro) {
		return libroService.save(libro);
	}


	@DeleteMapping("/libro/{id}")
	public @ResponseBody ResponseEntity<Object>  deleteById( @PathVariable int id) {
				
		Libro libro1 = libroService.findById(id);
		if (libro1.getIdLibro() == null) {
			throw new Excepciones("Libro " + id + "No encontrado");
		}
		libroService.deleteById(id);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	@PutMapping("/libro")
	public ResponseEntity<Libro> modificar( @RequestBody Libro libro) {
		Libro libro1 = libroService.update(libro);
		return new ResponseEntity<Libro>(libro1, HttpStatus.OK);
	}
	
	
	
	
}
