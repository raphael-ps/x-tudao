
public class Tabuleiro {
    private int[][] tabuleiro;

    public Tabuleiro(){
        tabuleiro = new int[8][8];
    }
    
    public void inserirRainha(int i, int j){
        tabuleiro[i][j] = 1;
    }
    
    public void mostrarTabuleiro(){
    
    	for (int i = 0; i < 8; i++) {
        	System.out.print("  "+i+" ");
        }
    	
        System.out.printf("\n+---+---+---+---+---+---+---+---+\n");
         
        for (int i = 0; i < 8; i++){
            System.out.printf("|");
            for (int j = 0; j < 8; j++){
                System.out.printf(" %s |", (tabuleiro[i][j] == 0) ? " ": "R");
            }
            System.out.print("  " + i);
            System.out.printf("\n+---+---+---+---+---+---+---+---+\n");
        }
    }

    public void removerEstado(Estado individuo){
        int[] vetorEstado = individuo.getVetorEstado();
        
        for (int i = 0; i < 8; i++){
            tabuleiro[vetorEstado[i]][i] = 0;
        }
    }

    public void adicionarEstado(Estado individuo){
        int[] vetorEstado = individuo.getVetorEstado();
        
        for (int i = 0; i < 8; i++){
            this.inserirRainha(vetorEstado[i], i);
        }
    }
    
    public void mostrarEstado(Estado estado) {
    	this.adicionarEstado(estado);
    	this.mostrarTabuleiro();
    	this.removerEstado(estado);
    	System.out.println("Avaliação: " + estado.getAvaliacao());
    }
}
