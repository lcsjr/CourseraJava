package br.com.semana5.avaliacao;

public class Autoridade   {
	
	private String nome;
	private String sobrenome;
	FormatadorNome f ;
	
	public Autoridade(String nome, String sobrenome, FormatadorNome o) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.f = o;
	}

	public String getTratamento() {	
		return  f.formatarNome(nome, sobrenome);
	}
	
	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	
}
