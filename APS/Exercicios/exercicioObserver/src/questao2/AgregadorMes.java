package questao2;

public class AgregadorMes extends Agregador{

	int mesDeInteresse;
	
	public AgregadorMes(String nome) {
		super(nome);
	}
	public void adicionarConsumidor(ConsumidorDeNoticia consumidor) {	
		if (consumidor != null) {
			super.getConsumidores().add(consumidor);
			System.out.println("Consumidor do Agregador Mês adicionado!\n");
		}	
	}
	@Override
	public void atualizar(Noticia noticia, String nomeNoticiario) {

		if (super.getUltimaNoticia() == null) { //Primeira noticia recebida pelo agregador
			this.mesDeInteresse = noticia.getMes();	
			super.setUltimaNoticia(noticia);
			
		} else if (this.mesDeInteresse == noticia.getMes()){
			this.adicionarNoticia(noticia);
			
		} else {
			super.getUltimaNoticia().setDia(0);
			super.getUltimaNoticia().setTopico("Mensal");
			super.notificarTodosConsumidores();
			super.setUltimaNoticia(null);
		}
	}

}
