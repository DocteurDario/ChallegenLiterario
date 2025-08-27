package com.aluracursos.desafio_literario.repository;

import com.aluracursos.desafio_literario.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {

}
