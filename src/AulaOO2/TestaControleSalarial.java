package AulaOO2;

public class TestaControleSalarial {
	public static void main(String[] args) {
		ControleSalarial controle = new ControleSalarial();
		
		Funcionario f1 = new Funcionario();
		f1.setSalario(1000);
		controle.setTotalSalarios(f1);
		System.out.println("Salario f1: " + f1.getSalario());
		System.out.println("Bonus f1: " + f1.getBonus());
		System.out.println("Total de salarios: " + controle.getTotalSalarios());
		
		DBA d1 = new DBA();
		d1.setSalario(1000);
		controle.setTotalSalarios(d1);
		System.out.println("Salario d1: " + d1.getSalario());
		System.out.println("Bonus d1: " + d1.getBonus());
		System.out.println("Total de salarios: " + controle.getTotalSalarios());
	}
}

