package br.com.semana4.heranca;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteContaCorrente {
	
	ContaCorrente cc;
	
	@Before
	public void inicializaConta() {
		cc = new ContaCorrente();
		cc.depositar(200);
	}

	@Test
	public void deposito() {
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(200);
		assertEquals(200, cc.saldo);
	}
	
	@Test
	public void saque() {
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(200);
		int valorSacado = cc.sacar(50);
		assertEquals(150, cc.saldo);
		assertEquals(valorSacado, 50);
	}
	
	@Test
	public void saqueMaiorQueSaldo() {
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(200);
		int valorSacado = cc.sacar(250);
		assertEquals(200, cc.saldo);
		assertEquals(valorSacado, 0);
	}

}
