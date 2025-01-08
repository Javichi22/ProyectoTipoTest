package com.example.dam.proyecto1springboot.controller;
import com.example.dam.proyecto1springboot.service.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class PreguntasController {

    @Autowired
    PreguntaService preguntaService;

    @GetMapping("/pagina/inicio")
    public String inicio(Model model) {
        model.addAttribute("preguntas", preguntas());
        return "pagina/inicio";
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
