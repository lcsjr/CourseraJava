package br.com.semana4.heranca;

public class ContaCorrente {
	
	int saldo;
	private int saldo2;
	
	public int sacar( int valor) {
		if(valor > saldo) {
			return 0;
		} else {
			saldo -= valor;
			return valor;
		}
	}

	public void depositar (int valor) {
		saldo += valor;
	}
}
