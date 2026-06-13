package br.fatec.tp2.padroes.singleton;

public class LogSingleton {

	public void info(String mensagem) {
		System.out.println("[INFO] " + mensagem);
	}
	
	public void warn(String mensagem) {
		System.out.println("[WARN] " + mensagem);
	}
	
	public void error(String mensagem) {
		System.err.println("[ERROR] " + mensagem);
	}
	
	public void debug(String mensagem) {
		System.out.println("[DEBUG] " + mensagem);
	}
	
	private static LogSingleton instance;
	
	private LogSingleton() {
		
	}
	
	public static LogSingleton getInstance() {
		if(instance == null) {
			instance = new LogSingleton();
		}
		
		return instance;
	}
}
