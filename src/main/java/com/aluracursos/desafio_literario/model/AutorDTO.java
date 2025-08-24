package com.aluracursos.desafio_literario.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;

@JsonIgnoreProperties(ignoreUnknown = true)
public record AutorDTO(
        @JsonProperty("name")
        String nombre, // en minúscula

        @JsonProperty("birth_year")
        Integer nacimiento, // como número y corregido

        @JsonProperty("death_year")
        Integer fallecimiento // como número
){
}
