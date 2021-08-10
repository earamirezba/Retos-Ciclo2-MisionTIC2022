package com.misiontic2022.retoselkin.Reto1;

/**
 * TEST Reto1 Ciclo2 MisionTic2022
 *
 */
public class App {
    public static void main(String[] args) {
        Double valor = 1000000.0;
        Integer tiempo = 1;
        EvaluarOpcionCredito evaluar = new EvaluarOpcionCredito();
        String eleccion = evaluar.compararOpcion(valor, tiempo);
        System.out.println(eleccion);

        valor = 300000.0;
        tiempo = 12;
        // EvaluarOpcionCredito evaluar = new EvaluarOpcionCredito();
        eleccion = evaluar.compararOpcion(valor, tiempo);
        System.out.println(eleccion);

        valor = 2051423.32;
        tiempo = 24;
        eleccion = evaluar.compararOpcion(valor, tiempo);
        System.out.println(eleccion);
    }
}
