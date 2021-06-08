package com.comit.bn.entities;

public class EmbarcacionFactory {
    public static Embarcacion crearEmbarcacion(String tipo){
        return switch (tipo) {
            case "Acorazado" -> new Acorazado();
            case "Portaaviones" -> new Portaaviones();
            case "Submarino" -> new Submarino();
            case "Fragata" -> new Fragata();
            default -> null;
        };
    }
}
