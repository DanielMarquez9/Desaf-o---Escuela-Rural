package org.educacionrural.escuela.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.educacionrural.escuela.EscuelaService;
import org.educacionrural.escuela.Curso;

@Controller
@RequestMapping("/cursos")
public class CursoController {
    @Autowired
    private EscuelaService escuelaService;

    @GetMapping
    public String listarCursos(Model model) {
        model.addAttribute("cursos", escuelaService.listarCursos());
        return "cursos";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioCurso(Model model) {
        model.addAttribute("curso", new Curso());
        return "formularioCurso";
    }

    @PostMapping
    public String agregarCurso(Curso curso) {
        escuelaService.agregarCurso(curso);
        return "redirect:/cursos";
    }

    // Métodos adicionales para editar y eliminar
}
