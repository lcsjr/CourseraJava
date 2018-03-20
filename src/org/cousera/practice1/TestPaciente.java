package org.cousera.practice1;

public class TestPaciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Paciente p1 = new Paciente(95, 1.85);
		p1.calcularIMC();
		System.out.println("Seu IMC é:" + p1.getImc() );
		p1.diagnostico();
		
		Paciente p2 = new Paciente(75, 1.78);
		p2.calcularIMC();
		System.out.println("Seu IMC é:" + p2.getImc() );
		p2.diagnostico();		
		
		Paciente p3 = new Paciente(55, 1.68);
		p3.calcularIMC();
		System.out.println("Seu IMC é:" + p3.getImc() );
		p3.diagnostico();				
	}

}
