package AulaOO2;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setNome("Clayton");
		f1.setSalario(1000.0);
		f1.setStatus("Professor");
		System.out.println(f1.getSalario());
		
		//f1.calculoBonificacao(50);
		//System.out.println(f1.salario);
	}
}
