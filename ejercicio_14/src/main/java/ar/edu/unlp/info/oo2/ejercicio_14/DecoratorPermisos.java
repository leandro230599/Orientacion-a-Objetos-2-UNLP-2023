package ar.edu.unlp.info.oo2.ejercicio_14;

public class DecoratorPermisos extends Decorator {

	public DecoratorPermisos(Component wrapper) {
		super(wrapper);
		// TODO Auto-generated constructor stub
	}
	
	public String print() {
		return this.getPermisos();
	}

}
