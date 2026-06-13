package br.fatec.tp2.financeira.padroes.singleton;

public class App {

	public static void main(String...strings) {
		
		/**
		 * Um arquiteto precisa criar um componente para realizar
		 * os logs de sua aplicação. O log, receberá inicialmente
		 * apenas uma string de acordo com os levels: 
		 *  -INFO -DEBUG -WARN - ERROR
		 *  
		 *  Formate a mensagem para representar o tipo de log
		 *  
		 *  
		 */
		
		
		ConfiguracaoSingleton c = ConfiguracaoSingleton.getInstance();
		
		System.out.println("Autor: " + c.getAutor());
		
		
		System.out.println("URL: " + ConfiguracaoSingleton.getInstance().getUrlBanco());
		
		
		LogSingleton log = LogSingleton.getInstance();
		
		log.debug("debugao");
		log.error("errinho, matt chora");
		
		
	}
}
