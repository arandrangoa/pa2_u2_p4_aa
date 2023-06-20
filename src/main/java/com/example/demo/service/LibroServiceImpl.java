package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Libro;
import com.example.demo.repository.ILibroRepo;

@Service
public class LibroServiceImpl implements ILibroService{
	
	@Autowired
	private ILibroRepo iLibroRepo;

	@Override
	public void agregar(Libro libro) {
		// TODO Auto-generated method stub
		this.iLibroRepo.insertar(libro);
	}

	@Override
	public void modificar(Libro libro) {
		// TODO Auto-generated method stub
		this.iLibroRepo.actualizar(libro);
	}

	@Override
	public Libro buscarLibro(Integer id) {
		// TODO Auto-generated method stub
		return this.iLibroRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iLibroRepo.elminar(id);
	}

}
