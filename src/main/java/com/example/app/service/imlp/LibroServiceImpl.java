package com.example.app.service.imlp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.model.Autor;
import com.example.app.model.Libro;
import com.example.app.repo.LibroRepoInterface;
import com.example.app.service.LibroService;

@Service
public class LibroServiceImpl implements LibroService {
	
	@Autowired
	private LibroRepoInterface repoInterFace;
	@Override
	public List<Libro> getAll() {
		// TODO Auto-generated method stub
		return repoInterFace.findAll();
	}

	@Override
	public Libro save(Libro libro) {
		// TODO Auto-generated method stub
		return repoInterFace.save(libro);
	}

	@Override
	public Boolean deleteById(int id) {
		// TODO Auto-generated method stub
		repoInterFace.deleteById(id);
		return true;
	}
	
	@Override
	public Libro update(Libro libro) {
		// TODO Auto-generated method stub
		return repoInterFace.save(libro);
	}
	
	@Override
	public Libro findById(int id) {
		// TODO Auto-generated method stub
		Optional<Libro> autor = repoInterFace.findById(id);
		if(autor.isPresent()) {
			return autor.get();
		}else {
			return new Libro();
		}
		
	}

}
