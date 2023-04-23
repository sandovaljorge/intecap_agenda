package com.intecap.agenda.services;

import com.intecap.agenda.models.Alumno;
import com.intecap.agenda.repositories.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service("alumnoService")
@Transactional
public class AlumnoService  {

    @Autowired
    private AlumnoRepository alumnoRepository;

    public ArrayList<Alumno> getAll(){
        return (ArrayList<Alumno>) alumnoRepository.findAll();
    }

    /*public void guardar(Alumno alumno){
        alumnoRepository.save(alumno);
    }*/
    public Alumno buscar(int id) {
        return alumnoRepository.findById(id).orElse(null);
    }

    public Alumno guardar(Alumno alumno){
        return alumnoRepository.save(alumno);
    }

    public Alumno actualizar(Alumno alumno){
        return alumnoRepository.save(alumno);
    }

    public void eliminar(int id){
        alumnoRepository.deleteById(id);
    }

}
