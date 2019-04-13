package AulaOO2;

abstract class Conta2 {
	protected int numero;
	protected String nome;
	protected double saldo;
	protected double limite;
	
	public boolean sacar(double valor) {
		if ((this.saldo + this.limite) < valor) {
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	abstract void correcao();
}
