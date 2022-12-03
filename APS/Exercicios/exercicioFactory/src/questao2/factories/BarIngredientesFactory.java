package questao2.factories;
import questao2.ingredientes.*;

public class BarIngredientesFactory implements SanduicheIngredientesFactory{

	@Override
	public Salada createSalada() {
		// TODO Auto-generated method stub
		System.out.println("- Salada sem Verdura preparada");
		return new SSemVerdura();
	}

	@Override
	public Pao createPao() {
		// TODO Auto-generated method stub
		System.out.println("- Pão Bola preparado");
		return new PBola();
	}

	@Override
	public Presunto createPresunto() {
		// TODO Auto-generated method stub
		System.out.println("- Presunto de Peru preparado");
		return new PRPeru();
	}

	@Override
	public Queijo createQueijo() {
		// TODO Auto-generated method stub
		System.out.println("- Queijo Cheddar preparado");
		return new QCheddar();
	}

}
