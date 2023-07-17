package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Concesionario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ConcesionarioRepoImpl implements IConcesionarioRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Concesionario concesionario) {
		// TODO Auto-generated method stub
		this.entityManager.persist(concesionario);
	}

	@Override
	public List<Concesionario> seleccionarInnerJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Concesionario> myQuery=this.entityManager.createQuery("select c from Concesionario c inner join c.vehiculos v", Concesionario.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Concesionario> seleccionarOuterRightJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Concesionario> myQuery=this.entityManager.createQuery("select c from Concesionario c right join c.vehiculos v", Concesionario.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Concesionario> seleccionarOuterLeftJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Concesionario> myQuery=this.entityManager.createQuery("select c from Concesionario c left join c.vehiculos v", Concesionario.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Concesionario> seleccionarFullOuterJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Concesionario> myQuery=this.entityManager.createQuery("select c from Concesionario c full join c.vehiculos v", Concesionario.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Concesionario> seleccionarWhereJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Concesionario> myQuery=this.entityManager.createQuery("select c from Concesionario c, Vehiculo v where c=v.concesionario", Concesionario.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Concesionario> seleccionarFetchJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Concesionario> myQuery=this.entityManager.createQuery("select c from Concesionario c join fetch c.vehiculos v", Concesionario.class);
		return myQuery.getResultList();
	}

}
