import java.util.concurrent.ThreadLocalRandom;

public class Individuo  implements Comparable<Individuo>{
	private static int individuosCriados = 0;
	private int id;
	private int geracao;
	private int[] vetorIndividuo;
	private int avaliacao;
	
	public Individuo(int geracao) {
		Individuo.individuosCriados++;
		this.id = individuosCriados;
		this.geracao = geracao;
		this.vetorIndividuo = this.criarNovoIndividuo();
		this.funcaoFitness2();
	}
	
	public Individuo(int geracao, int[] vetorIndiv) {
		Individuo.individuosCriados++;
		this.id = individuosCriados;
		this.geracao = geracao;
		this.vetorIndividuo = vetorIndiv;
		this.funcaoFitness2();
	}

	public int[] criarNovoIndividuo() { //*VETOR INDIVIDUO
		ThreadLocalRandom tl = ThreadLocalRandom.current();
        int[] novoIndividuo = new int[8];
        
        for (int i = 0; i < 8; i++){
            novoIndividuo[i] = tl.nextInt(8);
        }
        return novoIndividuo;
	}
	
	public void funcaoFitness() {
		int colisoes = 0;
		
		for (int col = 0; col < 8; col++) {
			for (int j = 0; j < 8; j++) {
				if (col == j) { //evita que a rainha seja testada com ela mesma
					continue;
				}
				else if ( (vetorIndividuo[col] + col - j) == vetorIndividuo[j]) { //verifica as diagonais esquerda-baixa e direita-alta
					colisoes++;
				} else if ( (vetorIndividuo[col] - col + j) == vetorIndividuo[j] ) {  //verifica as diagonais esquerda-alta e direita-baixa
					colisoes++;
				} else if (vetorIndividuo[col] == vetorIndividuo[j]) { //verifica a horizontal
					colisoes++;
				}
			}
		}
		colisoes /= 2;
		this.avaliacao = 28 - colisoes;
	}
	
    public void mostrarIndividuo(){
    	System.out.println("ID: " + id);
    	System.out.println("Geração: " + geracao);
		System.out.println("Avaliação: " + avaliacao);
        System.out.print("[");
        for (int i = 0; i < 8; i++){
            System.out.printf(vetorIndividuo[i] + "%s", (i == 7) ? "]\n":", ");
        }
    }
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGeracao() {
		return geracao;
	}

	public void setGeracao(int geracao) {
		this.geracao = geracao;
	}

	public int[] getVetorIndividuo() {
		return vetorIndividuo;
	}

	public void setVetorIndividuo(int[] indv) {
		this.vetorIndividuo = indv;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}

	@Override
	public int compareTo(Individuo o) {
		// TODO Auto-generated method stub
		if (this.avaliacao > o.getAvaliacao()) {
			return 1;
		} else if (this.avaliacao < o.getAvaliacao()) {
			return -1;
		}
		return 0;
	}

	public static int getIndividuosCriados() {
		return individuosCriados;
	}

	public static void setIndividuosCriados(int individuosCriados) {
		Individuo.individuosCriados = individuosCriados;
	}
	
	public void funcaoFitness2() {
		int colisoes = 0;
		
		for (int col = 0; col < 8; col++) {
			for (int j = 0; j < 8; j++) {
				if (j <= col) { //evita que a rainha seja testada com ela mesma ou que o mesmo par de rainha seja contado 2 vezes
					continue;  //verificando apenas a parte à direita da rainha atual no tabuleiro
				}
				else if ( (vetorIndividuo[col] + col - j) == vetorIndividuo[j]) { //verifica as diagonais esquerda-baixa e direita-alta
					colisoes++;
				} else if ( (vetorIndividuo[col] - col + j) == vetorIndividuo[j] ) {  //verifica as diagonais esquerda-alta e direita-baixa
					colisoes++;
				} else if (vetorIndividuo[col] == vetorIndividuo[j]) { //verifica a horizontal
					colisoes++;
				}
			}
		}
	
		this.avaliacao = 28 - colisoes;
	}
}
