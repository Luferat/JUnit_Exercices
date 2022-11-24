/*
 * Exercício
 * 
 * Escreva classe e os métodos de teste unitário com JUnit. 
 */

package net.luferat;

public class Calculadora {

	double value1, value2;

	public Calculadora() {}

	public Calculadora(double val1, double val2) {
		this.value1 = val1;
		this.value2 = val2;
	}

	public double getSum() {
		return this.value1 + this.value2;
	}

	public double getSub() {
		return this.value1 - this.value2;
	}

	public double getMult() {
		return this.value1 * this.value2;
	}

	public double getDiv() {
		return this.value1 / this.value2;
	}

	public double getMod() {
		return this.value1 % this.value2;
	}

}


