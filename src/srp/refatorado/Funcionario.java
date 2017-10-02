package srp.refatorado;

public class Funcionario {
	private Cargo cargo;
	private double salarioBase;

	public Funcionario(Cargo cargo, double salarioBase) {
		super();
		this.cargo = cargo;
		this.salarioBase = salarioBase;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getSalarioBase() {
		return salarioBase;
	}
}
