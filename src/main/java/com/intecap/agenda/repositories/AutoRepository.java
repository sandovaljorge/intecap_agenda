package com.intecap.agenda.repositories;

import com.intecap.agenda.models.Auto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoRepository extends CrudRepository<Auto, Integer> {
}
