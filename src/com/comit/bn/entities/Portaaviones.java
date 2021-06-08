package com.comit.bn.entities;

public class Portaaviones extends Embarcacion{
    public static final int TAMANIO = 4;
    public static final String NOMBRE = "Portaaviones";


    @Override
    public int getTamanio() {
        return TAMANIO;
    }

    @Override
    public String getNombre() {
        return NOMBRE;
    }
}
