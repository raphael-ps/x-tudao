package questao2;

public class Publicador implements ConsumidorDeNoticia{
	private String nome;
	
	public Publicador(String nome) {
		this.nome = nome;
	}
	
	@Override
	public void atualizar(Noticia noticia, String nomeNoticiario) {
		System.out.println("O Publicador "+this.nome+", consumidor do " + nomeNoticiario + ", recebeu a notificação da seguinte notícia:"
				+ "\n\t\tCategoria: "+noticia.getTopico()+" - "+noticia.getDia()+"/"+noticia.getMes()
				+ "\n\t" + noticia.getTexto());
		
	}

}
