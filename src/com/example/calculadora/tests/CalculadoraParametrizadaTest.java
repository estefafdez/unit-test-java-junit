package com.example.calculadora.tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.example.calculadora.Calculadora;

/**
 * Ejemplo de tests parametrizados: cada fila de la tabla ejecuta todos los tests una vez.
 */
@RunWith(Parameterized.class)
public class CalculadoraParametrizadaTest extends CalculadoraBaseTest {

	@Parameters(name = "{0} y {1}")
	public static Collection<Object[]> datos() {
		return Arrays.asList(new Object[][] {
			// num1, num2, suma, resta, multiplicacion, division
			{ 6, 3, 9, 3, 18, 2.0 },
			{ 3, 6, 9, -3, 18, 0.0 },
			{ 0, 5, 5, -5, 0, 0.0 },
			{ -4, 2, -2, -6, -8, -2.0 },
			{ -4, -2, -6, -2, 8, 2.0 },
		});
	}

	private final int num1;
	private final int num2;
	private final int suma;
	private final int resta;
	private final int multiplicacion;
	private final double division;

	public CalculadoraParametrizadaTest(int num1, int num2, int suma, int resta, int multiplicacion, double division) {
		this.num1 = num1;
		this.num2 = num2;
		this.suma = suma;
		this.resta = resta;
		this.multiplicacion = multiplicacion;
		this.division = division;
	}

	@Test
	public void testSumar() {
		assertEquals(suma, Calculadora.sumar(num1, num2));
	}

	@Test
	public void testRestar() {
		assertEquals(resta, Calculadora.restar(num1, num2));
	}

	@Test
	public void testMultiplicar() {
		assertEquals(multiplicacion, Calculadora.multiplicar(num1, num2));
	}

	@Test
	public void testDividir() {
		assertEquals(division, Calculadora.dividir(num1, num2), 0.0);
	}
}
