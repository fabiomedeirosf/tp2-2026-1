package br.fatec.tp2.funcoes;

public class Funcao3 {

		/*
		 * Um comercio precisa de um sistema que gerencia suas vendas
		 * ao que se refere ao financiamento;crediário.
		 * 
		 * Para tanto o comércio utiliza a seguinte regra:
		 * -> pagamnto a vista 10% de desco
		 * -> pagamento a prazo é aplicado júros compostos
		 * 
		 * Crie função que dado o valor da compra e o número de parcelas
		 * calcule o valor de cada parcela considerando uma taxa de júros
		 * 
		 * Mostre ao final a relação de parcelas, valores e o total
		 * a ser pago.
		 * 
		 */
	
	/*
	 * Crie 2 arrays, A e B, de inteiros de 20 posicoes;
	 *  
	 *  a. crie função que preencha o array e use-a para ambos;
	 *  b. crie uma função que receba os 2 arrays e retorne
	 *     um array resultante com a soma de Ai + Bi
	 *  c. crie uma função que receba um valor inteiro
	 *     e calcule a soma do valor com seus antecessores > 0;
	 *  d. para cada valor Ai, calcule a soma dos antecessores 
	 */
	
	public static void main(String...strings) {
		int listaA[] = new int[20];
		int listaB[] = new int[20];
		
		preencherArray(listaA);
		preencherArray(listaB);
		mostrarArray(listaA);
		mostrarArray(listaB);
		
		int listaSoma[] = somarArrays(listaA, listaB);
		mostrarArray(listaSoma);
		
		for(int i = 0; i < listaA.length; i++) {
			int soma = somarAntecessores(listaA[i]);
			System.out.printf("\nValor %d da lista A, antecessores: %d", 
					listaA[i], soma);
		}
	}
	
	public static Integer somarAntecessores(int n) {
		int soma = 0;
		for(int i = 1; i <= n; i++) {
			soma += i;
		}
		return soma;
	}
	
	public static int[] somarArrays(int a[], int b[]) {
		int listaSoma[] = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			listaSoma[i] = a[i] + b[i];
		}
		
		return listaSoma;
	}
	
	private static void preencherArray(int lista[]) {
		for(int i = 0; i < lista.length; i++) {
			lista[i] = (int) (Math.random() * 1000);
		}
	}
	
	public static void mostrarArray(int lista[]) {
		System.out.println("Listinha:");
		for(int i = 0; i < lista.length; i++) {
			System.out.print(lista[i] + " ");
		}
	}
	
}
