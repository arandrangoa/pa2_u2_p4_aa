package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Automovil;
import com.example.demo.repository.IAutomovilRepo;

@Service
public class AutomovilServiceImpl implements IAutomovilService{

	
	@Autowired
	private IAutomovilRepo automovilRepo;
	
	@Override
	public void insertar(Automovil automovil) {
		// TODO Auto-generated method stub
		this.automovilRepo.insertar(automovil);
	}

	@Override
	public void actualizar(Automovil automovil) {
		// TODO Auto-generated method stub
		this.automovilRepo.actualizar(automovil);
	}

	@Override
	public Automovil buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.automovilRepo.eliminar(id);
	}

	@Override
	public Automovil seleccionarPorPlaca(String placa) {
		// TODO Auto-generated method stub
		return this.automovilRepo.seleccionarPorPlaca(placa);
	}

	@Override
	public List<Automovil> seleccionarListaPorMarca(String marca) {
		// TODO Auto-generated method stub
		return this.automovilRepo.seleccionarListaPorMarca(marca);
	}

	@Override
	public Automovil seleccionarPorModeloTyped(String modelo) {
		// TODO Auto-generated method stub
		return this.automovilRepo.seleccionarPorModeloTyped(modelo);
	}

	@Override
	public List<Automovil> seleccionarListaPorModeloTyped(String modelo) {
		// TODO Auto-generated method stub
		return this.automovilRepo.seleccionarListaPorModeloTyped(modelo);
	}

}
