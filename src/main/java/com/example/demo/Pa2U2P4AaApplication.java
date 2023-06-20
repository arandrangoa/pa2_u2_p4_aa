package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Autor;
import com.example.demo.modelo.Libro;
import com.example.demo.service.IAutorService;
import com.example.demo.service.ILibroService;

@SpringBootApplication
public class Pa2U2P4AaApplication implements CommandLineRunner{
	
	@Autowired
	private IAutorService autorService;
	
	

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Libro l1=new Libro();
		
		Libro l2=new Libro();
		
		Set<Libro> libros=new HashSet<>();
		libros.add(l2);
		libros.add(l1);
		
		Set<Autor> autores=new HashSet<>();
		
		
		
		Autor autor1=new Autor();
		autor1.setApellido("Muzo");
		autor1.setNombre("Belen");
		autor1.setLibros(libros);
		
		autores.add(autor1);
		
		l1.setAutores(autores);
		
		this.autorService.agregar(autor1);

	}

}
