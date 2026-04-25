package br.fatec.tp2.financeira;

public class BancoAPP {

	public static void main(String...strings) {
		
		Conta c1 = new Conta(1111, "Joao da silva");
		Conta c2 = new Conta(222, "Carol da carol pay");
		
		OperacoesBancarias carolPay = new CarolPay();
		
		//conta do joao
		carolPay.depositar(c1, 1000D);
		carolPay.sacar(c1, 500D);
		System.out.println(c1.getSaldo());
		
		 
		carolPay.depositar(c2, 10000000D);
		
		//Financiamento
		Financiamento carolFinan = new CarolPay();
		carolFinan.financiar(c1, 1000D);
		
		c1.mostrarExtrato();
		
		//Ze pay
		OperacoesBancarias zePay = new ZePay();
		Conta c3 = new Conta(333, "Ze pay: o dono");
		zePay.depositar(c3, 100D);
		System.out.println("SAldo: " + c3.getSaldo());
		
		
		//MattPay
		OperacoesBancarias mattPay = new MattPay();
		Conta c4 = new Conta(444, "Matt Oliveira");
		mattPay.depositar(c4, 1000D);
		mattPay.sacar(c4, 500D);
		System.out.println("c4 matt pay: " + c4.getSaldo());
		mattPay.sacar(c4, 550D);
		System.out.println("c4 matt pay: " + c4.getSaldo());
		mattPay.depositar(c4, 25D);
		
		c4.mostrarExtrato();

		
		
		
	}
}
