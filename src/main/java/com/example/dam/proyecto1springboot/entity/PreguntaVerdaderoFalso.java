package com.example.dam.proyecto1springboot.entity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class PreguntaVerdaderoFalso extends Pregunta {
    private Boolean respuestaCorrecta;
}
