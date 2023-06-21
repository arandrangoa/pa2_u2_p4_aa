package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Matricula;
import com.example.demo.repository.IMatriculaRepo;

@Service
public class MatriculaServiceImpl implements IMatriculaService{
	
	@Autowired
	private IMatriculaRepo iMatriculaRepo;

	@Override
	public void insertar(Matricula matricual) {
		// TODO Auto-generated method stub
		this.iMatriculaRepo.insertar(matricual);
	}

}
