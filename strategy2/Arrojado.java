package strategy2;

import java.util.Random;

public class Arrojado implements Investimento {

	private static final double CINQUENTA_PORCENTO = 0.50;
	private static final double TRINTA_PORCENTO = 0.80;
	
	private static final double BAIXO_RENDIMENTO = 0.006;
	private static final double INTERMEDIARIO_RENDIMENTO = 0.03;
	private static final double ALTO_RENDIMENTO = 0.05;
	
	@Override
	public double investe(ContaCorrente cc) {
		double rendimento = getRendimentoComRisco();
		return cc.getSaldo() * rendimento;	
	}

	private double getRendimentoComRisco() {
		double indicadorDeRendimento = new Random().nextDouble();
		
		if(indicadorDeRendimento < CINQUENTA_PORCENTO){
			return BAIXO_RENDIMENTO;
			
		}else if(indicadorDeRendimento < TRINTA_PORCENTO){
			return INTERMEDIARIO_RENDIMENTO;
		}
		
		return ALTO_RENDIMENTO;
	}	
}