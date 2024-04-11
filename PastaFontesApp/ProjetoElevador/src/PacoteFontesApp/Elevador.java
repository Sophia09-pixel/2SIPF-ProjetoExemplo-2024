package PacoteFontesApp;

public class Elevador {

	int id;
	double cargaMaxima;
	double cargaAtual;
	boolean sinalAlerta;
	
	//Getters & Setters
	
	public void setCargaMaxima(double valor) {
		this.cargaMaxima = valor;
	}
	
	public double getCargaMaxima() {
		return this.cargaMaxima;
	}
	
	public void setCargaAtual(double valor) {
		this.cargaAtual = valor;
	}
	
	public double getCargaAtual() {
		return this.cargaAtual;
	}
	
	public void setSinalAlerta(boolean valor) {
		this.sinalAlerta = valor;
	}
	
	public boolean getSinalAlerta() {
		return this.sinalAlerta;
	}
	
	//Adiciona o peso de uma pessoa ao elevador
	public double entrarNoelevador(double peso) {
		Calculadora calc = new Calculadora();
		cargaAtual = calc.somar(cargaAtual, peso);
		return cargaAtual;
	}
	
	//Retira o peso de uma pessoa ao elevador
	public double sairDoelevador(double peso) {
		Calculadora calc = new Calculadora();
		cargaAtual = calc.subtrair(cargaAtual, peso);
		return cargaAtual;
	}
	
	//Alerta excesso de peso
	public boolean avaliarpeso(double pesoElevador) {
		if(pesoElevador > 200) {
			return sinalAlerta = true;
		}
		else {
			return sinalAlerta = false;
		}
	}

}
