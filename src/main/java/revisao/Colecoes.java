package revisao;

import java.util.ArrayList;
import java.util.List;

public class Colecoes {

	public static void main(String...strings) {
		
		List<Integer> lista = new ArrayList<>();
		lista.add(22);//inteiro
		lista.add(345);//inteiro
		lista.add(-15);
		lista.add(224);
		//acessa a posição
		System.out.println(lista.get(0));
		
		//percorrer posicional
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("for enhanced");
		for(Integer n : lista) {
			System.out.println(n);
		}
		
		lista.remove(new Integer(345));
		System.out.println("foreach");
		lista.forEach(n -> {
			System.out.println(n);
		});
		
		/**
		 * Crie uma listaA do tipo arraylist de inteiro
		 * e preencha-a com 20 valores arbitrários;
		 * 
		 * Crie uma listaB do mesmo tipo e preencha-a com 
		 * 100 valores.
		 * 
		 * a. mostre ambas as listas
		 * b. calcule a razão das somas de a com b;
		 * c. verifique quais elementos de a estão
		 *    presentes em b.
		 */
		
		
		
	}
}
