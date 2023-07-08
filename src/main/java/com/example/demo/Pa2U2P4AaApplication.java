package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Habitacion;
import com.example.demo.modelo.Hotel;
import com.example.demo.modelo.dto.EstudianteDTO;
import com.example.demo.modelo.dto.MatriculaDTO;
import com.example.demo.service.IEstudianteService;
import com.example.demo.service.IHabitacionService;
import com.example.demo.service.IHotelService;
import com.example.demo.service.IMatriculaService;
@SpringBootApplication
public class Pa2U2P4AaApplication implements CommandLineRunner{
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private IMatriculaService iMatriculaService;
	
	@Autowired
	private IHotelService hotelService;
	
	@Autowired
	private IHabitacionService habitacionService;
	
	

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		List<EstudianteDTO> estudiantes=this.estudianteService.seleccionarTodosDto();
		
		System.out.println("*************Lista de estudiantes con consulta DTO*************");
		
		for(EstudianteDTO e:estudiantes) {
			System.out.println(e);
		}
		
		List<MatriculaDTO> matriculas=this.iMatriculaService.seleccionarTodosDto();
		System.out.println("*************Lista de matriculas con consulta DTO*************");
		
		for(MatriculaDTO m:matriculas) {
			System.out.println(m);
		}
		
		System.out.println("*************Nombre de hotel*************");
		Hotel h=this.hotelService.buscar(4);
		System.out.println("Nombre de hotel: "+h);
		
		//this.habitacionService.insertar(hab1);
		
		System.out.println("*************Numero de habitaciones*************");
		List<Habitacion> habitaciones=h.getHabitaciones();
		for(Habitacion ha:habitaciones) {
			System.out.println(ha.getNumero());
		}
		

	}
}

