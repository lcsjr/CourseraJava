package br.com.semana5.interface1_concurso;

public class Candidato implements Comparable<Candidato> {
	
	private int nota;
	private boolean deficiente;
	private int idade;

	public Candidato(int nota, boolean deficiente, int idade) {
		super();
		this.nota = nota;
		this.deficiente = deficiente;
		this.idade = idade;
	}



	@Override
	public int compareTo(Candidato outroCandidato) {
		
		if (nota == outroCandidato.nota) {
			if (deficiente == outroCandidato.isDeficiente()) {
				return idade - outroCandidato.getIdade();
			}else {
				if (deficiente) {
					return 1;
				}else
					return -1;
			}
		}else {
			return nota - outroCandidato.getNota();
		}

	}
	
	@Override
	public String toString() {
		
		return nota+";"+deficiente+";"+idade;
	}



	public int getNota() {
		return nota;
	}

	public boolean isDeficiente() {
		return deficiente;
	}

	public int getIdade() {
		return idade;
	}

}
