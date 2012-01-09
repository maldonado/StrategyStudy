package strategy2;

public class Conservador implements Investimento{

	private static final double RENDIMENTO = 0.008;
	
	@Override
	public double investe(ContaCorrente cc) {
		return cc.getSaldo() * RENDIMENTO;
	}
}