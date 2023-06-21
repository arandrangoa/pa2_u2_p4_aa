package com.example.demo;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Alumno;
import com.example.demo.modelo.Autor;
import com.example.demo.modelo.Libro;
import com.example.demo.modelo.Materia;
import com.example.demo.modelo.Matricula;
import com.example.demo.service.IAutorService;
import com.example.demo.service.ILibroService;
import com.example.demo.service.IMatriculaService;

@SpringBootApplication
public class Pa2U2P4AaApplication implements CommandLineRunner{
	
	@Autowired
	private IMatriculaService iMatriculaService;
	
	

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Alumno a1=new Alumno();
		a1.setNombre("Alex");
		
		Materia m1=new Materia();
		m1.setNombre("Programacion Avanzada");
		
		
		Matricula matri=new Matricula();
		matri.setFechaMatricula(LocalDateTime.now());
		matri.setAlumno(a1);
		matri.setMateria(m1);
		matri.setNumero("M1");
		
		
		this.iMatriculaService.insertar(matri);

	}

}
