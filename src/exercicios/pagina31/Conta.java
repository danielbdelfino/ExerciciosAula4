package exercicios.pagina31;

public class Conta {
	private double saldo;

	public Conta(double saldo) {
		this.saldo = saldo;
	}

	public void sacar(double valor) throws Exception {
		if (validarSaldo(valor)) {
			saldo -= valor;
		}
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public void debitarConta(int valor) throws Exception {
		if (validarSaldo(valor)) {
			saldo -= valor;
		}
	}

	private boolean validarSaldo(double valor) throws Exception {
		if (saldo >= valor) {
			return true;
		} else {
			throw new Exception("Saldo insuficiente");
		}
	}

}
