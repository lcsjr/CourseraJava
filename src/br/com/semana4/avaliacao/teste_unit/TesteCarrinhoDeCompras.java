package br.com.semana4.avaliacao.teste_unit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.semana4.avaliacao.CarrinhoDeCompras;
import br.com.semana4.avaliacao.ProdutoComTamanho;

public class TesteCarrinhoDeCompras {

	@Test
	public void testeAdicionaProdutoCarrinho() {
		CarrinhoDeCompras sacola = new CarrinhoDeCompras();
		
		ProdutoComTamanho p1 = new ProdutoComTamanho("Cal�a A","001",50,45);
		sacola.adicionaProduto(p1, 1);
		
		ProdutoComTamanho p3 = new ProdutoComTamanho("Cal�a B","002",50,45);
		sacola.adicionaProduto(p3, 1);		

		ProdutoComTamanho p4 = new ProdutoComTamanho("Cal�a C","003",50,45);
		sacola.adicionaProduto(p4, 1);
		
		ProdutoComTamanho p5 = new ProdutoComTamanho("Cal�a C","003",50,47);
		sacola.adicionaProduto(p5, 1);
		
		ProdutoComTamanho p2 = new ProdutoComTamanho("Cal�a A","001",50,45);
		sacola.adicionaProduto(p2, 1);
		
		assertEquals(200,  sacola.calculaValorTotal());
	
	}
	
	@Test
	public void testeRemoveProdutoCarrinho() {
		CarrinhoDeCompras sacola = new CarrinhoDeCompras();
		
		ProdutoComTamanho p1 = new ProdutoComTamanho("Cal�a A","001",50,45);
		sacola.adicionaProduto(p1, 1);
		
		ProdutoComTamanho p2 = new ProdutoComTamanho("Cal�a B","001",50,47);
		sacola.adicionaProduto(p2, 1);
		
		ProdutoComTamanho p3 = new ProdutoComTamanho("Cal�a C","002",50,45);
		sacola.adicionaProduto(p3, 1);		

		sacola.removeProduto(p3, 1);
		assertEquals(100,  sacola.calculaValorTotal());
	
	}

	
	@Test
	public void testeAddMesmoProdutoCarrinho() {
		CarrinhoDeCompras sacola = new CarrinhoDeCompras();
		
		ProdutoComTamanho p1 = new ProdutoComTamanho("Cal�a A","001",50,45);
		sacola.adicionaProduto(p1, 1);
		
		ProdutoComTamanho p2 = new ProdutoComTamanho("Cal�a A","001",50,45);
		sacola.adicionaProduto(p2, 1);
		
		assertEquals(true, p1.equals(p2));
	
	}

}
