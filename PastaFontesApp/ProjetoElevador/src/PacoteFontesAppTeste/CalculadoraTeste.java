package PacoteFontesAppTeste;

import PacoteFontesApp.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTeste {

	Calculadora calc = new Calculadora();
	double resultCalc;
	
	@Test
	public void testeSomarPeso100com200kg() {
		resultCalc = calc.somar(100, 200);
		assertEquals(resultCalc, 300, 0);
	}
	
	@Test
	public void testeSomarPeso300com400kg() {
		resultCalc = calc.somar(300, 400);
		assertEquals(resultCalc, 700, 0);
	}
	
	@Test
	public void testeSubtrairPeso50de100kg() {
		resultCalc = calc.subtrair(50, 100);
		assertEquals(resultCalc, 50, 0);
	}


}
