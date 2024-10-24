package com.fundesplai.firstspringbootproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="estadio")
public class Estadio {
	@Id
	private int equipoCod;
	private int estadioCod;
	private String nombre;
	private int construccion;
	private String direccion;
	private int aforo;
	private String fotoEstadio;
	
	public int getEquipoCod() {
		return equipoCod;
	}
	public void setEquipoCod(int equipoCod) {
		this.equipoCod = equipoCod;
	}
	public int getEstadioCod() {
		return estadioCod;
	}
	public void setEstadioCod(int estadioCod) {
		this.estadioCod = estadioCod;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getConstruccion() {
		return construccion;
	}
	public void setConstruccion(int construccion) {
		this.construccion = construccion;
	}
	public int getAforo() {
		return aforo;
	}
	public void setAforo(int aforo) {
		this.aforo = aforo;
	}
	public String getFotoEstadio() {
		return fotoEstadio;
	}
	public void setFotoEstadio(String fotoEstadio) {
		this.fotoEstadio = fotoEstadio;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
