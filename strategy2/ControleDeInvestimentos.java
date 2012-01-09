package strategy2;

public class ControleDeInvestimentos {

	private static final double DESCONTO_DE_IMPOSTO = 0.75;

	public void investe(ContaCorrente cc, Investimento investimento){
		double lucro = (investimento.investe(cc)) * DESCONTO_DE_IMPOSTO;
		cc.soma(lucro);
	}
}