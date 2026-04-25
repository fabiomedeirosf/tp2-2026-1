package revisao;

public class Produto {

	String descricao;
		
	Double valor;
	
	Integer quantidade;
	
	/**
	 * Construtor padrão sobrescrito = modificado
	 */
	public Produto() {
		System.out.println("construtor padrão produto");
	}
	
	/**
	 * Construtor sobrecarregado
	 * @param descricao
	 */
	public Produto(String descricao) {
		this.descricao = descricao;
	}
	
	public Produto(String descricao, Double valor) {
		this.descricao = descricao;
		this.valor = valor;
	}
	
}
