package questao1;

public class BoloLaranja extends Bolo {
	public BoloLaranja() {
		super("Bolo de Laranja");
	}

	@Override
	public double calcularPreco() {
		final double preco = 15; 
		System.out.println(this.nome + "--- R$ " + preco);
		return preco;
	}
}
