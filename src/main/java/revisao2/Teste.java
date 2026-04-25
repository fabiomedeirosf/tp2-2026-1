package revisao2;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String...strings) {
		
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		
		Cliente c1 = new Cliente();
		c1.setCodigo(1232);
		c1.setNome("joao");
		c1.setEmail("joao@hotmail.com");
		
		Cliente c2 = new Cliente();
		c2.setCodigo(1232);
		c2.setNome("joao");
		c2.setEmail("maria@hotmail.com");
		
		Cliente c3 = new Cliente();
		c3.setCodigo(555);
		c3.setNome("Pedro");
		c3.setEmail("pedro@hotmail.com");
		
		listaClientes.add(c1);
		listaClientes.add(c2);
		listaClientes.add(c3);
		
		System.out.println(c1.equals(c2));
		
		System.out.println(listaClientes.contains(c3));
		
		/*if(c1.getCodigo().equals(c2.getCodigo()) &&
				c1.getNome().equals(c2.getNome())) {
			
		}*/
			
		
		
		for(Cliente c : listaClientes) {
			System.out.println(c);
		}
		
		int clienteProcurado = 4330;
		for(Cliente c : listaClientes) {
			if(c.getCodigo().equals(clienteProcurado)) {
				System.out.println("Cliente encontrado " + c);
			}
		}
		
	}
}
