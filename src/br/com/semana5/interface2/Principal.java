package br.com.semana5.interface2;

import java.awt.image.BufferedImage;

public class Principal {

	public static void main(String[] args) {
		
		//1
		/*
		 * Capturamos o Scanner atual e armazenamos em uma variável do tipo Scanner, depois chamamos o método digitalizar() na variável scanner 
		 * que retorna um objeto BufferedImage. Lembre-se que interfaces não podem ser instanciadas, neste caso estamos usando ela apenas como 
		 * uma “Referência” ao objeto em questão, que na verdade é uma instancia da classe Impressora mas pode ser referenciado por Scanner;
		 */
		Scanner scanner = Util.getScannerAtual();
		BufferedImage imagemDigitalizada = scanner.digitalizar();
		
		//2
		/*
		 * Capturamos o Fax atual e armazenamos em um variável do tipo Fax, depois chamamos o método enviarFax() com os texto “ola mundo” e o número de destino 
		 * no formato (+55 DDD e número). O método receberFax() nos retorna o texto lido através de uma String;
		 */
		Fax fax = Util.getFaxAtual();
		String numeroDestino = "551198-0099011";
		fax.enviarFax("Olá Mundo!", numeroDestino);
		String faxRecebido = fax.receberFax(numeroDestino);

		//3
		/*
		 * Capturamos a Copiadora e executamos o método copiarDocumento() passando como parâmetro o valor 10, o que significa que serão impressas 10 cópias do documento.
		 */
		Copiadora cop = Util.getCopiadora();
		cop.copiarDocumento(10);
		
		//4
		/*
		 * Capturamos o Printer, ou seja, a impressora que “apenas imprime” e executamos o método imprimir() passando os dados que queremos imprimir e a quantidade de folhas desejadas.
		 */
		Printer printer = Util.getPrinter();
		String dados = "Ola Mundo";
		printer.imprimir(dados.getBytes(), 1);
	}

}
