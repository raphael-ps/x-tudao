package questao1;

public class Assinante implements ConsumidorDeNoticia{
	private String nome;
	
	public Assinante(String nome) {
		this.nome = nome;
	}
	
	@Override
	public void lerNoticia(Noticia noticia) {
		System.out.println("O assinante "+this.nome+" recebeu a notifica��o da seguinte not�cia:"
				+ "\n\t\tCategoria: "+noticia.getTopico()+" - "+noticia.getDia()+"/"+noticia.getMes()
				+ "\n\t" + noticia.getTexto());
		
	}

}
