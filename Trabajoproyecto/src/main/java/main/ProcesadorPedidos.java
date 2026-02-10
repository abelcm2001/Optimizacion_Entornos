package main;

import java.util.ArrayList;

/**
 * Código corregido para la práctica de refactorización.
 */
public class ProcesadorPedidos {

    private static final double GASTOS = 15.95;
    private static final double DESCUENTO = 0.10;
    private static final double IVA = 0.21;

    public double procesar(ArrayList<String> nombres, ArrayList<Double> precios) {
        double total = 0;

        // Sumar precios de la lista
        for (int i = 0; i < precios.size(); i++) {
            System.out.println("Añadiendo producto: " + nombres.get(i));
            total += precios.get(i);
        }

        // Aplicar descuento si procede
        if (total > 100) {
            System.out.println("Descuento aplicado.");
            total = total - (total * DESCUENTO);
        }

        // Aplicar IVA
        double resultado = calcularIVA(total);

        // Gastos de envío
        if (resultado < 500) {
            resultado = aplicarGastosEnvio(resultado);
        }

        return resultado;
    }

    private double aplicarGastosEnvio(double total) {
        return total + GASTOS;
    }

    private double calcularIVA(double base) {
        return base + (base * IVA);
    }
}
