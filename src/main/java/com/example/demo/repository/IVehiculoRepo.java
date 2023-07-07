package com.example.demo.repository;

import java.time.LocalDate;

import com.example.demo.modelo.Vehiculo;

public interface IVehiculoRepo {
	
	public void insertar(Vehiculo vehiculo);
	
	public int eliminarPorMarca(String marca);
	
	public int actualizarPorMarcaElColor(String color, String marca);

	public Vehiculo seleccionarVehiculoPorFechaColorPlaca(LocalDate fechaFabricacion,String color, String placa);
	
}
