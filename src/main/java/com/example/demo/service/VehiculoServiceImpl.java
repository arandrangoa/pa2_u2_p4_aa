package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Vehiculo;
import com.example.demo.repository.IVehiculoRepo;

@Service
public class VehiculoServiceImpl implements IVehiculoService{
	
	@Autowired
	private IVehiculoRepo iVehiculoRepo;

	@Override
	public void agregar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.iVehiculoRepo.insertar(vehiculo);
	}

	@Override
	public int eliminarPorMarca(String marca) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.eliminarPorMarca(marca);
	}

	@Override
	public int actualizarPorMarcaElColor(String color, String marca) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.actualizarPorMarcaElColor(color, marca);
	}

	@Override
	public Vehiculo seleccionarVehiculoPorFechaColorPlaca(LocalDate fechaFabricacion, String color, String placa) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.seleccionarVehiculoPorFechaColorPlaca(fechaFabricacion, color, placa);
	}

	@Override
	public List<Vehiculo> seleccionarInnerJoin() {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.seleccionarInnerJoin();
	}

	@Override
	public List<Vehiculo> seleccionarOuterRightJoin() {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.seleccionarOuterRightJoin();
	}

	@Override
	public List<Vehiculo> seleccionarOuterLeftJoin() {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.seleccionarOuterLeftJoin();
	}

	@Override
	public List<Vehiculo> seleccionarFullOuterJoin() {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.seleccionarFullOuterJoin();
	}

	@Override
	public List<Vehiculo> seleccionarWhereJoin() {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.seleccionarWhereJoin();
	}

	@Override
	public List<Vehiculo> seleccionarFetchJoin() {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.seleccionarFetchJoin();
	}

}
