package com.example.dam.proyecto1springboot.controller;

import com.example.dam.proyecto1springboot.service.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private PreguntaService preguntaService;

    @GetMapping
    public String paginaPrincipal(){
    return "menu";
    }
}
