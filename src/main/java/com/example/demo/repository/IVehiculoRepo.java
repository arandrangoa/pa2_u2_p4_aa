package com.example.demo.repository;

import com.example.demo.modelo.Vehiculo;

public interface IVehiculoRepo {
	
	public void insertar(Vehiculo vehiculo);
	
	public int eliminarPorMarca(String marca);
	
	public int actualizarPorMarcaElColor(String color, String marca);

}
