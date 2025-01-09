package com.example.dam.proyecto1springboot.service;

import com.example.dam.proyecto1springboot.entity.Pregunta;
import com.example.dam.proyecto1springboot.repository.PreguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreguntaService {

    @Autowired
    PreguntaRepository preguntaRepository;

    public List<Pregunta> obtenerTodasLasPreguntas(){
        return preguntaRepository.findAll();
    }

    public Pregunta guardarPregunta(Pregunta pregunta){
        return preguntaRepository.save(pregunta);
    }


}
