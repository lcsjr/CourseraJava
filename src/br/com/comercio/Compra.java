package br.com.comercio;

public class Compra {
	
	int valorTotal;
	int numeroParcelas;
	
	// a vista
	public Compra(int valor) {
		valorTotal = valor;
		numeroParcelas = 1;
	}
	
	// Parcelamento
	public Compra( int qtdParcelas, int valorParcela) {
		numeroParcelas = qtdParcelas ;
		valorTotal = numeroParcelas * valorParcela;
	}

	public int getValorTotal() {
		return valorTotal;
	}

	public int getNumeroParcelas() {
		return numeroParcelas;
	}
	
	public int getvalorParcela() {
		return valorTotal/numeroParcelas ;
	}	
	

}
