package questao3;

public class ConcreteRotulo1 extends Rotulo {

	public ConcreteRotulo1(String texto) {
		super(texto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processarAlteracao() {
		this.exibirNumeroCaractere();

	}
	public void exibirNumeroCaractere() {
		System.out.println("O texto tem: " + this.getTexto().length() + " caracteres.\n");
	}
	
}
