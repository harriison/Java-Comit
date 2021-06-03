package com.comit.tp2.ej7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
Se recibe una solicitud de ingreso a un trabajo, en respuesta a un aviso
publicado en una página web. En dicha solicitud se especifica:
    - edad en años del aspirante,
    - experiencia en el oficio, también expresada en años,
    - y remuneración estimativa a percibir mensualmente.

La empresa usa los siguientes criterios de selección:
la edad debe estar entre 18 y 35 años inclusive en ambos extremos del
intervalo, sino será rechazado.
la experiencia menor a los 3 años debe estimar una remuneración debajo
de los $50000 mensuales, sino será rechazado.
si la edad del solicitante es mayor a los 32 años, deberá tener como mínimo
6 años de experiencia; si la experiencia es menor a los 6 años y mayor a 3
años, se lo tomará en forma condicional. En cualquier otro caso se lo
rechazará.
TP 2 - Estructuras de control de decisión 3
Realizar un programa que permita decidir a partir de los datos del aspirante si
fue seleccionado definitivamente, en forma condicional, o rechazado. Imprimir
un mensaje que indique lo ocurrido.

         */

        System.out.println("Para la solicitud del trabajo ingrese los siguientes datos: ");
        System.out.println("Cuantos años tienes?");
        Scanner scanner = new Scanner(System.in);
        int years = scanner.nextInt();

        System.out.println("Experiencia?");

    }
}
