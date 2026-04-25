package revisao.fatec.dsm;

public class AulaVarArgs {

	
	public static void main(String... args) {
		
		String texto = "fatec";
		String a = "fatec";
		String b = new String("fatec");
		System.out.println("b: " + b);
		System.out.println("Texto: " + texto);
		
		if(texto.equals(b)) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentinho");
		}
		
		//System.out.println(a.);
	}
	

	
	public static Integer somar(Integer... valores) {
		
		Integer soma = 0;
		for(Integer v : valores) {
			soma += v;
		}
		return soma;
	}
}
