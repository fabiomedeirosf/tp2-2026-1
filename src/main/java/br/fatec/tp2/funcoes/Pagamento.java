package br.fatec.tp2.funcoes;

public class Pagamento {

	private Integer parcela;
	
	private Double amortizacao;
	
	private Double valorJuros;
	
	private Double saldoDevedor;
	
	private Double valorParcela;

	public Integer getParcela() {
		return parcela;
	}

	public void setParcela(Integer parcela) {
		this.parcela = parcela;
	}

	public Double getAmortizacao() {
		return amortizacao;
	}

	public void setAmortizacao(Double amortizacao) {
		this.amortizacao = amortizacao;
	}

	public Double getValorJuros() {
		return valorJuros;
	}

	public void setValorJuros(Double valorJuros) {
		this.valorJuros = valorJuros;
	}

	public Double getSaldoDevedor() {
		return saldoDevedor;
	}

	public void setSaldoDevedor(Double saldoDevedor) {
		this.saldoDevedor = saldoDevedor;
	}

	public Double getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(Double valorParcela) {
		this.valorParcela = valorParcela;
	}

	@Override
	public String toString() {
		return "Pagamento [parcela=" + parcela + ", amortizacao=" + amortizacao + ", valorJuros=" + valorJuros
				+ ", saldoDevedor=" + saldoDevedor + ", valorParcela=" + valorParcela + "]";
	}
	
	
}
