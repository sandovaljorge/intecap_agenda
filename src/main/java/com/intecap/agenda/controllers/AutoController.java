package com.intecap.agenda.controllers;

import com.intecap.agenda.models.Auto;
import com.intecap.agenda.services.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/auto")
@CrossOrigin(origins = {"http:/localhost:3000","http:/localhost:3001","http:/localhost:4200"})
public class AutoController {

    @Autowired
    private AutoService autoService;
    @GetMapping("/")
    public ArrayList<Auto> obtenerAutos(){
        return autoService.ListarAutos();
    }

    @GetMapping("/{id}")
    public Auto obtenerAuto(@PathVariable("id") int id){
        return autoService.buscarPorId(id);
    }

    @PostMapping("/nuevo")
    public Auto registrar(@RequestBody Auto auto){
        return autoService.guardar(auto);
    }

    @PostMapping("/actualizar")
    public Auto actualizar(@RequestBody Auto auto){
        return autoService.guardar(auto);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable("id") int id){
        autoService.eliminar(id);
    }
}
