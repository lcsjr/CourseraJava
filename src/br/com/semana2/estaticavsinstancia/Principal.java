package br.com.semana2.estaticavsinstancia;

public class Principal {

	public static void main(String[] args) {

		Somador s1 = new Somador();
		s1.nome = "Somador 1";
		
		Somador s2 = new Somador();
		s2.nome = "Somador 2";
		
		Somador s3 = new Somador();
		s3.nome = "Somador 3";

		for(int i=0; i<3; i++) {
			s1.somar();
			s2.somar();
			s3.somar();
		}
		
		s2.somar();
		
		/*
		 *  vari�vel est�tica � a mesma para todos os objetos instanciados, enquanto as vari�veis de instacia
		 *  seus exclusivas para cada objetos instanciado.
		 */
		
		s1.imprimir();
		s2.imprimir();
		s3.imprimir();
	}

}
