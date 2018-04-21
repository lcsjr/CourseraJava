package br.com.semana4.modificadores_acesso.outro;

import br.com.semana4.modificadores_acesso.Modificadores;

public class OutraClasse {

	public void testeAcesso() {
		Modificadores modif = new Modificadores();
		
		/* 
		-> POR ESTAR EM OUTRO PACOTE, ESSES ATRIBUTOS NÃO PODEM SER ACESSADOS.
		
		modif.modificadorDefault = 0;
		modif.modificadorProtegido = 0;
		modif.modificadorPrivado = 0;
		*/
		
		modif.modificadorPublico = 0;
		
	}
}
