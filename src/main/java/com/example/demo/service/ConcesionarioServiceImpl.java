package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Concesionario;
import com.example.demo.repository.IConcesionarioRepo;

@Service
public class ConcesionarioServiceImpl implements IConcesionarioService{

	@Autowired
	private IConcesionarioRepo concesionarioRepo;
	
	@Override
	public void insertar(Concesionario concesionario) {
		// TODO Auto-generated method stub
		this.concesionarioRepo.insertar(concesionario);
	}

	@Override
	public List<Concesionario> seleccionarInnerJoin() {
		// TODO Auto-generated method stub
		return this.concesionarioRepo.seleccionarInnerJoin();
	}

	@Override
	public List<Concesionario> seleccionarOuterRightJoin() {
		// TODO Auto-generated method stub
		return this.concesionarioRepo.seleccionarOuterRightJoin();
	}

	@Override
	public List<Concesionario> seleccionarOuterLeftJoin() {
		// TODO Auto-generated method stub
		return this.concesionarioRepo.seleccionarOuterLeftJoin();
	}

	@Override
	public List<Concesionario> seleccionarFullOuterJoin() {
		// TODO Auto-generated method stub
		return this.concesionarioRepo.seleccionarFullOuterJoin();
	}

	@Override
	public List<Concesionario> seleccionarWhereJoin() {
		// TODO Auto-generated method stub
		return this.concesionarioRepo.seleccionarWhereJoin();
	}

}
