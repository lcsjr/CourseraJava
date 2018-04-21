package br.com.semana4.heranca_construtores;

public class LaDeBaixo extends DoMeio {

	public LaDeBaixo() {
		System.out.println("Construtor LaDeBaixo executa após os construtores do PaiDeTodos e DoMeio, pois ao ser extendido pela classe DoMeio ele herda também"
				+ " a classe PaiDeTodos que é extendida pela classe DoMeio.");
	}

}
