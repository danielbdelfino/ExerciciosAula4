package srp.refatorado;

public class Teste {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario(Cargo.DESENVOLVEDOR, 100);
		Funcionario f2 = new Funcionario(Cargo.DBA, 100);
		
		CalculadoraDeSalario calc = new CalculadoraDeSalario();
		System.out.println(calc.calcula(f1));
		System.out.println(calc.calcula(f2));
	}

}
