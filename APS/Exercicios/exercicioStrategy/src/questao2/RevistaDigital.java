package questao2;

public class RevistaDigital extends Revista {

	public RevistaDigital(String nome, double preco) {
		super(nome, preco);
	}
	
	public double calcularDesconto() {
		double taxaDescontoDigital = 0.15;
		return this.getPreco() * taxaDescontoDigital;
	}
}
