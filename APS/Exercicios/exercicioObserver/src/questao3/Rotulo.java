package questao3;

public abstract class Rotulo implements Observer{
	private String texto;

	public Rotulo(String texto) {
		this.texto = texto;
	}
	
	public abstract void processarAlteracao();
	
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	@Override
	public void atualizar(String novoTexto) {
		System.out.println("Rotulo informado da atualização.");
		this.setTexto(novoTexto);
		this.processarAlteracao();
	}
	
}
