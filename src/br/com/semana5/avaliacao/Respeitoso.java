package br.com.semana5.avaliacao;

public class Respeitoso implements FormatadorNome {
	
	private String sexo;

	@Override
	public String formatarNome(String nome, String sobrenome) {

		if ( "M".equals(this.sexo.substring(0, 1)) ) {		
			return "Sr. "+ sobrenome ;
		}else {
			return "Sra. "+ sobrenome ;
		}
	}

	public Respeitoso(String sexo) {	
		this.sexo = sexo;
	}
}
