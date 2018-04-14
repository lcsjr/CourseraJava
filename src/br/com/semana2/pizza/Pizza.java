package br.com.semana2.pizza;

import java.util.HashMap;
import java.util.Map;

public class Pizza {
	
	Map<String, Integer> listaIngredientes = new HashMap<String, Integer>();
	int valorPizza;
	int qtdeIngredientes;
	static int ingredientes ;
	
	void adicionaIngrediente( String ingrediente ) {
		qtdeIngredientes += 1;
		getPreco();
		ingredientes = contabilizaIngrediente();
		listaIngredientes.put(ingrediente, qtdeIngredientes );
	}
	
	public int getPreco() {
	

		if (qtdeIngredientes <= 2) {
			valorPizza = 15;
		} else if ( qtdeIngredientes >= 2 || qtdeIngredientes <=5 ) {
			valorPizza = 20;
		}else if (qtdeIngredientes > 5) {
			valorPizza = 23;
		}
		
		return valorPizza;
	}
	
	static int contabilizaIngrediente() {
		return ingredientes + 1;
	}

	static void zeraIngrediente() {
		ingredientes = 0;
	}

}
