package com.fundesplai.firstspringbootproject.controller;

import com.fundesplai.firstspringbootproject.entity.Equipo;
import com.fundesplai.firstspringbootproject.entity.EquipoWithJugadores;
import com.fundesplai.firstspringbootproject.entity.Jugador;
import com.fundesplai.firstspringbootproject.repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/equipos")
public class EquipoController {

    @Autowired
    private EquipoRepository equipoRepository;

    @GetMapping
    public List<Equipo> listEquipos(){
        List<Equipo> equipos = (List<Equipo>) equipoRepository.findAll();
        return equipos;
    }

    @GetMapping("/{id}")
    public EquipoWithJugadores getEquipo(@PathVariable("id") Integer id){
        Optional<Equipo> equipo = equipoRepository.findById(id);
        List<Jugador> jugadores = equipo.get().getJugadores();
        return new EquipoWithJugadores(equipo.get(), jugadores);
    }
}

