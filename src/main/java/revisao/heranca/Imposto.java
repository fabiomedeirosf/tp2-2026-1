package revisao.heranca;

public abstract class Imposto extends Tributos{

	public Double calcularImposto(Double valor) {
		
		if(valor <= 1000) {
			return (valor * 0.07);
		} else {
			return (valor * 0.11);
		}
	}
	
	public abstract Double aliquotaPadrao();
	
	@Override
	public Double calcularTributos(Double valor, Double imposto) {
		
		if (valor < 1000 && imposto > 0) {
			return valor * 0.1;
		} 
		
		return valor * 0.25;
	}
}
