package br.fatec.tp2.funcoes;

/*
 * Um comercio precisa de um sistema que gerencia suas vendas
 * ao que se refere ao financiamento;crediário.
 * 
 * Para tanto o comércio utiliza a seguinte regra:
 * -> pagamento a vista 10% de desco
 * -> pagamento a prazo é aplicado júros compostos
 * 
 * Crie função que dado o valor da compra e o número de parcelas
 * calcule o valor de cada parcela considerando uma taxa de júros
 * 
 * Mostre ao final a relação de parcelas, valores e o total
 * a ser pago.
 * 
 */
public class Funcao4 {

	public static void main(String... args) {
		
		Pagamento listaPagamentos[] = financiamento(1000D, 5, 5D);
		Double totalPagamento = 0D;
		
//		for(int i = 0; i < listaPagamentos.length; i++) {
//			System.out.println(listaPagamentos[i]);
//			totalPagamento += listaPagamentos[i].getValorParcela();
//		}
		
		//for(TipoDadoDaLista var : lista)
		
		for(Pagamento p : listaPagamentos) {
			System.out.println(p);
			totalPagamento += p.getValorParcela();
		}
		
		System.out.println("Valor Final: " + totalPagamento);
	}
	
	public static Pagamento[] financiamento(Double valor, Integer parcelas, Double taxa) {
		
		Double parcelaFixa = valor / parcelas;
		Double saldoDevedor = valor;	
		Pagamento listaPagamentos[] = new Pagamento[parcelas];
		
		for(int i = 0; i < parcelas; i++) {
			Double juros = saldoDevedor * taxa / 100;
			Double valorParcela = parcelaFixa + juros;
			
			Pagamento p = new Pagamento();
			p.setParcela(i + 1);
			p.setAmortizacao(parcelaFixa);
			p.setSaldoDevedor(saldoDevedor);
			p.setValorJuros(juros);
			p.setValorParcela(valorParcela);
			
			//armazenam-se cada pagamento em posição do array
			listaPagamentos[i] = p;			
			saldoDevedor = saldoDevedor - parcelaFixa;
		}
		return listaPagamentos;		
	}
}
