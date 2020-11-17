package com.example.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.app.model.Libro;
@Repository
public interface LibroRepoInterface extends JpaRepository<Libro, Integer> {

}
