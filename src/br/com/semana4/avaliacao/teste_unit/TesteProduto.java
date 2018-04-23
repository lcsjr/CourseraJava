package br.com.semana4.avaliacao.teste_unit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.semana4.avaliacao.Produto;

public class TesteProduto {

	@Test
	public void cadastroProduto() {
		
		Produto p1 = new Produto("Cadastro A", "CAD01", 12);
		
		assertEquals("CAD01", p1.getCodigo());
		
	}

}
