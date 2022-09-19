package questao2;

public class Main {

	public static void main(String[] args) {
		Livro ld = new LivroDigital("Game of Thrones", 100);
		Livro lf = new LivroFisico("The Hobbit", 100);
		
		Revista rd = new RevistaDigital("Turma da Mônica", 100);
		Revista rf = new RevistaFisica("Homem-Aranha HQ", 100);
		
		Jogo tab = new JogoTabuleiro("Banco Imobiliaro", 100);
		Jogo god = new VideoGameFisico("Jogo God of War", 100);
		Jogo sim = new VideoGameDigital("Jogo SimCity: Deluxe", 100);
		
		System.out.printf("Livro %s de R$ %.2f por apenas R$ %.2f.\n", lf.getNome(), lf.getPreco(), lf.calcularPreco());
		System.out.printf("Ebook %s de R$ %.2f por apenas R$ %.2f.\n", ld.getNome(), ld.getPreco(), ld.calcularPreco());
		System.out.printf("Revista %s de R$ %.2f por apenas R$ %.2f.\n", rf.getNome(), rf.getPreco(), rf.calcularPreco());
		System.out.printf("Revista digital %s de R$ %.2f por apenas R$ %.2f.\n", rd.getNome(), rd.getPreco(), rd.calcularPreco());
		System.out.printf("Jogo tabuleiro%s de R$ %.2f por apenas R$ %.2f.\n", tab.getNome(), tab.getPreco(), tab.calcularPreco());
		System.out.printf("CD do %s de R$ %.2f por apenas R$ %.2f.\n", god.getNome(), god.getPreco(), god.calcularPreco());
		System.out.printf("Jogo Steam %s de R$ %.2f por apenas R$ %.2f.\n", sim.getNome(), sim.getPreco(), sim.calcularPreco());
	}

}
