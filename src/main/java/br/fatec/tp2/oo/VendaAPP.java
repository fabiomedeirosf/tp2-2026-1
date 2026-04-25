package br.fatec.tp2.oo;

public class VendaAPP {

	public static void main(String...strings) {
		Venda v = new VendaImpl();
		
		System.out.println(v.valorVenda(10, 5.5));
		
		System.out.println("é venda impl? " + (v instanceof VendaImpl));
		System.out.println("é vendaGenerica? " + (v instanceof VendaGenerica));
		
		VendaGenerica g = (VendaGenerica) v;
		//VendaGenerica g = new VendaImpl();
		System.out.println("Valor compra: " + g.valorCompra(8, 8.0));

		
	}
}
