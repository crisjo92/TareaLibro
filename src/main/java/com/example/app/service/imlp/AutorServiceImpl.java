package com.example.app.service.imlp;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.app.model.Autor;
import com.example.app.repo.AutorRepoInterface;
import com.example.app.service.AutorService;

@Service
public class AutorServiceImpl implements AutorService {
	
	@Autowired
	private AutorRepoInterface repoInterFace;
	
	@Override
	public List<Autor> getAll() {
		// TODO Auto-generated method stub
		return repoInterFace.findAll();
	}
	
	@Override
	public Autor save(Autor autor) {
		// TODO Auto-generated method stub
		return repoInterFace.save(autor);
	}

	@Override
	public Boolean deleteById(int id) {
		// TODO Auto-generated method stub
		repoInterFace.deleteById(id);
		return true;
	}
	
	@Override
	public Autor update(Autor autor) {
		// TODO Auto-generated method stub
		return repoInterFace.save(autor);
	}
	
	@Override
	public Autor findById(int id) {
		// TODO Auto-generated method stub
		Optional<Autor> autor = repoInterFace.findById(id);
		if(autor.isPresent()) {
			return autor.get();
		}else {
			return new Autor();
		}
		
	}
	
	
}
