package strategy2;

public class ContaCorrente {

	private double saldo;
	
	public ContaCorrente(double saldo){
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void soma(double valor) {
		this.saldo += valor;
	}
}