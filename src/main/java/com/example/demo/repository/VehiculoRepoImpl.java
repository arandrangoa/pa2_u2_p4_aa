package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Vehiculo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class VehiculoRepoImpl implements IVehiculoRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public int eliminarPorMarca(String marca) {
		// TODO Auto-generated method stub
		
		Query myQuery=this.entityManager.createQuery("delete from Vehiculo v where v.marca= :datoMarca");
		myQuery.setParameter("datoMarca", marca);
		return myQuery.executeUpdate();
	}

	@Override
	public int actualizarPorMarcaElColor(String color, String marca) {
		// TODO Auto-generated method stub
		Query myQuery=this.entityManager.createQuery("update Vehiculo v set v.color= :datoColor where v.marca= :datoMarca");
		myQuery.setParameter("datoColor", color);
		myQuery.setParameter("datoMarca", marca);
		return myQuery.executeUpdate();
	}

	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(vehiculo);
	}

}
