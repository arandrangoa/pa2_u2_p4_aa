package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.dto.EstudianteDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EstudianteRepoImpl implements IEstudianteRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.merge(estudiante);
	}

	@Override
	public Estudiante buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Estudiante.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Estudiante estu=this.buscar(id);
		this.entityManager.remove(estu);
	}

	@Override
	public Estudiante seleccionarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		//SELECT * FROM estudiante e WHERE e.estu_apellido =
		//JPQL
		//SELECT  e FROM Estudiante e WHERE e.apellido = 
		Query myQuery = this.entityManager.createQuery("SELECT  e FROM Estudiante e WHERE e.apellido = :datoApellido");
		myQuery.setParameter("datoApellido", apellido);		
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> seleccionarListaPorApellido(String apellido) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("SELECT  e FROM Estudiante e WHERE e.apellido = :datoApellido");
		myQuery.setParameter("datoApellido", apellido);		
		return myQuery.getResultList();
	}

	@Override
	public Estudiante seleccionarPorApellidoyNombre(String apellido, String nombre) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("SELECT  e FROM Estudiante e WHERE e.apellido = :datoApellido AND e.nombre = :datoNombre");
		myQuery.setParameter("datoApellido", apellido);		
		myQuery.setParameter("datoNombre", nombre);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoTyped(String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager.createQuery("SELECT  e FROM Estudiante e WHERE e.apellido = :datoApellido", Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);	
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoNamed(String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery=this.entityManager.createNamedQuery("Estudiante.buscaPorApellido", Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);	
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoNamedQuery(String apellido) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorApellido");
		myQuery.setParameter("datoApellido", apellido);		
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoNativeQuery(String apellido) {
		// TODO Auto-generated method stub
		Query myQuery=this.entityManager.createNativeQuery("SELECT * FROM estudiante where estu_apellido= :datoApellido", Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoNativeQueryNamed(String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorApellidoNative",Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);		
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreNamed(String nombre) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscaPorNombre");
		myQuery.setParameter("datoNombre", nombre);		
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorNombreNativeQueryNamed(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombreNative",Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);		
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoCriteriaApiQuery(String apellido) {
		// TODO Auto-generated method stub
		CriteriaBuilder myBuilder=this.entityManager.getCriteriaBuilder();
		
		//1.-Especificar el tipo de retorno que tiene Query
		CriteriaQuery<Estudiante> myCriteriaQuery=myBuilder.createQuery(Estudiante.class);
		
		//2.-Empezamos a crear el SQL
		//2.1-Definimos el FROM (Root)
		Root<Estudiante> miTablaFrom=myCriteriaQuery.from(Estudiante.class);
		
		//3.- Construir las condiciones de mi SQL
		//las condiciones se las conoce como predicados
		//e.apellido= :datoApellido
		Predicate condicionApellido=myBuilder.equal(miTablaFrom.get("apellido"), apellido);
		
		//4.-Armamos mi SQL final
		myCriteriaQuery.select(miTablaFrom).where(condicionApellido);
		
		//5.-La ejecucion del Query lo realizamos con TypedQuery
		TypedQuery<Estudiante> myQueryFinal=this.entityManager.createQuery(myCriteriaQuery);
		
		
		return myQueryFinal.getSingleResult();
	}

	@Override
	public Estudiante seleccionarEstudianteDinamico(String nombre, String apellido, Double peso) {
		// TODO Auto-generated method stub
		
		CriteriaBuilder myBuilder=this.entityManager.getCriteriaBuilder();
		
		CriteriaQuery<Estudiante> myCriteriaQuery=myBuilder.createQuery(Estudiante.class);
		
		Root<Estudiante> myTableFrom=myCriteriaQuery.from(Estudiante.class);
		
		//3- >100 e.nombre=? and e.apellido=?
		//<=100 e.nombre=? or e.apellido=?
		
		//e.nombre
		Predicate pNombre=myBuilder.equal(myTableFrom.get("nombre"), nombre);
		
		//e.apellido
		Predicate pApellido=myBuilder.equal(myTableFrom.get("apellido"), apellido);
		
		Predicate predicadoFinal=null;
		
		if(peso.compareTo(Double.valueOf(100))<=0){
			predicadoFinal=myBuilder.or(pNombre, pApellido);
		}else {
			predicadoFinal=myBuilder.and(pNombre, pApellido);
		}
		
		//4.-Armamos mi SQL final
		myCriteriaQuery.select(myTableFrom).where(predicadoFinal);
		
		//5.-La ejecucion del Query lo realizamos con TypedQuery
		TypedQuery<Estudiante> myQueryFinal=this.entityManager.createQuery(myCriteriaQuery);
		
		
		return myQueryFinal.getSingleResult();
		
		
	}

	@Override
	public int eliminarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		
		//DELETE FROM estudiante where estu_nombre=?
		//DELETE FROM Estudiante e where e.nombre= :datoNombre
		
		Query myQuery=this.entityManager.createQuery("DELETE FROM Estudiante e where e.nombre= :datoNombre");
		myQuery.setParameter("datoNombre", nombre);
		return myQuery.executeUpdate();
		
	}

	@Override
	public int actualizarPorApellido(String nombre,String apellido) {
		// TODO Auto-generated method stub
		//SQL
		//UPDATE estudiante SET estu_nombre=? WHERE estu_apellido=?
		//JPQL
		//UPDATE Estudiante e SET e.nombre= :datoNombre WHERE e.apllido= :datoApellido
		
		
		Query myQuery=this.entityManager.
				createQuery("UPDATE Estudiante e SET e.nombre= :datoNombre WHERE e.apellido= :datoApellido");
		myQuery.setParameter("datoNombre", nombre);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.executeUpdate();
	}

	@Override
	public List<EstudianteDTO> seleccionarTodosDto() {
		// TODO Auto-generated method stub
		TypedQuery<EstudianteDTO> myQuery=this.entityManager.createQuery("SELECT NEW com.example.demo.modelo.dto.EstudianteDTO(e.nombre, e.apellido) FROM Estudiante e ",EstudianteDTO.class);
		return myQuery.getResultList();
	}

	

}
