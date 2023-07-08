package com.example.demo.repository;

import org.apache.logging.log4j.util.PerformanceSensitive;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HotelRepoImpl implements IhotelRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.entityManager.persist(hotel);
	}

	@Override
	public void actualizar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.entityManager.merge(hotel);
	}

	@Override
	public Hotel buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Hotel.class, id);

	}

	@Override
	public void elminar(Integer id) {
		// TODO Auto-generated method stub
		Hotel hotel=this.buscar(id);
		this.entityManager.remove(hotel);
	}
	
	

}
