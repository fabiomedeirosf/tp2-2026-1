package br.fatec.tp2.financeira.padroes.factory;

public class AnucionSampiGcn implements PublicacaoAnuncios {

	private AnuncioRepository anuncioRepository;
	
	public AnucionSampiGcn() {
		
	}
	
	public AnucionSampiGcn(AnuncioRepository anuncioRepository) {
		this.anuncioRepository = anuncioRepository;
	}
	
	@Override
	public void criarAnuncio(String anuncio) {
		System.out.println("consulta no BD");
		this.anuncioRepository.consultarAnuncio();
		
		System.out.println("[SAMPI é de franca uhuull] " + anuncio);
	}
}
