package questao2;

public abstract class Artigo {
	private String nome;
	private double preco;
	
	public Artigo(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public abstract double calcularPreco();
	public abstract double calcularDesconto();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
