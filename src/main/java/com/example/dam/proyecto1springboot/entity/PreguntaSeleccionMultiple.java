package com.example.dam.proyecto1springboot.entity;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import lombok.Data;
import java.util.List;

@Data
@Entity
public class PreguntaSeleccionMultiple extends Pregunta{
    @ElementCollection
    private List<String> opciones;

    @ElementCollection
    private List<Integer> correcta;
}
