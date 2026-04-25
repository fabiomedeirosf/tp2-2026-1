package br.fatec.tp2.financeira;

public class ZePay extends BancoPadrao {

	@Override
	public void depositar(Conta conta, Double valor) {
		
		Double incentivo = 0D;
		
		if(valor <= 1000) {
			incentivo = valor * 0.05;
		} else  if(valor >1000 && valor <= 10000) {
			incentivo = valor * 0.02;
		}
		
		conta.alterarSaldo(valor);
		conta.alterarSaldo(incentivo);
		
	}

}
