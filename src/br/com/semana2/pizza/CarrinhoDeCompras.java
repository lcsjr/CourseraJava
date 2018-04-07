package br.com.semana2.pizza;

import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {

	Map<String, Integer> listaCompras = new HashMap<String, Integer>();
	int valorTotal;
	
	
	void adicionaItem( Map<String, Integer> listaIngredientes, int valor ) {

		if (listaIngredientes.isEmpty() ){
			System.out.println("Não é possível Adicionar uma pizza sem ingredientes!");
			System.out.println();
			return ;
		}
		
		listaCompras.put(listaIngredientes.toString(), valor);
		valorTotal += valor;
	}
	
}
