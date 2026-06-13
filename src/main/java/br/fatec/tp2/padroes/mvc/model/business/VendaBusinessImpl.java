package br.fatec.tp2.padroes.mvc.model.business;

import br.fatec.tp2.padroes.mvc.model.dto.Venda;
import br.fatec.tp2.padroes.mvc.model.repository.VendaRepository;

public class VendaBusinessImpl implements VendaBusiness {

	private VendaRepository vendaRepository = new VendaRepository();
	
	@Override
	public Venda criarVenda(Venda venda) {
		
		venda.setComissao(this.calcularComissao(venda));
		venda.setDesconto(this.calcularDesconto(venda));
		
		venda.setTotal(venda.getValorVenda() - venda.getDesconto());
		
		Venda vendaSalva = this.vendaRepository.salvar(venda);
		return vendaSalva;
	}
	
	private Double calcularComissao(Venda venda) {
		
		if(venda.getValorVenda() <= 1000D) {
			return (venda.getValorVenda() * 0.05); //5%
		} else {
			return (venda.getValorVenda() * 0.065); //6.5%
		}
	}
	
	private double calcularDesconto(Venda venda) {
		if(venda.getTipoVenda().equals("pix")) {
			return (venda.getValorVenda() * 0.05);
		} else if(venda.getTipoVenda().equals("debito")) {
			return (venda.getValorVenda() * 0.02); 
		}
		return 0D;
	}
}
