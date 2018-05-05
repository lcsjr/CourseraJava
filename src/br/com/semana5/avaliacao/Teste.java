package br.com.semana5.avaliacao;

public class Teste {

	public static void main(String[] args) {
		
		Informal informal = new Informal();
		Autoridade a = new Autoridade("luiz","santos",informal);
		System.out.println( a.getTratamento());
		
		Respeitoso respeitoso = new Respeitoso("Masculino");
		Autoridade b = new Autoridade("luiz","santos",respeitoso);
		System.out.println( b.getTratamento());
		
		ComTitulo comTitulo = new ComTitulo("Excelentíssimo");
		Autoridade c = new Autoridade("luiz","santos",comTitulo);
		System.out.println( c.getTratamento());

	}

}
