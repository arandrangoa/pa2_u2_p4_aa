package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Autor;
import com.example.demo.modelo.Ciudadano;
import com.example.demo.modelo.Empleado;
import com.example.demo.modelo.Habitacion;
import com.example.demo.modelo.Hotel;
import com.example.demo.modelo.Libro;
import com.example.demo.service.CiudadanoService;
import com.example.demo.service.EmpleadoService;
import com.example.demo.service.IAutorService;
import com.example.demo.service.IHotelService;
import com.example.demo.service.ILibroService;

@SpringBootApplication
public class Pa2U2P4AaApplication implements CommandLineRunner{
	
	@Autowired
	private ILibroService iLibroService;
	

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Set<Libro> libros=new HashSet<>();
		
		
		Libro l1=new Libro();
		l1.setEditorial("Dilipa");
		l1.setTitulo("Dejame que te cuente");
		
		libros.add(l1);
		
		Autor a1=new Autor();
		a1.setNombre("Alex");
		a1.setApellido("Andrango");
		a1.setLibros(libros);
		
		Autor a2=new Autor();
		a2.setApellido("Muzo");
		a2.setNombre("Belen");
		a2.setLibros(libros);
		
		Set<Autor> autores=new HashSet<>();
		autores.add(a1);
		autores.add(a2);
		l1.setAutores(autores);
		
		
	
		this.iLibroService.agregar(l1);
		
		
		

	
	
	
	
	}

}
