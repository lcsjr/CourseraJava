package br.com.semana4.sobrescrever;

public class Colaborador {
	
	private String nome;
	protected double salarioBruto;
	protected double aliqDesconto = 0.85;
	protected double salarioLiquido;
	protected final double taxaFixaDesconto = 150.0;
	
	Colaborador(){
		
	}
	
	Colaborador( String nome, double salarioBruto){
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		
	}

	
	public double calculoLiquido1() {
		
		if (this.salarioBruto == 0 ) {
			System.out.println("Salário Bruto não definido.");
			return 0;
		}
		
		this.salarioLiquido = (this.salarioBruto * this.aliqDesconto) - this.taxaFixaDesconto;
		
		return this.salarioLiquido;
	}
	
	public double calculoLiquido2() {
		
		if (this.salarioBruto == 0 ) {
			System.out.println("Salário Bruto não definido.");
			return 0;
		}
		
		this.salarioLiquido = (this.salarioBruto * this.aliqDesconto) - this.taxaFixaDesconto;
		
		return this.salarioLiquido;
	}

	public double getAliqDesconto() {
		return aliqDesconto;
	}

	public void setAliqDesconto(double aliqDesconto) {
		this.aliqDesconto = aliqDesconto;
	}

	public double getTaxaFixaDesconto() {
		return taxaFixaDesconto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double getSalarioLiquido() {
		return salarioLiquido;
	}
}
