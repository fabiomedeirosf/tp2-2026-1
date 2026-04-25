package revisao;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ExercicioMap {

	public static void main(String...string) {
		
		Map<Integer, Integer> mapa = new HashMap<Integer, Integer>();
		
		for(int i  = 0; i < 100; i++) {
			int chave = (int) (Math.random() * 1000);
			//System.out.println(numero);
			
			/*Integer valor = mapa.get(chave);
			
			if(valor == null) {
				mapa.put(chave, 1);
			} else {
				mapa.put(chave, (valor + 1));
			}
			*/
			
			Integer valor = mapa.getOrDefault(chave, 0);
			mapa.put(chave, (valor + 1));
			
		}
		
		for(Entry<Integer, Integer> m : mapa.entrySet()) {
			System.out.println(m.getKey() + "   " + m.getValue());
		}
	}
}
