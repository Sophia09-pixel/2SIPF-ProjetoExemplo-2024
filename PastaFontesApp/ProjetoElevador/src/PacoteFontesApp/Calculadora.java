package PacoteFontesApp;

public class Calculadora {

	//Atributo de resultado de cálculo
	double resultado;
	
	//Método de soma de dois fatores
	public double somar(double valor1, double valor2) {
		this.resultado = valor1 + valor2;
		return this.resultado;
	}
	
	//Método de subtração de dois fatores
	public double subtrair(double valor1, double valor2) {
		this.resultado = valor2 - valor1;
		return this.resultado;
	}

}
