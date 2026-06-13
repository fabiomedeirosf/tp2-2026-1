package br.fatec.tp2.financeira.padroes.observer;

public class EstoqueObserver implements Observer {

	
	@Override
	public void processarVenda(Venda venda) {
		System.out.println("######### estoque ############");
		System.out.println(venda.getCliente());
		
	}
}
