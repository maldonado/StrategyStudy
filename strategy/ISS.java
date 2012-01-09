package strategy;

public class ISS implements Imposto {

	private static final double TAXA_ISS= 0.06;
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * TAXA_ISS;
	}
}