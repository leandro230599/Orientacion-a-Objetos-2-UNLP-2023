package ar.edu.unlp.info.oo2.ejercicio_14;

public class DecoratorFechaCreacion extends Decorator {

	public DecoratorFechaCreacion(Component wrapper) {
		super(wrapper);
		// TODO Auto-generated constructor stub
	}
	
	public String print() {
		return this.getFecha_creacion();
	}

}
