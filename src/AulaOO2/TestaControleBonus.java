package AulaOO2;

public class TestaControleBonus {
	public static void main(String[] args) {
		ControleBonus controle = new ControleBonus();
		
		Funcionario f1 = new Funcionario();
		f1.setSalario(1000);
		controle.setTotalBonus(f1);
		System.out.println("Total de bonus: " + controle.getTotalBonus());
		
		DBA d1 = new DBA();
		d1.setSalario(1000);
		controle.setTotalBonus(d1);
		System.out.println("Total de bonus: " + controle.getTotalBonus());
		
		Gerente g1 = new Gerente();
		g1.setSalario(10000);
		controle.setTotalBonus(g1);
		System.out.println("Total de bonus: " + controle.getTotalBonus());
	}
}
