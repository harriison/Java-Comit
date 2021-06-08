package com.comit.bn.entities;

public class Submarino extends Embarcacion{
    public static final int TAMANIO = 3;
    public static final String NOMBRE = "Submarino";


    @Override
    public int getTamanio() {
        return TAMANIO;
    }

    @Override
    public String getNombre() {
        return NOMBRE;
    }
}
