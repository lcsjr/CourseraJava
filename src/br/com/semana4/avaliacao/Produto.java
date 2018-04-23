package br.com.semana4.avaliacao;

public class Produto {

	private String nome;
	private String codigo;
	private int preco;
	
	public Produto( String nome, String codigo, int preco){
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
	}
	
	
	public boolean equals(Object o) {
		
		if ((o instanceof Produto) && 
				((Produto) o).getCodigo().equals(this.getCodigo()))
		{
			return true;
		}else
			return false;
	}
	
	public int hashCode() {
		return getCodigo().length() + getNome().length();
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public int getPreco() {
		return preco;
	}
	
	
}
