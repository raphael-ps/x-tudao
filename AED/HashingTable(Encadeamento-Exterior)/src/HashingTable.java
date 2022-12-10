import java.util.LinkedList;

public class HashingTable {
	private LinkedList<Dado>[] dados;
	
	public HashingTable(int tamanho) {
		if (tamanho <= 0) {
			System.out.println("Tamanho inválido! Tabela criada com tamanho mínimo: 1");
			tamanho = 1;
		}
		this.dados = new LinkedList[tamanho]; 
	}

	public int funcaoHash(int chave) {
		//Metodo da divisão
		return chave % this.dados.length;
	}
	
	public Dado buscar(int chave) {
		if (chave < 0) {
			System.out.println("Chave inválida!");
			return null;
		}
		
		int indice = this.funcaoHash(chave);
		
		if (this.dados[indice] == null) {
			return null;
		}
		
		for (Dado dado : dados[indice]) {
			if (dado.getChave() == chave) {
				return dado;
			}
		}
		
		return null;
	}
	
	public boolean inserir(Dado novoDado) {
		if (novoDado.getChave() < 0) {
			System.out.println("Chave inválida!");
			return false;
		}
		
		int indice = this.funcaoHash(novoDado.getChave());
	
		if (this.dados[indice] == null) {
			this.dados[indice] = new LinkedList<Dado>();
		}
		
		for (Dado dado : dados[indice]) {
			if (dado.getChave() == novoDado.getChave()) {
				System.out.printf("A chave %d já existe na tabela.\n", novoDado.getChave());
				return false;
			}
		}
		
		dados[indice].addLast(novoDado);
		
		return true;
	}
	
	public Dado remover(int chave) {
		if (chave < 0) {
			System.out.println("Chave inválida!");
			return null;
		}
		
		int indice = this.funcaoHash(chave);
		
		if (this.dados[indice] == null) {
			System.out.printf("Chave %d não encontrada.\n", chave);
			return null;
		}
		
		for (Dado dado : dados[indice]) {
			if (dado.getChave() == chave) {
				System.out.printf("Dado com chave %d removido.\n", chave);
				dados[indice].remove(dado);
				return dado;
			}
		}
		
		System.out.printf("Chave %d não encontrada.\n", chave);
		return null;
	}
	
}
