package com.example.dam.proyecto1springboot.controller;

import com.example.dam.proyecto1springboot.entity.PreguntaVerdaderoFalso;
import com.example.dam.proyecto1springboot.repository.PreguntaVerdaderoFalsoRepository;
import com.example.dam.proyecto1springboot.service.PreguntaService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private PreguntaService preguntaService;

    @GetMapping
    public String paginaPrincipal(){
    return "menu";
    }

    @GetMapping("/pagina/preguntas")
    public String preguntas() {
        return "pagina/preguntas";
    }

    @GetMapping("/pagina/configuracion")
    public String configuracion() {
        return "pagina/configuracion";
    }
}
