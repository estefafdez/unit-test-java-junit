package com.example.calculadora;

/**
 * Dependencia externa de {@link CalculadoraConRegistro}. En los tests se sustituye por un mock.
 */
public interface Registro {

	/**
	 * Guarda un mensaje en el registro.
	 * @param mensaje texto a guardar.
	 */
	void guardar(String mensaje);

	/**
	 * Indica si el registro está disponible.
	 * @return true si se puede escribir en el registro.
	 */
	boolean estaDisponible();
}
