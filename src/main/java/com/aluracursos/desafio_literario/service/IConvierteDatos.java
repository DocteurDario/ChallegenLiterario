package com.aluracursos.desafio_literario.service;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public interface IConvierteDatos  {
    <T> T obtenerDatos(String json, Class<T> clase)  throws JsonProcessingException;
}