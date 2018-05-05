package br.com.semana6.interfaces;

public class Principal {

	public static void main(String[] args) {
		Barulhento[] barulhentos = new Barulhento[10];
		
		barulhentos[0] = new Cachorro();
		barulhentos[1] = new Carro();
		barulhentos[2] = new Bateria();
		barulhentos[3] = new Buzina();
		barulhentos[4] = new Gato();
		barulhentos[5] = new Carro();
		barulhentos[6] = new Bateria();
		barulhentos[7] = new Gato();
		barulhentos[8] = new Cachorro();
		barulhentos[9] = new Gato();
		
		sons(barulhentos);
	}

	public static void sons(Barulhento[] barulhentos) {
		
		for(Barulhento b: barulhentos) {
			System.out.println(b.fazerBarulho());
		}
		
	}
}
