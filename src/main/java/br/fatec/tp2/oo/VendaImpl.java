package br.fatec.tp2.oo;

public class VendaImpl extends VendaGenerica {

	@Override
	public Double valorVenda(Integer quantidade, Double valor) {
		return (quantidade * valor) * 1.1;
	}
	
	@Override
	public Double valorCompra(Integer quantidade, Double valor) {
		return (quantidade + valor);
	}
}
