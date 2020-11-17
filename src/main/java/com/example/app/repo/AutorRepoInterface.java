package com.example.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.app.model.Autor;
@Repository
public interface AutorRepoInterface extends JpaRepository<Autor, Integer>{

}
