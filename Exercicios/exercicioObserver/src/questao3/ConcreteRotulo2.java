package questao3;

public class ConcreteRotulo2 extends Rotulo{

	public ConcreteRotulo2(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processarAlteracao() {
		this.exibirNumeroPalavra();
		
	}
	
	public void exibirNumeroPalavra() {
		String[] palavras = this.getTexto().split("\s+");
		System.out.println("O texto tem: " + palavras.length + " palavras.\n");
	}

}
