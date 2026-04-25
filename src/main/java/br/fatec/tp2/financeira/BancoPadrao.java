package br.fatec.tp2.financeira;

public abstract class BancoPadrao implements OperacoesBancarias{

	@Override
	public void sacar(Conta conta, Double valor) {
		if(valor > conta.getSaldo()) {
			throw new IllegalArgumentException("Saldo insuficiente: " + conta.getSaldo());
		}
		
		conta.alterarSaldo(-valor);		
	}
	
	@Override
	public void depositar(Conta conta, Double valor) {
		
		//Regra de negocio do deposito
		if(valor <= 0) {
			throw new IllegalArgumentException("Valor negativo");
		}
		
		conta.alterarSaldo(valor);		
	}
}
