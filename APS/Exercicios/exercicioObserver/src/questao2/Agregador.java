package questao2;

public abstract class Agregador extends Noticiario implements ConsumidorDeNoticia{

	public Agregador(String nome) {
		super(nome);
	}

	@Override
	public void adicionarNoticia(Noticia noticia) {
		Noticia auxUltimaNoticia = super.getUltimaNoticia();
		auxUltimaNoticia.setTexto(auxUltimaNoticia.getTexto() + "\n\n\t" + noticia.getTexto());
	}
}
