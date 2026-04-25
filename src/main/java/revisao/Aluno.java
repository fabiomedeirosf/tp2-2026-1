package revisao;

import java.util.Date;

public class Aluno {

	String ra;
	
	String nome;
	
	String apelido;
	
	public Aluno(String ra, String nome) {
		this.ra = ra;
		this.nome = nome;
	}
	
	public Aluno(String nome) {
		this.nome = nome;
		
		//this.ra = (new Date().toGMTString());
		
		String ra =  new Double(Math.random() * 1000).toString();
		this.ra = ra;
	}
} 
