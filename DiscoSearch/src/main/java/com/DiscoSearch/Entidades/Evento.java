package com.DiscoSearch.Entidades;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventoId;
    
    private double precio;
    private Date fecha;
    private String nombre;
    
    @ManyToOne
    @JoinColumn(name = "discoteca_id")
    private Discoteca discoteca;
    
    // Getters y setters
}