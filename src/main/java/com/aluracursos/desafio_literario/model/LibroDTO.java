package com.aluracursos.desafio_literario.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record LibroDTO(
        @JsonProperty("title") // Usar @JsonProperty
        String titulo,

        @JsonProperty("authors") // Usar @JsonProperty
        List<AutorDTO> authors,

        @JsonProperty("languages") // Usar @JsonProperty
        List<String> languages,

        @JsonProperty("download_count") // Usar @JsonProperty
        long descargas
        ){ }
