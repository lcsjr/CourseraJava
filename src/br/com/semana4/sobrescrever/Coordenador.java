package br.com.semana4.sobrescrever;

public class Coordenador extends Colaborador{

	private double bonus ;
	
	@Override
	public double calculoLiquido1() {
		
		// EXECUTA O DEFAULT DO METODO
		super.calculoLiquido1();
		
		double valorLiquido = this.getSalarioLiquido() + this.bonus;
		
		return valorLiquido;
	}
	
	@Override
	public double calculoLiquido2() {
			
		// CONSEGUI ACESSAR O ATRIBUTO PORQUE ESTÃO DEFINIDO COMO PROTECTED
		if ( this.salarioBruto == 0 ) {
			System.out.println("Salário Bruto não definido.");
			return 0;
		}
		
		this.salarioLiquido = (this.salarioBruto * this.aliqDesconto) ;
		this.salarioLiquido -= (this.taxaFixaDesconto * 2) ;
		
		return this.salarioLiquido;

	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
}
