package revisao2;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {

	private String nome;
	
	private String cargo;
	
	private Double salario;
	
	private List<Double> historicoSalarios = new ArrayList<Double>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome == null || nome.isEmpty() || nome.trim().length() <= 5) {
			System.err.println("Nome invãlido");
		}
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		if(salario == null || salario <= 0) {
			System.err.println("salário invalido");
			return;
		}
		
		//registra o historico de salarios
		this.historicoSalarios.add(salario);
		this.salario = salario;
	}
	
	public List<Double> getHistoricoSalarios() {
		return this.historicoSalarios;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cargo=" + cargo + ", salario=" + salario + "]";
	}
	
	
	
	
}
