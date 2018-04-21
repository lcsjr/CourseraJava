package br.com.semana4.heranca_construtores;

public class DoMeio extends PaiDeTodos {

/*
	public DoMeio() {
		System.out.println("Construtor do DoMeio executa após o construtor PaiDeTodos, porque ele é herança do PaiDeTodos que será executado primeiro.");
		System.out.println();
	}
	*/
	
	public DoMeio() {
		super("Passando Parametro"); // passando parametro para o construtor superclasse.
		System.out.println("Construtor do DoMeio executa após o construtor PaiDeTodos, porque ele é herança do PaiDeTodos que será executado primeiro.");
		System.out.println();
	}

}
