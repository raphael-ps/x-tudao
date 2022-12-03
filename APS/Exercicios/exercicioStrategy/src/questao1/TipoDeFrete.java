package questao1;

import questao1.frete.*;

public enum TipoDeFrete{
	SEDEX{
		public FreteStrategy getTipoDeFrete() {
			return new SedexStrategy();
		}
	},
	FEDEX{
		public FreteStrategy getTipoDeFrete() {
			return new FedexStrategy();
		}
	},
	JADLOG{
		public FreteStrategy getTipoDeFrete() {
			return new JadlogStrategy();
		}		
	},
	PAC{
		public FreteStrategy getTipoDeFrete() {
			return new PACStrategy();
		}
	};
	
	public abstract FreteStrategy getTipoDeFrete();
}