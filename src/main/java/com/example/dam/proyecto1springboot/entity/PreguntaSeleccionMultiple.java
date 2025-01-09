package com.example.dam.proyecto1springboot.entity;
import jakarta.persistence.Entity;
import java.util.List;

@Entity
public class PreguntaSeleccionMultiple extends Pregunta{
    private List<String> opciones;
    private List<String> respuestaCorrectas;

    public void setOpciones(List<String> opciones) {
        this.opciones = opciones;
    }

    public void setRespuestaCorrectas(List<String> respuestaCorrectas) {
        this.respuestaCorrectas = respuestaCorrectas;
    }
}
