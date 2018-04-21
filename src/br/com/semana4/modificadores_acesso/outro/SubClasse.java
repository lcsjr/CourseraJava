package br.com.semana4.modificadores_acesso.outro;

import br.com.semana4.modificadores_acesso.Modificadores;

public class SubClasse extends Modificadores {

	public void testeAcesso() {
		
		modificadorProtegido = 0;
		modificadorPublico = 0;
		
		/*
		 * NA SubClasse os modificadores abaixo não podem ser acessados.
		 * 
		modificadorDefault = 0;
		modificadorPrivado = 0;
		*/
	}
}
