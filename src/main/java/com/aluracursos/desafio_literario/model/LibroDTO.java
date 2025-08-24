package com.aluracursos.desafio_literario.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record LibroDTO(
        @JsonAlias("title")
        String titulo,
        @JsonAlias("authors")
        List<AutorDTO> authors, // lista de autores
        @JsonAlias("languages")
        List<String> languages, // lista de idiomas
        @JsonAlias("download_count")
        long descargas  ){
}
