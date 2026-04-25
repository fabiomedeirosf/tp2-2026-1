package revisao.heranca;

public class ImpostoMG extends Imposto {

	@Override
	public Double calcularImposto(Double valor) {
		
		if(valor <= 1000) {
			return (valor  * 0.1);
		} else if( (valor > 1000) && (valor <= 100000)) {
			return (valor * 0.12);
		} else {
			return (valor * 0.15);
		}
	}
	
	@Override
	public Double aliquotaPadrao() {
		return 10.0;
	}
}
