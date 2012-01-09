package strategy2;

import java.util.Random;

public class Moderado implements Investimento {
	
	private static final double CINQUENTA_PORCENTO = 0.50;
	private static final double BAIXO_RENDIMENTO = 0.007;
	private static final double ALTO_RENDIMENTO = 0.025;

	@Override
	public double investe(ContaCorrente cc){
		double rendimento = getRendimentoComRisco();
		return cc.getSaldo() * rendimento;	
	}

	private double getRendimentoComRisco() {
		if(new Random().nextDouble() > CINQUENTA_PORCENTO){
			return ALTO_RENDIMENTO;
		}
		return BAIXO_RENDIMENTO;
	}	
}