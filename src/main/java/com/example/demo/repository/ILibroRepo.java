package com.example.demo.repository;

import com.example.demo.modelo.Libro;

public interface ILibroRepo {
	
	public void insertar(Libro libro);
	public void actualizar(Libro libro);
	public Libro buscar(Integer id);
	public void elminar(Integer id);

}
