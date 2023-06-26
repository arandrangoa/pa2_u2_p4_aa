package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Automovil;
import com.example.demo.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AutomovilRepoImpl implements IAutomovilRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Automovil automovil) {
		// TODO Auto-generated method stub
		this.entityManager.persist(automovil);
	}

	@Override
	public void actualizar(Automovil automovil) {
		// TODO Auto-generated method stub
		this.entityManager.merge(automovil);
	}

	@Override
	public Automovil buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Automovil.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Automovil auto=this.buscar(id);
		this.entityManager.remove(auto);
	}

	@Override
	public Automovil seleccionarPorPlaca(String placa) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("SELECT  e FROM Automovil e WHERE e.placa = :datoPlaca");
		myQuery.setParameter("datoPlaca", placa);		
		return (Automovil) myQuery.getSingleResult();
	}

	@Override
	public List<Automovil> seleccionarListaPorMarca(String marca) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("SELECT  e FROM Automovil e WHERE e.marca = :datoMarca");
		myQuery.setParameter("datoMarca", marca);		
		return myQuery.getResultList();
	}

	@Override
	public Automovil seleccionarPorModeloTyped(String modelo) {
		// TODO Auto-generated method stub
		TypedQuery<Automovil> myQuery = this.entityManager.createQuery("SELECT  e FROM Automovil e WHERE e.modelo = :datoModelo", Automovil.class);
		myQuery.setParameter("datoModelo", modelo);	
		return myQuery.getSingleResult();
	}

	@Override
	public List<Automovil> seleccionarListaPorModeloTyped(String modelo) {
		// TODO Auto-generated method stub
		TypedQuery<Automovil> myQuery = this.entityManager.createQuery("SELECT  e FROM Automovil e WHERE e.modelo = :datoModelo", Automovil.class);
		myQuery.setParameter("datoModelo", modelo);	
		return myQuery.getResultList();
	}

}
