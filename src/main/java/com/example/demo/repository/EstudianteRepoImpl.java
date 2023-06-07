package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Estudiante;

@Repository
public class EstudianteRepoImpl implements IEstudianteRepo{
	
	private static List<Estudiante> baseDatos=new ArrayList<>();

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		baseDatos.add(estudiante);
	}

}
