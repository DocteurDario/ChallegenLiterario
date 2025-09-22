package com.aluracursos.desafio_literario.service;

import com.aluracursos.desafio_literario.model.Libro;
import com.aluracursos.desafio_literario.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LibroServicio {
    private final LibroRepository libroRepository;

    public LibroServicio(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }
    public List<Libro> traerLibros() {
        return libroRepository.findAll(); // 🔹 va a la base y trae todos los registros
    }

}
