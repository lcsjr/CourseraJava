package br.com.semana5.interface2;

import java.awt.image.BufferedImage;

public class Impressora extends Dispositivo implements Multifuncional {

	public Impressora() {
		setTipoDispositivo("IMPRESSORA");
	}

    /*
     * ####################################
     *  MÉTODOS DAS INTERFACES
     * ###################################
     * */
	@Override
	public BufferedImage digitalizar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void enviarFax(String texto, String numeroDestino) {
		// TODO Auto-generated method stub

	}

	@Override
	public String receberFax(String numeroOrigem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void imprimir(byte[] dados, int quantidade) {
		// TODO Auto-generated method stub

	}

	@Override
	public void copiarDocumento(int quantidade) {
		// TODO Auto-generated method stub

	}

}
