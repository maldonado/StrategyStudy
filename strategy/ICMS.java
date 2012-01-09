package strategy;

public class ICMS implements Imposto {
	
	private static final double TAXA_ICMS = 0.05;
	private static final double VALOR_FIXO = 50;

	@Override
	public double calcula(Orcamento orcamento){
		return orcamento.getValor() * TAXA_ICMS + VALOR_FIXO;
	}
}