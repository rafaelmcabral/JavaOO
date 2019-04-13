package AulaOO2;

public class Conta {
	int numero;
	String nome;
	double saldo;
	double limite;
	
	boolean sacar(double valor) {
		//double saldoAlterado = saldo - valor;
		
		if (this.saldo + this.limite < valor)
			return false;
		else {
			saldo -= valor;
			return true;
		}
	}
	
	void depositar(double valor) {
		this.saldo += valor;
	}
}
