package questao2;

public class Main {

	public static void main(String[] args) {
		String texto = "O Real Madrid venceu por 2 a 1 o clássico contra o Atlético de Madrid neste domingo,"
				+ "\npela 6ª rodada do Campeonato Espanhol, para continuar como líder isolado com 100% de aproveitamento.";
		Noticia noticia = new Noticia(texto, 1, 9, "Esporte");
		
		NoticiarioAssina espn = new NoticiarioAssina("ESPN");
		AgregadorTopico agregTop = new AgregadorTopico("Agregador Tópico", "Entretenimento");
		AgregadorMes agregMes = new AgregadorMes("Agregador Mês");
		
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
		espn.adicionarNoticia(new Noticia("Ingresso a R$ 10! Cinemas fazem promoção para atrair público", 
				1,  9, "Entretenimento"));
		espn.adicionarNoticia(new Noticia("Instabilidade política leva a Itália ao 68º governo em 75 anos", 
				2,  9, "Politica"));
		espn.adicionarNoticia(new Noticia("Os 5 melhores filmes e séries para maratonar no fim de semana",
				3,  9, "Entretenimento"));
		espn.adicionarNoticia(new Noticia("Tecnologia 5G: diversas possibilidades na era da internet das coisas",
				4,  9, "Tecnologia"));
		espn.adicionarNoticia(new Noticia("Star Wars: Quem são os principais personagens da série Andor", 
				5,  9, "Entretenimento"));
		espn.adicionarNoticia(new Noticia("Agência de viagens se especializa em passeios apenas para solteiros e prevê faturamento de R$ 10 milhões", 
				6,  9, "Viagem"));
		espn.adicionarNoticia(new Noticia("Filmes e séries de rainhas e reis ingleses para ver no streaming", 
				7,  9, "Entretenimento"));
		espn.adicionarNoticia(new Noticia("14 Estados podem ter eleição para governador encerrada no 1º turno",
				8,  9, "Eleição"));
		espn.adicionarNoticia(new Noticia("Netflix anuncia novas produções de filmes e séries brasileiras", 
				9,  9, "Entretenimento"));
		espn.adicionarNoticia(new Noticia("5 filmes e séries sobre xadrez com lições para quem começar um negócio",
				10, 9, "Entretenimento"));
		espn.adicionarNoticia(new Noticia("Brasileiros buscam YouTube para saber sobre séries e filmes", 
				11, 9, "Entretenimento"));
		espn.adicionarNoticia(new Noticia("Lançamentos Netflix Outubro de 2022: Todos os filmes e Séries", 
				12, 9, "Entretenimento"));
		espn.adicionarNoticia(new Noticia("7 filmes e séries baseados em jogos que foram bem recebidos pelo público",
				13, 10, "Entretenimento"));
		espn.adicionarNoticia(new Noticia("As 13 melhores séries de terror. Outubro está chegando e, com ele, o Halloween. É aquela época perfeita para mergulhar nos filmes e séries de terror.",
				14, 11, "Entretenimento"));
	
	}

}
