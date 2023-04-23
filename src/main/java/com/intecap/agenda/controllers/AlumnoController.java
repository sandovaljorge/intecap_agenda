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
@CrossOrigin(origins = {"http:/localhost:3000","http:/localhost:3001","http:/localhost:4200"})
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @GetMapping("/")
    public ArrayList<Alumno> getAll(){
        return alumnoService.getAll();
    }
    @GetMapping("/{id}")
    public Alumno buscarAlumno(@PathVariable("id") int id){
        return alumnoService.buscar(id);
    }
    /*@PostMapping("/nuevo")
    public ResponseEntity<?> guardar(@RequestBody Alumno alumno){
        alumnoService.guardar(alumno);
        return new ResponseEntity<>("Alumno creado.", HttpStatus.OK);
    }*/

    /**
     * Metodo alternativo para devolver el alumno.
     * @param alumno
     * @return
     */
    @PostMapping("/nuevo")
    public Alumno nuevo(@RequestBody Alumno alumno){
        return alumnoService.guardar(alumno);
    }


    @PutMapping("/actualizar/{id}")
    public Alumno actualizar(@PathVariable int id,@RequestBody Alumno alumno){
        Alumno alumnoEncontrado = alumnoService.buscar(id);
        alumnoEncontrado.setNombre(alumno.getNombre());
        alumnoEncontrado.setEdad(alumno.getEdad());
        alumnoEncontrado.setTelefono(alumno.getTelefono());
        alumnoEncontrado.setGenero(alumno.getGenero());
        alumnoEncontrado.setCorreo(alumno.getCorreo());
        return alumnoService.actualizar(alumnoEncontrado);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable int id){
        alumnoService.eliminar(id);
    }
}
