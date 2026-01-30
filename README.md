# Optimizacion_Entornos

---

Para instalar Sonarqube: Help > Eclipse marketplace > buscamos sonarqube e instalamos.

Tarea de configuración: Window > Preferences > SonarQube -> Rules Configuration.

En la carpeta IMAGEN se encuentra las capturas hechas (activando y desactivando la opción Magic Numbers y Cognitive.


![Refactor Preview]

En la carpeta IMAGEN se encuentra las capturas hechas, aparte explico aquí cada cambio realizado.

Rename: Cambio de los nombres de las variables a (por Descuento) , b (por precios), t (por total) y res (por resultado). 


Extract Method: He seleccionado cálculo del IVA y lo he extraído a un método privado independiente, al igual que los gastos de envío.

private double CalculoIVA(double IVA) {
		double resultado = IVA + (IVA * 0.21);
		return resultado;

private double GastosEnvio(double Gastos_envio) {
		Gastos_envio = Gastos_envio + 15.95;
		return Gastos_envio;

Extract Constant: Sustituye los "números mágicos" (0.21, 0.10, 15.95) por constantes de clase bien nombradas.

Sustituyo 0,21 por PORCENTAJE_IVA.

private double CalculoIVA(double IVA) {
		double resultado = IVA + (IVA * PORCENTAJE_IVA);
		return resultado;
    
Sustituyo 0,10 por DESCUENTO.

if (total > 100) {
            System.out.println("Descuento aplicado.");
            total = total - (total * DESCUENTO); 
            
Sustituyo 15,95 por GASTOS.

private double GastosEnvio(double Gastos_envio) {
		Gastos_envio = Gastos_envio + GASTOS;
		return Gastos_envio;
