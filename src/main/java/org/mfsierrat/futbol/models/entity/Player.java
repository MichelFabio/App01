package org.mfsierrat.futbol.models.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "players")
public class Player implements Serializable {

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public short getJersey() {
		return jersey;
	}

	public void setJersey(short jersey) {
		this.jersey = jersey;
	}

	public String[] getPosition() {
		return position;
	}

	public void setPosition(String[] position) {
		this.position = position;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "first_name")
	private String nombre;

	@Column(name = "last_name")
	private String apellido;

	private short jersey;
	private String[] position;

}
