package revisao.heranca;

import revisao.heranca.dsm.CalculadoraFatec;

public class App {

	public static void main(String...strings) {
		
		CalculadoraFatec cf = new CalculadoraFatec(33.3);
		
		System.out.println("Get valor: " + cf.getValor());
		System.out.println("Get valor herdado" + cf.getValorHerdado());
	}
}
