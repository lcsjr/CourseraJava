package br.com.semana5.interface2;

public interface Fax {

	public void enviarFax(String texto, String numeroDestino);
	
	public String receberFax(String numeroOrigem);
}
