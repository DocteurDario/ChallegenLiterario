package com.aluracursos.desafio_literario.service;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
