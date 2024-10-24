package com.fundesplai.firstspringbootproject.entity;

import java.util.List;

public class EquipoWithJugadores {
    private Equipo equipo;
    private List<Jugador> jugadores;

    public EquipoWithJugadores(Equipo equipo, List<Jugador> jugadores) {
        this.equipo = equipo;
        this.jugadores = jugadores;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public EquipoWithJugadores() {
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
