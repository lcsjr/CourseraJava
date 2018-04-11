package org.veiculos;

public class Carro {
	
	public String nome;
	public int potencia;
	public int velocidade;

	public void acelerar() {
		velocidade += potencia;
	}
	
	public void frear() {
		velocidade *= 0.5;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public void imprimir() {
		System.out.println("O Carro "+ nome + " está a velocidade de " + this.getVelocidade() +" km/h");
	}
}
