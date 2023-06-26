package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="automovil")
public class Automovil {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_automovil")
	@SequenceGenerator(name = "seq_automovil",sequenceName = "seq_automovil", allocationSize = 1)
	@Column(name="auto_id")
	private Integer id;
	
	@Column(name="auto_marca")
	private String marca;
	
	@Column(name="auto_modelo")
	private String modelo;
	
	@Column(name="auto_anio_fabricacion")
	private String anioDeFabricacion;
	
	@Column(name="auto_placa")
	private String placa;
	
	
	//SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAnioDeFabricacion() {
		return anioDeFabricacion;
	}

	public void setAnioDeFabricacion(String anioDeFabricacion) {
		this.anioDeFabricacion = anioDeFabricacion;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Override
	public String toString() {
		return "Automovil [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", anioDeFabricacion="
				+ anioDeFabricacion + ", placa=" + placa + "]";
	}
	
	
	

}
