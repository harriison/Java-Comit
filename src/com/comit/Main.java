package com.comit;

public class Main {

    public static void main(String[] args) {

                int cantEmpleados = 50;
                int cantCasosSector1 = 0;
                int cantCasosSector2 = 0;
                int cantCasosSector3 = 0;
                int cantEmpleadosSector1 = 0;
                int cantEmpleadosSector2 = 0;
                int cantEmpleadosSector3 = 0;
                double temperatura = 0;
                int sector;
                int cantCasosGeneral = 0;

                for (int i = 0; i < cantEmpleados; i++) {
                    sector = (int) (Math.random() * 3 + 1);
                    temperatura = (Math.random() * 2) + 36;
                    if (sector == 1) {
                        cantEmpleadosSector1 += 1;
                        if (temperatura > 37.5) {
                            cantCasosSector1 += 1;
                        }
                    } else if (sector == 2) {
                        cantEmpleadosSector2 += 1;
                        if (temperatura > 37.5) {
                            cantCasosSector2 += 1;
                        }
                    } else {
                        cantEmpleadosSector3 += 1;
                        if (temperatura > 37.5) {
                            cantCasosSector3 += 1;
                        }
                    }
                }
                double porcentaje1 = ((cantCasosSector1 * 100) / cantEmpleadosSector1);
                System.out.println("Sector 1 tiene " + cantCasosSector1 + " empleados sospechosos de " + cantEmpleadosSector1
                        + " - Porcentaje de sospecha: " + porcentaje1 + "%");
                double porcentaje2 = ((cantCasosSector2 * 100) / cantEmpleadosSector2);
                System.out.println("Sector 2 tiene " + cantCasosSector2 + " empleados sospechosos de " + cantEmpleadosSector2
                        + " - Porcentaje de sospecha: " + porcentaje2 + "%");
                double porcentaje3 = ((cantCasosSector3 * 100) / cantEmpleadosSector3);
                System.out.println("Sector 3 tiene " + cantCasosSector3 + " empleados sospechosos de " + cantEmpleadosSector3
                        + " - Porcentaje de sospecha: " + porcentaje3 + "%");
                cantCasosGeneral = cantCasosSector1 + cantCasosSector2 + cantCasosSector3;

                System.out.println(" ");

                int porcentajeGeneral = ((cantCasosGeneral * 100) / cantEmpleados);
                System.out.println("La fabrica tiene " + cantCasosGeneral + " empleados sospechosos de " + cantEmpleados
                        + " - Porcentaje de sospecha: " + porcentajeGeneral + "%");

            }
        }
