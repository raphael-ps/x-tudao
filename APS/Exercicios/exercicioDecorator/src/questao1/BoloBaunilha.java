package questao1;

public class BoloBaunilha extends Bolo {
	public BoloBaunilha() {
		super("Bolo de Baunilha");
	}

	@Override
	public double calcularPreco() {
		final double preco = 13; 
		System.out.println(this.nome + "--- R$ " + preco);
		return preco;
	}
}
