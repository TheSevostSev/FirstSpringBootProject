package com.fundesplai.firstspringbootproject.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "equipo")
public class Equipo {
	@Id
	private int equipoCod;
	private String nombre;
	private String fundacion;
	private String presidente;
	private int presupuesto;
	private String equipacion;
	private String fotoEquipo;
	private String fotoEscudo;
	private String paginaWeb;

	@OneToMany(mappedBy = "equipo")
	@JsonIgnore
    private List<Jugador> jugadores;

	public int getEquipoCod() {
		return equipoCod;
	}
	public void setEquipoCod(int equipoCod) {
		this.equipoCod = equipoCod;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFundacion() {
		return fundacion;
	}

	public void setFundacion(String fundacion) {
		this.fundacion = fundacion;
	}

	public int getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	public String getEquipacion() {
		return equipacion;
	}

	public void setEquipacion(String equipacion) {
		this.equipacion = equipacion;
	}

	public String getFotoEquipo() {
		return fotoEquipo;
	}

	public void setFotoEquipo(String fotoEquipo) {
		this.fotoEquipo = fotoEquipo;
	}

	public String getFotoEscudo() {
		return fotoEscudo;
	}

	public void setFotoEscudo(String fotoEscudo) {
		this.fotoEscudo = fotoEscudo;
	}

	public String getPaginaWeb() {
		return paginaWeb;
	}

	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}

	public String getPresidente() {
		return presidente;
	}

	public void setPresidente(String presidente) {
		this.presidente = presidente;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}


}
