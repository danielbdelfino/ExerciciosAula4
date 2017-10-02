package exercicios.pagina31;

public class Comprovante {
	private double valorCompra;
	private String dataCompra;

	public Comprovante(double valorCompra, String dataCompra) {
		super();
		this.valorCompra = valorCompra;
		this.dataCompra = dataCompra;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public String getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(String dataCompra) {
		this.dataCompra = dataCompra;
	}

}
