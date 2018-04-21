package br.com.semana4.sobrescrever;

public class Teste {

	public static void main(String[] args) {
		
		Colaborador c1 = new Colaborador();
		c1.setNome("Luiz");
		c1.setSalarioBruto(10000.00);
		c1.setAliqDesconto(0.60);
		
		System.out.println("Nome: " + c1.getNome() );
		System.out.println("Salario Bruto:" + c1.getSalarioBruto() );
		System.out.println("Aliq Desconto: " + c1.getAliqDesconto() );
		System.out.println("Taxa Fixa: " +  c1.getTaxaFixaDesconto() );
		System.out.println("Salario Liquido 1: " + c1.calculoLiquido1() );
		System.out.println("Salario Liquido 2: " + c1.calculoLiquido2() );

		System.out.println();
		
		Coordenador c2 = new Coordenador();
		c2.setNome("Luiz Santos");
		c2.setSalarioBruto(10000.00);
		c2.setBonus(500.0);
		System.out.println("Nome: " + c2.getNome() );
		System.out.println("Salario Bruto:" + c2.getSalarioBruto());
		System.out.println("Aliq Desconto: " + c2.getAliqDesconto() );
		System.out.println("Taxa Fixa: " +  c2.getTaxaFixaDesconto() );
		System.out.println("Bonus:" + c2.getBonus());
		System.out.println("Salario Liquido 1: " + c2.calculoLiquido1());
		System.out.println("Salario Liquido 2: " + c2.calculoLiquido2());


		

	}

}
