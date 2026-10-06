package com.example.calculadora.tests;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import com.example.calculadora.CalculadoraConRegistro;
import com.example.calculadora.Registro;

/**
 * Ejemplo de Mockito: crear un mock, definir su comportamiento (stub) y verificar las llamadas.
 */
public class CalculadoraConRegistroTest extends CalculadoraBaseTest {

	private Registro registro;
	private CalculadoraConRegistro calculadora;

	@Before
	public void crearMock() {
		registro = mock(Registro.class);
		calculadora = new CalculadoraConRegistro(registro);
	}

	@Test
	public void testSumaGuardaLaOperacionSiElRegistroEstaDisponible() {
		when(registro.estaDisponible()).thenReturn(true);

		assertEquals(5, calculadora.sumar(2, 3));

		verify(registro).guardar("2 + 3 = 5");
	}

	@Test
	public void testSumaNoGuardaNadaSiElRegistroNoEstaDisponible() {
		when(registro.estaDisponible()).thenReturn(false);

		assertEquals(5, calculadora.sumar(2, 3));

		verify(registro, never()).guardar("2 + 3 = 5");
	}
}
