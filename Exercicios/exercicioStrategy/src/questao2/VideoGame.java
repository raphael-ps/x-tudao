package questao2;

public class VideoGame extends Jogo {

	public VideoGame(String nome, double preco) {
		super(nome, preco);
	}
	
	public double calcularDesconto() {
		double taxaDescontoVideoGame = 0;
		return this.getPreco() * taxaDescontoVideoGame;
	}
}
