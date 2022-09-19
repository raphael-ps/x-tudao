package questao3;

public class ConcreteRotulo3 extends Rotulo {

	public ConcreteRotulo3(String texto) {
		super(texto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processarAlteracao() {
		this.exibirTextoUpperCase();

	}
	
	public void exibirTextoUpperCase() {
		System.out.println(this.getTexto().toUpperCase() + "\n");
	}
}
