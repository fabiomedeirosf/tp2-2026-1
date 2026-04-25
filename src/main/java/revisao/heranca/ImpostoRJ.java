package revisao.heranca;

public class ImpostoRJ extends Imposto {

	@Override
	public Double calcularImposto(Double valor) {
		
		Double imposto = super.calcularImposto(valor);
		
		Double adicional = 0D;
		if(imposto < 100) {
			adicional = valor * 0.03;
		} else if(imposto >= 100 && imposto <= 1000) {
			adicional = valor * 0.04;
		} else {
			adicional = valor * 0.05;
		}
		
		return (imposto + adicional);
	}
	
	public Double calcularImposto(Double valor, Double aliquota) {
		return null;
	}
	
	@Override
	public Double aliquotaPadrao() {
		return 15D;
	}
}
