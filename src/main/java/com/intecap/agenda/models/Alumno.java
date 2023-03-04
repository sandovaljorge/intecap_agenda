package com.intecap.agenda.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name ="alumno")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    @Getter @Setter
    private int id;
    @Column(name = "nombre")
    @Getter @Setter
    private String nombre;
    @Column(name = "correo")
    @Getter @Setter
    private String correo;
    @Column(name = "genero")
    @Getter @Setter
    private String genero;
    @Column(name = "telefono")
    @Getter @Setter
    private String telefono;
    @Column(name = "edad")
    @Getter @Setter
    private int edad;
}
