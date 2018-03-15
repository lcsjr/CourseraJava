package org.veiculos;

public class TesteCarro {

	public static void main(String[] args) {
	
		Carro c1 = new Carro();
		c1.nome = "Fusca";
		c1.potencia = 2;
		c1.acelerar();
		c1.acelerar();
		c1.imprimir();
		
		Carro c2 = new Carro();		
		c2.nome = "ASX";
		c2.potencia = 3; 
		c2.acelerar();
		c2.acelerar();
		c2.imprimir();	

	}

}
