package br.com.semana5.avaliacao.idade_signo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Pessoa {
	
	private Date dataNascimento;
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

	public Pessoa(String d) {
		
		d = d.replace( "/", "-");
	    String dateInString = d;
        try {
        	this.dataNascimento = sdf.parse(dateInString);
        	System.out.println( sdf.format(dataNascimento));
        } catch (ParseException e) {
            e.printStackTrace();
        }		
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public int getIdade() {
		
		Date hoje = new Date();
		String[] dtHoje = sdf.format(hoje).split("-");
		String[] dtNasc = sdf.format(dataNascimento).split("-");	
	
		int idade = 0;
		idade = Integer.parseInt(dtHoje[2]) - Integer.parseInt(dtNasc[2]);
		
		if(Integer.parseInt(dtNasc[1]) > Integer.parseInt(dtHoje[1]))
			idade--;
		else if(Integer.parseInt(dtNasc[1]) == Integer.parseInt(dtHoje[1]) && Integer.parseInt(dtNasc[0]) > Integer.parseInt(dtHoje[0]))
			idade--;
		
		return idade;
	}



	public String getSigno() {
		
		String[] dtNasc = sdf.format(dataNascimento).split("-");	
		int dia = Integer.parseInt(dtNasc[0]);
		int mes = Integer.parseInt(dtNasc[1]);
		
		// Áries: 21 de março - 20 de abril
		if ( ( mes == 3  &&  (dia >= 21 && dia <=31) ) || ( mes == 4 &&  ( dia <= 20 && dia >= 1 )) ){
			return "Áries";
		} else 
			// Touro: 21 de abril - 20 de maio
			if ( ( mes == 4  &&  (dia >= 21 && dia <=31) ) || ( mes == 5 &&  ( dia <= 20 && dia >= 1 )) ){
			return "Touro";
		} else
		// Gêmeos: 21 de maio - 20 de junho
		if ( ( mes == 5  &&  (dia >= 21 && dia <=31) ) || ( mes == 6 &&  ( dia <= 20 && dia >= 1 )) ){
		return "Gemeos";
		} else 
		// Câncer: 21 de junho - 21 de julho
		if ( ( mes == 6  &&  (dia >= 21 && dia <=31) ) || ( mes == 7 &&  ( dia <= 21 && dia >= 1 )) ){
			return "Câncer";
		} else
		// Leão: 22 de julho - 22 de agosto
		if ( ( mes == 7  &&  (dia >= 22 && dia <=31) ) || ( mes == 8 &&  ( dia <= 22 && dia >= 1 )) ){
			return "Leão";
		} else
		// Virgem: 23 de agosto - 22 de setembro
		if ( ( mes == 8  &&  (dia >= 23 && dia <=31) ) || ( mes == 9 &&  ( dia <= 22 && dia >= 1 )) ){
			return "Virgem";
		} else
		// Libra: 23 de setembro - 22 de outubro
		if ( ( mes == 9  &&  (dia >= 23 && dia <=31) ) || ( mes == 10 &&  ( dia <= 22 && dia >= 1 )) ){
			return "Libra";
		} else
		// Escorpião: 23 de outubro - 21 de novembro
		if ( ( mes == 10  &&  (dia >= 23 && dia <=31) ) || ( mes == 11 &&  ( dia <= 21 && dia >= 1 )) ){
			return "Escorpião";
		} else
		// Sagitário: 22 de novembro - 21 de dezembro
		if ( ( mes == 11  &&  (dia >= 22 && dia <=31) ) || ( mes == 12 &&  ( dia <= 21 && dia >= 1 )) ){
			return "Sargitário";
		} else
		// Capricórnio: 22 de dezembro - 20 de janeiro
		if ( ( mes == 12  &&  (dia >= 22 && dia <=31) ) || ( mes == 1 &&  ( dia <= 20 && dia >= 1 )) ){
			return "Capricórnio";
		}else
		// Aquário: 21 de Janeiro - 19 de fevereiro
		if ( ( mes == 1  &&  (dia >= 21 && dia <=31) ) || ( mes == 2 &&  ( dia <= 19 && dia >= 1 )) ){
			return "Aquário";
		}else
		// Peixes: 20 de fevereiro - 20 de março
		if ( ( mes == 2  &&  (dia >= 20 && dia <=31) ) || ( mes == 3 &&  ( dia <= 20 && dia >= 1 )) ){
			return "Peixes";
		}

		return null;
	}

	 
	
}
