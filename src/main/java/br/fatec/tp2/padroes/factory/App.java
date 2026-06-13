package br.fatec.tp2.padroes.factory;

public class App {

	public static void main(String...strings) {
		
		PublicacaoAnuncios a = AnuncioFactory.create(AnuncioEnum.GOOGLE);
		
		a.criarAnuncio("faca pra churrasco");
		
		a = AnuncioFactory.create(AnuncioEnum.SAMPI);
		
		a.criarAnuncio("Botina bonita");
	}
}
