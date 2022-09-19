package questao2;

public class NoticiarioAssina extends Noticiario{

	public NoticiarioAssina(String nome) {
		super(nome);
	}

	@Override
	public void adicionarNoticia(Noticia noticia) {
		if (noticia != null) {
			super.setUltimaNoticia(noticia);
			super.notificarTodosConsumidores();
		}
		
	}
	
	
}
