package AulaOO2;

public class Gerente extends Funcionario implements IControleInterno {
	String senha;

	public double getBonus() {
		return super.getBonus() + 10000;
	}

	@Override
	public boolean verifica(String senha) {
		if (this.senha == senha) {
			System.out.println("Acesso autorizado");
			return true;
		} else {
			System.out.println("Acesso nao autorizado");
			return false;
		}
	}
	
}
