package br.com.semana4.heranca_construtores;

public class LaDeBaixo extends DoMeio {

	public LaDeBaixo() {
		System.out.println("Construtor LaDeBaixo executa ap�s os construtores do PaiDeTodos e DoMeio, pois ao ser extendido pela classe DoMeio ele herda tamb�m"
				+ " a classe PaiDeTodos que � extendida pela classe DoMeio.");
	}

}
