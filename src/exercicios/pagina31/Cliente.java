package exercicios.pagina31;

public class Cliente {
	private String nome;
	private Conta conta;
	private Comprovante comprovate;

	public Cliente(String nome, double saldo) {
		this.nome = nome;
		conta = new Conta(saldo);
	}

	public void comprar(double valor) throws Exception {
		conta.debitarConta(20);
	}

	public void setComprante(Comprovante comprovante) {
		this.comprovate = comprovante;
	}
}
