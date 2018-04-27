package br.com.semana5.encapsulamento;

public class Principal {

	public static void main(String[] args) {
		
		Pilha p = new Pilha(10);
		p.empilhar("Nome A");
		p.empilhar("Nome B");
		p.empilhar("Nome C");
		p.empilhar("Nome D");
		
		System.out.println("Elemento no topo: "+p.topo());
		System.out.println("Quantidade de elementos: " +p.tamanho());
		
		System.out.println();
		System.out.println("----------------------------------------------");
		System.out.println("Desempilhando o Elemento do Topo..."+ p.desempilhar());
		System.out.println("----------------------------------------------");
		System.out.println();
		
		System.out.println("O Elemento do Topo agora é: " + p.topo());
		System.out.println("Quantidade de Elementos atualizada: "+p.tamanho());
	}
}
