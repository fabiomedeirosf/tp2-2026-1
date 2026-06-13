package br.fatec.tp2.financeira.padroes.factory;

public class AnucioGoogle implements PublicacaoAnuncios {

	@Override
	public void criarAnuncio(String anuncio) {
		System.out.println("[GOOGLE] publicando anuncio: " + anuncio);
		
	}
}
