package questao1;

public class FrutaMorango extends Fruta {

	public FrutaMorango(Bolo bolo) {
		super("Fruta Morango", bolo);
		// TODO Auto-generated constructor stub
	}
	public double calcularPreco() {
		final double preco = 6.5; 
		System.out.println(this.nome + "--- R$ " + preco);
		return super.calcularPreco() + preco;
	}
}
