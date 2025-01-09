package com.example.dam.proyecto1springboot.controller;
import com.example.dam.proyecto1springboot.entity.Pregunta;
import com.example.dam.proyecto1springboot.entity.PreguntaSeleccionMultiple;
import com.example.dam.proyecto1springboot.entity.PreguntaSeleccionUnica;
import com.example.dam.proyecto1springboot.entity.PreguntaVerdaderoFalso;
import com.example.dam.proyecto1springboot.repository.PreguntaRepository;
import com.example.dam.proyecto1springboot.repository.PreguntaSeleccionMultipleRepository;
import com.example.dam.proyecto1springboot.repository.PreguntaSeleccionUnicaRepository;
import com.example.dam.proyecto1springboot.repository.PreguntaVerdaderoFalsoRepository;
import com.example.dam.proyecto1springboot.service.PreguntaService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@Controller
@RequestMapping("/preguntas")
public class PreguntaController {


    @Autowired
    private PreguntaService preguntaService;
    @Autowired
    private PreguntaVerdaderoFalsoRepository preguntaVerdaderoFalsoRepository;
    @Autowired
    private PreguntaRepository preguntaRepository;
    @Autowired
    private PreguntaSeleccionUnicaRepository preguntaSeleccionUnicaRepository;
    @Autowired
    private PreguntaSeleccionMultipleRepository preguntaSeleccionMultipleRepository;

    @GetMapping
    public String preguntasLista(Model model){
        List<Pregunta> preguntas = preguntaService.obtenerTodasLasPreguntas();
        model.addAttribute("preguntas", preguntas);
        return "preguntas/listado";
    }

    @GetMapping("/nueva")
    public String nuevaPregunta(Model model){
        model.addAttribute("pregunta", new Pregunta());
        return "preguntas/formulario";
    }

    @PostMapping("/guardar")
    public String guardarPregunta(@ModelAttribute Pregunta pregunta) {
        preguntaRepository.save(pregunta);
        return "redirect:/preguntas";
    }

    @PostMapping("/importar")
    public String importarPreguntas(@RequestParam("archivoJson") MultipartFile archivoJson) {
        try {
            // Convertir el archivo JSON en una lista de preguntas
            ObjectMapper objectMapper = new ObjectMapper();
            List<PreguntaVerdaderoFalso> preguntas = objectMapper.readValue(
                    archivoJson.getInputStream(),
                    new TypeReference<List<PreguntaVerdaderoFalso>>() {}
            );

            // Guardar las preguntas en la base de datos
            preguntaVerdaderoFalsoRepository.saveAll(preguntas);

        } catch (Exception e) {
            e.printStackTrace();
            // Manejar el error, redirigir con un mensaje de error
            return "redirect:/preguntas?error=true";
        }
        // Redirigir al listado de preguntas con éxito
        return "redirect:/preguntas?success=true";
    }

}
