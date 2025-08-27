package com.aluracursos.desafio_literario.repository;

import com.aluracursos.desafio_literario.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {
}
