package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Concesionario;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.service.IConcesionarioService;
import com.example.demo.service.IVehiculoService;

@SpringBootApplication
public class Tarea9ytarea10Application implements CommandLineRunner{
	
	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Autowired
	private IConcesionarioService concesionarioService;

	public static void main(String[] args) {
		SpringApplication.run(Tarea9ytarea10Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("***************1-SELECCIONAR INNER JOIN********************");
		
		List<Concesionario> listaConce1=this.concesionarioService.seleccionarInnerJoin();
		for(Concesionario c:listaConce1) {
			System.out.println(c);
		}
		
		System.out.println("***************2-SELECCIONAR INNER JOIN********************");
		List<Vehiculo> listaVehi1=this.iVehiculoService.seleccionarInnerJoin();
		for(Vehiculo v:listaVehi1) {
			System.out.println(v);
		}
		
		System.out.println("***************1-SELECCIONAR OUTER RIGTH JOIN********************");
		List<Concesionario> listaConce2=this.concesionarioService.seleccionarOuterRightJoin();
		for(Concesionario c:listaConce2) {
			System.out.println(c);
		}
		System.out.println("***************2-SELECCIONAR OUTER RIGTH JOIN********************");
		List<Vehiculo> listaVehi2=this.iVehiculoService.seleccionarOuterRightJoin();
		for(Vehiculo v:listaVehi2) {
			System.out.println(v);
		}
		
		System.out.println("***************1-SELECCIONAR OUTER LEFT JOIN********************");
		List<Concesionario> listaConce3=this.concesionarioService.seleccionarOuterLeftJoin();
		for(Concesionario c:listaConce3) {
			System.out.println(c);
		}
		System.out.println("***************2-SELECCIONAR OUTER LEFT JOIN********************");
		List<Vehiculo> listaVehi3=this.iVehiculoService.seleccionarOuterLeftJoin();
		for(Vehiculo v:listaVehi3) {
			System.out.println(v);
		}
		
		System.out.println("***************1-SELECCIONAR OUTER FULL JOIN********************");
		List<Concesionario> listaConce4=this.concesionarioService.seleccionarFullOuterJoin();
		for(Concesionario c:listaConce4) {
			System.out.println(c);
		}
		System.out.println("***************2-SELECCIONAR OUTER FULL JOIN********************");
		List<Vehiculo> listaVehi4=this.iVehiculoService.seleccionarFullOuterJoin();
		for(Vehiculo v:listaVehi4) {
			System.out.println(v);
		}
		
		System.out.println("***************1-SELECCIONAR WHERE JOIN********************");
		List<Concesionario> listaConce5=this.concesionarioService.seleccionarWhereJoin();
		for(Concesionario c:listaConce5) {
			System.out.println(c);
		}
		System.out.println("***************2-SELECCIONAR WHERE JOIN********************");
		List<Vehiculo> listaVehi5=this.iVehiculoService.seleccionarWhereJoin();
		for(Vehiculo v:listaVehi5) {
			System.out.println(v);
		}
		
		System.out.println("***************1-SELECCIONAR FETCH JOIN********************");
		List<Concesionario> listaConce6=this.concesionarioService.seleccionarFetchJoin();
		for(Concesionario c:listaConce6) {
			System.out.println(c);
		}
		System.out.println("***************2-SELECCIONAR FETCH JOIN********************");
		List<Vehiculo> listaVehi7=this.iVehiculoService.seleccionarFetchJoin();
		for(Vehiculo v:listaVehi7) {
			System.out.println(v);
		}
		


	}

}
