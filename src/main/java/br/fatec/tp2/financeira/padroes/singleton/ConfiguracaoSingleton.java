package br.fatec.tp2.financeira.padroes.singleton;

public class ConfiguracaoSingleton {

	private String autor = "Fabio";
	
	private String urlBanco = "10.0.0.55";
	
	private Double margemErroFinanceiro = 0.05;
	
	private static ConfiguracaoSingleton instance;
	
	private ConfiguracaoSingleton() {
		
	}
	
	public static ConfiguracaoSingleton getInstance() {
		
		if(instance == null) {
			instance = new ConfiguracaoSingleton();
		}
		
		return instance;
	}

	public String getAutor() {
		return autor;
	}

	public String getUrlBanco() {
		return urlBanco;
	}

	public Double getMargemErroFinanceiro() {
		return margemErroFinanceiro;
	}
	
}
