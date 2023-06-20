package com.example.demo.service;

import com.example.demo.modelo.Autor;

public interface IAutorService {
	
	public void agregar(Autor autor);
	public void modificar(Autor autor);
	public Autor buscarAutor(Integer id);
	public void borrar(Integer id);

}
