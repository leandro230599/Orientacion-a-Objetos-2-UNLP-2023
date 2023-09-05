package ar.edu.unlp.info.oo2.ejercicio_15;

public class DecoratorPresion extends Decorator{

	public DecoratorPresion(Component wrapper) {
		super(wrapper);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String print() {
		return "Presion atmosferica: "+(int)this.getPresion(); 
	}

}
