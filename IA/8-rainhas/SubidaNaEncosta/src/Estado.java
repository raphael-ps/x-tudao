import java.util.concurrent.ThreadLocalRandom;

public class Estado{
	
	private int[] vetorEstado;
	private int avaliacao;
	
	public Estado() {
		this.vetorEstado = this.criarNovoVetorEstado();
		avaliacao = this.avaliarPosicao(0, vetorEstado[0]);
	}
	
	public Estado(int[] vetorEstado, int avaliacao) {
		this.vetorEstado = vetorEstado;
		this.avaliacao = avaliacao;
	}
	
	public int[] criarNovoVetorEstado() {  //cria e retorna um vetor estado aleatório
		ThreadLocalRandom tl = ThreadLocalRandom.current();
        int[] novoEstado = new int[8];
        
        for (int i = 0; i < 8; i++){
            novoEstado[i] = tl.nextInt(8);
        }
        return novoEstado;
	}
	 
	public Estado getSucessor() {  //Escolhe e retorna o melhor vizinho(sucessor) com melhor avaliação
		ThreadLocalRandom random = ThreadLocalRandom.current();
		int moverNaColuna = 0, moverParaLinha = 0;
		int avaliacaoAtual, melhorAvaliacao = 100;
		
		boolean acheiAlgumMelhor;
		
		for (int i = 0; i < 8; i++) {
 			for (int j = 0; j < 8; j++) {
 				acheiAlgumMelhor = false;
 				avaliacaoAtual = this.avaliarPosicao(i, j);
 				
 				if (avaliacaoAtual < melhorAvaliacao) {
 					acheiAlgumMelhor = true;
 					
 				} else if (avaliacaoAtual == melhorAvaliacao){ //se tiver empatado 
 					acheiAlgumMelhor = random.nextBoolean();   //o sucessor é escolhido aleatoriamente
 				}
 				
 				if (acheiAlgumMelhor) {					//guarda as informações do melhor sucessor
 					melhorAvaliacao = avaliacaoAtual;
 					moverNaColuna = i;
 					moverParaLinha = j;
 				}
 			}
 		}
		
		int[] vetorEstadoSucessor = this.vetorEstado.clone();
		vetorEstadoSucessor[moverNaColuna] = moverParaLinha;
		
		return new Estado(vetorEstadoSucessor, melhorAvaliacao); //cria o estado sucessor com as informações encontradas
	}
	
	public int avaliarPosicao(int x, int y) {
		
		int colisoes = 0;
		int valorOriginal = vetorEstado[x];
		vetorEstado[x] = y;
		
		for (int col = 0; col < 7; col++) {
			for (int j = 0; j < 8; j++) {
				if (j <= col) { //evita que a rainha seja testada com ela mesma ou que o mesmo par de rainha seja contado 2 vezes
					continue;  //verificando apenas a parte à direita da rainha atual no tabuleiro
				}
				else if ( (vetorEstado[col] + col - j) == vetorEstado[j]) { //verifica as diagonais esquerda-baixa e direita-alta
					colisoes++;
				} else if ( (vetorEstado[col] - col + j) == vetorEstado[j] ) {  //verifica as diagonais esquerda-alta e direita-baixa
					colisoes++;
				} else if (vetorEstado[col] == vetorEstado[j]) { //verifica a horizontal
					colisoes++;
				}
			}
		}
		vetorEstado[x] = valorOriginal;
		
		return colisoes;
		
	}
	
	public void mostrarMapeamento() {  //mostra um esboço de um tabuleiro com as rainhas dispostas de acordo com o estado usado 
		for (int i = 0; i < 8; i++) {  //e a avaliação de cada posição do tabueleiro
 			for (int j = 0; j < 8; j++) {
 				if (i == vetorEstado[j]) 
 					System.out.print(" >R<");
 				else
 					System.out.printf(" %2d ", this.avaliarPosicao(j, i));
			}
 			System.out.println();
		}
	}
	
    public void mostrarEstado(){
		System.out.println("Avaliação: " + avaliacao);
        System.out.print(" [");
        for (int i = 0; i < 8; i++){
            System.out.printf(vetorEstado[i] + "%s", (i == 7) ? "]\n":",  ");
        }
    }
    
	public int[] getVetorEstado() {
		return vetorEstado;
	}

	public void setVetorEstado(int[] indv) {
		this.vetorEstado = indv;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}
	
}
