package exercicios.pagina31;

public class Venda {
	public void realizarVenda(Cliente cliente, double valor) throws Exception {
		cliente.comprar(valor);
		cliente.setComprante(emitirComprovante(valor, "10/10/2017"));
	}

	private Comprovante emitirComprovante(double valor, String data) {
		return new Comprovante(valor, data);
	}
}
