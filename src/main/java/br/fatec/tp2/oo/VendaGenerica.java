package br.fatec.tp2.oo;

public abstract class VendaGenerica implements Venda {

	@Override
	public Double valorVenda(Integer quantidade, Double valor) {
		return quantidade * valor;
	}
	
	public abstract Double valorCompra(Integer quantidade, Double valor);
}
