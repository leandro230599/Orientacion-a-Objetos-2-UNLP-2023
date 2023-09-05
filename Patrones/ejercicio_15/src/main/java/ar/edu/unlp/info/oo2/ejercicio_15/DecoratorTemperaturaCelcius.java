package ar.edu.unlp.info.oo2.ejercicio_15;

public class DecoratorTemperaturaCelcius extends Decorator{

	public DecoratorTemperaturaCelcius(Component wrapper) {
		super(wrapper);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String print() {
		return "Temperatura C°: "+(int)this.getTemperaturaCelcius();
	}

}
