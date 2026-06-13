package br.fatec.tp2.padroes.factory;

public class AnuncioFactory {

	
	public static PublicacaoAnuncios create(AnuncioEnum anuncioEnum) {
		
		PublicacaoAnuncios instance =  null;
		
		if(anuncioEnum.equals(AnuncioEnum.GOOGLE)) {
			instance = new AnucioGoogle();
		} else if(anuncioEnum.equals(AnuncioEnum.META)) {
			instance = new AnucioMeta();
		} else if (anuncioEnum.equals(AnuncioEnum.SAMPI)) {
			instance = new AnucionSampiGcn(new AnuncioRepository());
		} else {
			throw new RuntimeException("opcao nao existe");
		}
		
		return instance;
	}
}
