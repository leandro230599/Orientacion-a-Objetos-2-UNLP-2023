package ar.edu.unlp.info.oo2.ejercicio_14;

public class DecoratorFechaModificacion extends Decorator {

	public DecoratorFechaModificacion(Component wrapper) {
		super(wrapper);
		// TODO Auto-generated constructor stub
	}
	
	public String print() {
		return this.getFecha_modificacion();
	}

}
