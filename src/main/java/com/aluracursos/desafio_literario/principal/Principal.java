package com.aluracursos.desafio_literario.principal;

import com.aluracursos.desafio_literario.model.*;
import com.aluracursos.desafio_literario.repository.AutorRepository;
import com.aluracursos.desafio_literario.repository.LibroRepository;
import com.aluracursos.desafio_literario.service.ConsumoAPI;
import com.aluracursos.desafio_literario.service.ConvierteDatos;
import com.aluracursos.desafio_literario.service.IConvierteDatos;
import org.aspectj.apache.bcel.util.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.text.html.parser.Parser;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private final AutorRepository autorRepository;
    private Scanner teclado = new Scanner(System.in);

    private ConsumoAPI consumoAPI = new ConsumoAPI();

    private final String url_Base = "https://gutendex.com/books/?search=";

    private IConvierteDatos conversor = new ConvierteDatos();

    private String nombreLibro;

    private List<LibroDTO> libroDTO = new ArrayList<>();

    private List<Libro> libro = new ArrayList<>();

    private String json ;
    private int opcion;

    private Boolean salir = Boolean.FALSE;


    private LibroRepository librorepository  ;

    public Principal(LibroRepository repository, AutorRepository autorRepository) {
        this.librorepository = repository;
        this.autorRepository= autorRepository;
    }

    public void menuPrincipal() throws Exception {
        //String url ="don+quijote";
        //var json = consumoAPI.obtenerDatos(url_Base );
        menu();
        opcionElegida();

        //System.out.println(json);
        System.out.println("Fin");
    }

    public void opcionElegida() throws Exception {
        while(!salir){
            opcion = Integer.parseInt(teclado.nextLine());
            switch(opcion){
                case 1: busquedaDeLibroPorTítulo();
                    break;
                case 2: listaDeTodosLosLibros();
                    break;
                case 3: listaDeAutores();
                    break;
                case 4: listarAutoresVivosEnDeterminadoAnio();
                    break;
                case 5: salir= Boolean.TRUE;
                    break;
                default:
                    break;
            }
        }

    }

    private void listarAutoresVivosEnDeterminadoAnio() throws Exception {


    }

    private void listaDeAutores() {
    }

    private void listaDeTodosLosLibros() {
    }

    private void busquedaDeLibroPorTítulo() {
        System.out.println("Escribe el nombre del Libro que deseas buscar");
        var nombreLibro = teclado.nextLine();
        String url_completa = (url_Base + nombreLibro.replace(" ", "+"));
        var json = consumoAPI.obtenerDatos(url_completa );

        try {
            LibroDTO libroDATO = conversor.obtenerDatos(json,LibroDTO.class);
            RespuestaApi respuesta = conversor.obtenerDatos(json, RespuestaApi.class);

            LibroDTO  libroDTOAux ;
            AutorDTO autorDTO;
            libroDTOAux = respuesta.results().get(0);
            autorDTO = respuesta.results().get(0).authors().get(0);

            Libro libro =new Libro();
            Autor autor = new Autor();

            libro.setTitulo(libroDTOAux.titulo());

            autor.setNombre(autorDTO.nombre());
            autor.setNacimeinto(String.valueOf(autorDTO.nacimiento()));
            autor.setFallecimiento(String.valueOf((autorDTO.fallecimiento())));
            libro.setAutor(autor);

            libro.setDescargas(libroDTOAux.descargas());
            libro.setIdiona(String.valueOf(libroDTOAux.languages().get(0)));

            System.out.println(libro);

            autorRepository.save(autor);
            librorepository.save(libro);

        } catch (Exception e){
            System.out.println(e);
        }




    }

    public void menu() {
        System.out.println(
                        """ 
                        Menu del Programa 
                        1) Búsqueda de libro por título "+
                        2) Lista de todos los libros" +
                        3) Lista de autores" +
                        4) Listar autores vivos en determinado año" +
                        5) Salir 
                        """
        );
    }
}
