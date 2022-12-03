package questao2;

public class LivroDigital extends Livro {

	public LivroDigital(String nome, double preco) {
		super(nome, preco);
		
	}
	
	public double calcularDesconto() {
		double taxaDesconto = 0.15;
		return this.getPreco() * taxaDesconto; 
	}
}
