package br.com.semana5.avaliacao.idade_signo.teste_unit;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.semana5.avaliacao.idade_signo.Pessoa;

public class Teste_IdadeSigno {

	@Test
	public void testEu() {
		
		Pessoa eu = new Pessoa("22/03/1984");
		
		assertEquals(34, eu.getIdade() );
		assertEquals("Áries", eu.getSigno() );
	}
	
	@Test
	public void testEle() {
		
		Pessoa ele = new Pessoa("20/02/2014");
		
		assertEquals(4, ele.getIdade() );
		assertEquals("Peixes", ele.getSigno() );
	}
	
	@Test
	public void testEla() {
		
		Pessoa ela = new Pessoa("29/07/1985");
		
		assertEquals(32, ela.getIdade() );
		assertEquals("Leão", ela.getSigno() );
	}
	
}
