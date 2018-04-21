package br.com.semana4.heranca;

public class ContaEspecial extends ContaCorrente{

	int limite;
	
	ContaEspecial(int limite){
		this.limite = limite;
	}
	
	//SOBRESCREVER O MÉTODO DA CLASSE CONTACORRENTE
	public int sacar( int valor) {
		if(valor > saldo+limite) {
			return 0;
		} else {
			saldo -= valor;
			return valor;
		}
	}
}
