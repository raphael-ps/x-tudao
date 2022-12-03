package questao3;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaldeiraChocolate caldeira = CaldeiraChocolate.getInstance();
		CaldeiraChocolate caldeira2 = CaldeiraChocolate.getInstance();
		
		System.out.println(caldeira);
		System.out.println(caldeira2);
		
		// Não funciona -> caldeira = new CaldeiraChocolate();
		// Singleton aplicado
		
		caldeira.fill();
		caldeira.boil();
		
		caldeira2.drain(); 
		// A caldeira2 é drenada mesmo, supostamente, não tendo sida usada anteriormente
		// Portanto, caldeira e caldeira2 são a mesma
	}

}
