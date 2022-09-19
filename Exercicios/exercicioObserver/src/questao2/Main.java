package questao2;

public class Main {

	public static void main(String[] args) {
		String texto = "O Real Madrid venceu por 2 a 1 o cl�ssico contra o Atl�tico de Madrid neste domingo,"
				+ "\npela 6� rodada do Campeonato Espanhol, para continuar como l�der isolado com 100% de aproveitamento.";
		Noticia noticia = new Noticia(texto, 1, 9, "Esporte");
		
		NoticiarioAssina espn = new NoticiarioAssina("ESPN");
		AgregadorTopico agregTop = new AgregadorTopico("Agregador T�pico", "Entretenimento");
		AgregadorMes agregMes = new AgregadorMes("Agregador M�s");
		
		espn.adicionarConsumidor(new Assinante());
		espn.adicionarConsumidor(new Assinante());
		espn.adicionarConsumidor(agregTop);
		espn.adicionarConsumidor(agregMes);
		
		agregTop.adicionarConsumidor(new Assinante());
		agregTop.adicionarConsumidor(new Assinante());
		agregTop.adicionarConsumidor(new Publicador("Pagliari"));
		
		agregMes.adicionarConsumidor(new Assinante());
		agregMes.adicionarConsumidor(new Publicador("GE"));
		
		espn.adicionarNoticia(noticia);
		espn.adicionarNoticia(new Noticia("Ingresso a R$ 10! Cinemas fazem promo��o para atrair p�blico", 
				1,  9, "Entretenimento"));
		espn.adicionarNoticia(new Noticia("Instabilidade pol�tica leva a It�lia ao 68� governo em 75 anos", 
				2,  9, "Politica"));
		espn.adicionarNoticia(new Noticia("Os 5 melhores filmes e s�ries para maratonar no fim de semana",
				3,  9, "Entretenimento"));
		espn.adicionarNoticia(new Noticia("Tecnologia 5G: diversas possibilidades na era da internet das coisas",
				4,  9, "Tecnologia"));
		espn.adicionarNoticia(new Noticia("Star Wars: Quem s�o os principais personagens da s�rie Andor", 
				5,  9, "Entretenimento"));
		espn.adicionarNoticia(new Noticia("Ag�ncia de viagens se especializa em passeios apenas para solteiros e prev� faturamento de R$ 10 milh�es", 
				6,  9, "Viagem"));
		espn.adicionarNoticia(new Noticia("Filmes e s�ries de rainhas e reis ingleses para ver no streaming", 
				7,  9, "Entretenimento"));
		espn.adicionarNoticia(new Noticia("14 Estados podem ter elei��o para governador encerrada no 1� turno",
				8,  9, "Elei��o"));
		espn.adicionarNoticia(new Noticia("Netflix anuncia novas produ��es de filmes e s�ries brasileiras", 
				9,  9, "Entretenimento"));
		espn.adicionarNoticia(new Noticia("5 filmes e s�ries sobre xadrez com li��es para quem come�ar um neg�cio",
				10, 9, "Entretenimento"));
		espn.adicionarNoticia(new Noticia("Brasileiros buscam YouTube para saber sobre s�ries e filmes", 
				11, 9, "Entretenimento"));
		espn.adicionarNoticia(new Noticia("Lan�amentos Netflix Outubro de 2022: Todos os filmes e S�ries", 
				12, 9, "Entretenimento"));
		espn.adicionarNoticia(new Noticia("7 filmes e s�ries baseados em jogos que foram bem recebidos pelo p�blico",
				13, 10, "Entretenimento"));
		espn.adicionarNoticia(new Noticia("As 13 melhores s�ries de terror. Outubro est� chegando e, com ele, o Halloween. � aquela �poca perfeita para mergulhar nos filmes e s�ries de terror.",
				14, 11, "Entretenimento"));
	
	}

}
