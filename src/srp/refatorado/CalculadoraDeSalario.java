package srp.refatorado;

public class CalculadoraDeSalario {
	public double calcula(Funcionario funcionario) {
		return funcionario.getCargo().getRegra().calcula(funcionario);
	}
}
