package JUnit.Calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import JUnit.Calculadora.Calculos;

class CalculadoraTest {

	Calculos calc;
	
	@BeforeEach
	public void before() {
		System.out.println("before");
		calc = new Calculos();
	}
	
	@Test
	public void testSuma() {
		System.out.println("testSuma");
		String result = calc.suma(10, 5);
		String esperado = "15.0";
		assertEquals(esperado, result);
	}

	@Test
	public void testResta() {
		System.out.println("testResta");
		String result = calc.resta(10, 5);
		String esperado = "5.0";
		assertEquals(esperado, result);
	}
	
	@Test
	public void testMultiplicacion() {
		System.out.println("testMultiplicacion");
		String result = calc.multiplicacion(10, 5);
		String esperado = "50.0";
		assertEquals(esperado, result);
	}
	
	@Test
	public void testDivision() {
		System.out.println("testDivision");
		String result = calc.division(10, 5);
		String esperado = "2.0";
		assertEquals(esperado, result);
	}
}
