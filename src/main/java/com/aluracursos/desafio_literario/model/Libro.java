package com.aluracursos.desafio_literario.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="libros")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="titulo", unique = true)
    private String titulo;

    @ManyToOne
    @JoinColumn(name="autor_id")
    private Autor autor;

    private String idiona;

    private long descargas;

    public Libro() {
    }

    public Libro(int id, String titulo, Autor autor, String idiona, long descargas) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.idiona = idiona;
        this.descargas = descargas;
    }

    public Libro(LibroDTO libroDTO) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.idiona = idiona;
        this.descargas = descargas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getIdiona() {
        return idiona;
    }

    public void setIdiona(String idiona) {
        this.idiona = idiona;
    }

    public long getDescargas() {
        return descargas;
    }

    public void setDescargas(long descargas) {
        this.descargas = descargas;
    }

    @Override
    public String toString() {
        return "Libro" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", idiona='" + idiona + '\'' +
                ", descargas=" + descargas ;
    }
}
