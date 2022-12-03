package questao2.factories;
import questao2.ingredientes.*;

public class JuaIngredientesFactory implements SanduicheIngredientesFactory{

	@Override
	public Salada createSalada() {
		// TODO Auto-generated method stub
		System.out.println("- Salada sem Verdura preparada");
		return new SSemVerdura();
	}

	@Override
	public Pao createPao() {
		// TODO Auto-generated method stub
		System.out.println("- Pao Integral preparado");
		return new PIntegral();
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
		System.out.println("- Queijo Prato preparado");
		return new QPrato();
	}

}
