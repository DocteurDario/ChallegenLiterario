package com.aluracursos.desafio_literario;

import com.aluracursos.desafio_literario.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioLiterarioApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesafioLiterarioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();

		principal.menuPrincipal();

	}
}
