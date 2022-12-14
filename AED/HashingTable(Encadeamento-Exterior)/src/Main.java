import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		HashingTable ht = new HashingTable(15);
		ht.inserir(new Dado(12, ""));
		ht.inserir(new Dado(24, ""));
		ht.inserir(new Dado(-1, "")); // msg chave invalida
		ht.inserir(new Dado(7, ""));
		ht.inserir(new Dado(100, ""));
		ht.inserir(new Dado(73, ""));
		ht.inserir(new Dado(85, ""));
		ht.inserir(new Dado(12, "")); // msg chave repetida
		ht.inserir(new Dado(14, ""));
		ht.inserir(new Dado(54, ""));
		ht.inserir(new Dado(32, ""));
		ht.inserir(new Dado(75, ""));
		ht.inserir(new Dado(45, ""));
		ht.inserir(new Dado(13, ""));
		ht.inserir(new Dado(0, ""));
		ht.inserir(new Dado(1, ""));
		ht.inserir(new Dado(2, ""));
		ht.inserir(new Dado(3, ""));
		ht.inserir(new Dado(4, ""));
		ht.inserir(new Dado(5, ""));
		ht.inserir(new Dado(6, ""));
		ht.mostrarTabelaHash();
		
		ht.remover(73);
		ht.remover(-1);	// msg chave invalida
		ht.remover(45);
		ht.remover(45); // msg chave não encontrada
		ht.mostrarTabelaHash();
		System.out.println("===================== Teste Pré-Produzido Encerrado =========================================================\n");
		
		Scanner input = new Scanner(System.in);
		int tamanho = receberInt("Informe o tamanho da Tabela Hash a ser criada: ", input, -1);
		HashingTable ht2 = new HashingTable(tamanho);
		
		int opcao = -1;
		
		while(opcao != 0) {
			System.out.println("[0] - Para sair");
			System.out.println("[1] - Para adicionar chave");
			System.out.println("[2] - Para remover chave");
			System.out.println("[3] - Para buscar chave");
			System.out.println("[4] - Para mostrar tabela");
			opcao = receberInt("---> ", input, 4);
			
			if (opcao == 1) {
				int chave = receberInt("Insira o número da chave: ", input, -1);
				ht2.inserir(new Dado(chave, "(Alguma"+ chave +"Coisa)"));
				 
			} else if (opcao == 2) {
				int chave = receberInt("Insira a chave a ser removida: ", input, -1);
				ht2.remover(chave);
				
			} else if (opcao == 3) {
				int chave = receberInt("Insira a chave a ser buscada: ", input, -1);
				Dado dado = ht2.buscar(chave);
				if (dado != null) {
					System.out.println("Elemento " + dado.toString() + " encontrado:");
					System.out.printf("\tChave: %d\n\tDado: %s\n", dado.getChave(), dado.getAlgumaCoisa());
				} else {
					System.out.println("Chave não encontrada!");
				}			
			} else if (opcao == 4) {
				ht2.mostrarTabelaHash();
			}
			System.out.println();
		}	
		input.close();
	}
	
	//retorna sempre um int maior do que 0
	public static int receberInt(String msg, Scanner input, int max) {
    	// se max for negativo, não há limite para o int a ser recebido
		// se max for um positiv maior que 0, recebe entrada do usuário...
		// ...até receber um número x tal que 0 <= x <= max
    	boolean valido = false;
    	int numero = 0;
    	
    	while (!valido) {
    		try {
    			System.out.print(msg);
				String entrada = input.nextLine();
				numero = Integer.parseInt(entrada.strip());
				
				if ((max > 0 && numero > max ) || numero < 0) continue;
				
				valido = true;
				
			} catch (NumberFormatException e){
	            System.out.println("Número inválido! Tente Novamente.");
	        }
    	}
    	
		return numero;
    	
    }
	
	
}
