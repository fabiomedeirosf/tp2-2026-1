package revisao.heranca.dsm;

import revisao.heranca.Calculadora;

/**
 * Deseja-se mo
 */
public class CalculadoraFatec extends Calculadora {

	private Double valor;
	
	public CalculadoraFatec(Double valor) {
	
		this.valor = valor;
		super.valor = valor * 3;
		
		System.out.println("Construtor: " + valor);	
		
	}
	
	public Double getValor() {
		return valor;
	}
	
	public Double getValorHerdado() {
		return super.valor;
	}
	
}
