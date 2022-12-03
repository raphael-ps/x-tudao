package questao2;

public abstract class Livro extends Artigo{

	public Livro(String nome, double preco) {
		super(nome, preco);
	}
	
	public double calcularPreco() {
		return this.getPreco() - calcularDesconto();
	}
	
	public double calcularDesconto() {
		double taxaDesconto = 0.3;
		return this.getPreco() * taxaDesconto; 
	}

}
