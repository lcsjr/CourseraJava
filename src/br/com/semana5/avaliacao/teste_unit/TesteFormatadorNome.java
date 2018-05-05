package br.com.semana5.avaliacao.teste_unit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.semana5.avaliacao.Autoridade;
import br.com.semana5.avaliacao.ComTitulo;
import br.com.semana5.avaliacao.Informal;
import br.com.semana5.avaliacao.Respeitoso;


public class TesteFormatadorNome {

	private String nome = "Luiz";	
	private String sobrenome = "Santos";
	private String sexo = "M";
	private String titulo = "Meretíssimo";

	
	@Test
	public void testInformal() {
		Informal informal = new Informal();
		Autoridade a = new Autoridade(nome,sobrenome,informal);
		System.out.println( a.getTratamento());
		assertEquals(nome,a.getTratamento());
	}

	@Test
	public void testRespeitoso() {
		Respeitoso respeitoso = new Respeitoso(sexo);
		Autoridade b = new Autoridade(nome,sobrenome,respeitoso);
		System.out.println( b.getTratamento());
		assertEquals("Sr. "+sobrenome,b.getTratamento());
		
	}
	
	@Test
	public void testComTitulo() {
		ComTitulo comTitulo = new ComTitulo(titulo);
		Autoridade c = new Autoridade(nome,sobrenome,comTitulo);
		System.out.println( c.getTratamento());
		assertEquals(titulo+ ' '+nome+' '+sobrenome,c.getTratamento());
	}

}
