package com.comit.bn.entities;

public class Acorazado extends Embarcacion {
    public static final int TAMANIO = 3;
    public static final String NOMBRE = "Acorazado";

    @Override
    public int getTamanio() {
        return TAMANIO;
    }

    @Override
    public String getNombre() {
        return NOMBRE;
    }
}
