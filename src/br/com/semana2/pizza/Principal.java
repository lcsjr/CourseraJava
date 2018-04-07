package br.com.semana2.pizza;

public class Principal {

	public static void main(String[] args) {
		
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Frango");
		p1.adicionaIngrediente("Mussarela");
		//System.out.println( Pizza.ingredientes );
		//System.out.println(p1.listaIngredientes);
		//System.out.println(p1.valorPizza);
		//System.out.println();
		
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("Calabresa");
		p2.adicionaIngrediente("Atum");
		p2.adicionaIngrediente("Margarita");
		//System.out.println( Pizza.ingredientes );
		//System.out.println(p2.listaIngredientes);
		//System.out.println(p2.valorPizza);
		//System.out.println();
	
		Pizza p3 = new Pizza();

		Pizza p4 = new Pizza();
		p4.adicionaIngrediente("Calabresa");
		p4.adicionaIngrediente("Atum");
		p4.adicionaIngrediente("Margarita");
		p4.adicionaIngrediente("Frango Catupiry");
		//System.out.println( Pizza.ingredientes );
		//System.out.println(p2.listaIngredientes);
		//System.out.println(p2.valorPizza);
		//System.out.println();
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaItem(p1.listaIngredientes, p1.valorPizza);
		carrinho.adicionaItem(p2.listaIngredientes, p2.valorPizza);
		carrinho.adicionaItem(p3.listaIngredientes, p3.valorPizza);
		carrinho.adicionaItem(p4.listaIngredientes, p4.valorPizza);
		System.out.println(carrinho.listaCompras);
		System.out.println("Valor total das Pizzas: "+carrinho.valorTotal);
		
	
	}

}
