package com.aluracursos.desafio_literario.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public record RespuestaApi(
        int count,
        List<LibroDTO> results) {
}
