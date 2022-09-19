package questao2;

public abstract class Jogo extends Artigo{

	public Jogo(String nome, double preco) {
		super(nome, preco);
	}
	
	public double calcularPreco() {
		return this.getPreco() - calcularDesconto();
	}
	
	public double calcularDesconto() {
		double taxaDesconto = 0.15;
		return this.getPreco() * taxaDesconto;
	}
	
}
