package questao2.factories;
import questao2.ingredientes.*;

public class CraIngredientesFactory implements SanduicheIngredientesFactory{

	@Override
	public Salada createSalada() {
		// TODO Auto-generated method stub
		System.out.println("- Salada com verdura preparada");
		return new SComVerdura();
	}

	@Override
	public Pao createPao() {
		// TODO Auto-generated method stub
		System.out.println("- Pão Francês preparado");
		return new PFrances();
	}

	@Override
	public Presunto createPresunto() {
		// TODO Auto-generated method stub
		System.out.println("- Presunto de Frango preparado");
		return new PRFrango();
	}

	@Override
	public Queijo createQueijo() {
		// TODO Auto-generated method stub
		System.out.println("- Queijo Mussarela preparado");
		return new QMussarela();
	}

}
