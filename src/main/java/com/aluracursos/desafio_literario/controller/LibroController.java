package com.aluracursos.desafio_literario.controller;
import com.aluracursos.desafio_literario.model.Libro;
import com.aluracursos.desafio_literario.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class LibroController {

    @Autowired
    private LibroRepository libroService;


}