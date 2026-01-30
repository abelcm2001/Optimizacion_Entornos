package main;
import java.util.ArrayList;


/**
 * Código inicial para la práctica de refactorización.
 * Criterios: Nombres genéricos, números mágicos y métodos con demasiadas responsabilidades.
 */
public class ProcesadorPedidos {
 
 
    private static final double GASTOS = 15.95;
	private static final double DESCUENTO = 0.10;
	private static final double IVA = 0.21;

	public double procesar(ArrayList<String> Descuento, ArrayList<Double> precios) {
        double total = 0;
        
        // Sumar precios de la lista
        for (int i = 0; i < precios.size(); i++) {
            System.out.println("Añadiendo producto: " + Descuento.get(i));
            total = total + precios.get(i);
        }
        
        // Lógica de descuento (Magic Number 100 y 0.10)
        if (total > 100) {
            System.out.println("Descuento aplicado.");
            total = total - (total * DESCUENTO); 
        }
        
        // Cálculo de impuestos (Magic Number 0.21)
        double resultado = CalculoIVA(total);
        
        // Gastos de envío (Magic Number 500 y 15.95)
        if (resultado < 500) {
            resultado = GastosEnvio(resultado);
        }
        
        return resultado;
    }

	private double GastosEnvio(double Gastos_envio) {
		Gastos_envio = Gastos_envio + GASTOS;
		return Gastos_envio;
	}

	private double CalculoIVA(double IVA) {
		double resultado = IVA + (IVA * IVA);
		return resultado;
	}
}