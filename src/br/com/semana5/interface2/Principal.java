package br.com.semana5.interface2;

import java.awt.image.BufferedImage;

public class Principal {

	public static void main(String[] args) {
		
		//1
		/*
		 * Capturamos o Scanner atual e armazenamos em uma vari�vel do tipo Scanner, depois chamamos o m�todo digitalizar() na vari�vel scanner 
		 * que retorna um objeto BufferedImage. Lembre-se que interfaces n�o podem ser instanciadas, neste caso estamos usando ela apenas como 
		 * uma �Refer�ncia� ao objeto em quest�o, que na verdade � uma instancia da classe Impressora mas pode ser referenciado por Scanner;
		 */
		Scanner scanner = Util.getScannerAtual();
		BufferedImage imagemDigitalizada = scanner.digitalizar();
		
		//2
		/*
		 * Capturamos o Fax atual e armazenamos em um vari�vel do tipo Fax, depois chamamos o m�todo enviarFax() com os texto �ola mundo� e o n�mero de destino 
		 * no formato (+55 DDD e n�mero). O m�todo receberFax() nos retorna o texto lido atrav�s de uma String;
		 */
		Fax fax = Util.getFaxAtual();
		String numeroDestino = "551198-0099011";
		fax.enviarFax("Ol� Mundo!", numeroDestino);
		String faxRecebido = fax.receberFax(numeroDestino);

		//3
		/*
		 * Capturamos a Copiadora e executamos o m�todo copiarDocumento() passando como par�metro o valor 10, o que significa que ser�o impressas 10 c�pias do documento.
		 */
		Copiadora cop = Util.getCopiadora();
		cop.copiarDocumento(10);
		
		//4
		/*
		 * Capturamos o Printer, ou seja, a impressora que �apenas imprime� e executamos o m�todo imprimir() passando os dados que queremos imprimir e a quantidade de folhas desejadas.
		 */
		Printer printer = Util.getPrinter();
		String dados = "Ola Mundo";
		printer.imprimir(dados.getBytes(), 1);
	}

}
