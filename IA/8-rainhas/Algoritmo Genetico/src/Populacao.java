import java.util.ArrayList;
import java.util.Collections;

public class Populacao{
	private int somaDasAvaliacoes;
	private ArrayList<Individuo> populacao;

	public Populacao(int tamanhoInicial) {
		this.somaDasAvaliacoes = 0;
		this.populacao = new ArrayList<Individuo>();
		this.gerarPopulacao(tamanhoInicial, 0);
	}

	public Populacao() {
		this.somaDasAvaliacoes = 0;
		this.populacao = new ArrayList<Individuo>();
	}
	
	public void manterMelhoresIndividuos(int tamNovaPopulacao) {
		this.sort(true);
		for (int i = tamNovaPopulacao; i < populacao.size(); i++) {
			this.removerIndividuo(i);
		}
	}
	
	public void adicionarPopulacao(Populacao pop) {
		this.adicionarIndividuos(pop.getPopulacao());
	}
	
	public void adicionarIndividuos(ArrayList<Individuo> individuos) {
		for (Individuo ind : individuos) {
			this.adicionarIndividuo(ind);
		}
	}
	
	public void adicionarIndividuos(Individuo[] individuos) {
		for (Individuo ind : individuos) {
			this.adicionarIndividuo(ind);
		}
	}
	
	public void adicionarIndividuo(Individuo individuo) {
		populacao.add(individuo);
		somaDasAvaliacoes += individuo.getAvaliacao();
	}
	
	public void removerIndividuo(int index) {
		somaDasAvaliacoes -= populacao.get(index).getAvaliacao();
		populacao.remove(index);
	}
	
	public void gerarPopulacao(int tamanho, int geracao) {
		for (int i = 0; i < tamanho; i++) {
			this.adicionarIndividuo(new Individuo(geracao));
		}
	}
	
	public void mostrarPopulacao() {
		Individuo ind;
		for (int i = 0; i < populacao.size(); i++) {
			ind = populacao.get(i);
			ind.mostrarIndividuo();
			System.out.println();
		}
	}
	
	public void mostrarVetorAvaliacoes(int qtd) {
		if (qtd > populacao.size()) {
			qtd = populacao.size();
		}
		
		System.out.print("[");
		for (int i = 0; i < qtd; i++) {
			System.out.printf(populacao.get(i).getAvaliacao() + "%s", (i+1 == qtd) ? "]\n" : ", ");
		}
	}
	
	public void sort(boolean reverse) {
		if (reverse) {
			Collections.sort(populacao, Collections.reverseOrder());
		} else {
			Collections.sort(populacao);
		}
	}
	
	public ArrayList<Individuo> getPopulacao() {
		return populacao;
	}

	public void setPopulacao(ArrayList<Individuo> populacao) {
		this.populacao = populacao;
	}

	public int getSomaDasAvaliacoes() {
		return somaDasAvaliacoes;
	}

	public void setSomaDasAvaliacoes(int somaDasAvaliacoes) {
		this.somaDasAvaliacoes = somaDasAvaliacoes;
	}
	
	public Individuo getPrimeiro() {
		return populacao.get(0);
	}
}
