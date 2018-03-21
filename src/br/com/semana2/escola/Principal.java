package br.com.semana2.escola;

public class Principal {

	public static void main(String[] args) {
	
		// COMO SE FARIA NA PROGRAMACAO ESTRUTURADA
		Aluno luiz = new Aluno();
		luiz.bim1 = 70;
		luiz.bim2 = 60;
		luiz.bim3 = 80;
		luiz.bim4 = 70;
		
		System.out.println(VerificadoraNota.mediaAluno(luiz) );
		System.out.println(VerificadoraNota.passouDeAno(luiz));

		
		// FAZENDO VIA ORIENTADO A OBJETO
		Aluno junior = new Aluno();
		junior.bim1 = 70;
		junior.bim2 = 60;
		junior.bim3 = 80;
		junior.bim4 = 70;
		
		System.out.println(junior.media() );
		System.out.println(junior.passouDeAno());

	}

}
