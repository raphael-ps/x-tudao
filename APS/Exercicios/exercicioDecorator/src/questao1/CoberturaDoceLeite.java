package questao1;

public class CoberturaDoceLeite extends Cobertura {

	public CoberturaDoceLeite(Bolo bolo) {
		super("Cobertura de Doce de Leite", bolo);
		// TODO Auto-generated constructor stub
	}
	public double calcularPreco() {
		final double preco = 6.5; 
		System.out.println(this.nome + "--- R$ " + preco);
		return super.calcularPreco() + preco;
	}
}
