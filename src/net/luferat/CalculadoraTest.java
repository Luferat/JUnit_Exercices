package net.luferat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	Calculadora calc = new Calculadora(8, 2);

	@Test
	void testaGetSum() {
		assertEquals(10, calc.getSum());
	}

	@Test
	void testaGetSub() {
		assertEquals(6, calc.getSub());
	}

	@Test
	void testaGetMult() {
		assertEquals(16, calc.getMult());
	}

	@Test
	void testaGetDiv() {
		assertEquals(4, calc.getDiv());
	}

	@Test
	void testaGetMod() {
		assertEquals(0, calc.getMod());
	}
}
