package revisao;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Revisao2 {

	public static void main(String...strings) {
		
		Map<Integer, String> mapa = new HashMap<Integer, String>();
		
		mapa.put(11, "TV");
		mapa.put(12, "Geladeira");
		mapa.put(13, "PS5");
		
		System.out.println(mapa.get(12));
		System.out.println(mapa.get(444));
		
		//remover
		mapa.remove(11);
		System.out.println(mapa.get(11));
		
		mapa.put(12, "caminhao");
		System.out.println(mapa.get(12));
		
		//percorrer map
		for(Entry<Integer, String> m : mapa.entrySet()) {
			System.out.println("Chave: " + m.getKey() + 
					" Valor: " + m.getValue());
		}
	}
}
