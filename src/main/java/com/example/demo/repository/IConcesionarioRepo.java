package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Concesionario;

public interface IConcesionarioRepo {
	
	public void insertar(Concesionario concesionario);
	
	public List<Concesionario> seleccionarInnerJoin();
	
	public List<Concesionario> seleccionarOuterRightJoin();
	
	public List<Concesionario> seleccionarOuterLeftJoin();
	
	public List<Concesionario> seleccionarFullOuterJoin();
	
	public List<Concesionario> seleccionarWhereJoin();

}
