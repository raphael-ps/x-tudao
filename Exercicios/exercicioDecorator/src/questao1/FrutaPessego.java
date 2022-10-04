package questao1;

public class FrutaPessego extends Fruta {

	public FrutaPessego(Bolo bolo) {
		super("Fruta Pessego", bolo);
		// TODO Auto-generated constructor stub
	}
	public double calcularPreco() {
		final double preco = 3; 
		System.out.println(this.nome + "--- R$ " + preco);
		return super.calcularPreco() + preco;
	}
}
