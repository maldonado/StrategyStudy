package strategy;

public class CalculadoraDeImpostos {

	public double calculaImposto(Orcamento orcamento, Imposto imposto){
		return imposto.calcula(orcamento);
	}
}

//Design pattern strategy, each implementation of Imposto has it's own peculiar way to calculate.
//The class which returns a value don't need to change anymore,even if more Impostos was created, the caller is responsible for send the right implementation.