
public class Musica implements Componente{

	private String nomeMusica;
	private String artista;
	private float velocidadeReproducao = 1;
	
	public Musica(String nomeMusica, String artista) {
		this.nomeMusica = nomeMusica;
		this.artista = artista;
	}

	public String getArtista() {
		return artista;
	}
	
	public void setVelocidade(float velocidade) {
		// TODO Auto-generated method stub
		this.velocidadeReproducao = velocidade;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return this.nomeMusica;
	}

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.printf("Música \"%s - %s\" tocando agora em %.2fx.\n", nomeMusica, artista, velocidadeReproducao);
	}


	public float getVelocidade() {
		// TODO Auto-generated method stub
		return velocidadeReproducao;
	}
	
	//Construa seu código aqui
	
}
