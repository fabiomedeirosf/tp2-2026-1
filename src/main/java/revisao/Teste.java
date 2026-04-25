package revisao;

public class Teste {

	public static void main(String...strings) {
		
		System.out.println("Programinha");
		
		Produto p1 = new Produto();
		
		Produto p2 = new Produto("TV");
		
		Produto p3 = new Produto("celular", 2555D);
		
		Aluno a1 = new Aluno("1234", "Matheus do lanche");
		//a1.nome = "matheus do lanche";

		Aluno a2 = new Aluno("joaquim");
		System.out.println(a2.ra);
	}
}
