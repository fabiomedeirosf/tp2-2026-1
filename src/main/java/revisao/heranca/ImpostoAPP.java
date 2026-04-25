package revisao.heranca;

public class ImpostoAPP {

	public static void main(String...strings ) {
		
		Imposto imposto = new ImpostoPadrao();
		
		System.out.println(imposto.calcularImposto(500D));
		System.out.println(imposto.calcularImposto(2500D));
		
		imposto = new ImpostoMG();
		
		System.out.println("MG");
		System.out.println(imposto.calcularImposto(500D));
		System.out.println(imposto.calcularImposto(2500D));
		
		imposto = new ImpostoRJ();
		
		System.out.println("RJ");
		System.out.println(imposto.calcularImposto(500D));
		System.out.println(imposto.calcularImposto(2500D));
		
		Tributos t = new ImpostoMG();
		
		System.out.println("T é um imposto?");
		System.out.println(t instanceof Imposto);
		
		if(t instanceof Imposto) {
			Imposto i = (Imposto) t;
			
		}
	}
}
