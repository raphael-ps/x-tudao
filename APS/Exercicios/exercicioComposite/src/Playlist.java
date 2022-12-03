
import java.util.ArrayList;

public class Playlist implements Componente {

	private String nomePlaylist;
	private ArrayList<Musica> playlist;
	
	public Playlist(String nomePlaylist) {
		this.nomePlaylist = nomePlaylist;
		this.playlist = new ArrayList<Musica>();
	}
	
	public void add(Musica novaMusica) {
		if (novaMusica != null) {
			playlist.add(novaMusica);
		}
	}
	public void add(Playlist novaPlaylist) {
		if (novaPlaylist != null) {
			playlist.addAll(novaPlaylist.getPlaylist());
		}
	}
	
	public void remover(Musica musica) {
		try {
			playlist.remove(musica);
		} catch (Exception ex) {
			System.out.println("Não foi possível remover música da playlist.");
		}
	}
	//Construa seu código aqui

	@Override
	public void setVelocidade(float velocidade) {
		// TODO Auto-generated method stub
		for (Componente musica : playlist) {
			musica.setVelocidade(velocidade);
		}
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return nomePlaylist;
	}

	@Override
	public void tocar() {
		System.out.println("Reproduzindo Playlist: "+ nomePlaylist);
		for (Musica musica : playlist) {
			System.out.print("\t");
			musica.tocar();
		}
	}
	
	public ArrayList<Musica> getPlaylist(){
		return playlist;
	}
}
