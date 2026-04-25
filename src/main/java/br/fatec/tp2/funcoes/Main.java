package br.fatec.tp2.funcoes;

public class Main {

	public static void main(String... args) {
		
		Main m = new Main();
		
		System.out.println("Soma: " + somar(3, 5));
		
		System.out.println("Harmonico: " + somarSerieHarmonica(5));
	}
	
	public static Integer somar(Integer a, Integer b) {
		
		return (a + b);
	}
	
	/**
	 * Crie uma função que receba um valor inteiro
	 * positivo e que calcule a soma de seus antecessores
	 * 
	 * Chame a função e exiba seu resultado
	 */
	public static Integer somarAntecessores(Integer valor) {
		
		Integer soma = 0;
		for(int i = valor; i > 0; i--) {
			soma += i;
		}
		return soma;
	}
	
	/**
	 * Crie um método que calcule a série harmônica
	 * de um número N.
	 */
	public static Double somarSerieHarmonica(Integer n) {
		
		Double soma = 0D;
		
		for(int i = 1; i <= n; i++) {
			soma += (double) 1/i;
		}
		
		return soma;
	}
	
	
	
}
