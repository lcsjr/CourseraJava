package br.com.semana4.avaliacao.teste_unit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.semana4.avaliacao.Produto;
import br.com.semana4.avaliacao.ProdutoComTamanho;

public class TesteProdutoComTamanho {

	@Test
	public void testeMesmoProduto() {
		Produto p1 = new ProdutoComTamanho("Cadastro A", "CAD01", 15, 10);
		Produto p2 = new ProdutoComTamanho("Cadastro A", "CAD01", 15, 10);
		
		assertEquals(true, p1.equals(p2));
		
	}
	
	@Test
	public void testeProdutoDiferente() {
		Produto p1 = new ProdutoComTamanho("Cadastro A", "CAD01", 15, 10);
		Produto p2 = new ProdutoComTamanho("Cadastro A", "CAD01", 15, 15);
		
		assertEquals(false, p1.equals(p2));
		
	}

}
