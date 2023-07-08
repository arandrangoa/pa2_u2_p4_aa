package com.example.demo.repository;

import com.example.demo.modelo.Hotel;

public interface IhotelRepo {
	
	public void insertar(Hotel hotel);
	public void actualizar(Hotel hotel);
	public Hotel buscar(Integer id);
	public void elminar(Integer id);
	

}
