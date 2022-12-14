import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] vetor = {37, 28, 39, 75, 24, 58, 90, 15, 94, 60, 70, 78, 66};
		System.out.print("Criando Heap de Máximo com o vetor: ");
		mostrarVetor(vetor);
		System.out.println();
		
		Heap heap = new HeapMax(vetor);
		System.out.print("Heap criado: ");
		heap.mostrarVetorPrioridades();
		System.out.println();

		System.out.print("Alterando a prioridade do 6º elemento para 99: ");
		heap.alterarPrioridade(6, 98);
		heap.mostrarVetorPrioridades();
		System.out.println();
		
		System.out.print("Alterando a prioridade do 1º elemento para 1: ");
		heap.alterarPrioridade(1, 1);
		heap.mostrarVetorPrioridades();
		System.out.println();
		
		System.out.print("Adicionando a prioridade 99: ");
		heap.adicionar(new Dado(99, "Lavar as mãos"));
		heap.mostrarVetorPrioridades();
		System.out.println();
		
		System.out.print("Adicionando a prioridade 2: ");
		heap.adicionar(new Dado(2, "Olhar para o chão"));
		heap.mostrarVetorPrioridades();
		System.out.println();
		
		System.out.print("Adicionando a prioridade 57: ");
		heap.adicionar(new Dado(57, "Torcer contra a alemanha"));
		heap.mostrarVetorPrioridades();
		System.out.println();
		
		System.out.print("Removendo: ");
		heap.remover();
		heap.mostrarVetorPrioridades();
		System.out.println();
		
		System.out.print("Removendo: ");
		heap.remover();
		heap.mostrarVetorPrioridades();
		System.out.println();
		
		System.out.print("Removendo: ");
		heap.remover();
		heap.mostrarVetorPrioridades();
		System.out.println();
		
		System.out.print("Vetor desordenado: ");
		mostrarVetor(vetor);
		System.out.println();
		
		System.out.print("Vetor ordenado de forma crescente: ");
		heapSort(vetor, true);
		mostrarVetor(vetor);
		System.out.println();
		
		System.out.print("Vetor ordenado de forma decrescente: ");
		heapSort(vetor, false);
		mostrarVetor(vetor);
		System.out.println("===================== Teste \"Automático\" Encerrado=========================================================\n");
			
		Heap hp = null;
		Scanner input = new Scanner(System.in);
			
		System.out.println("[0] - Para criar vetor de Máximo");
		System.out.println("[1] - Para criar vetor de Mínimo");
		int opcao = receberInt("---> ", input, 1);
			
		int tamanho = receberInt("Informe o tamanho do heap: ", input, -1);
		int[] vetorPrioridades = new int[tamanho];
		
		for (int i = 0; i < tamanho; i++) {
			vetorPrioridades[i] = receberInt("Informe a " + (i+1) + "ª prioridade:" , input, -1);
		}
		if (opcao == 0) {
			hp = new HeapMax(vetorPrioridades);
		} else if (opcao == 1) {
			hp = new HeapMin(vetorPrioridades);
		}
		
		if (hp != null) {
			opcao = -1;
			while(opcao != 0) {
				System.out.println("[0] - Para sair");
				System.out.println("[1] - Para alterar prioridade");
				System.out.println("[2] - Para adicionar dado");
				System.out.println("[3] - Para remover dado");
				System.out.println("[4] - Para mostrar o vetor das prioridades");
				
				opcao = receberInt("---> ", input, 4);
				
				if (opcao == 1) {
					 int index = receberInt("Deseja alterar a prioridade de qual indice? ", input, -1);
					 int novaPrioridade = receberInt("Nova prioridade: ", input, -1);
					 hp.alterarPrioridade(index, novaPrioridade);
					 
				} else if (opcao == 2) {
					int prioridade = receberInt("Prioridade do dado: ", input, -1);
					hp.adicionar(new Dado(prioridade, "alguma coisa"));
					
				} else if (opcao == 3) {
					Dado removido = hp.remover();
					String msg = (removido == null) ? "Não há nada para remover, tente adicionar algum elemento": "O dado de prioridade "+removido.getPrioridade()+" foi removido!";
					System.out.println(msg);
					
				}  else if (opcao == 4) {
					hp.mostrarVetorPrioridades();
				}
				
				System.out.println();
			}
		}
		
		
	}
	
	public static void heapSort(int[] vetor, boolean crescente) {
		HeapMax heapMax = new HeapMax(vetor);
		
		if (crescente) {
			while (heapMax.getTamanho() > 0) {
				int aux = heapMax.remover().getPrioridade();
				vetor[heapMax.getTamanho()] = aux;
			}
		} else {
			for (int i = 0; heapMax.getTamanho() > 0; i++) {
				vetor[i] = heapMax.remover().getPrioridade();
			}
		}

	}
	
	public static void mostrarVetor(int[] vetor) {
		System.out.print("[");
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%d%s", vetor[i], (i+1 == vetor.length) ? "]\n" : ", ");
		}
	}
	
	public static int receberInt(String msg, Scanner input, int max) {
    	
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
