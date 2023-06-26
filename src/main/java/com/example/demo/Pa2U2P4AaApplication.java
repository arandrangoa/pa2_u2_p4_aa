package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Automovil;
import com.example.demo.modelo.Estudiante;
import com.example.demo.service.IAutomovilService;
import com.example.demo.service.IEstudianteService;

@SpringBootApplication
public class Pa2U2P4AaApplication implements CommandLineRunner{
	
	@Autowired
	private IAutomovilService automovilService;
	
	

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Automovil a1 = new Automovil();
		a1.setAnioDeFabricacion("2021");
		a1.setMarca("Chevrolet");
		a1.setModelo("Camaro");
		a1.setPlaca("LBB725");
		
		//this.automovilService.insertar(a1);
	
		System.out.println("///////////////Ejemplo de Query con single result////////////////");
		Automovil auto = this.automovilService.seleccionarPorPlaca("TCX900");	
		System.out.println(auto);
		
		
		System.out.println("////////////////Ejemplo de Query con result list///////////////");
		List<Automovil> autos = this.automovilService.seleccionarListaPorMarca("Chevrolet");
		
		for(Automovil au: autos) {
			System.out.println(au);
		}
		
		
		System.out.println("///////////////////Ejemplo de TypedQuery con single result////////");
		Automovil auto2 = this.automovilService.seleccionarPorModeloTyped("Sail");
		System.out.println(auto2);
		
		
		System.out.println("///////////////Ejemplo de TypedQuery con result list////////////////");
		List<Automovil> autos2 = this.automovilService.seleccionarListaPorModeloTyped("Camaro");
		
		for(Automovil au2: autos2) {
			System.out.println(au2);
		}
		

	}

}
