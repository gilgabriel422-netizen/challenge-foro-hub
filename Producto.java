package com.tuusuario.challenge.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private BigDecimal precio;
    private LocalDate fechaRegistro = LocalDate.now();

    public Producto() {}

    public Producto(String nombre, String descripcion, BigDecimal precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    // Getters y Setters
}
