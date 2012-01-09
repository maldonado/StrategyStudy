package strategy;

public class ICCC implements Imposto {

	private static final int FAIXA_ORCAMENTO_BAIXO = 999;
	private static final int FAIXA_ORCAMENTO_INTERMEDIARIO = 1000;
	private static final int FAIXA_ORCAMENTO_ALTO = 3000;
	
	private static final double TAXA_ORCAMENTO_BAIXO = 0.05;
	private static final double TAXA_ORCAMENTO_INTERMEDIARIO = 0.07;
	private static final double TAXA_ORCAMENTO_ALT0 = 0.08;
	private static final int TAXA_FIXA = 30;

	@Override
	public double calcula(Orcamento orcamento) {
		return calculaImpostoPorFaixa(orcamento.getValor());
	}
	
	private double calculaImpostoPorFaixa(double valorParaCalculo){
		if(valorParaCalculo <= FAIXA_ORCAMENTO_BAIXO){
			return valorParaCalculo * TAXA_ORCAMENTO_BAIXO;
			
		}else if(valorParaCalculo >= FAIXA_ORCAMENTO_INTERMEDIARIO && valorParaCalculo <= FAIXA_ORCAMENTO_ALTO){
			return valorParaCalculo * TAXA_ORCAMENTO_INTERMEDIARIO;
			
		}else{
			return valorParaCalculo * TAXA_ORCAMENTO_ALT0 + TAXA_FIXA;
		}	
	}
}