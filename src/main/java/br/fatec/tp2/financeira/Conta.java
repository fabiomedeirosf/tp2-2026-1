package br.fatec.tp2.financeira;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Conta {
	
	private Integer codigo;
	
	private String cliente;
	
	private Double saldo;
	
	private Double valorFinanciamento;
	
	private List<String> extratoMovimentacao = new ArrayList<String>();
	
	/**
	 * Construtor sobrecarregado da conta
	 * @param codigo
	 * @param cliente
	 */
	public Conta(Integer codigo, String cliente) {
		this.cliente = cliente;
		this.codigo = codigo;
		this.saldo = 0D;
		this.valorFinanciamento = 0D;
	}
	
	public Double alterarSaldo(Double valor) {
		this.saldo += valor;
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		String lancamento = df.format(System.currentTimeMillis());
		lancamento += (valor < 0) ? "  Saque      " : "  Depósito    ";
		lancamento += valor + "\t" + this.saldo;
		
		this.extratoMovimentacao.add(lancamento);		
		
		return this.saldo;
	}
	
	public void mostrarExtrato() {
		System.out.println("#### EXTRATO BANCÁRIO #####");
		System.out.println("Cliente: " + this.cliente);
		System.out.println("Conta: " + this.codigo);
		System.out.println("Saldo atual: " + this.saldo);
		System.out.println("Financiamento: " + this.valorFinanciamento);
		
		System.out.println("------ Movimentações --------");
		System.out.println("Data              Desc       Valor\tSAldo");
		this.extratoMovimentacao.forEach(lancamento -> {
			System.out.println(lancamento);
		});
	}
	
	public Integer getCodigo() {
		return codigo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getValorFinanciamento() {
		return valorFinanciamento;
	}

	public void setValorFinanciamento(Double valorFinanciamento) {
		this.valorFinanciamento = valorFinanciamento;
	}
	
	

}
