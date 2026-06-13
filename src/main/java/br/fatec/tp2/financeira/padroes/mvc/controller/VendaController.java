package br.fatec.tp2.financeira.padroes.mvc.controller;

import java.util.List;

import br.fatec.tp2.financeira.padroes.mvc.model.business.VendaBusiness;
import br.fatec.tp2.financeira.padroes.mvc.model.business.VendaBusinessImpl;
import br.fatec.tp2.financeira.padroes.mvc.model.dto.Venda;

public class VendaController {

	private VendaBusiness vendaBusiness = new VendaBusinessImpl();
	
	/**
	 * Recebe do view e converte e aciona par ao model
	 * @param cliente
	 * @param tipo
	 * @param valor
	 * @return
	 */
	public Venda criarVenda(String cliente, String tipo, Double valor) {
		
		Venda novaVenda = new Venda();
		novaVenda.setCliente(cliente);
		novaVenda.setTipoVenda(tipo);
		novaVenda.setValorVenda(valor);
		
		return this.vendaBusiness.criarVenda(novaVenda);
	}
	
	public List<Venda> listar() {
		return null;
	}
}
