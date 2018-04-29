package br.com.semana5.avaliacao;

import org.junit.Before;

public class Autoridade implements FormatadorNome  {
	
	private String nome;
	private String sobrenome;
	private int tratamento; // 1- Informal, 2- Respeitoso, 3- ComTitulo
	private String sexo; // M- Masculino, F- Feminino
	private String titulo;
	
	
	@Override
	public String formatarNome(String nome, String sobrenome) {

		if (this.tratamento == 1) {
			return nome;	
		}else if(this.tratamento == 2 ) {
			if ( "M".equals(this.sexo.substring(0, 1)) ) {		
				return "Sr. "+ sobrenome;
			}else {
				return "Sra. "+ sobrenome;
			}	
		} else {
			return this.titulo + ' ' + nome + sobrenome;
		}
	}
	
	public Autoridade(String nome) {
		this.nome = nome;
	}
	
	public Autoridade(String sexo, String sobrenome) {
		this.sexo = sexo;
		this.sobrenome = sobrenome;
	}
	
	public Autoridade(String titulo, String nome, String sobrenome) {
		this.titulo = titulo;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public String getTratamento(int i) {
		this.tratamento = i;
		
		return this.formatarNome(nome, sobrenome);
	}
	
	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}



	
}
