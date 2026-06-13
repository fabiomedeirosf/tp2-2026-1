package br.fatec.tp2.financeira.padroes.mvc.model.repository;

import java.util.ArrayList;
import java.util.List;

import br.fatec.tp2.financeira.padroes.mvc.model.dto.Venda;

public class VendaRepository {

	private static List<Venda> listaVenda = new ArrayList<>();
	
	public Venda salvar(Venda venda) {
		listaVenda.add(venda);
		
		return venda;
	}
	
	public List<Venda> listar() {
		return listaVenda;
	}
}
