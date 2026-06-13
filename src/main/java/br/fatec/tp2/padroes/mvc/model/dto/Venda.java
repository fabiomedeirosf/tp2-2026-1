package br.fatec.tp2.padroes.mvc.model.dto;

public class Venda {

	private String cliente;
	
	private String tipoVenda;
	
	private Double valorVenda;
	
	private Double comissao;
	
	private Double desconto;
	
	private Double total;

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getTipoVenda() {
		return tipoVenda;
	}

	public void setTipoVenda(String tipoVenda) {
		this.tipoVenda = tipoVenda;
	}

	public Double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(Double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Venda [cliente=" + cliente + ", tipoVenda=" + tipoVenda + ", valorVenda=" + valorVenda + ", comissao="
				+ comissao + ", desconto=" + desconto + ", total=" + total + "]";
	}
	
	
	
}
