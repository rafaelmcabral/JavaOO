package AulaOO2;

public class ContaTransf2 {
	int numero;
	double saldo;
	double limite;
	Cliente cliente;
	static int contadorDeContas;
	
	public ContaTransf2(String nome, String cpf) {
		System.out.println("Testando o construtor");
		this.cliente = new Cliente();
		this.cliente.nome = nome;
		this.cliente.cpf = cpf;
		ContaTransf2.contadorDeContas++;
	}
	
	public static int getContadorDeContas() {
		return ContaTransf2.contadorDeContas;
	}
}
