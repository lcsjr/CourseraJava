package org.cousera.practice1;

public class Paciente {
	
	double peso; 
	double altura;
	double imc;
	
	public Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
		//this.diagnostico();
		
	}
	
	void calcularIMC() {
		this.imc = this.peso / (this.altura * this.altura);
	}
	
	void diagnostico() {
		//this.calcularIMC();
		
		if (this.imc < 16) {
			System.out.println("Baixo peso muito grave = IMC abaixo de 16 kg/m²");
		} else if (this.imc >= 16 && this.imc <= 16.99) {
				System.out.println("Baixo peso grave = IMC entre 16 e 16,99 kg/m²");
			} else if (this.imc >= 17 && this.imc <= 18.49) {
					System.out.println("Baixo peso = IMC entre 17 e 18,49 kg/m²");
				} else if (this.imc >= 18.50 && this.imc <= 24.99) {
						System.out.println("Peso normal = IMC entre 18,50 e 24,99 kg/m²");
					} else if (this.imc >= 25 && this.imc <= 29.99) {
							System.out.println("Sobrepeso = IMC entre 25 e 29,99 kg/m²");
						} else if (this.imc >= 30 && this.imc <= 34.99) {
								System.out.println("Obesidade grau I = IMC entre 30 e 34,99 kg/m²");
							} else if (this.imc >= 35 && this.imc <= 39.99) {
									System.out.println("Obesidade grau II = IMC entre 35 e 39,99 kg/m²");
								} else if (this.imc >= 40 ) {
										System.out.println("Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²");
									}	
		System.out.println();
	}

	public double getImc() {
		return imc;
	}	
	
}
