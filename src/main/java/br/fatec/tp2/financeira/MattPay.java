package br.fatec.tp2.financeira;

public class MattPay extends BancoPadrao {
	
	@Override
	public void sacar(Conta conta, Double valor) {
				
		if(conta.getSaldo() <= 0) {
			throw new IllegalArgumentException("Limite e uso: " + conta.getSaldo());
		}
		
		Double limite = conta.getSaldo() * 0.1; //10%
		
		if( valor > (conta.getSaldo() + limite)) {
			throw new IllegalArgumentException("Saldo + limite invário " + conta.getSaldo() +
					" Limite: " + limite +
					" Total Disponĩvel: " + (conta.getSaldo() + limite));
		}
		
		conta.alterarSaldo(-valor);
		
	}
}
