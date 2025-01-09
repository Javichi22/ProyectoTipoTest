package com.example.dam.proyecto1springboot.entity;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;


import java.util.List;

@Entity
public class PreguntaSeleccionUnica extends Pregunta{
    @ElementCollection
    private List<String> opciones;

    private Integer respuestaCorrecta;

    public void setOpciones(List<String> opciones) {
        this.opciones = opciones;
    }

    public void setRespuestaCorrecta(Integer respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }
}
