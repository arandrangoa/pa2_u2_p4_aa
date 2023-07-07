package com.example.demo.service;

import java.time.LocalDate;

import com.example.demo.modelo.Vehiculo;

public interface IVehiculoService {
	
	public void agregar(Vehiculo vehiculo);
	
	public int eliminarPorMarca(String marca);
	
	public int actualizarPorMarcaElColor(String color, String marca);

	public Vehiculo seleccionarVehiculoPorFechaColorPlaca(LocalDate fechaFabricacion,String color, String placa);
	
	
}
