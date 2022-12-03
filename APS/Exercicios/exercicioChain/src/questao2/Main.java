package questao2;

public class Main {

	public static void main(String[] args) {
		
		C6 c6Bank = new C6(null, "C6 Bank");
		Nubank nubank = new Nubank(c6Bank ,"Nubank");
		Itau itau = new Itau(nubank, "Itaú");
		Bradesco bradesco = new Bradesco(itau, "Bradesco");
		
		c6Bank.processarPagamento(new Pagamento(200, 1004));
		bradesco.processarPagamento(new Pagamento(1000, 1003));
		bradesco.processarPagamento(new Pagamento(900, 1005));

	}

}
