package com.aluracursos.desafio_literario.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "autores")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name= "nombre_autor")
    private String Nombre;

    @Column(name= "AnioNacimiento")
    private String nacimeinto;

    @Column(name="anioFallecimiento")
    private String fallecimiento;

    @OneToMany(mappedBy = "autor") // Relación inversa
    private List<Libro> libros = new ArrayList<>();

    public Autor() {
    }

    public Autor(int id, String nombre, String nacimeinto, String fallecimiento) {
        this.id = id;
        Nombre = nombre;
        this.nacimeinto = nacimeinto;
        this.fallecimiento = fallecimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getNacimeinto() {
        return nacimeinto;
    }

    public void setNacimeinto(String nacimeinto) {
        this.nacimeinto = nacimeinto;
    }

    public String getFallecimiento() {
        return fallecimiento;
    }

    public void setFallecimiento(String fallecimiento) {
        this.fallecimiento = fallecimiento;
    }

    @Override
    public String toString() {
        return "Autor" +
                "id=" + id +
                ", Nombre='" + Nombre + '\'' +
                ", nacimeinto='" + nacimeinto + '\'' +
                ", fallecimiento='" + fallecimiento + '\'' ;
    }


}
