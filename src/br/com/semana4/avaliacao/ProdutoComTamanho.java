package br.com.semana4.avaliacao;

public class ProdutoComTamanho extends Produto {

	private int tamanho ;
	
	public ProdutoComTamanho(String nome, String codigo, int preco, int tamanho) {
		super(nome, codigo, preco);

		this.tamanho = tamanho;
	}
	


	public boolean equals(Object o) {
		
		if ((o instanceof ProdutoComTamanho) && 
				((ProdutoComTamanho) o).getCodigo().equals(this.getCodigo()) && 
				((ProdutoComTamanho) o).tamanho == this.getTamanho()		)
		{
			return true;
		}else
			return false;
	}
	
	public int hashCode() {
		return getCodigo().length() + this.tamanho ;
	}
	
	public int getTamanho() {
		return tamanho;
	}

}
