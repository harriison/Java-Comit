package com.comit.tp1y2;

public class Producto {
    private int cantidad;
    private String descripcion;
    private double precio;


    public Producto(int cantidad, String descripcion, double precio) {
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.precio = precio;
    }


    public int getCantidad() {
        return cantidad;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }
}
