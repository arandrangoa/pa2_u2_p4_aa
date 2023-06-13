package com.example.demo.service;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteService {
	
	public void agregar(Estudiante estudiante);
	
	public void modificar(Estudiante estudiante);
	
	public Estudiante buscarPorId(Integer id);
	
	public void borrar(Integer id);
}
