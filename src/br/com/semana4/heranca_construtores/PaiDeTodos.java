package br.com.semana4.heranca_construtores;

public class PaiDeTodos {
	
	public PaiDeTodos() {
		System.out.println("Construtor PaiDeTodos executa primeiro, porque ele é o primeiro nivel da hierarquia.");
		System.out.println();
	}
	
	
	public PaiDeTodos(String s) {
		System.out.println( s + "- Construtor PaiDeTodos executa primeiro, porque ele é o primeiro nivel da hierarquia.");
		System.out.println();
	}

}
