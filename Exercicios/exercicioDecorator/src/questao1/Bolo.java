package questao1;

public abstract class Bolo {
	protected String nome;

	public Bolo(String nome) {
		this.nome = nome;
	}
	
	public abstract double calcularPreco();
	
}
