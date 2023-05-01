package ar.edu.unlp.info.oo2.ejercicio_14;

public class DecoratorTamano extends Decorator {

	public DecoratorTamano(Component wrapper) {
		super(wrapper);
		// TODO Auto-generated constructor stub
	}
	
	public String print() {
		return String.valueOf(this.getTamano());
	}

}
