package com.comit.bn.entities;

import java.util.ArrayList;
import java.util.List;

public class Tablero {
    public static final int TAMANIO_X = 10;
    public static final int TAMANIO_Y = 10;

    private Character[][] tablero= new Character[TAMANIO_X][TAMANIO_Y];
    private List<Embarcacion> embarcaciones = new ArrayList<>();

    private void impactar(Coordenada coord) {
        validarCoordenada(coord);
        //TODO  seguir la logica

    }

    public void inicializarTablero(){
        for (int i = 0; i < TAMANIO_X; i++) {
            for (int j = 0; j < TAMANIO_Y; j++) {
                tablero[i][j] = ' ';
            }

        }
    }

    private boolean validarCoordenada(Coordenada coord) {
        boolean esValida = true;
        esValida= (coord.getY() >= 1 && coord.getY() < TAMANIO_Y) && (coord.getX() >= 1 && coord.getX() < TAMANIO_X);
            //throw new RuntimeException("La coordenada esta mal");
        if(esValida)
            esValida = tablero[coord.getX()][coord.getY()]==' ';
        return esValida;
    }

    private void imprimir(){
        // TODO completar metodo
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < TAMANIO_X; i++) {
            for (int j = 0; j < TAMANIO_Y; j++) {
                if(j==0)
                sb.append((j+1)+")");
                else
                    sb.append("("+tablero[i][j]+")");

                //System.out.println("");
            }
        }
    }

    private void posicionarEmbarcacion(Coordenada c, Embarcacion e){

    }
}
