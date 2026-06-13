package br.fatec.tp2.padroes.observer;

public class EmailObserver implements Observer {

	@Override
	public void processarVenda(Venda venda) {
		System.out.println("######EmailObserver");
		System.out.println("Send mail to: " + venda.getCliente());
		
	}
}
