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
	
		Estudiante e=new Estudiante();
		e.setApellido("Santos");
		e.setCedula("9874963125");
		e.setNombre("Neymar");
		e.setPeso(120.0);
		
		//this.estudianteService.agregar(e);
		
		
		Estudiante bus=this.estudianteService.seleccionarEstudianteDinamico("Sebas", "Arboleda", 100.0);
		System.out.println(bus);
		
		int numeroElminados=this.estudianteService.eliminarPorNombre("Neymar");
		System.out.println("El numero de elminados es: "+numeroElminados);
		
		
		int numeroActualizados=this.estudianteService.actualizarPorApellido("Jaime", "Rodriguez");
		System.out.println("El numero de actualizados es: "+numeroActualizados);
		
		}
		

	}


