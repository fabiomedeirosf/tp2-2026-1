package br.fatec.tp2.financeira;

public interface OperacoesBancarias {
	
	public abstract void depositar(Conta conta, Double valor);
	
	public void sacar(Conta conta, Double valor);

}
