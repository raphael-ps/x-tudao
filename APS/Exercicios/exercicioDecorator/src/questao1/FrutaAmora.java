package questao1;

public class FrutaAmora extends Fruta {

	public FrutaAmora(Bolo bolo) {
		super("Fruta Amora", bolo);
		// TODO Auto-generated constructor stub
	}
	public double calcularPreco() {
		final double preco = 4; 
		System.out.println(this.nome + "--- R$ " + preco);
		return super.calcularPreco() + preco;
	}
}
