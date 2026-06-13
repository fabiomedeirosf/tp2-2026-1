package br.fatec.tp2.financeira.padroes.mvc.view;

import java.util.Scanner;

import br.fatec.tp2.financeira.padroes.mvc.controller.VendaController;
import br.fatec.tp2.financeira.padroes.mvc.model.dto.Venda;

public class VendaView {

	public static void main(String...strings) {
		
		VendaController controller = new VendaController();
		
		Scanner scanner = new Scanner(System.in);
		
		String cliente;
		Double valor;
		String tipo;
		
		System.out.println("############# sistema de vendas #######");
		System.out.println("Cliente: ");
		cliente = scanner.next();
		
		System.out.println("Valor: ");
		valor = scanner.nextDouble();
		
		System.out.println("Tipo [pix, debito]");
		tipo = scanner.next();
		
		Venda venda = controller.criarVenda(cliente, tipo, valor);
		System.out.println(venda);
	}
}
