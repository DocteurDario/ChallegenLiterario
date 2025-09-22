package com.aluracursos.desafio_literario;

import com.aluracursos.desafio_literario.principal.Principal;
import com.aluracursos.desafio_literario.repository.AutorRepository;
import com.aluracursos.desafio_literario.repository.LibroRepository;
import com.aluracursos.desafio_literario.service.LibroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioLiterarioApplication implements CommandLineRunner {

	@Autowired //es una notacion para indicarle a Spring que debe inyectar dependencias
	private LibroRepository repository;

	@Autowired //es una notacion para indicarle a Spring que debe inyectar dependencias
	private AutorRepository  autorRepository;

	private final LibroServicio libroService;

    public DesafioLiterarioApplication(LibroServicio libroService) {
        this.libroService = libroService;
    }

    public static void main(String[] args) {
		SpringApplication.run(DesafioLiterarioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repository,autorRepository,libroService);
		System.out.println("DB_HOST: " + System.getenv("DB_HOST"));
//		System.out.println("DB_NAME: " + System.getenv("DB_NAME"));
//		System.out.println("DB_USER: " + System.getenv("DB_USER"));
//		System.out.println("DB_PASSWORD: " + System.getenv("DB_PASSWORD"));
		principal.menuPrincipal();
	}
}
