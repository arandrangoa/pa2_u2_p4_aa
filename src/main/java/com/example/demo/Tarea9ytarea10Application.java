package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Vehiculo;
import com.example.demo.service.IVehiculoService;

@SpringBootApplication
public class Tarea9ytarea10Application implements CommandLineRunner{
	
	@Autowired
	private IVehiculoService iVehiculoService;

	public static void main(String[] args) {
		SpringApplication.run(Tarea9ytarea10Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Vehiculo v=new Vehiculo();
		v.setColor("Rojo");
		v.setFechaFabricacion(LocalDate.ofYearDay(2022, 18));
		v.setMarca("Chevrolet");
		v.setModelo("Cerato");
		v.setPlaca("PCX400");
		v.setTipo("Liviano");
		v.setValorMatricula(new BigDecimal(160));
		
		//this.iVehiculoService.agregar(v);
		
		int numeroEliminados=this.iVehiculoService.eliminarPorMarca("Chevrolet");
		System.out.println("El numero de eliminados marca Chevrolet son: "+numeroEliminados);
		
		int numeroActualizados=this.iVehiculoService.actualizarPorMarcaElColor("Blanco","Toyota");
		System.out.println("El numero de actualizados el color por marca es: "+numeroActualizados);
		
		
	}

}
