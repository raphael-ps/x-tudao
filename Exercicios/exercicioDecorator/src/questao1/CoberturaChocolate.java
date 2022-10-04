package questao1;

public class CoberturaChocolate extends Cobertura {

	public CoberturaChocolate(Bolo bolo) {
		super("Cobertura de Chocolate", bolo);
		// TODO Auto-generated constructor stub
	}
	public double calcularPreco() {
		final double preco = 7; 
		System.out.println(this.nome + "--- R$ " + preco);
		return super.calcularPreco() + preco;
	}
}
