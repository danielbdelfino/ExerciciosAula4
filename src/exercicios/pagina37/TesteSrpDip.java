package exercicios.pagina37;

import srp.refatorado.CalculadoraDeSalario;
import srp.refatorado.Cargo;
import srp.refatorado.Funcionario;

public class TesteSrpDip {
	public static void main(String[] args) {
		/**
		 * Classe Funcionario passou a ter uma única responsabilidade(SRP)
		 */
		Funcionario f1 = new Funcionario(Cargo.DESENVOLVEDOR, 100);
		Funcionario f2 = new Funcionario(Cargo.DBA, 100);
		
		CalculadoraDeSalario calc = new CalculadoraDeSalario();
		/**
		 * Estabilizamos as classes que de fato realizam os calculos de salário
		 * através da interface RegraDeCalculo(DIP)
		 */
		System.out.println(calc.calcula(f1));
		System.out.println(calc.calcula(f2));
	}

}
