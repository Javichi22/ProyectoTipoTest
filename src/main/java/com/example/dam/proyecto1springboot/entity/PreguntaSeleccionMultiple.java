package com.example.dam.proyecto1springboot.entity;

import jakarta.persistence.ElementCollection;

import java.util.List;

public class PreguntaSeleccionMultiple extends Pregunta{
    @ElementCollection
    private List<String> opciones;

    @ElementCollection
    private List<Integer> correcta;
}
