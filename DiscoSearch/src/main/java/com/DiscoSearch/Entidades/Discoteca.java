package com.DiscoSearch.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Discoteca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long discotecaId;
    
    private String nombre;
    private String ubicacion;
    
    // Getters y setters
}