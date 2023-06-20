package com.example.demo.service;

import com.example.demo.modelo.Libro;

public interface ILibroService {
	
	
	public void agregar(Libro libro);
	public void modificar(Libro libro);
	public Libro buscarLibro(Integer id);
	public void borrar(Integer id);

}
