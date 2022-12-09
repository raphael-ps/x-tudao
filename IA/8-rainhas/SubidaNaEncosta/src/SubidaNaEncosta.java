
public class SubidaNaEncosta {

	public Estado subidaNaEncosta() {

    	Estado atual = new Estado(); //Cria um estado aleatorio para executar a subida na encosta e tentar encontrar a solução
    	Estado vizinho;
    	
    	while (true) {
    		//System.out.println();
    		//atual.mostrarEstado();
    		//System.out.println();
    		//atual.mostrarMapeamento();
    		
    		vizinho = atual.getSucessor(); //recebe o sucessor do estado
    		
    		if (vizinho.getAvaliacao() >= atual.getAvaliacao()) { //se chegar em um platô ou minimo local
    			return atual;									  // o melhor estado encontrado é retornado	
    		}													  // e a execução é encerrada
    			
    		atual = vizinho;	
    	}
    }
	
}
