package srp.primeiro;

import static srp.primeiro.Cargo.DBA;
import static srp.primeiro.Cargo.DESENVOLVEDOR;
import static srp.primeiro.Cargo.TESTER;

import srp.refatorado.Funcionario;

public class CalculadoraDeSalario {
	public double calcula(Funcionario funcionario) {
		if (DESENVOLVEDOR.equals(funcionario.getCargo())) {
			return dezOuVintePorcento(funcionario);
		}
		if (DBA.equals(funcionario.getCargo()) || TESTER.equals(funcionario.getCargo())) {
			return quinzeOuVinteCincoPorcento(funcionario);
		}
		throw new RuntimeException("funcionario invalido");
	}

	private double dezOuVintePorcento(Funcionario funcionario) {
		if (funcionario.getSalarioBase() > 3000.0) {
			return funcionario.getSalarioBase() * 0.8;
		} else {
			return funcionario.getSalarioBase() * 0.9;
		}
	}
	
	private double quinzeOuVinteCincoPorcento(Funcionario funcionario) {
		if (funcionario.getSalarioBase() > 2000.0) {
			return funcionario.getSalarioBase() * 0.75;
		} else {
			return funcionario.getSalarioBase() * 0.85;
		}
	}
}
