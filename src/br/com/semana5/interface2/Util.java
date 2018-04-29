package br.com.semana5.interface2;

import java.util.Date;

public class Util {

	//1 - Nosso objeto impressora armazena a instancia atual que foi criada da impressora, ou seja, teremos apenas uma instância por aplicação;
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
	 * O método getScannerAtual() retorna a impressora atual como um Scanner. Neste ponto estamos partindo do principio que o Scanner faz parte da impressora, 
	 * mas se fosse aquele caso de possuir um Scanner separado? Simplesmente nós mudaríamos o comportamento do método getScannerAtual(), 
	 * de alguma forma ele iria retornar o Scanner seja físico, remoto ou virtual, realmente não importa para o programa principal. 
	 * Perceba que neste ponto a interface é de grande valia, pois no nosso programa principal nós usaremos apenas as interfaces, como a Scanner, 
	 * sendo assim não importa de onde ela vem, apenas que ela pode ser usada para cumprir com as funções básicas de um Scanner.
	 * 
	 * Quando chegamos neste ponto do artigo começa a ficar mais claro porque fizemos toda essa divisão e estrutura modularizada. 
	 * Nosso programa tem uma estrutura pronta para funcionar de forma mais genérica possível, possibilitando a mudança radical 
	 * de comportamento sem mudança de estrutura. Imagine que hoje nossa Copiadora pode ser acoplada a impressora mas amanhã nós compramos uma Copiadora 
	 * profissional da XEROX e isso não fará a menor diferença para a estrutura do nosso projeto;
	 */
    public static Scanner getScannerAtual() {
        return getImpressoraInstance();
	  }
	
	// 3 - O método getFaxAtual() retorna a impressora atual como um Fax, seguindo a mesma lógica do item 2
    public static Fax getFaxAtual() {
        return getImpressoraInstance();
  }

    // 4 - O método getCopiadora() retorna a impressora atual como uma Copiadora, seguindo a mesma lógica do item 2;
    public static Copiadora getCopiadora() {
        return getImpressoraInstance();
  }

    // 5 - O método getPrinter() retorna a impressora atual como uma Impressora simples (apenas função de imprimir), seguindo a mesma lógica do item 2. 
    //Não confunda com nossa classe Impressora, a nossa interface Printer possui apenas a função de imprimir, enquanto que a classe Impressora possui todas as nossas interfaces;
    public static Printer getPrinter() {
        return getImpressoraInstance();
  }
  
    //6 - O método getImpressora() retorna a impressora como sendo uma Impressora Multifuncional
    public static Multifuncional getImpressora() {
        return getImpressoraInstance();
  }

}
