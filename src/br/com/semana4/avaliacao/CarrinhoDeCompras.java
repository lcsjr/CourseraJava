package br.com.semana4.avaliacao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class CarrinhoDeCompras {
	
	private Map<ProdutoComTamanho, Integer> produtos = new HashMap<>();
	private int valorTotal;

	public void adicionaProduto(ProdutoComTamanho produto, Integer quantidade) {
		
		if (!produtos.keySet().contains(produto) ) {
			produtos.put(produto,  quantidade );
		}  else {
			int qtdeAtual = produtos.get(produto) + quantidade;
			produtos.replace(produto, qtdeAtual);
		}
	}
	
	public void imprimeProdutos() {
		
		System.out.println("Produtos no Carrinho de Compras:");
		
		for( ProdutoComTamanho prod : produtos.keySet() ) {

			System.out.println("Codigo: "+ prod.getCodigo() + " - Produto:" + prod.getNome() + " - Tamanho: " + prod.getTamanho()  + 
					" - Quantidade: " + produtos.get(prod) + " - Valor: R$ " + prod.getPreco() );
			
		}
		System.out.println();
	}
	
	public void removeProduto(ProdutoComTamanho produto, Integer quantidade) {

		Iterator it =  produtos.keySet().iterator();

		 while(it.hasNext()) {
		     Object prod=it.next();
		     
		     if (produto.equals(prod)){
		    	 
		    	 int qtdeAtual = produtos.get(prod) - quantidade;
		    	 
		    	 if ( qtdeAtual > 0 ) {
						System.out.println(" Aualizado.. " + produto.getCodigo() +"-"+produto.getNome() +" -> Qtd.: " + qtdeAtual);
						produtos.replace(produto, qtdeAtual);
		    	 } else {
		    		 System.out.println(" Removendo.. " + produto.getCodigo() +"-"+produto.getNome() +" -> Qtd.: " + qtdeAtual);
		    		 it.remove();
		    	 }
		     }
		 }			
	}
	
	public int calculaValorTotal() {
		
		for( ProdutoComTamanho prod : produtos.keySet() ) {
			valorTotal += prod.getPreco() ;		
		}
		
		System.out.println("----------------------------------------------------");
		System.out.println("-- O Valor Total da Compra é: R$ " + valorTotal );
		System.out.println("----------------------------------------------------");
		
		return valorTotal;
	}
}
