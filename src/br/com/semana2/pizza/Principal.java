package br.com.semana2.pizza;

public class Principal {

	public static void main(String[] args) {
		
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Frango");
		p1.adicionaIngrediente("Mussarela");
		System.out.println( Pizza.ingredientes );
		System.out.println(p1.listaIngredientes);
		System.out.println();
		
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("Calabresa");
		p2.adicionaIngrediente("Atum");
		System.out.println( Pizza.ingredientes );
		System.out.println(p2.listaIngredientes);
		System.out.println();
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras(p1);
		System.out.println(carrinho.pizzas.listaIngredientes);
	}

}
