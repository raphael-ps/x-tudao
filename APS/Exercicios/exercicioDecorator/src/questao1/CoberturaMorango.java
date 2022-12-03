package questao1;

public class CoberturaMorango extends Cobertura {

	public CoberturaMorango(Bolo bolo) {
		super("Cobertura de Morango", bolo);
		// TODO Auto-generated constructor stub
	}
	public double calcularPreco() {
		final double preco = 8; 
		System.out.println(this.nome + "--- R$ " + preco);
		return super.calcularPreco() + preco;
	}
}
