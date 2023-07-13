package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Concesionario;

public interface IConcesionarioService {
	
	public void insertar(Concesionario concesionario);

	
	public List<Concesionario> seleccionarInnerJoin();
	
	public List<Concesionario> seleccionarOuterRightJoin();
	
	public List<Concesionario> seleccionarOuterLeftJoin();
	
	public List<Concesionario> seleccionarFullOuterJoin();
	
	public List<Concesionario> seleccionarWhereJoin();

}
