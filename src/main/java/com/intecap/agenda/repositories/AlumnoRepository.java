package com.intecap.agenda.repositories;

import com.intecap.agenda.models.Alumno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("alumnoRepository")
public interface AlumnoRepository extends CrudRepository<Alumno, Integer> {
}
