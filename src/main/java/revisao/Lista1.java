package revisao;

import java.util.ArrayList;
import java.util.List;

public class Lista1 {

	public static void main(String...strings) {
		
		List<Integer> listaA = new ArrayList<>();
		List<Integer> listaB = new ArrayList<>();
		
		//preencher a lista A
		for(int i = 0; i < 20; i++) {
			Integer numero = (int) (Math.random() * 100);
			listaA.add(numero);
		}
		
		for(int i = 0; i < 100; i++) {
			Integer numero = (int) (Math.random() * 100);
			listaB.add(numero);
		}
		
		Integer somaA = 0;
	    Integer somaB = 0;
		//mostrar as listas
		System.out.println("Lista A");
		for(Integer n : listaA) {
			System.out.print(n + " ");
			somaA += n;
		}
		
		System.out.println("Lista B");
		for(Integer n : listaB) {
			System.out.println(n + " ");
			somaB += n;
		}
		Double razao = (double) (somaA / somaB);
		System.out.println("Razao da somas: " + razao);
		
		//elementos de A em B ==> intersecção
		for(Integer a : listaA) {
			
			for(Integer b : listaB) {
				
				if(a.equals(b)) {
					System.out.println(a + "existe em B");
				}
			}
		}
		
	}
}
