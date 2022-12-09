import java.util.ArrayList;
import java.util.List;

public abstract class Heap{
	private ArrayList<Dado> dados;
	private int tamanho;
	
	public Heap(int[] vetor) {
		this.tamanho = vetor.length;
		this.dados = new ArrayList<Dado>();
		this.dados.add(0, null); //para o heap começar do indice 1
		
		for (int i = 0; i < tamanho; i++) {
			dados.add(new Dado(vetor[i], "" + vetor[i]));
		}
		
		for (int i = (tamanho / 2); i >= 1; i--) {
			this.descer(i);
		}
	}
	
	public abstract void alterarPrioridade(int index, int novaPrioridade);
	
	public abstract void descer(int index);
	
	public abstract void subir(int index);
	
	public Dado remover() {
		if (this.tamanho == 0) return null;
				
		Dado aux = null;
		aux = dados.get(1);
		
		if (this.tamanho > 1){
			this.dados.set(1, this.dados.get(this.tamanho));
		}
		
		dados.remove(tamanho);
		this.tamanho--;
		this.descer(1);
		
		return aux;
	}
	
	public void adicionar(Dado novoElemento) {
		this.dados.add(novoElemento);
		this.tamanho++;
		this.subir(this.tamanho);
	}
	
	public void mostrarVetorPrioridades() {
		System.out.print("[");
		for (int i = 1; i <= this.tamanho; i++) {
			Dado aux = this.dados.get(i);
			System.out.printf("%d%s", aux.getPrioridade(), (i == this.tamanho) ? "" : ", ");
		}
		System.out.println("]");
	}
	
	public int setPrioridade(int index, int novaPrioridade) {
		Dado aux = this.dados.get(index);
		int antigaPrioridade = aux.getPrioridade();
		
		aux.setPrioridade(novaPrioridade);
		
		return antigaPrioridade;
	}
	
	public int getPrioridade(int index) {
		return this.dados.get(index).getPrioridade();
	}
	
	public Dado getDado(int index) {
		return this.dados.get(index);
	}
	
	public List<Dado> getDados() {
		return this.dados;
	}

	public void setDados(ArrayList<Dado> dados) {
		this.dados = dados;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
		
}
