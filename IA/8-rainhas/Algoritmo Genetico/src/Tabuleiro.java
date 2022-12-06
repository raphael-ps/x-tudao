import java.util.concurrent.ThreadLocalRandom;

public class Tabuleiro {
    private int[][] tabuleiro;

    public Tabuleiro(){
        tabuleiro = new int[8][8];
    }
    
    public Individuo algoritmoGenetico(int tamPopulacao, int maxIteracoes, double taxaMutacao) {
		boolean fitnessOtimoEncontrado = false;
		Populacao populacao = new Populacao(tamPopulacao);
		int geracao = 1;
		
		while (geracao <= maxIteracoes && !(fitnessOtimoEncontrado)) {
			//populacao.mostrarVetorAvaliacoes(20);
			Populacao novaPopulacao = new Populacao();
			for (int i = 0; i < tamPopulacao; i++) { 
				Individuo[] genitores = this.getGenitores(populacao); //Funcao de Selecionar e Retornar os Pais
				Individuo[] filhos = this.crossover(genitores, geracao); //Função de criar os filhos(crossover)
				
				if (this.mutacao(filhos, taxaMutacao)) { //Se a solução for encontrada durante o processo de mutação, retorna true...
					novaPopulacao.adicionarIndividuos(filhos); //...para a execução ser encerrada mais cedo e poupar tempo
					break;
				}
				novaPopulacao.adicionarIndividuos(filhos);
			}
			populacao.adicionarPopulacao(novaPopulacao);
			populacao.manterMelhoresIndividuos(tamPopulacao);
			
			if (populacao.getPrimeiro().getAvaliacao() == 28) {
				fitnessOtimoEncontrado = true;
			}
			
			geracao++;
		}
		Individuo melhorInd = populacao.getPopulacao().get(0); //Melhor Indivíduo
		return melhorInd;
	}
    
    //Seleciona os pais
    public Individuo[] getGenitores(Populacao populacao) {
    	Individuo genitores[] = new Individuo[2];
    	ThreadLocalRandom tl = ThreadLocalRandom.current();
    	int soma = populacao.getSomaDasAvaliacoes();
    	
    	int escolhido1 = tl.nextInt(soma); 
		int escolhido2 = tl.nextInt(soma);
    	int probAcumulada = 0;
    	
    	for (Individuo ind: populacao.getPopulacao()) {
    		int probIndividuo = ind.getAvaliacao();
    		probAcumulada += probIndividuo;
    		
    		if (escolhido1 > -1 && escolhido1 <= probAcumulada) {
    			genitores[0] = ind;
    			escolhido1 = -1;  // para não entrar no mesmo if mais de uma vez
    		}
    		if (escolhido2 > -1 && escolhido2 <= probAcumulada) {
    			genitores[1] = ind;
    			escolhido2 = -1;
    		}

    		if (escolhido1 == -1 && escolhido2 == -1) break; //depois que os pais são escolhidos para de iterar na lista da população
    	}
    	
    	return genitores;
    }
    
    //retorna um vetor com 2 individuos filhos 
    public Individuo[] crossover(Individuo[] genitores, int geracao) {
    	ThreadLocalRandom tl = ThreadLocalRandom.current();
    	int pontoDeCorte = tl.nextInt(8);
    	
    	int[] genitor1 = genitores[0].getVetorIndividuo(); //pega o vetor dos pais
    	int[] genitor2 = genitores[1].getVetorIndividuo();
    	
    	int[] vetorFilho1 = new int[8]; // cria o vetor dos filhos
    	int[] vetorFilho2 = new int[8];
    
    	for (int i = 0; i < 8; i++) {   //realiza o crossover
    		if (i <= pontoDeCorte) {
    			vetorFilho1[i] = genitor1[i];
    			vetorFilho2[i] = genitor2[i]; 
    		} else {
    			vetorFilho1[i] = genitor2[i];
    			vetorFilho2[i] = genitor1[i];
    		}
    		
    	}
    	//cria os individuos com os vetores especificos
    	Individuo[] filhos = {new Individuo(geracao, vetorFilho1), new Individuo(geracao, vetorFilho2)}; 
    	return filhos;
    }
    public boolean mutacao(Individuo[] filhos, double taxaMutacao) {
    	ThreadLocalRandom tl = ThreadLocalRandom.current();
    	
    	for (Individuo ind : filhos) { //a taxa de mutação é usada para cada filho, um pode ser mutado e outro não.
    		double p = tl.nextDouble();
    		if (ind.getAvaliacao() == 28) { //antes da mutação ele verifica se o filho já não é a solução ótima
    			//System.out.println("solução encontrada antes de ser mutado");
    			return true;				//se já for a solução ótima, ele não é mutado e retorna uma flag(boolean)...
    		}								//...para encerrar a busca
    		if (p < taxaMutacao) {
    			int mutarNoIndex = tl.nextInt(8); //escolhe aleatoriamento o index que vai ser mutado
    			int novoValor = tl.nextInt(8); //escolhe aleatoriamente o novo valor 
    	
    			ind.getVetorIndividuo()[mutarNoIndex] = novoValor;
    			ind.funcaoFitness2();
    		}
    	}
    				
    	return false;
    }
    
    // | Funções para representar o tabuleiro no console
    // v
    public void inserirRainha(int i, int j){
        tabuleiro[i][j] = 1;
    }

    public void mostrarTabuleiro(){
        System.out.printf("+---+---+---+---+---+---+---+---+\n");
        for (int i = 0; i < 8; i++){
            System.out.printf("|");
            for (int j = 0; j < 8; j++){
                System.out.printf(" %s |", (tabuleiro[i][j] == 0) ? " ": "R");
            }
            System.out.printf("\n+---+---+---+---+---+---+---+---+\n");
        }
    }

    public void removerIndividuo(Individuo individuo){
        int[] vetorIndividuo = individuo.getVetorIndividuo();
        
        for (int i = 0; i < 8; i++){
            tabuleiro[vetorIndividuo[i]][i] = 0;
        }
    }

    public void adicionarIndividuo(Individuo individuo){
        int[] vetorIndividuo = individuo.getVetorIndividuo();
        
        for (int i = 0; i < 8; i++){
            this.inserirRainha(vetorIndividuo[i], i);
        }
    }
}
