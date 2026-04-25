package br.fatec.tp2.financeira;

public class CarolPay extends BancoPadrao implements Financiamento {

	@Override
	public void financiar(Conta conta, Double valor) {
		
		Double valorDisponivel = conta.getSaldo() * 5;
		
		if(valor > valorDisponivel) {
			throw new IllegalArgumentException(
					"Valor não liberado. Disponível: " + valorDisponivel);
		}
		
		//efetiva o financiamento se de acordo com a regra
		conta.setValorFinanciamento(valor);
	}

}
