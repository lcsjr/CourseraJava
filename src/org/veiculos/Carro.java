package org.veiculos;

public class Carro {
	
	String nome;
	int potencia;
	int velocidade;

	void acelerar() {
		velocidade += potencia;
	}
	
	void frear() {
		velocidade *= 0.5;
	}
	
	int getVelocidade() {
		return velocidade;
	}
	
	void imprimir() {
		System.out.println("O Carro "+ nome + " está a velocidade de " + this.getVelocidade() +" km/h");
	}
}
