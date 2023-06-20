package com.example.demo.repository;

import com.example.demo.modelo.Autor;

public interface IAutorRepo {
	
	public void insertar(Autor autor);
	public void actualizar(Autor autor);
	public Autor buscar(Integer id);
	public void elminar(Integer id);

}
