package questao1;

public class RequisicaoCompra {
	private double valorCompra;
	private String descricao;
	
	public RequisicaoCompra(double valorCompra, String descricao) {
		this.valorCompra = valorCompra;
		this.descricao = descricao;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
