package ar.edu.unlp.info.oo2.ejercicio_15;

public class DecoratorRadiacionSolar extends Decorator{

	public DecoratorRadiacionSolar(Component wrapper) {
		super(wrapper);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String print() {
		return "Radiacion solar: "+(int)this.getRadiacionSolar();
	}

}
