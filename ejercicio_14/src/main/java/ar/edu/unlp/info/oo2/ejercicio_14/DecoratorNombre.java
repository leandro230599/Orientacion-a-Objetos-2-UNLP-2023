package ar.edu.unlp.info.oo2.ejercicio_14;

public class DecoratorNombre extends Decorator {

	public DecoratorNombre(Component wrapper) {
		super(wrapper);
	}
	
	public String print() {
		return this.getNombre();
	}

}
