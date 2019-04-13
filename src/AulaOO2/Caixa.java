package AulaOO2;

public class Caixa extends Funcionario {
	int senha;
	
	public double getBonus() {
		return super.getBonus() + 10000;
	}
	
	public boolean verificaSenha(int senha) {
		return false;
	}

}
