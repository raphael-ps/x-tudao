package questao1;

public abstract class ComplementoDecorator extends Bolo{

	private Bolo bolo;

	public ComplementoDecorator(String nome, Bolo bolo) {
		super(nome);
		this.bolo = bolo;
	}

	public double calcularPreco() {
		return bolo.calcularPreco(); 
	}
}
