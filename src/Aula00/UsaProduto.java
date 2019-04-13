package Aula00;

//Instanciacao de uma classe
public class UsaProduto {
	public static void main(String[] args) {
		Produto A, B, C;
		A = new Produto();
		B = new Produto();
		C = new Produto();
		
		System.out.println(A.getCodigo() + " " + A.getNome() + " ");
		System.out.println(A.getQuantidade() + " " + A.getPreco());
		
		A.setCodigo(10);
		A.setNome("Sabonete");
		A.setQuantidade(5);
		A.setPreco(0.54);
		
		System.out.println(A.getCodigo() + " " + A.getNome() + " ");
		System.out.println(A.getQuantidade() + " " + A.getPreco());
		
		B.setCodigo(11);
		B.setNome("Detergente");
		B.setQuantidade(35);
		B.setPreco(1.25);
		
		System.out.println(B.getCodigo() + " " + B.getNome() + " ");
		System.out.println(B.getQuantidade() + " " + B.getPreco());
		
		C.setCodigo(12);
		C.setNome("Shampoo");
		C.setQuantidade(3);
		C.setPreco(3.65);
		
		System.out.println(C.getCodigo() + " " + C.getNome() + " ");
		System.out.println(C.getQuantidade() + " " + C.getPreco());
		
		A.mostraPreco();
		A.atualizaPreco(12);
		A.mostraPreco();
	}
}