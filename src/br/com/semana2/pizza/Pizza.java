package br.com.semana2.pizza;

import java.util.HashMap;
import java.util.Map;

public class Pizza {
	
	Map<String, Integer> listaIngredientes = new HashMap<String, Integer>();
	static int ingredientes ;
	
	void adicionaIngrediente( String ingrediente ) {
		listaIngredientes.put(ingrediente, 1);
		ingredientes = contabilizaIngrediente();
		
	}
	
	public double getPreco() {
	
		double preco = 0;
		
		if (ingredientes <= 2) {
			preco = 15;
		} else if ( ingredientes >= 2 || ingredientes <=5 ) {
			preco = 20;
		}else if (ingredientes > 5) {
			preco = 23;
		}
		
		return preco;
	}
	
	static int contabilizaIngrediente() {
		return ingredientes + 1;
	}

}
