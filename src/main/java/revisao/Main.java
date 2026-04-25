package revisao;

public class Main {

	public static void main(String...strings) {
		
		int numeros[] = new int[10];
		
		//preencher
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 100);
		}
		
		//Integer soma = 0;
		//mostrar
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
			//soma = soma + numeros[i];
		}
		
		System.out.println("for enhanced");
		//for enhanced
		for(Integer n : numeros) {
			System.out.println(n);
			//soma +=  n;
		}
		
		/**
		 * Crie um vetor de 20 posicoes do tipo numérico de
		 * ponto flutuante, e:
		 *  a. preencha-o de modo aleatório;
		 *  b. mostre os valores com for enhanced;
		 *  c. calcule a soma dos valores
		 */
		
		double valores[] = new double[20];
		
		for(int i = 0; i < valores.length; i++) {
			valores[i] = Math.random() * 100;
		}
		
		Double soma = 0D;
		for(Double n : valores) {
			System.out.println(n);
			soma += n;
		}
		
		System.out.println("Sominha é: " + soma);
		
	}
}
