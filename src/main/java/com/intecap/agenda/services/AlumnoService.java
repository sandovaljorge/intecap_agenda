package com.intecap.agenda.services;

import com.intecap.agenda.models.Alumno;
import com.intecap.agenda.repositories.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("alumnoService")
@Transactional
public class AlumnoService  {

    @Autowired
    private AlumnoRepository alumnoRepository;

    public ArrayList<Alumno> getAll(){
        return (ArrayList<Alumno>) alumnoRepository.findAll();
    }

    public void guardar(Alumno alumno){
        alumnoRepository.save(alumno);
    }

    /**
     * Metodo alternativo para insertar un dato a nuestro servicio.
     * @param alumno
     * @return
     */
    public Alumno save(Alumno alumno){
        return alumnoRepository.save(alumno);
    }
}
