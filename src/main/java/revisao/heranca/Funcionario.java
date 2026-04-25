package revisao.heranca;

public class Funcionario {

	protected Integer codigo;
	
	protected String nome;
	
	protected String cargo;
	
	protected Double salario;

	public Funcionario(Integer codigo, String nome, String cargo, Double salario) {
		this.codigo = codigo;
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [codigo=" + codigo + ", nome=" + nome + ", cargo=" + cargo + ", salario=" + salario + "]";
	}
	
	
}
