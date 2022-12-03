package questao3;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaldeiraChocolate caldeira = CaldeiraChocolate.getInstance();
		CaldeiraChocolate caldeira2 = CaldeiraChocolate.getInstance();
		
		System.out.println(caldeira);
		System.out.println(caldeira2);
		
		// N�o funciona -> caldeira = new CaldeiraChocolate();
		// Singleton aplicado
		
		caldeira.fill();
		caldeira.boil();
		
		caldeira2.drain(); 
		// A caldeira2 � drenada mesmo, supostamente, n�o tendo sida usada anteriormente
		// Portanto, caldeira e caldeira2 s�o a mesma
	}

}
