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
	
		
		//this.automovilService.insertar(a1);
	
		System.out.println("///////////////Buscar por Apellido Named Query////////////////");
		Estudiante estu1 = this.estudianteService.seleccionarPorApellidoNamedQuery("Mullo");
		System.out.println(estu1);
		
		System.out.println("///////////////Buscar por Apellido Native Query////////////////");
		Estudiante estu2 = this.estudianteService.seleccionarPorApellidoNativeQuery("Mullo");
		System.out.println(estu2);
		
		System.out.println("///////////////Buscar por Apellido Named Native Query////////////////");
		Estudiante estu3 = this.estudianteService.seleccionarPorApellidoNativeQueryNamed("Mullo");
		System.out.println(estu3);
		
		System.out.println("///////////////Buscar por Nombre Named Query////////////////");
		Estudiante estu4 = this.estudianteService.buscarPorNombreNamed("Belen");
		System.out.println(estu4);
		
		System.out.println("///////////////Buscar por Nombre Named Native Query////////////////");
		Estudiante estu5 = this.estudianteService.seleccionarPorNombreNativeQueryNamed("Belen");
		System.out.println(estu5);
		
		
		
		
		}
		

	}


