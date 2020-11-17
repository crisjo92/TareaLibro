package com.example.app.controller;

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
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.example.app.service.AutorService;
import com.example.app.exception.Excepciones;
import com.example.app.model.Autor;

@RestController
public class AutorController {

	@Autowired
	private AutorService  autorService;
	
	@GetMapping("/autor")
	public @ResponseBody List<Autor> getAll(){
		return autorService.getAll();
	}
	
	@PostMapping("/autor")
	public @ResponseBody Autor save( @RequestBody Autor autor) {
		return autorService.save(autor);
	}


	@DeleteMapping("/autor/{id}")
	public @ResponseBody ResponseEntity<Object>   deleteById( @PathVariable int id) {
		autorService.deleteById(id);
		
		Autor autor1 = autorService.findById(id);
		if (autor1.getIdAutor() == null) {
			throw new Excepciones("Libro " + id + "No encontrado");
		}
		autorService.deleteById(id);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	@PutMapping("/autor")
	public ResponseEntity<Autor> modificar( @RequestBody Autor autor) {
		Autor autor1 = autorService.update(autor);
		return new ResponseEntity<Autor>(autor1, HttpStatus.OK);
	}
	
}
