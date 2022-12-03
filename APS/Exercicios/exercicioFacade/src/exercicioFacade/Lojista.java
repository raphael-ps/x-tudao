package exercicioFacade;

public class Lojista {
	private LojaCelular apple;
	private LojaCelular samsung;
	private LojaCelular xiaomi;
	
	public Lojista() {
		this.apple = new Apple("Apple Iphone 13", 5000, 40);
		this.samsung = new Samsung("Samgung Galaxy A52s", 1600, 30);
		this.xiaomi = new Xiaomi("Xiaomi Redmi Note 11 LTE", 1400, 45);
	}
	public void appleVenda() {
		System.out.println("Celulares da Apple: \n");
		System.out.printf("\t%11s %s\n"
				+ "\t%11s %.2f\n"
				+ "\t%11s %d\n\n", 
				"Modelo:", apple.getModelo(),
				"Preço(R$):", apple.getPreco(), 
				"Em Estoque:", apple.getQuantidadeEstoque());
	}
	public void samsungVenda() {
		System.out.println("Celulares da Samsung: \n");
		System.out.printf("\t%11s %s\n"
				+ "\t%11s %.2f\n"
				+ "\t%11s %d\n\n", 
				"Modelo:", samsung.getModelo(),
				"Preço(R$):", samsung.getPreco(), 
				"Em Estoque:", samsung.getQuantidadeEstoque());
	}
	public void xiaomiVenda() {
		System.out.println("Celulares da Xiaomi: \n");
		System.out.printf("\t%11s %s\n"
				+ "\t%11s %.2f\n"
				+ "\t%11s %d\n\n", 
				"Modelo:", xiaomi.getModelo(),
				"Preço(R$):", xiaomi.getPreco(), 
				"Em Estoque:", xiaomi.getQuantidadeEstoque());
	}
}
