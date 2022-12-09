
public class Main {

	public static void main(String[] args) {
		
		SubidaNaEncosta climb = new SubidaNaEncosta();
		Estado estado = null;
		
		int count = 0, i;
		for (i = 0; i < 10000; i++) { //define quantas vezes será executado o algoritmo
			System.out.printf("=============== Execução Nº %d ===============\n", i+1);
			
			estado = climb.subidaNaEncosta(); // executa o subida na encosta e retorna o melhor encontrado
			
			if (estado.getAvaliacao() == 0) { // se foi a solução ótima incrementa o contador
				System.out.println("Solução Encontrada");
				count++;
			}
			else {
				System.out.println("Solução ótima não encontrada");
			}
		}
		
		double porcentagem = ((count * 100) / (double) i);
		Tabuleiro tab = new Tabuleiro();
		tab.mostrarEstado(estado);
		
		System.out.println("\nSolução Encontrada "+ count + " vezes de " + i);
		System.out.println("Ou seja, " + porcentagem + "% das vezes.");
		
	}

}
