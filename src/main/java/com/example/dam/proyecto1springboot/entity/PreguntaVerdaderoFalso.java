package com.example.dam.proyecto1springboot.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class PreguntaVerdaderoFalso extends Pregunta {
    private Boolean RespuestaCorrecta;
}
