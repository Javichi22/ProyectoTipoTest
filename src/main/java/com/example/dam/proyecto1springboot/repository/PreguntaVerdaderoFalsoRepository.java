package com.example.dam.proyecto1springboot.repository;

import com.example.dam.proyecto1springboot.entity.PreguntaVerdaderoFalso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreguntaVerdaderoFalsoRepository extends JpaRepository<PreguntaVerdaderoFalso, Long> {

}
