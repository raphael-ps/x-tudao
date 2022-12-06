import java.util.Scanner;

public class App {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
    	Tabuleiro tabuleiro = new Tabuleiro();
    	int solucaoOtima = 0;
    	
    	int tamPopulacao = receberInt("Informe o tamanho da população: ", input);
    	int maxIteracoes = receberInt("Informe o máximo de gerações: ", input);
    	double taxaMutacao = receberTaxaMutacao("Informe a taxa de mutação: ", input);
    	
    	
    	int i;	
    	for (i = 0; i < 10; i++) {
    		System.out.printf("==== %dº EXECUÇÃO ====\n", i+1);
    		Individuo melhorIndividuo = tabuleiro.algoritmoGenetico(tamPopulacao, maxIteracoes, taxaMutacao);
    		
    		if (melhorIndividuo.getAvaliacao() == 28) {
    			solucaoOtima++;
    		}
    		
    		System.out.println("Dados Do Melhor Individuo: ");
    		melhorIndividuo.mostrarIndividuo();
    		
    		System.out.println("\nIndividuos criados nessa execução: " + Individuo.getIndividuosCriados());
    		System.out.println();
    		
    		tabuleiro.adicionarIndividuo(melhorIndividuo);
    		tabuleiro.mostrarTabuleiro();
    		tabuleiro.removerIndividuo(melhorIndividuo);
    		
    		Individuo.setIndividuosCriados(0);
    		System.out.println();
    	}
    	
    	System.out.println("Quantas vezes foi encontrada a solução ótima: " + solucaoOtima + " de " + i + " tentativas.");
    	input.close(); 

    }
    
    public static int receberInt(String msg, Scanner input) {
    	
    	boolean valido = false;
    	int numero = 0;
    	
    	while (!valido) {
    		try {
    			System.out.print(msg);
				String entrada = input.nextLine();
				numero = Integer.parseInt(entrada.strip());
				valido = true;
				
			} catch (NumberFormatException e){
	            System.out.println("Número inválido! Tente Novamente.");
	        }
    	}
    	
		return numero;
    	
    }
    
    public static double receberTaxaMutacao(String msg, Scanner input) {
    	double numero = -1;
    	
		while (numero > 1 || numero < 0){
    		try {
    			System.out.print(msg);
				String entrada = input.nextLine();
				numero = Double.parseDouble(entrada.strip());
		
			} catch (NumberFormatException e){
	            System.out.println("Número inválido! Tente Novamente.");
	        }
    	}
    	
		return numero;
    }
}
