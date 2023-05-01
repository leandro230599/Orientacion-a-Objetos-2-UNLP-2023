package ar.edu.unlp.info.oo2.ejercicio_14;

public class DecoratorExtencion extends Decorator {

	public DecoratorExtencion(Component wrapper) {
		super(wrapper);
		// TODO Auto-generated constructor stub
	}
	
	public String print() {
		return this.getExtension();
	}

}
