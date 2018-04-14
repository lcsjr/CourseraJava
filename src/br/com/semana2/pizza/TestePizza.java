package br.com.semana2.pizza;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestePizza {

	@Before
	public void tesZeraIngredientes() {
		Pizza.zeraIngrediente();
	}
	@Test
	public void testPizzaComIngredientes() {
		
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Frango");
		p1.adicionaIngrediente("Mussarela");
		
		assertEquals(2, Pizza.ingredientes);
			
	}
	
	@Test
	public void testPizzaComValor() {
		
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Frango");
		p1.adicionaIngrediente("Mussarela");
		
		assertEquals(15, p1.valorPizza) ;
			
	}
	
	@Test
	public void testPizzaSemIngredientes() {
		
		Pizza p1 = new Pizza();
		assertEquals(0, Pizza.ingredientes) ;	
	}
	
	
	@Test
	public void testCarrinhoValor() {
		
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Frango");
		p1.adicionaIngrediente("Mussarela");
		
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("Frango");
		p2.adicionaIngrediente("Mussarela");
		
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaItem(p1.listaIngredientes, p1.valorPizza);
		carrinho.adicionaItem(p2.listaIngredientes, p2.valorPizza);
		
		assertEquals(30, carrinho.valorTotal) ;

		
	}
	
	@Test
	public void testCarrinhoQtdeIngredientes() {
		
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Frango");
		p1.adicionaIngrediente("Mussarela");
		
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("Frango");
		p2.adicionaIngrediente("Mussarela");
		
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaItem(p1.listaIngredientes, p1.valorPizza);
		carrinho.adicionaItem(p2.listaIngredientes, p2.valorPizza);
		
		assertEquals(4, Pizza.ingredientes);
		
	}
	
	@Test
	public void testCarrinhoAddSemIngredientes() {
		
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Frango");
		p1.adicionaIngrediente("Mussarela");
		
		Pizza p2 = new Pizza();
			
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaItem(p1.listaIngredientes, p1.valorPizza);
		carrinho.adicionaItem(p2.listaIngredientes, p2.valorPizza);

		assertEquals(false, carrinho.adicionaItem(p2.listaIngredientes, p2.valorPizza));

		
	}
	
}
