package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Automovil;

public interface IAutomovilService {
	
	public void insertar(Automovil automovil);
	
	public void actualizar(Automovil automovil);
	
	public Automovil buscar(Integer id);
	
	public void eliminar(Integer id);
	
	public Automovil seleccionarPorPlaca(String placa);
	
	
	public List<Automovil> seleccionarListaPorMarca(String marca);

	
	public Automovil seleccionarPorModeloTyped(String modelo);
	
	
	public List<Automovil> seleccionarListaPorModeloTyped(String modelo);
	

}
