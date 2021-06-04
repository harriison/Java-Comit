package com.comit.tp1y2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona("Pepito Perez", "Calle Falsa 123");
        ArrayList<Producto> listaDeCompras = new ArrayList<Producto>();
        listaDeCompras.add(new Producto(2, "Papas", 200));
        listaDeCompras.add(new Producto(3, "Carne", 1000));
        Factura factura = new Factura(persona, listaDeCompras);
        factura.imprimirFactura();
    }
}
