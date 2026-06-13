package br.fatec.tp2.financeira.padroes.factory;

public class AnucioMeta implements PublicacaoAnuncios {

	@Override
	public void criarAnuncio(String anuncio) {
		System.out.println("[META] Publicando anuncio... " + anuncio);
		
	}
}
