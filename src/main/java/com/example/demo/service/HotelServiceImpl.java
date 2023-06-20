package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Hotel;
import com.example.demo.repository.IhotelRepo;

@Service
public class HotelServiceImpl implements IHotelService{
	
	@Autowired
	private IhotelRepo ihotelRepo;

	@Override
	public void insertar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.ihotelRepo.insertar(hotel);
	}

	@Override
	public void actualizar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.ihotelRepo.actualizar(hotel);
	}

	@Override
	public Hotel buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.ihotelRepo.buscar(id);
	}

	@Override
	public void elminar(Integer id) {
		// TODO Auto-generated method stub
		this.ihotelRepo.elminar(id);
	}

}
