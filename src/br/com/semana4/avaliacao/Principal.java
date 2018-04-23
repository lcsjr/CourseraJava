package br.com.semana4.avaliacao;


public class Principal {

	public static void main(String[] args) {
		
		CarrinhoDeCompras sacola = new CarrinhoDeCompras();
		
		ProdutoComTamanho p1 = new ProdutoComTamanho("Cal�a A","001",12,45);
		sacola.adicionaProduto(p1, 1);
		
		ProdutoComTamanho p3 = new ProdutoComTamanho("Cal�a B","002",21,45);
		sacola.adicionaProduto(p3, 1);		

		ProdutoComTamanho p4 = new ProdutoComTamanho("Cal�a C","003",12,45);
		sacola.adicionaProduto(p4, 1);
		
		ProdutoComTamanho p5 = new ProdutoComTamanho("Cal�a C","003",12,47);
		sacola.adicionaProduto(p5, 1);
		
		ProdutoComTamanho p2 = new ProdutoComTamanho("Cal�a A","001",12,45);
		sacola.adicionaProduto(p2, 1);
		
		sacola.imprimeProdutos();
		
		
		System.out.println();
		
		sacola.removeProduto(p1, 1);
		sacola.removeProduto(p3, 1);
		
		System.out.println();
		
		sacola.imprimeProdutos();
		sacola.calculaValorTotal();
		
	
	}

}
