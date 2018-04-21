package br.com.semana4.modificadores_acesso;

public class OutraMesmoPacote {
	
	public void testeAcesso() {
		Modificadores modif = new Modificadores();
		
		/* 
		-> POR ESTAR NO MESMO PACOTE, OS ATRIBUTOS PODEM SER ACESSADOS EXCETO DE MODO PRIVATE.
		
		modif.modificadorPrivado = 0;
		
		 */
		modif.modificadorDefault = 0;
		modif.modificadorProtegido = 0;
		modif.modificadorPublico = 0;
		
	}
}
