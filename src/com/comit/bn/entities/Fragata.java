package com.comit.bn.entities;

public class Fragata extends Embarcacion{
    public static final int TAMANIO = 1;
    public static final String NOMBRE = "Fragata";

    @Override
    public int getTamanio() {
        return TAMANIO;
    }

    @Override
    public String getNombre() {
        return NOMBRE;
    }
}
