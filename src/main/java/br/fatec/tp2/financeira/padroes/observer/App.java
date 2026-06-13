package br.fatec.tp2.financeira.padroes.observer;

public class App {

	public static void main(String...strings) {
		
		VendaSubject vendaSubject = new VendaSubject();
		
		Observer email = new EmailObserver();
		Observer estoque = new EstoqueObserver();
		Observer sms = new SMSObserver();
		
		vendaSubject.register(sms);
		vendaSubject.register(estoque);
		vendaSubject.register(email);
		
		Venda v1 = new Venda();
		v1.setCliente("Joao");
		v1.setValor(4009.99);
		
		Venda v2 = new Venda();
		v2.setCliente("Ana");
		
		vendaSubject.update(v1);
		vendaSubject.update(v2);
		
	}
}
