package AulaOO2;

public class UsaConta {
	public static void main(String[] args) {
		Conta A = new Conta();
		A.numero = 001;
		A.nome = "Joao";
		A.saldo = 100.0;
		A.limite = 10.0;
		
		double saque = 1100.0;
		
		System.out.println("Numero da conta: " + A.numero);
		System.out.println("Titular: " + A.nome);
		System.out.println("Saldo atual: " + A.saldo);
		System.out.println("Limite: " + A.limite);
		
		if (A.sacar(saque))
			System.out.println("Você sacou R$ " + saque + " e seu saldo atual eh de R$ " + A.saldo);
		else
			System.out.println("Saque não permitido.");
		
		System.out.println("Saldo atual: " + A.saldo);
		
		A.depositar(1000);
		System.out.println("Saldo atual: " + A.saldo);
	}
}
