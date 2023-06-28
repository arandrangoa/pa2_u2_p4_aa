package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteService {
	
	public void agregar(Estudiante estudiante);
	
	public void modificar(Estudiante estudiante);
	
	public Estudiante buscarPorId(Integer id);
	
	public void borrar(Integer id);
	
	public Estudiante buscarPorApellido(String apellido);
	
	public List<Estudiante> reporteEstudiantes(String apellido);
	
	public Estudiante reportePorApellidoyNombre(String apellido, String nombre);
	
	public Estudiante reportePorApellidoTyped(String apellido);
	
	public Estudiante seleccionarPorApellidoNamedQuery(String apellido);
	
	public Estudiante seleccionarPorApellidoNativeQuery(String apellido);
	
	public Estudiante seleccionarPorApellidoNativeQueryNamed(String apellido);
	
	
	public Estudiante buscarPorNombreNamed(String nombre);
	
	public Estudiante seleccionarPorNombreNativeQueryNamed(String nombre);
	
	
	public Estudiante seleccionarPorApellidoCriteriaApiQuery(String apellido);
}
