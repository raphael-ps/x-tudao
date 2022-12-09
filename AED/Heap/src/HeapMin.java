
public class HeapMin extends Heap{

	public HeapMin(int[] vetor) {
		super(vetor);
	}
	
	public void alterarPrioridade(int index, int novaPrioridade) {
		if (index > this.getTamanho() || index < 1) { 
			System.out.println("[Erro] Index out of range");
			return;
		}
		
		int aux = this.setPrioridade(index, novaPrioridade);
		
		if(aux > novaPrioridade) {
			this.subir(index);
		} else if (aux < novaPrioridade) {
			this.descer(index);
		}
		
	}
	
	public void descer(int index) {
		int j = (2 * index);
		
		if (j <= this.getTamanho()) {
			
			if (j < this.getTamanho()) {
				Dado filhoDireito = this.getDado(j+1), filhoEsquerdo = this.getDado(j);
				
				if (filhoDireito.getPrioridade() < filhoEsquerdo.getPrioridade()) {
					j++;
				}
			}
			if (this.getPrioridade(index) > this.getPrioridade(j)) {
				Dado aux = this.getDados().set(index, this.getDado(j));
				this.getDados().set(j, aux);
				this.descer(j);
			}
		} 
	}
	
	public void subir(int index) {
		int j = index / 2;
		
		if (j >= 1) {
			if (this.getPrioridade(index) < this.getPrioridade(j)) {
				Dado aux = this.getDados().set(index, this.getDado(j));
				this.getDados().set(j, aux);
				this.subir(j);
			}
		}
	}
}