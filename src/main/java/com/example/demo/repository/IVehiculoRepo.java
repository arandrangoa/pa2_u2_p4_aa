package com.example.demo.repository;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.modelo.Concesionario;
import com.example.demo.modelo.Vehiculo;

public interface IVehiculoRepo {
	
	public void insertar(Vehiculo vehiculo);
	
	public int eliminarPorMarca(String marca);
	
	public int actualizarPorMarcaElColor(String color, String marca);

	public Vehiculo seleccionarVehiculoPorFechaColorPlaca(LocalDate fechaFabricacion,String color, String placa);
	
	public List<Vehiculo> seleccionarInnerJoin();
	
	public List<Vehiculo> seleccionarOuterRightJoin();
	
	public List<Vehiculo> seleccionarOuterLeftJoin();
	
	public List<Vehiculo> seleccionarFullOuterJoin();
	
	public List<Vehiculo> seleccionarWhereJoin();
	
}
