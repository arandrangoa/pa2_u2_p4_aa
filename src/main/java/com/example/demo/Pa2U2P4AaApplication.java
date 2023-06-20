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
	private IHotelService hotelService;
	

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		

		
		
		Hotel hotel=new Hotel();
		hotel.setDireccion("Av.Amazonas");
		hotel.setNombre("Trivago");
		
		Habitacion hab1=new Habitacion();
		hab1.setNumero("A1");
		hab1.setValor(new BigDecimal(50));
		hab1.setHotel(hotel);
		Habitacion hab2=new Habitacion();
		hab2.setNumero("A2");
		hab2.setValor(new BigDecimal(40));
		hab2.setHotel(hotel);
		
		List<Habitacion> habitaciones=new ArrayList<>();
		habitaciones.add(hab1);
		habitaciones.add(hab2);
		
		hotel.setHabitaciones(habitaciones);
		
		this.hotelService.insertar(hotel);
		
		

	
	
	
	
	}

}
