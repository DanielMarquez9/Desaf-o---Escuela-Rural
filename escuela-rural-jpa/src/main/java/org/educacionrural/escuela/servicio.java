package org.educacionrural.escuela;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class EscuelaService {
    @Autowired
    private EstudianteRepository estudianteRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @Transactional
    public Estudiante agregarEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Transactional
    public Curso agregarCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    public List<Estudiante> listarEstudiantes() {
        return estudianteRepository.findAll();
    }

    public List<Curso> listarCursos() {
        return cursoRepository.findAll();
    }

    // Métodos adicionales para editar y eliminar
}
