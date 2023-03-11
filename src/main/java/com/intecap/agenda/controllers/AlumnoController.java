package com.intecap.agenda.controllers;

import com.intecap.agenda.models.Alumno;
import com.intecap.agenda.services.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @GetMapping("/")
    public ArrayList<Alumno> getAll(){
        return alumnoService.getAll();
    }

    /**
     * Metodo para buscar por id
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Alumno buscarAlumno(@PathVariable("id") int id){
        return alumnoService.buscar(id);
    }
    @PostMapping("/nuevo")
    public ResponseEntity<?> guardar(@RequestBody Alumno alumno){
        alumnoService.guardar(alumno);
        return new ResponseEntity<>("Alumno creado.", HttpStatus.OK);
    }

    /**
     * Metodo alternativo para devolver el alumno.
     * @param alumno
     * @return
     */
    @PostMapping("/new")
    public Alumno nuevo(@RequestBody Alumno alumno){
        return alumnoService.save(alumno);
    }


}
