package com.intecap.agenda.services;

import com.intecap.agenda.models.Auto;
import com.intecap.agenda.repositories.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AutoService {

    @Autowired
    private AutoRepository autoRepository;

    public ArrayList<Auto> ListarAutos(){
        return (ArrayList<Auto>) autoRepository.findAll();
    }

    public Auto guardar(Auto auto){
        return autoRepository.save(auto);
    }

    public Auto buscarPorId(int id){
        return autoRepository.findById(id).orElse(null);
    }

    public void eliminar(int id){
        autoRepository.deleteById(id);
    }
}
