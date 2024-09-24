package com.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nombreProducto", nullable = false)
    private String nombreProducto;

    @Column(name = "precio", nullable = false)
    private double precio;

    public Producto() {}

    public Producto(String nombreProducto, double precio) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}


