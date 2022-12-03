package questao2;

public abstract class Viagem {

	private String descricao;

	private double preco;
	
	public Viagem(String descricao, double preco) {
		this.descricao = descricao;
		this.preco = preco;
	}

	public double calcularPreco() {
		System.out.println(this.getDescricao() + " --- R$ " + this.getPreco());
		return this.getPreco();
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
