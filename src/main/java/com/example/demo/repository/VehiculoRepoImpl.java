package com.example.demo.repository;

import java.time.LocalDate;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Vehiculo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
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

	@Override
	public Vehiculo seleccionarVehiculoPorFechaColorPlaca(LocalDate fechaFabricacion, String color, String placa) {
		// TODO Auto-generated method stub
		CriteriaBuilder myBuilder=this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Vehiculo> myCriteriaQuery=myBuilder.createQuery(Vehiculo.class);
		Root<Vehiculo> myTableFrom=myCriteriaQuery.from(Vehiculo.class);
		
		Predicate pFecha=myBuilder.equal(myTableFrom.get("fechaFabricacion"), fechaFabricacion);
		Predicate pColor=myBuilder.equal(myTableFrom.get("color"),color );
		Predicate pPlaca=myBuilder.equal(myTableFrom.get("placa"), "placa");
		
		Predicate pFinal=null;
		
		if(fechaFabricacion.compareTo(LocalDate.of(2023, 1, 1))<=0) {
			pFinal=myBuilder.or(pColor,pPlaca);
		}else {
			pFinal=myBuilder.and(pColor,pPlaca);
		}
		
		myCriteriaQuery.select(myTableFrom).where(pFinal);
		
		TypedQuery<Vehiculo> myQueryFinal=this.entityManager.createQuery(myCriteriaQuery);
		
		return myQueryFinal.getSingleResult();
	}

}
