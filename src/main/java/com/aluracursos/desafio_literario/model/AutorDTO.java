package com.aluracursos.desafio_literario.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;

@JsonIgnoreProperties(ignoreUnknown = true)
public record AutorDTO(

                @JsonAlias("name")
                String Nombre,

                @JsonAlias("birth_year")
                String nacimeinto,

                @JsonAlias("death_year")
                String fallecimiento) {
}
