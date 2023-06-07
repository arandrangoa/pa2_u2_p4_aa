package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

@SpringBootApplication
public class Pa2U2P4AaApplication implements CommandLineRunner{
	
	@Autowired
	private IEstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Estudiante estu=new Estudiante();
		estu.setApellido("Alex");
		estu.setCedula("1727193847");
		estu.setNombre("Alex");
		
		this.estudianteService.agregar(estu);

	}

}
