package AulaOO2;

public class ControleSalarial {
	private double totalSalarios = 0;
	
	public void setTotalSalarios(Funcionario funcionario) {
		this.totalSalarios += funcionario.getSalario() + funcionario.getBonus();
	}
	
	public double getTotalSalarios() {
		return this.totalSalarios;
	}
}
