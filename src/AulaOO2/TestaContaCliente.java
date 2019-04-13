package AulaOO2;

public class TestaContaCliente {
	public static void main(String[] args) {
		ContaTransf2 c2 = new ContaTransf2("Joao", "123.456.789-01");
		System.out.println(c2.cliente.nome);
		System.out.println(ContaTransf2.getContadorDeContas());
		
		ContaTransf2 c3 = new ContaTransf2("Maria", "123.456.789-02");
		System.out.println(c3.cliente.nome);
		System.out.println(ContaTransf2.getContadorDeContas());
	}
}
