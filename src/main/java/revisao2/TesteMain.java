package revisao2;

public class TesteMain {

	public static void main(String...strings) {
		
		Funcionario f1 = new Funcionario();
		f1.setCargo("Analista");
		f1.setSalario(5000D);
		f1.setNome("Matt Gringo");
		f1.setSalario(5500D);
		f1.setSalario(6500D);
		f1.setSalario(10000D);
		
		System.out.println(f1);
		System.out.println(f1.getHistoricoSalarios());
	}
}
