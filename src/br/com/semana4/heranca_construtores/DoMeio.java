package br.com.semana4.heranca_construtores;

public class DoMeio extends PaiDeTodos {

/*
	public DoMeio() {
		System.out.println("Construtor do DoMeio executa ap�s o construtor PaiDeTodos, porque ele � heran�a do PaiDeTodos que ser� executado primeiro.");
		System.out.println();
	}
	*/
	
	public DoMeio() {
		super("Passando Parametro"); // passando parametro para o construtor superclasse.
		System.out.println("Construtor do DoMeio executa ap�s o construtor PaiDeTodos, porque ele � heran�a do PaiDeTodos que ser� executado primeiro.");
		System.out.println();
	}

}
