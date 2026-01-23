package main;
import java.util.ArrayList;


/**
 * Código inicial para la práctica de refactorización.
 * Criterios: Nombres genéricos, números mágicos y métodos con demasiadas responsabilidades.
 */
public class ProcesadorPedidos {
 
 
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
            total = total - (total * 0.10); 
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
		Gastos_envio = Gastos_envio + 15.95;
		return Gastos_envio;
	}

	private double CalculoIVA(double IVA) {
		double resultado = IVA + (IVA * 0.21);
		return resultado;
	}
}