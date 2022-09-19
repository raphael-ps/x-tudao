package questao1;

public class Main {

	public static void main(String[] args) {
		String texto = "O Real Madrid venceu por 2 a 1 o clássico contra o Atlético de Madrid neste domingo,"
				+ "\npela 6ª rodada do Campeonato Espanhol, para continuar como líder isolado com 100% de aproveitamento.\n";
		Noticia noticia = new Noticia(texto, 18, 9, "Esporte");
		
		NoticiarioAssina espnNotificacoes = new NoticiarioAssina();
		
		Assinante a1 = new Assinante("Rodrygo");
		Assinante a2 = new Assinante("Vinicius");
		
		espnNotificacoes.adicionarConsumidor(a1);
		espnNotificacoes.adicionarConsumidor(a2);
		
		espnNotificacoes.publicarNoticia(noticia);
		
		
	}

}
