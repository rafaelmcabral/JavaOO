package Aula00;

//Partes de uma classe: definicao, atributos e metodos
public class Produto {
	private int codigo;
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	private String nome;
	private int quantidade;
	private double preco;
	
//	definicao de metodos
	
	public void mostraPreco() {
		System.out.println(preco);
	}
	
	public void atualizaPreco(double porc) {
		preco += preco*porc/100;
	}
}