package com.example.calculadora;

/**
 * Calculadora que deja constancia de cada suma en un {@link Registro}.
 */
public class CalculadoraConRegistro {

	private final Registro registro;

	public CalculadoraConRegistro(Registro registro) {
		this.registro = registro;
	}

	/**
	 * Suma dos números y, si el registro está disponible, guarda la operación.
	 * @param num1
	 * @param num2
	 * @return num1 + num2.
	 */
	public int sumar(int num1, int num2) {
		int resultado = Calculadora.sumar(num1, num2);
		if (registro.estaDisponible()) {
			registro.guardar(num1 + " + " + num2 + " = " + resultado);
		}
		return resultado;
	}
}
