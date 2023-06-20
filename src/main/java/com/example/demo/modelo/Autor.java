package com.example.demo.modelo;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="autor")
public class Autor {
	
	@Id
	@SequenceGenerator(name = "seq_autor", sequenceName = "seq_autor", allocationSize = 1)
	@GeneratedValue(generator = "seq_autor", strategy = GenerationType.SEQUENCE)
	@Column(name="auto_id")
	private Integer id;
	
	@Column(name="auto_nombre")
	private String nombre;
	
	@Column(name="auto_apellido")
	private String apellido;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "libro_autor",joinColumns = @JoinColumn(name="auli_id_libro"),
	inverseJoinColumns =@JoinColumn(name="auli_id_autor"))
	private Set<Libro> libros;

	
	//SET Y GET
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Set<Libro> getLibros() {
		return libros;
	}

	public void setLibros(Set<Libro> libros) {
		this.libros = libros;
	}
	
	

}
