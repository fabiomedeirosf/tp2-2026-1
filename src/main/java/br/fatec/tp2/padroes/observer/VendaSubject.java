package br.fatec.tp2.padroes.observer;

import java.util.ArrayList;
import java.util.List;

public class VendaSubject implements Subject{

	private List<Observer> observersList = new ArrayList<>();
	
	private Venda venda;
	
	@Override
	public void register(Observer observer) {
		
		this.observersList.add(observer);
	}

	@Override
	public void unRegister(Observer observer) {
		this.observersList.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer o : this.observersList) {
			o.processarVenda(this.venda);
		}
	}
	
	public void update(Venda venda) {
		this.venda = venda;
		this.notifyObservers();
	}

}
