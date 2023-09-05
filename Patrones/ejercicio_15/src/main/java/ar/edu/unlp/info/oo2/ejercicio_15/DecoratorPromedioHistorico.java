package ar.edu.unlp.info.oo2.ejercicio_15;

public class DecoratorPromedioHistorico extends Decorator{

	public DecoratorPromedioHistorico(Component wrapper) {
		super(wrapper);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String print() {
		return "Promedio de temperaturas en F°: "+(int)this.getPromedioHistorico();
	}

}
