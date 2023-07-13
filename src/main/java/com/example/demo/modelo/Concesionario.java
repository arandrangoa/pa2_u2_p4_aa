package com.example.demo.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="concesionario")
public class Concesionario {
	
	@Id
	@SequenceGenerator(name = "seq_concesionario", sequenceName = "seq_concesionario", allocationSize = 1)
	@GeneratedValue(generator = "seq_concesionario", strategy = GenerationType.SEQUENCE)
	@Column(name="conc_id")
	private Integer id;
	
	@Column(name="conc_nombre")
	private String nombre;
	
	@Column(name="conc_direccion")
	private String direccion;
	
	@Column(name="conc_ciudad")
	private String ciudad;
	
	
	@OneToMany(mappedBy = "concesionario",cascade = CascadeType.ALL)
	private List<Vehiculo> vehiculos;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public List<Vehiculo> getVehiculos() {
		return vehiculos;
	}


	public void setVehiculos(List<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}


	@Override
	public String toString() {
		return "Concesionario [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", ciudad=" + ciudad
				+ ", vehiculos=" + "]";
	}
	
	
	
	

}
