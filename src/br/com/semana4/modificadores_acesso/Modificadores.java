package br.com.semana4.modificadores_acesso;

public class Modificadores {
	
	int modificadorDefault;
	public int modificadorPublico;
	protected int modificadorProtegido;
	private int modificadorPrivado;
	
	public void naPropriaClasse() {
		
		modificadorDefault = 0;
		modificadorPublico = 0;
		modificadorProtegido = 0;
		modificadorPrivado =0;
	}

}
