package br.fatec.tp2.funcoes;

public class Funcao2 {

	public static void main(String...strings) {
		
		int lista[] = new int[10];
		int soma = 0;
		int contMultiplos = 0;
		
		preencherArray(lista);
		
		//mostrar
		mostrarArray(lista);
		
		for(int i = 0; i< lista.length; i++) {
			soma += lista[i];
			
			contMultiplos = (lista[i] % 3 == 0) ? (contMultiplos + 1) : contMultiplos;
			/*if(lista[i] % 3 == 0) {
				contMultiplos++;
			}*/
		}
		System.out.println("soma: " + soma);
		System.out.println("Multiplos de 3: " + contMultiplos);
				
		/**
		 * a. preencher a lista (array) com 10 valores arbitrários
		 * b. mostrar a lista
		 * c. somar os elementos
		 * d. calcular a quantidade de multiplos de 3
		 */
	}
	
	public static void preencherArray(int lista[]) {
		for(int i = 0; i < lista.length; i++) {
			lista[i] = (int) (Math.random() * 100);
		}
	}
	
	public static void mostrarArray(int lista[]) {
		System.out.println("Array:");
		for(int i = 0; i< lista.length; i++) {
			System.out.println(lista[i]);
		}
	}
}
