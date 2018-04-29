package br.com.semana5.avaliacao.teste_unit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.semana5.avaliacao.Autoridade;


public class TesteFormatadorNome {

	private String nome = "Luiz";	
	private String sobrenome = "Santos";
	private String sexo = "M";
	private String titulo = "Meretíssimo";

	
	@Test
	public void testInformal() {
		Autoridade informal = new Autoridade(nome);		
		assertEquals(nome, informal.getTratamento(1));
	}
	
	@Test
	public void testRespeitoso() {
		
		String tratam;
		
		if ("M".equals(sexo)) {
			tratam = "Sr. ";
		}else {
			tratam = "Sra. ";
		}
		
		Autoridade informal = new Autoridade(sexo, sobrenome);
		assertEquals(tratam + sobrenome, informal.getTratamento(2));
	}
	
	@Test
	public void testComTitulo() {
		
		Autoridade informal = new Autoridade(titulo, nome, sobrenome);
		assertEquals(titulo + ' ' + nome + sobrenome, informal.getTratamento(3));
	}

}
