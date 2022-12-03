package questao1;

public class BoloChocolate extends Bolo {
	public BoloChocolate() {
		super("Bolo de Chocolate");
	}

	@Override
	public double calcularPreco() {
		final double preco = 16; 
		System.out.println(this.nome + "--- R$ " + preco);
		return preco;
	}
}
