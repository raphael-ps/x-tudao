package questao1;

public class BoloLimao extends Bolo {
	public BoloLimao() {
		super("Bolo de Lim�o");
	}

	@Override
	public double calcularPreco() {
		final double preco = 15; 
		System.out.println(this.nome + "--- R$ " + preco);
		return preco;
	}
}
