package questao3;

public class ConcreteCampoTexto extends SubjectCampoTexto{
	private String texto;
	
	public ConcreteCampoTexto() {
		this.setTexto("");
	}
	
	@Override
	public void notificarTodosObservers() {
		for(Observer observer: this.getObservers()) {
			observer.atualizar(texto);
		}
	}
	
	public void atualizarTexto(String novoTexto) {
		if (novoTexto == null) return;
		
		this.setTexto(novoTexto);
		this.notificarTodosObservers();
	}
	
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto.trim();
	}

}
