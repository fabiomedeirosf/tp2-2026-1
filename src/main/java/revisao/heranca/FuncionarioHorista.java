package revisao.heranca;

public class FuncionarioHorista extends Funcionario {

	protected Integer horas;
	
	protected Double valorHora;
	
	public FuncionarioHorista(Integer codigo, 
								String nome, 
								String cargo,
								Integer horas, 
								Double valorHora) {
		
		//construtor da classe Funcionario (pai)
		super(codigo, nome, cargo, (horas * valorHora));

		this.horas = horas;
		this.valorHora = valorHora;
		
	}
}
