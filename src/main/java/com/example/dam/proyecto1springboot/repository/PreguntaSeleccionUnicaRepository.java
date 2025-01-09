package com.example.dam.proyecto1springboot.repository;

import com.example.dam.proyecto1springboot.entity.Pregunta;
import com.example.dam.proyecto1springboot.entity.PreguntaSeleccionUnica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreguntaSeleccionUnicaRepository extends JpaRepository<PreguntaSeleccionUnica, Long> {
}
