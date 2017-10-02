package exercicios.pagina32;

public class Cargo {
	public static final Cargo DESENVOLVEDOR = new Cargo(new DezOuVintePorCento());
	public static final Cargo DBA = new Cargo(new QuinzeOuVinteCincoPorCento());
	public static final Cargo TESTER = new Cargo(new QuinzeOuVinteCincoPorCento());
	public static final Cargo GERENTE = new Cargo(new OutraRegra());
	
	private RegraDeCalculo regra;

	Cargo(RegraDeCalculo regra) {
		this.regra = regra;
	}

	public RegraDeCalculo getRegra() {
		return regra;
	}
}
