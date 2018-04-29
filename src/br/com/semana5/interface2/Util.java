package br.com.semana5.interface2;

import java.util.Date;

public class Util {

	//1 - Nosso objeto impressora armazena a instancia atual que foi criada da impressora, ou seja, teremos apenas uma inst�ncia por aplica��o;
	private static Impressora impressora;
	
	private static Impressora getImpressoraInstance() {
		if (impressora == null) {
			impressora = new Impressora();
			impressora.setCor("Branca");
			impressora.setDataCompra( new Date());
			impressora.setMarca("Epson");
			impressora.setModelo("Modelo-XPTO");
			impressora.setNumeroSerie("NumSerie-1234567890");
		}
		return impressora;
	}
	
	//2
	/*
	 * O m�todo getScannerAtual() retorna a impressora atual como um Scanner. Neste ponto estamos partindo do principio que o Scanner faz parte da impressora, 
	 * mas se fosse aquele caso de possuir um Scanner separado? Simplesmente n�s mudar�amos o comportamento do m�todo getScannerAtual(), 
	 * de alguma forma ele iria retornar o Scanner seja f�sico, remoto ou virtual, realmente n�o importa para o programa principal. 
	 * Perceba que neste ponto a interface � de grande valia, pois no nosso programa principal n�s usaremos apenas as interfaces, como a Scanner, 
	 * sendo assim n�o importa de onde ela vem, apenas que ela pode ser usada para cumprir com as fun��es b�sicas de um Scanner.
	 * 
	 * Quando chegamos neste ponto do artigo come�a a ficar mais claro porque fizemos toda essa divis�o e estrutura modularizada. 
	 * Nosso programa tem uma estrutura pronta para funcionar de forma mais gen�rica poss�vel, possibilitando a mudan�a radical 
	 * de comportamento sem mudan�a de estrutura. Imagine que hoje nossa Copiadora pode ser acoplada a impressora mas amanh� n�s compramos uma Copiadora 
	 * profissional da XEROX e isso n�o far� a menor diferen�a para a estrutura do nosso projeto;
	 */
    public static Scanner getScannerAtual() {
        return getImpressoraInstance();
	  }
	
	// 3 - O m�todo getFaxAtual() retorna a impressora atual como um Fax, seguindo a mesma l�gica do item 2
    public static Fax getFaxAtual() {
        return getImpressoraInstance();
  }

    // 4 - O m�todo getCopiadora() retorna a impressora atual como uma Copiadora, seguindo a mesma l�gica do item 2;
    public static Copiadora getCopiadora() {
        return getImpressoraInstance();
  }

    // 5 - O m�todo getPrinter() retorna a impressora atual como uma Impressora simples (apenas fun��o de imprimir), seguindo a mesma l�gica do item 2. 
    //N�o confunda com nossa classe Impressora, a nossa interface Printer possui apenas a fun��o de imprimir, enquanto que a classe Impressora possui todas as nossas interfaces;
    public static Printer getPrinter() {
        return getImpressoraInstance();
  }
  
    //6 - O m�todo getImpressora() retorna a impressora como sendo uma Impressora Multifuncional
    public static Multifuncional getImpressora() {
        return getImpressoraInstance();
  }

}
