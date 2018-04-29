package br.com.semana5.interface2;

import java.util.Date;

public class Dispositivo {

	//1 - Temos os atributos que definem as características comuns a todos os dispositivos (controle remoto, impressora, mouse, televisão e etc.);
	private String marca;
	private String modelo;
	private String cor;
	private String numeroSerie;
	private Date dataCompra;
	private Date dataCadastro;
	
	//2 - O campo booleano 'ativo' identifica se este dispositivo ainda funciona. Este campo não é de suma importância para nosso estudo de caso, mas é importante modelar um caso no mundo real;
	private boolean ativo;
	
	//3 - O campo 'tipoDispositivo' identifica qual o tipo de dispositivo que estamos usando: IMPRESSORA, SCANNER (Caso seja um scanner separado), MOUSE e etc;
	private String tipoDispositivo;
	
	//4 - Definimos um construtor onde colocamos a data de cadastro igual a data atual do sistema e o campo 'ativo' com o padrão TRUE.
	public Dispositivo() {
		this.dataCadastro = new Date();
		this.ativo = true;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public String getTipoDispositivo() {
		return tipoDispositivo;
	}

	public void setTipoDispositivo(String tipoDispositivo) {
		this.tipoDispositivo = tipoDispositivo;
	}
	
	
	
}
