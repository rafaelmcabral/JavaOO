package AulaOO2;

public class TestaHeranca {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setSalario(1000);
		double salFunc = f1.getSalario();
		System.out.println("Salario do funcionario: " + salFunc);
		System.out.println("Bonus do funcionario: " + f1.getBonus());
		
		DBA d1 = new DBA();
		d1.setSalario(1000);
		double salFunc2 = d1.getSalario();
		System.out.println("Salario do funcionario: " + salFunc2);
		System.out.println("Bonus do funcionario: " + d1.getBonus());
		
		Gerente g1 = new Gerente();
		g1.setSalario(10000);
		double salFunc3 = g1.getSalario();
		System.out.println("Salario do funcionario: " + salFunc3);
		System.out.println("Bonus do funcionario: " + g1.getBonus());
		
		ControleSalarial controle = new ControleSalarial();
		controle.setTotalSalarios(f1);
		controle.setTotalSalarios(d1);
		controle.setTotalSalarios(g1);
		
		System.out.println("Total de Salarios: " + controle.getTotalSalarios());
	}
}
